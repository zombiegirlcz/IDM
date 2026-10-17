package ujb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f280548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f280549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f280550c;

    public /* synthetic */ d0(int i, long j2, long j3, Long l2) {
        if (7 != (i & 7)) {
            j1.f(b0.f280544a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280548a = j2;
        this.f280549b = j3;
        this.f280550c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f280548a == d0Var.f280548a && this.f280549b == d0Var.f280549b && Intrinsics.f(this.f280550c, d0Var.f280550c);
    }

    public final int hashCode() {
        int iC = a0.d.c(Long.hashCode(this.f280548a) * 31, 31, this.f280549b);
        Long l2 = this.f280550c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }

    public d0(long j2, long j3, Long l2) {
        this.f280548a = j2;
        this.f280549b = j3;
        this.f280550c = l2;
    }
}
