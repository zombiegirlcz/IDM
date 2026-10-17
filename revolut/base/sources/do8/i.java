package do8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f116451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f116452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f116453c;

    public i(Data profile, Data remoteLoginInvitation, Data activeDevicePresent) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(remoteLoginInvitation, "remoteLoginInvitation");
        Intrinsics.checkNotNullParameter(activeDevicePresent, "activeDevicePresent");
        this.f116451a = profile;
        this.f116452b = remoteLoginInvitation;
        this.f116453c = activeDevicePresent;
    }

    public static i a(i iVar, Data profile, Data remoteLoginInvitation, Data activeDevicePresent, int i) {
        if ((i & 1) != 0) {
            profile = iVar.f116451a;
        }
        if ((i & 2) != 0) {
            remoteLoginInvitation = iVar.f116452b;
        }
        if ((i & 4) != 0) {
            activeDevicePresent = iVar.f116453c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(profile, "profile");
        Intrinsics.checkNotNullParameter(remoteLoginInvitation, "remoteLoginInvitation");
        Intrinsics.checkNotNullParameter(activeDevicePresent, "activeDevicePresent");
        return new i(profile, remoteLoginInvitation, activeDevicePresent);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f116451a, iVar.f116451a) && Intrinsics.f(this.f116452b, iVar.f116452b) && Intrinsics.f(this.f116453c, iVar.f116453c);
    }

    public final int hashCode() {
        return this.f116453c.hashCode() + kii.e.c(this.f116452b, this.f116451a.hashCode() * 31, 31);
    }
}
