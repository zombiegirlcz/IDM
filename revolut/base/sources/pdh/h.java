package pdh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f235238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f235239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f235240c;
    public final f d;
    public final f e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f235241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f235242h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f235243j;

    public h(g status, f nationality, d accountPurpose, f occupation, f netIncome, f netWorth, f employmentStatus, f employer, f employerIndustry, f affiliated) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(nationality, "nationality");
        Intrinsics.checkNotNullParameter(accountPurpose, "accountPurpose");
        Intrinsics.checkNotNullParameter(occupation, "occupation");
        Intrinsics.checkNotNullParameter(netIncome, "netIncome");
        Intrinsics.checkNotNullParameter(netWorth, "netWorth");
        Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
        Intrinsics.checkNotNullParameter(employer, "employer");
        Intrinsics.checkNotNullParameter(employerIndustry, "employerIndustry");
        Intrinsics.checkNotNullParameter(affiliated, "affiliated");
        this.f235238a = status;
        this.f235239b = nationality;
        this.f235240c = accountPurpose;
        this.d = occupation;
        this.e = netIncome;
        this.f = netWorth;
        this.f235241g = employmentStatus;
        this.f235242h = employer;
        this.i = employerIndustry;
        this.f235243j = affiliated;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f235238a == hVar.f235238a && Intrinsics.f(this.f235239b, hVar.f235239b) && Intrinsics.f(this.f235240c, hVar.f235240c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f235241g, hVar.f235241g) && Intrinsics.f(this.f235242h, hVar.f235242h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f235243j, hVar.f235243j);
    }

    public final int hashCode() {
        return this.f235243j.hashCode() + ((this.i.hashCode() + ((this.f235242h.hashCode() + ((this.f235241g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f235240c.hashCode() + ((this.f235239b.hashCode() + (this.f235238a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
