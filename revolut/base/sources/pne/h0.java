package pne;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f237720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f237721b;

    public /* synthetic */ h0(int i, long j2, long j3) {
        if (3 != (i & 3)) {
            j1.f(f0.f237718a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237720a = j2;
        this.f237721b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f237720a == h0Var.f237720a && this.f237721b == h0Var.f237721b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f237721b) + (Long.hashCode(this.f237720a) * 31);
    }

    public h0(long j2, long j3) {
        this.f237720a = j2;
        this.f237721b = j3;
    }
}
