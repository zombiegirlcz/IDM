package mx0;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f209923b;

    public p4(List value, Function0 function0) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f209922a = value;
        this.f209923b = function0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj2;
        return Intrinsics.f(this.f209922a, p4Var.f209922a) && Intrinsics.f(this.f209923b, p4Var.f209923b);
    }

    public final int hashCode() {
        int iHashCode = this.f209922a.hashCode() * 31;
        Function0 function0 = this.f209923b;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }
}
