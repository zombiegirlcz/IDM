package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class l1 extends f1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f222076c;
    public final c d;
    public final long e;

    public /* synthetic */ l1(int i, long j2, Long l2, c cVar, long j3) {
        if (15 != (i & 15)) {
            qlm.j1.f(j1.f222072a.getDescriptor(), i, 15);
            throw null;
        }
        this.f222075b = j2;
        this.f222076c = l2;
        this.d = cVar;
        this.e = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return this.f222075b == l1Var.f222075b && Intrinsics.f(this.f222076c, l1Var.f222076c) && Intrinsics.f(this.d, l1Var.d) && this.e == l1Var.e;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f222075b) * 31;
        Long l2 = this.f222076c;
        return Long.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31);
    }

    public l1(long j2, Long l2, c interest, long j3) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f222075b = j2;
        this.f222076c = l2;
        this.d = interest;
        this.e = j3;
    }
}
