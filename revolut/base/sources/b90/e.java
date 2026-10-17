package b90;

import androidx.core.app.NotificationManagerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManagerCompat f13523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w70.a f13524b;

    public e(NotificationManagerCompat notificationManager, w70.a androidVersion) {
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f13523a = notificationManager;
        this.f13524b = androidVersion;
    }
}
