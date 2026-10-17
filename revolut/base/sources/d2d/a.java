package d2d;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f110794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f110795b;

    public a(int i, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.f110794a = i;
        this.f110795b = pair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f110794a == aVar.f110794a && Intrinsics.f(this.f110795b, aVar.f110795b);
    }

    public final int hashCode() {
        return this.f110795b.hashCode() + (Integer.hashCode(this.f110794a) * 31);
    }
}
