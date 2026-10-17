package hcl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151014c;
    public final String d;
    public final o0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151015g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f151016h;
    public final List i;

    public i0(String ref2, String symbol, String str, String stockExchangeCode, o0 o0Var, String sector, String type, b bVar, List list) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f151012a = ref2;
        this.f151013b = symbol;
        this.f151014c = str;
        this.d = stockExchangeCode;
        this.e = o0Var;
        this.f = sector;
        this.f151015g = type;
        this.f151016h = bVar;
        this.i = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f151012a, i0Var.f151012a) && Intrinsics.f(this.f151013b, i0Var.f151013b) && Intrinsics.f(this.f151014c, i0Var.f151014c) && Intrinsics.f(this.d, i0Var.d) && Intrinsics.f(this.e, i0Var.e) && Intrinsics.f(this.f, i0Var.f) && Intrinsics.f(this.f151015g, i0Var.f151015g) && Intrinsics.f(this.f151016h, i0Var.f151016h) && Intrinsics.f(this.i, i0Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f151012a.hashCode() * 31, 31, this.f151013b);
        String str = this.f151014c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        o0 o0Var = this.e;
        int iC3 = p.a.c(p.a.c((iC2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31, this.f), 31, this.f151015g);
        b bVar = this.f151016h;
        int iHashCode = (iC3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.i;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
