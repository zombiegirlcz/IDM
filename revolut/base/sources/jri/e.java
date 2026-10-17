package jri;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.a f178022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f178024c;
    public final int d;
    public final boolean e;

    public e(hri.a flowComponent, boolean z, boolean z3, int i, boolean z4) {
        Intrinsics.checkNotNullParameter(flowComponent, "flowComponent");
        this.f178022a = flowComponent;
        this.f178023b = z;
        this.f178024c = z3;
        this.d = i;
        this.e = z4;
    }

    public static e a(e eVar, boolean z, boolean z3, int i, int i2) {
        hri.a flowComponent = eVar.f178022a;
        if ((i2 & 2) != 0) {
            z = eVar.f178023b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z3 = eVar.f178024c;
        }
        boolean z6 = z3;
        if ((i2 & 8) != 0) {
            i = eVar.d;
        }
        int i3 = i;
        boolean z11 = (i2 & 16) != 0 ? eVar.e : true;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(flowComponent, "flowComponent");
        return new e(flowComponent, z4, z6, i3, z11);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f178022a, eVar.f178022a) && this.f178023b == eVar.f178023b && this.f178024c == eVar.f178024c && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.b(this.d, j6.a.c(j6.a.c(this.f178022a.hashCode() * 31, 31, this.f178023b), 31, this.f178024c), 31);
    }
}
