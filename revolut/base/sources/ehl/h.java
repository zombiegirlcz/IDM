package ehl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f126251c;

    public h(String symbol, String ref2, jo3.b fees) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f126249a = symbol;
        this.f126250b = ref2;
        this.f126251c = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f126249a, hVar.f126249a) && Intrinsics.f(this.f126250b, hVar.f126250b) && Intrinsics.f(this.f126251c, hVar.f126251c);
    }

    public final int hashCode() {
        return this.f126251c.hashCode() + p.a.c(this.f126249a.hashCode() * 31, 31, this.f126250b);
    }
}
