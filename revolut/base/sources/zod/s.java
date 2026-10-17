package zod;

import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f324030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f324031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final he3.l f324032c;

    public s(double d, i3 i3Var, he3.l categoryType) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        this.f324030a = d;
        this.f324031b = i3Var;
        this.f324032c = categoryType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Double.compare(this.f324030a, sVar.f324030a) == 0 && Intrinsics.f(this.f324031b, sVar.f324031b) && this.f324032c == sVar.f324032c;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f324030a) * 31;
        i3 i3Var = this.f324031b;
        return this.f324032c.hashCode() + ((iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31);
    }
}
