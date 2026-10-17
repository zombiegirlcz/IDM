package ehl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126276c;

    public p(String symbol, String ref2, List list) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f126274a = symbol;
        this.f126275b = ref2;
        this.f126276c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f126274a, pVar.f126274a) && Intrinsics.f(this.f126275b, pVar.f126275b) && Intrinsics.f(this.f126276c, pVar.f126276c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126274a.hashCode() * 31, 31, this.f126275b);
        List list = this.f126276c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
