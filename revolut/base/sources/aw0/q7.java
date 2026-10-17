package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10494c;
    public final float d;

    public q7(Clause clause, Clause averageValue, Clause clause2, float f) {
        Intrinsics.checkNotNullParameter(averageValue, "averageValue");
        this.f10492a = clause;
        this.f10493b = averageValue;
        this.f10494c = clause2;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj2;
        return Intrinsics.f(this.f10492a, q7Var.f10492a) && Intrinsics.f(this.f10493b, q7Var.f10493b) && Intrinsics.f(this.f10494c, q7Var.f10494c) && Float.compare(this.d, q7Var.d) == 0;
    }

    public final int hashCode() {
        Clause clause = this.f10492a;
        int iA = p.a.a((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f10493b);
        Clause clause2 = this.f10494c;
        return Float.hashCode(this.d) + ((iA + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
