package ehl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f126282c;

    public r(String symbol, String ref2, List list) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f126280a = symbol;
        this.f126281b = ref2;
        this.f126282c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f126280a, rVar.f126280a) && Intrinsics.f(this.f126281b, rVar.f126281b) && Intrinsics.f(this.f126282c, rVar.f126282c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126280a.hashCode() * 31, 31, this.f126281b);
        List list = this.f126282c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
