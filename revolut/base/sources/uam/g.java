package uam;

import ch.qos.logback.core.CoreConstants;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements h, vim.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f278695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f278696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntRange f278697c;

    public g(int i, int i2) {
        this.f278695a = i;
        this.f278696b = i2;
        this.f278697c = new IntRange(i, i2, 1);
    }

    @Override // vim.d
    public final Comparable b() {
        return Integer.valueOf(this.f278697c.f186449b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vim.d
    public final boolean contains(Comparable comparable) {
        return this.f278697c.d(((Number) comparable).intValue());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f278695a == gVar.f278695a && this.f278696b == gVar.f278696b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Integer.valueOf(this.f278697c.f186448a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f278696b) + (Integer.hashCode(this.f278695a) * 31);
    }

    @Override // vim.d
    public final boolean isEmpty() {
        return this.f278697c.isEmpty();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("FpsRange(min=");
        sb6.append(this.f278695a);
        sb6.append(", max=");
        return j6.a.t(sb6, this.f278696b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
