package kel;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f183173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f183174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f183175c;
    public final BigDecimal d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f183176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f183177h;
    public final ej0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z f183178j;
    public final m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f183179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ZonedDateTime f183180m;

    public n(a baseHolding, BigDecimal quantity, BigDecimal available, BigDecimal total, String ref2, String symbol, String str, dj0.d dVar, ej0.b bVar, z instrumentType, m mVar, e eVar, ZonedDateTime zonedDateTime) {
        Intrinsics.checkNotNullParameter(baseHolding, "baseHolding");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        this.f183173a = baseHolding;
        this.f183174b = quantity;
        this.f183175c = available;
        this.d = total;
        this.e = ref2;
        this.f = symbol;
        this.f183176g = str;
        this.f183177h = dVar;
        this.i = bVar;
        this.f183178j = instrumentType;
        this.k = mVar;
        this.f183179l = eVar;
        this.f183180m = zonedDateTime;
    }

    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f183173a, nVar.f183173a) && Intrinsics.f(this.f183174b, nVar.f183174b) && Intrinsics.f(this.f183175c, nVar.f183175c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && Intrinsics.f(this.f, nVar.f) && Intrinsics.f(this.f183176g, nVar.f183176g) && Intrinsics.f(this.f183177h, nVar.f183177h) && Intrinsics.f(this.i, nVar.i) && this.f183178j == nVar.f183178j && Intrinsics.f(this.k, nVar.k) && Intrinsics.f(this.f183179l, nVar.f183179l) && Intrinsics.f(this.f183180m, nVar.f183180m);
    }

    @Override // kel.g
    public final String g() {
        return this.f183173a.f183146b;
    }

    @Override // kel.g
    public final String getCurrency() {
        return this.f183173a.e;
    }

    @Override // kel.g
    public final String getId() {
        return this.f183173a.f183145a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(t61.a.d(this.d, t61.a.d(this.f183175c, t61.a.d(this.f183174b, this.f183173a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
        String str = this.f183176g;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar = this.f183177h;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        ej0.b bVar = this.i;
        int iHashCode3 = (this.f183178j.hashCode() + ((iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        m mVar = this.k;
        int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        e eVar = this.f183179l;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f183180m;
        return iHashCode5 + (zonedDateTime != null ? zonedDateTime.hashCode() : 0);
    }
}
