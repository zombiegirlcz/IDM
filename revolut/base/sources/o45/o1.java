package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class o1 extends f1 {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f222085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f222086c;
    public final c d;
    public final c e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222087g;

    public /* synthetic */ o1(int i, long j2, Long l2, c cVar, c cVar2, long j3, String str) {
        if (63 != (i & 63)) {
            qlm.j1.f(m1.f222082a.getDescriptor(), i, 63);
            throw null;
        }
        this.f222085b = j2;
        this.f222086c = l2;
        this.d = cVar;
        this.e = cVar2;
        this.f = j3;
        this.f222087g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj2;
        return this.f222085b == o1Var.f222085b && Intrinsics.f(this.f222086c, o1Var.f222086c) && Intrinsics.f(this.d, o1Var.d) && Intrinsics.f(this.e, o1Var.e) && this.f == o1Var.f && Intrinsics.f(this.f222087g, o1Var.f222087g);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f222085b) * 31;
        Long l2 = this.f222086c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31)) * 31;
        c cVar = this.e;
        int iC = a0.d.c((iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f);
        String str = this.f222087g;
        return iC + (str != null ? str.hashCode() : 0);
    }

    public o1(long j2, Long l2, c accruedInterest, c cVar, long j3, String str) {
        Intrinsics.checkNotNullParameter(accruedInterest, "accruedInterest");
        this.f222085b = j2;
        this.f222086c = l2;
        this.d = accruedInterest;
        this.e = cVar;
        this.f = j3;
        this.f222087g = str;
    }
}
