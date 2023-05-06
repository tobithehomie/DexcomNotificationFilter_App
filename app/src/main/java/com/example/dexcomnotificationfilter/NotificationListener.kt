package com.example.dexcomnotificationfilter

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.service.notification.StatusBarNotification

class NotificationListener : Service() {
    override fun onBind(intent: Intent): IBinder? {
        return super.onBind(intent)
    }

    override fun onNotificationPosted(sbn: StatusBarNotification) {
        // Implement what you want here
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification) {
        // Implement what you want here
    }
}