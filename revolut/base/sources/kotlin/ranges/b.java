package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/ranges/a;", "Lvim/d;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b extends a implements vim.d {
    static {
        new b((char) 1, (char) 0);
    }

    @Override // vim.d
    public final Comparable b() {
        return Character.valueOf(this.f186446b);
    }

    @Override // vim.d
    public final boolean contains(Comparable comparable) {
        char cCharValue = ((Character) comparable).charValue();
        return Intrinsics.k(this.f186445a, cCharValue) <= 0 && Intrinsics.k(cCharValue, this.f186446b) <= 0;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj2).isEmpty()) {
            return true;
        }
        b bVar = (b) obj2;
        return this.f186445a == bVar.f186445a && this.f186446b == bVar.f186446b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Character.valueOf(this.f186445a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f186445a * 31) + this.f186446b;
    }

    @Override // vim.d
    public final boolean isEmpty() {
        return Intrinsics.k(this.f186445a, this.f186446b) > 0;
    }

    public final String toString() {
        return this.f186445a + ".." + this.f186446b;
    }
}
