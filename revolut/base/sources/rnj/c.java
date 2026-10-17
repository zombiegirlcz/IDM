package rnj;

import com.revolut.data.model.Data;
import dfj.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f255702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f255703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f255704c;

    public c(Data esimProfileData, Data troubleshootingData, q installationAvailability) {
        Intrinsics.checkNotNullParameter(esimProfileData, "esimProfileData");
        Intrinsics.checkNotNullParameter(troubleshootingData, "troubleshootingData");
        Intrinsics.checkNotNullParameter(installationAvailability, "installationAvailability");
        this.f255702a = esimProfileData;
        this.f255703b = troubleshootingData;
        this.f255704c = installationAvailability;
    }

    public static c a(c cVar, Data esimProfileData, Data troubleshootingData, q installationAvailability, int i) {
        if ((i & 1) != 0) {
            esimProfileData = cVar.f255702a;
        }
        if ((i & 2) != 0) {
            troubleshootingData = cVar.f255703b;
        }
        if ((i & 4) != 0) {
            installationAvailability = cVar.f255704c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(esimProfileData, "esimProfileData");
        Intrinsics.checkNotNullParameter(troubleshootingData, "troubleshootingData");
        Intrinsics.checkNotNullParameter(installationAvailability, "installationAvailability");
        return new c(esimProfileData, troubleshootingData, installationAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f255702a, cVar.f255702a) && Intrinsics.f(this.f255703b, cVar.f255703b) && Intrinsics.f(this.f255704c, cVar.f255704c);
    }

    public final int hashCode() {
        return this.f255704c.hashCode() + kii.e.c(this.f255703b, this.f255702a.hashCode() * 31, 31);
    }
}
