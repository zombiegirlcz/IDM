package u3c;

import d3c.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f276902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f276903b;

    public i(c0 cartItem, long j2) {
        Intrinsics.checkNotNullParameter(cartItem, "cartItem");
        this.f276902a = cartItem;
        this.f276903b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f276902a, iVar.f276902a) && this.f276903b == iVar.f276903b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f276903b) + (this.f276902a.hashCode() * 31);
    }
}
