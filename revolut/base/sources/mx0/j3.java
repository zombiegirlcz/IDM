package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j3 implements l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3 f209772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209773b;

    public j3() {
        this(null, false, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f209772a, j3Var.f209772a) && this.f209773b == j3Var.f209773b;
    }

    public final int hashCode() {
        i3 i3Var = this.f209772a;
        return Boolean.hashCode(this.f209773b) + ((i3Var == null ? 0 : i3Var.hashCode()) * 31);
    }

    public j3(i3 i3Var, boolean z) {
        this.f209772a = i3Var;
        this.f209773b = z;
    }

    public /* synthetic */ j3(i3 i3Var, boolean z, int i) {
        this((i & 1) != 0 ? null : i3Var, (i & 2) != 0 ? false : z);
    }
}
