package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10458b;

    public p1(Clause title, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f10457a = title;
        this.f10458b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f10457a, p1Var.f10457a) && Intrinsics.f(this.f10458b, p1Var.f10458b);
    }

    public final int hashCode() {
        int iHashCode = this.f10457a.hashCode() * 31;
        Clause clause = this.f10458b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
