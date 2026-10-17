package jcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f172888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f172889c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f172890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f172891h;

    public e(String id10, String portfolioId, Long l2, String holdingState, String name, String currency, a aVar, g gVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(holdingState, "holdingState");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f172887a = id10;
        this.f172888b = portfolioId;
        this.f172889c = l2;
        this.d = holdingState;
        this.e = name;
        this.f = currency;
        this.f172890g = aVar;
        this.f172891h = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f172887a, eVar.f172887a) && Intrinsics.f(this.f172888b, eVar.f172888b) && Intrinsics.f(this.f172889c, eVar.f172889c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f172890g, eVar.f172890g) && Intrinsics.f(this.f172891h, eVar.f172891h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f172887a.hashCode() * 31, 31, this.f172888b);
        Long l2 = this.f172889c;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        a aVar = this.f172890g;
        int iHashCode = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        g gVar = this.f172891h;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public /* synthetic */ e(String str, String str2, Long l2, String str3, String str4, String str5, a aVar, g gVar, int i) {
        this(str, str2, l2, str3, str4, str5, (i & 64) != 0 ? null : aVar, (i & 128) != 0 ? null : gVar);
    }
}
