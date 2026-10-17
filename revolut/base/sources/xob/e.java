package xob;

import com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge;
import kotlin.jvm.internal.Intrinsics;
import n38.z;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.s f307763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ncd.a f307764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f307765c;
    public final z d;
    public final od0.i e;
    public final uib.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SavingsChallenge f307766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xme.e f307767h;
    public final pjb.b i;

    public e(pcd.s vault, ncd.a availableProduct, m nextInterestPayment, z zVar, od0.i juniorProfileData, uib.a config, SavingsChallenge savingsChallenge, xme.e taxExemptionAvailability, pjb.b bVar) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(availableProduct, "availableProduct");
        Intrinsics.checkNotNullParameter(nextInterestPayment, "nextInterestPayment");
        Intrinsics.checkNotNullParameter(juniorProfileData, "juniorProfileData");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(taxExemptionAvailability, "taxExemptionAvailability");
        this.f307763a = vault;
        this.f307764b = availableProduct;
        this.f307765c = nextInterestPayment;
        this.d = zVar;
        this.e = juniorProfileData;
        this.f = config;
        this.f307766g = savingsChallenge;
        this.f307767h = taxExemptionAvailability;
        this.i = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f307763a, eVar.f307763a) && Intrinsics.f(this.f307764b, eVar.f307764b) && Intrinsics.f(this.f307765c, eVar.f307765c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f307766g, eVar.f307766g) && Intrinsics.f(this.f307767h, eVar.f307767h) && Intrinsics.f(this.i, eVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f307765c.hashCode() + ((this.f307764b.hashCode() + (this.f307763a.hashCode() * 31)) * 31)) * 31;
        z zVar = this.d;
        int iHashCode2 = (this.f.hashCode() + r6.b.f(this.e, (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31, 31)) * 31;
        SavingsChallenge savingsChallenge = this.f307766g;
        int iHashCode3 = (this.f307767h.hashCode() + ((iHashCode2 + (savingsChallenge == null ? 0 : savingsChallenge.hashCode())) * 31)) * 31;
        pjb.b bVar = this.i;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
