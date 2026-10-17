package ds4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f117199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f117200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f117201c;
    public final List d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f117202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f117203h;
    public final wi0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f117204j;

    public d(dj0.d nextDue, LocalDate localDate, dj0.d leftToPay, List currentInstalmentPlans, List pastInstalmentPlans, boolean z, f fVar, List terms, wi0.b countryCode, List creditCardMsiOffers) {
        Intrinsics.checkNotNullParameter(nextDue, "nextDue");
        Intrinsics.checkNotNullParameter(leftToPay, "leftToPay");
        Intrinsics.checkNotNullParameter(currentInstalmentPlans, "currentInstalmentPlans");
        Intrinsics.checkNotNullParameter(pastInstalmentPlans, "pastInstalmentPlans");
        Intrinsics.checkNotNullParameter(terms, "terms");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(creditCardMsiOffers, "creditCardMsiOffers");
        this.f117199a = nextDue;
        this.f117200b = localDate;
        this.f117201c = leftToPay;
        this.d = currentInstalmentPlans;
        this.e = pastInstalmentPlans;
        this.f = z;
        this.f117202g = fVar;
        this.f117203h = terms;
        this.i = countryCode;
        this.f117204j = creditCardMsiOffers;
    }

    @Override // ds4.g
    public final List a() {
        return this.f117204j;
    }

    @Override // ds4.g
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f117199a, dVar.f117199a) && Intrinsics.f(this.f117200b, dVar.f117200b) && Intrinsics.f(this.f117201c, dVar.f117201c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && this.f == dVar.f && Intrinsics.f(this.f117202g, dVar.f117202g) && Intrinsics.f(this.f117203h, dVar.f117203h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f117204j, dVar.f117204j);
    }

    public final int hashCode() {
        int iHashCode = this.f117199a.hashCode() * 31;
        LocalDate localDate = this.f117200b;
        int iC = j6.a.c(p.a.d(p.a.d(v7.c((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f117201c), 31, this.d), 31, this.e), 31, this.f);
        f fVar = this.f117202g;
        return this.f117204j.hashCode() + p.a.c(p.a.d((iC + (fVar != null ? fVar.hashCode() : 0)) * 31, 31, this.f117203h), 31, this.i.f297794a);
    }
}
