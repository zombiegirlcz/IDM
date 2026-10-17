package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f10478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f10479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10480c;

    public q0(p0 primaryButtonAction, p0 p0Var, List moreActions) {
        Intrinsics.checkNotNullParameter(primaryButtonAction, "primaryButtonAction");
        Intrinsics.checkNotNullParameter(moreActions, "moreActions");
        this.f10478a = primaryButtonAction;
        this.f10479b = p0Var;
        this.f10480c = moreActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f10478a, q0Var.f10478a) && Intrinsics.f(this.f10479b, q0Var.f10479b) && Intrinsics.f(this.f10480c, q0Var.f10480c);
    }

    public final int hashCode() {
        int iHashCode = this.f10478a.hashCode() * 31;
        p0 p0Var = this.f10479b;
        return this.f10480c.hashCode() + ((iHashCode + (p0Var == null ? 0 : p0Var.hashCode())) * 31);
    }

    public q0(p0 p0Var, p0 p0Var2, int i) {
        this(p0Var, (i & 2) != 0 ? null : p0Var2, zhm.f0.f322471a);
    }
}
