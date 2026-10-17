package ie7;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.provider.Settings;
import com.revolut.feature.in_app_calls.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f160672a = {0, 2000, 1000, 2000, 1000};

    public static final class a {
        private a() {
        }
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (c(context).getNotificationChannel("com.revolut.call.active.v2") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("com.revolut.call.active.v2", context.getString(R$string.in_app_calls_notification_channel_active_name), 3);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        c(context).createNotificationChannel(notificationChannel);
    }

    public static void b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (c(context).getNotificationChannel("com.revolut.call.incoming") != null) {
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("com.revolut.call.incoming", context.getString(R$string.in_app_calls_notification_channel_incoming_name), 4);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setBypassDnd(true);
        notificationChannel.setSound(Settings.System.DEFAULT_RINGTONE_URI, new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
        notificationChannel.enableVibration(true);
        notificationChannel.setVibrationPattern(f160672a);
        c(context).createNotificationChannel(notificationChannel);
    }

    public static NotificationManager c(Context context) {
        Object systemService = context.getSystemService("notification");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }
}
