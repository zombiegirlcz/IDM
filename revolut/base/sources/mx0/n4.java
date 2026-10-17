package mx0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw0.q f209853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f209854b;

    public n4(gw0.q qVar, Function0 function0) {
        this.f209853a = qVar;
        this.f209854b = function0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f209853a, n4Var.f209853a) && Intrinsics.f(this.f209854b, n4Var.f209854b);
    }

    public final int hashCode() {
        gw0.q qVar = this.f209853a;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        Function0 function0 = this.f209854b;
        return iHashCode + (function0 != null ? function0.hashCode() : 0);
    }
}
