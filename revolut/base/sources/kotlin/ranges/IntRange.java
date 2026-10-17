package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/c;", "Lvim/d;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntRange extends c implements vim.d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final IntRange d = new IntRange(1, 0, 1);

    /* JADX INFO: renamed from: kotlin.ranges.IntRange$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/IntRange$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // vim.d
    public final Comparable b() {
        return Integer.valueOf(this.f186449b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vim.d
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return d(((Number) comparable).intValue());
    }

    public final boolean d(int i) {
        return this.f186448a <= i && i <= this.f186449b;
    }

    @Override // kotlin.ranges.c
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof IntRange)) {
            return false;
        }
        if (isEmpty() && ((IntRange) obj2).isEmpty()) {
            return true;
        }
        IntRange intRange = (IntRange) obj2;
        return this.f186448a == intRange.f186448a && this.f186449b == intRange.f186449b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Integer.valueOf(this.f186448a);
    }

    @Override // kotlin.ranges.c
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f186448a * 31) + this.f186449b;
    }

    @Override // kotlin.ranges.c, vim.d
    public final boolean isEmpty() {
        return this.f186448a > this.f186449b;
    }

    @Override // kotlin.ranges.c
    public final String toString() {
        return this.f186448a + ".." + this.f186449b;
    }
}
