package vim;

import kotlin.ranges.ClosedFloatingPointRange;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements ClosedFloatingPointRange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f289619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f289620b;

    public c(float f, float f4) {
        this.f289619a = f;
        this.f289620b = f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedFloatingPointRange
    public final boolean a(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    @Override // vim.d
    public final Comparable b() {
        return Float.valueOf(this.f289620b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vim.d
    public final boolean contains(Comparable comparable) {
        float fFloatValue = ((Number) comparable).floatValue();
        return fFloatValue >= this.f289619a && fFloatValue <= this.f289620b;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj2).isEmpty()) {
            return true;
        }
        c cVar = (c) obj2;
        return this.f289619a == cVar.f289619a && this.f289620b == cVar.f289620b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Float.valueOf(this.f289619a);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.f289620b) + (Float.hashCode(this.f289619a) * 31);
    }

    @Override // vim.d
    public final boolean isEmpty() {
        return this.f289619a > this.f289620b;
    }

    public final String toString() {
        return this.f289619a + ".." + this.f289620b;
    }
}
