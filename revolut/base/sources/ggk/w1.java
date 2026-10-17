package ggk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class w1 implements qf1.d {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f143792b;

    public /* synthetic */ w1(int i, String str, u1 u1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(r1.f143776a.getDescriptor(), i, 3);
            throw null;
        }
        this.f143791a = str;
        this.f143792b = u1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f143791a, w1Var.f143791a) && Intrinsics.f(this.f143792b, w1Var.f143792b);
    }

    public final int hashCode() {
        return this.f143792b.hashCode() + (this.f143791a.hashCode() * 31);
    }

    public w1(String itemId, u1 ageRange) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(ageRange, "ageRange");
        this.f143791a = itemId;
        this.f143792b = ageRange;
    }
}
