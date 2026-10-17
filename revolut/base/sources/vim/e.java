package vim;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f289621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f289622b;

    public e(Comparable start, Comparable endInclusive) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(endInclusive, "endInclusive");
        this.f289621a = start;
        this.f289622b = endInclusive;
    }

    @Override // vim.d
    public final Comparable b() {
        return this.f289622b;
    }

    @Override // vim.d
    public final boolean contains(Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(getStart()) >= 0 && value.compareTo(b()) <= 0;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj2).isEmpty()) {
            return true;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f289621a, eVar.f289621a) && Intrinsics.f(this.f289622b, eVar.f289622b);
    }

    @Override // vim.d
    public final Comparable getStart() {
        return this.f289621a;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.f289622b.hashCode() + (this.f289621a.hashCode() * 31);
    }

    @Override // vim.d
    public final boolean isEmpty() {
        return getStart().compareTo(b()) > 0;
    }

    public final String toString() {
        return this.f289621a + ".." + this.f289622b;
    }
}
