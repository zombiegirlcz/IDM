package btg;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f18575b;

    public b() {
        this(false, 3);
    }

    public final Pair a() {
        return this.f18575b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18574a == bVar.f18574a && Intrinsics.f(this.f18575b, bVar.f18575b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f18574a) * 31;
        Pair pair = this.f18575b;
        return iHashCode + (pair == null ? 0 : pair.hashCode());
    }

    public /* synthetic */ b(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (Pair) null);
    }

    public b(boolean z, Pair pair) {
        this.f18574a = z;
        this.f18575b = pair;
    }
}
