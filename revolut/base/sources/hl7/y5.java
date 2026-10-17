package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class y5 {

    @NotNull
    public static final x5 Companion = new x5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a8 f153378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a8 f153379c;

    public /* synthetic */ y5(int i, String str, a8 a8Var, a8 a8Var2) {
        if (7 != (i & 7)) {
            qlm.j1.f(w5.f153351a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153377a = str;
        this.f153378b = a8Var;
        this.f153379c = a8Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj2;
        return Intrinsics.f(this.f153377a, y5Var.f153377a) && Intrinsics.f(this.f153378b, y5Var.f153378b) && Intrinsics.f(this.f153379c, y5Var.f153379c);
    }

    public final int hashCode() {
        int iHashCode = this.f153377a.hashCode() * 31;
        a8 a8Var = this.f153378b;
        int iHashCode2 = (iHashCode + (a8Var == null ? 0 : a8Var.hashCode())) * 31;
        a8 a8Var2 = this.f153379c;
        return iHashCode2 + (a8Var2 != null ? a8Var2.hashCode() : 0);
    }
}
