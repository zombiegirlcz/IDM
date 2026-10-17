package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/e;", "Lkotlin/ranges/d;", "Lvim/d;", "", "", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends d implements vim.d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final e d = new e(1, 0);

    /* JADX INFO: renamed from: kotlin.ranges.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/ranges/e$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public e(long j2, long j3) {
        super(j2, j3, 1L);
    }

    @Override // vim.d
    public final Comparable b() {
        return Long.valueOf(this.f186452b);
    }

    public final boolean c(long j2) {
        return this.f186451a <= j2 && j2 <= this.f186452b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vim.d
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return c(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.d
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj2).isEmpty()) {
            return true;
        }
        e eVar = (e) obj2;
        return this.f186451a == eVar.f186451a && this.f186452b == eVar.f186452b;
    }

    @Override // vim.d
    public final Comparable getStart() {
        return Long.valueOf(this.f186451a);
    }

    @Override // kotlin.ranges.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j2 = this.f186451a;
        long j3 = ((long) 31) * (j2 ^ (j2 >>> 32));
        long j5 = this.f186452b;
        return (int) (j3 + (j5 ^ (j5 >>> 32)));
    }

    @Override // kotlin.ranges.d, vim.d
    public final boolean isEmpty() {
        return this.f186451a > this.f186452b;
    }

    @Override // kotlin.ranges.d
    public final String toString() {
        return this.f186451a + ".." + this.f186452b;
    }
}
