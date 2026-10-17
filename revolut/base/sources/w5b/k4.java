package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class k4 {

    @NotNull
    public static final j4 Companion = new j4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3 f294899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f294900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q4 f294901c;

    public /* synthetic */ k4(int i, j3 j3Var, e4 e4Var, q4 q4Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(i4.f294876a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294899a = j3Var;
        this.f294900b = e4Var;
        this.f294901c = q4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj2;
        return Intrinsics.f(this.f294899a, k4Var.f294899a) && Intrinsics.f(this.f294900b, k4Var.f294900b) && Intrinsics.f(this.f294901c, k4Var.f294901c);
    }

    public final int hashCode() {
        int iHashCode = this.f294899a.hashCode() * 31;
        e4 e4Var = this.f294900b;
        return this.f294901c.f294987a.hashCode() + ((iHashCode + (e4Var == null ? 0 : e4Var.f294824a.hashCode())) * 31);
    }

    public k4(j3 overview, e4 e4Var, q4 transactions) {
        Intrinsics.checkNotNullParameter(overview, "overview");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f294899a = overview;
        this.f294900b = e4Var;
        this.f294901c = transactions;
    }
}
