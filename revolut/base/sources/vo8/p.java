package vo8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f290900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f290901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f290902c;
    public final Data d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f290903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f290904h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f290905j;

    public p(Data juniorProfileData, Data referralsToggleData, Data paymentsSettingsToggleData, Data guardianConsent, Data termsAndConditionLink, boolean z, boolean z3, boolean z4, Data graduationData, Data activeDevicesAvailable) {
        Intrinsics.checkNotNullParameter(juniorProfileData, "juniorProfileData");
        Intrinsics.checkNotNullParameter(referralsToggleData, "referralsToggleData");
        Intrinsics.checkNotNullParameter(paymentsSettingsToggleData, "paymentsSettingsToggleData");
        Intrinsics.checkNotNullParameter(guardianConsent, "guardianConsent");
        Intrinsics.checkNotNullParameter(termsAndConditionLink, "termsAndConditionLink");
        Intrinsics.checkNotNullParameter(graduationData, "graduationData");
        Intrinsics.checkNotNullParameter(activeDevicesAvailable, "activeDevicesAvailable");
        this.f290900a = juniorProfileData;
        this.f290901b = referralsToggleData;
        this.f290902c = paymentsSettingsToggleData;
        this.d = guardianConsent;
        this.e = termsAndConditionLink;
        this.f = z;
        this.f290903g = z3;
        this.f290904h = z4;
        this.i = graduationData;
        this.f290905j = activeDevicesAvailable;
    }

    public static p a(p pVar, Data data, Data data2, Data data3, Data data4, Data data5, boolean z, boolean z3, boolean z4, Data data6, Data data7, int i) {
        if ((i & 1) != 0) {
            data = pVar.f290900a;
        }
        Data juniorProfileData = data;
        if ((i & 2) != 0) {
            data2 = pVar.f290901b;
        }
        Data referralsToggleData = data2;
        if ((i & 4) != 0) {
            data3 = pVar.f290902c;
        }
        Data paymentsSettingsToggleData = data3;
        if ((i & 8) != 0) {
            data4 = pVar.d;
        }
        Data guardianConsent = data4;
        Data termsAndConditionLink = (i & 16) != 0 ? pVar.e : data5;
        boolean z6 = (i & 32) != 0 ? pVar.f : z;
        boolean z11 = (i & 64) != 0 ? pVar.f290903g : z3;
        boolean z12 = (i & 128) != 0 ? pVar.f290904h : z4;
        Data graduationData = (i & 256) != 0 ? pVar.i : data6;
        Data activeDevicesAvailable = (i & 512) != 0 ? pVar.f290905j : data7;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(juniorProfileData, "juniorProfileData");
        Intrinsics.checkNotNullParameter(referralsToggleData, "referralsToggleData");
        Intrinsics.checkNotNullParameter(paymentsSettingsToggleData, "paymentsSettingsToggleData");
        Intrinsics.checkNotNullParameter(guardianConsent, "guardianConsent");
        Intrinsics.checkNotNullParameter(termsAndConditionLink, "termsAndConditionLink");
        Intrinsics.checkNotNullParameter(graduationData, "graduationData");
        Intrinsics.checkNotNullParameter(activeDevicesAvailable, "activeDevicesAvailable");
        return new p(juniorProfileData, referralsToggleData, paymentsSettingsToggleData, guardianConsent, termsAndConditionLink, z6, z11, z12, graduationData, activeDevicesAvailable);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f290900a, pVar.f290900a) && Intrinsics.f(this.f290901b, pVar.f290901b) && Intrinsics.f(this.f290902c, pVar.f290902c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && this.f == pVar.f && this.f290903g == pVar.f290903g && this.f290904h == pVar.f290904h && Intrinsics.f(this.i, pVar.i) && Intrinsics.f(this.f290905j, pVar.f290905j);
    }

    public final int hashCode() {
        return this.f290905j.hashCode() + kii.e.c(this.i, j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f290902c, kii.e.c(this.f290901b, this.f290900a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31, this.f290903g), 31, this.f290904h), 31);
    }
}
