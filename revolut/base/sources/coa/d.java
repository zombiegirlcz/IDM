package coa;

import aii.r;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationSettingsDetails f25503a;

    public d(NotificationSettingsDetails notificationSettingsDetails) {
        Intrinsics.checkNotNullParameter(notificationSettingsDetails, "notificationSettingsDetails");
        this.f25503a = notificationSettingsDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f25503a, ((d) obj2).f25503a);
    }

    public final int hashCode() {
        return this.f25503a.hashCode();
    }
}
