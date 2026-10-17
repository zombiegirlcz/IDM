package hcl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151217c;
    public final y1 d;

    public x1(String ref2, String symbol, String stockExchangeCode, y1 y1Var) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
        this.f151215a = ref2;
        this.f151216b = symbol;
        this.f151217c = stockExchangeCode;
        this.d = y1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f151215a, x1Var.f151215a) && Intrinsics.f(this.f151216b, x1Var.f151216b) && Intrinsics.f(this.f151217c, x1Var.f151217c) && Intrinsics.f(this.d, x1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151215a.hashCode() * 31, 31, this.f151216b), 31, this.f151217c);
        y1 y1Var = this.d;
        return iC + (y1Var == null ? 0 : y1Var.hashCode());
    }
}
