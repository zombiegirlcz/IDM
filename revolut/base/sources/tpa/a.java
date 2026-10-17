package tpa;

import androidx.core.app.NotificationManagerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManagerCompat f273324a;

    public a(z70.a contextProvider) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(contextProvider.getContext());
        Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(...)");
        this.f273324a = notificationManagerCompatFrom;
    }
}
