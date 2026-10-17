package vim;

import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements ClosedFloatingPointRange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f289617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f289618b;

    public b(double d, double d5) {
        this.f289617a = d;
        this.f289618b = d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    @Override // vim.d
    public final Comparable b() {
        return Double.valueOf(this.f289618b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vim.d
    public final boolean contains(Comparable comparable) {
        double dDoubleValue = ((Number) comparable).doubleValue();
        return dDoubleValue >= this.f289617a && dDoubleValue <= this.f289618b;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj2).isEmpty()) {
            return true;
        }
        b bVar = (b) obj2;
        return this.f289617a == bVar.f289617a && this.f289618b == bVar.f289618b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Double.valueOf(this.f289617a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Double.hashCode(this.f289618b) + (Double.hashCode(this.f289617a) * 31);
    }

    @Override // vim.d
    public final boolean isEmpty() {
        return this.f289617a > this.f289618b;
    }

    public final String toString() {
        return this.f289617a + ".." + this.f289618b;
    }
}
