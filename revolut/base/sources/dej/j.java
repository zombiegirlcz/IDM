package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f113566b;

    public j(boolean z, s1 s1Var) {
        this.f113565a = z;
        this.f113566b = s1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f113565a == jVar.f113565a && Intrinsics.f(this.f113566b, jVar.f113566b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f113565a) * 31;
        s1 s1Var = this.f113566b;
        return iHashCode + (s1Var == null ? 0 : s1Var.hashCode());
    }

    public final String toString() {
        s1 s1Var = this.f113566b;
        return "revPaySdkDrivenAuthenticationEnabled:" + this.f113565a + " revPayOrderId:" + (s1Var != null ? s1Var.f113646a : null);
    }
}
