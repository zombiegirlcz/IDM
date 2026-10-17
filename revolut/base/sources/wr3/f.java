package wr3;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManagerCompat f299516a;

    public f(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(...)");
        this.f299516a = notificationManagerCompatFrom;
    }
}
