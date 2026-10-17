package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f177801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f177802c;
    public final Long d;

    public /* synthetic */ k1(int i, boolean z, Long l2, Integer num, Long l3) {
        if (15 != (i & 15)) {
            qlm.j1.f(i1.f177795a.getDescriptor(), i, 15);
            throw null;
        }
        this.f177800a = z;
        this.f177801b = l2;
        this.f177802c = num;
        this.d = l3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return this.f177800a == k1Var.f177800a && Intrinsics.f(this.f177801b, k1Var.f177801b) && Intrinsics.f(this.f177802c, k1Var.f177802c) && Intrinsics.f(this.d, k1Var.d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f177800a) * 31;
        Long l2 = this.f177801b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f177802c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.d;
        return iHashCode3 + (l3 != null ? l3.hashCode() : 0);
    }
}
