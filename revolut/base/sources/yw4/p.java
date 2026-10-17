package yw4;

import com.revolut.feature.credit.card.models.creditcard.CreditCardCancellation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f317327c;
    public final xi0.b d;
    public final q e;
    public final double f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f317328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f317329h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n f317330j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f317331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f317332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CreditCardCancellation f317333n;

    public p(String facilityId, String pocketId, long j2, xi0.b currency, q state, double d, Double d5, m mVar, h cardType, n nVar, String str, l accessLevel, long j3, CreditCardCancellation creditCardCancellation) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accessLevel, "accessLevel");
        this.f317325a = facilityId;
        this.f317326b = pocketId;
        this.f317327c = j2;
        this.d = currency;
        this.e = state;
        this.f = d;
        this.f317328g = d5;
        this.f317329h = mVar;
        this.i = cardType;
        this.f317330j = nVar;
        this.k = str;
        this.f317331l = accessLevel;
        this.f317332m = j3;
        this.f317333n = creditCardCancellation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f317325a, pVar.f317325a) && Intrinsics.f(this.f317326b, pVar.f317326b) && this.f317327c == pVar.f317327c && Intrinsics.f(this.d, pVar.d) && this.e == pVar.e && Double.compare(this.f, pVar.f) == 0 && Intrinsics.f(this.f317328g, pVar.f317328g) && Intrinsics.f(this.f317329h, pVar.f317329h) && this.i == pVar.i && Intrinsics.f(this.f317330j, pVar.f317330j) && Intrinsics.f(this.k, pVar.k) && this.f317331l == pVar.f317331l && this.f317332m == pVar.f317332m && Intrinsics.f(this.f317333n, pVar.f317333n);
    }

    public final int hashCode() {
        int iC = m72.b.c((this.e.hashCode() + h30.l.j(this.d, a0.d.c(p.a.c(this.f317325a.hashCode() * 31, 31, this.f317326b), 31, this.f317327c), 31)) * 31, this.f, 31);
        Double d = this.f317328g;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        m mVar = this.f317329h;
        int iHashCode2 = (this.i.hashCode() + ((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31)) * 31;
        n nVar = this.f317330j;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.f317324a.hashCode())) * 31;
        String str = this.k;
        int iC2 = a0.d.c((this.f317331l.hashCode() + ((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f317332m);
        CreditCardCancellation creditCardCancellation = this.f317333n;
        return iC2 + (creditCardCancellation != null ? creditCardCancellation.hashCode() : 0);
    }
}
