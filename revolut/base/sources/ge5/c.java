package ge5;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f143224b;

    public c(int i, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.f143223a = i;
        this.f143224b = pair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f143223a == cVar.f143223a && Intrinsics.f(this.f143224b, cVar.f143224b);
    }

    public final int hashCode() {
        return this.f143224b.hashCode() + (Integer.hashCode(this.f143223a) * 31);
    }
}
