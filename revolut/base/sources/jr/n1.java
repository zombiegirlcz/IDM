package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f177811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f177812c;
    public final Long d;
    public final Integer e;

    public /* synthetic */ n1(int i, boolean z, Long l2, Integer num, Long l3, Integer num2) {
        if (31 != (i & 31)) {
            qlm.j1.f(l1.f177805a.getDescriptor(), i, 31);
            throw null;
        }
        this.f177810a = z;
        this.f177811b = l2;
        this.f177812c = num;
        this.d = l3;
        this.e = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return this.f177810a == n1Var.f177810a && Intrinsics.f(this.f177811b, n1Var.f177811b) && Intrinsics.f(this.f177812c, n1Var.f177812c) && Intrinsics.f(this.d, n1Var.d) && Intrinsics.f(this.e, n1Var.e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f177810a) * 31;
        Long l2 = this.f177811b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f177812c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }
}
