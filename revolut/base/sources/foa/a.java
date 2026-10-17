package foa;

import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationSettingsDetails f136860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a59.a f136861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l71.d f136862c;
    public final boolean d;
    public final boolean e;

    public a(NotificationSettingsDetails settings, a59.a aVar, l71.d dVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f136860a = settings;
        this.f136861b = aVar;
        this.f136862c = dVar;
        this.d = z;
        this.e = z3;
    }

    public static a a(a aVar, NotificationSettingsDetails notificationSettingsDetails, a59.a aVar2, l71.d dVar, int i) {
        if ((i & 1) != 0) {
            notificationSettingsDetails = aVar.f136860a;
        }
        NotificationSettingsDetails settings = notificationSettingsDetails;
        if ((i & 2) != 0) {
            aVar2 = aVar.f136861b;
        }
        a59.a aVar3 = aVar2;
        if ((i & 4) != 0) {
            dVar = aVar.f136862c;
        }
        boolean z = aVar.d;
        boolean z3 = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new a(settings, aVar3, dVar, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136860a, aVar.f136860a) && this.f136861b == aVar.f136861b && Intrinsics.f(this.f136862c, aVar.f136862c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f136860a.hashCode() * 31;
        a59.a aVar = this.f136861b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        l71.d dVar = this.f136862c;
        return Boolean.hashCode(this.e) + j6.a.c((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31, 31, this.d);
    }
}
