package br4;

import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.models.CreditCard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCard f17900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yt8.c f17901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f17902c;
    public final ux4.b d;
    public final wi0.b e;
    public final ll4.r f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xp3.b f17903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja5.a f17904h;
    public final um4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f17905j;
    public final kl4.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f17906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f17907m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CreditLimitIncreaseStatus f17908n;
    public final od0.i o;

    public k(CreditCard creditCard, yt8.c kyc2, List cards, ux4.b documents, wi0.b countryCode, ll4.r rates, xp3.b bVar, ja5.a aVar, um4.a limitsInfo, j jVar, kl4.b bVar2, boolean z, boolean z3, CreditLimitIncreaseStatus creditLimitIncreaseStatus, od0.i infoSectionsContent) {
        Intrinsics.checkNotNullParameter(creditCard, "creditCard");
        Intrinsics.checkNotNullParameter(kyc2, "kyc");
        Intrinsics.checkNotNullParameter(cards, "cards");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(limitsInfo, "limitsInfo");
        Intrinsics.checkNotNullParameter(creditLimitIncreaseStatus, "creditLimitIncreaseStatus");
        Intrinsics.checkNotNullParameter(infoSectionsContent, "infoSectionsContent");
        this.f17900a = creditCard;
        this.f17901b = kyc2;
        this.f17902c = cards;
        this.d = documents;
        this.e = countryCode;
        this.f = rates;
        this.f17903g = bVar;
        this.f17904h = aVar;
        this.i = limitsInfo;
        this.f17905j = jVar;
        this.k = bVar2;
        this.f17906l = z;
        this.f17907m = z3;
        this.f17908n = creditLimitIncreaseStatus;
        this.o = infoSectionsContent;
    }

    @Override // br4.l
    public final CreditCard a() {
        return this.f17900a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f17900a, kVar.f17900a) && Intrinsics.f(this.f17901b, kVar.f17901b) && Intrinsics.f(this.f17902c, kVar.f17902c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f17903g, kVar.f17903g) && Intrinsics.f(this.f17904h, kVar.f17904h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f17905j, kVar.f17905j) && Intrinsics.f(this.k, kVar.k) && this.f17906l == kVar.f17906l && this.f17907m == kVar.f17907m && Intrinsics.f(this.f17908n, kVar.f17908n) && Intrinsics.f(this.o, kVar.o);
    }

    @Override // br4.l
    public final wi0.b getCountryCode() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.d(p.a.d((this.f17901b.hashCode() + (this.f17900a.hashCode() * 31)) * 31, 31, this.f17902c), 31, this.d.f283864a), 31, this.e.f297794a)) * 31;
        xp3.b bVar = this.f17903g;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ja5.a aVar = this.f17904h;
        int iHashCode3 = (this.i.hashCode() + ((iHashCode2 + (aVar == null ? 0 : aVar.f172439a.hashCode())) * 31)) * 31;
        j jVar = this.f17905j;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.f17898a.hashCode())) * 31;
        kl4.b bVar2 = this.k;
        return this.o.hashCode() + ((this.f17908n.hashCode() + j6.a.c(j6.a.c((iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31, 31, this.f17906l), 31, this.f17907m)) * 31);
    }
}
