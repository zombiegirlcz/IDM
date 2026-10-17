package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f126291c;
    public final String d;

    public u(String symbol, String ref2, String oldSymbol, String newSymbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(oldSymbol, "oldSymbol");
        Intrinsics.checkNotNullParameter(newSymbol, "newSymbol");
        this.f126289a = symbol;
        this.f126290b = ref2;
        this.f126291c = oldSymbol;
        this.d = newSymbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f126289a, uVar.f126289a) && Intrinsics.f(this.f126290b, uVar.f126290b) && Intrinsics.f(this.f126291c, uVar.f126291c) && Intrinsics.f(this.d, uVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f126289a.hashCode() * 31, 31, this.f126290b), 31, this.f126291c);
    }
}
