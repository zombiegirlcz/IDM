package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ServiceCompat {

    public static class Api29Impl {
        public static void startForeground(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 255);
            }
        }
    }

    public static class Api34Impl {
        public static void startForeground(Service service, int i, Notification notification, int i2) {
            if (i2 == 0 || i2 == -1) {
                service.startForeground(i, notification, i2);
            } else {
                service.startForeground(i, notification, i2 & 1073745919);
            }
        }
    }

    public static void startForeground(Service service, int i, Notification notification, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            Api34Impl.startForeground(service, i, notification, i2);
        } else if (i3 >= 29) {
            Api29Impl.startForeground(service, i, notification, i2);
        } else {
            service.startForeground(i, notification);
        }
    }
}
