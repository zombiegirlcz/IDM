package dki;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class y extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlowStep f115563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransitionAnimation f115565c;
    public final boolean d;

    public y(FlowStep step, boolean z, TransitionAnimation animation, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f115563a = step;
        this.f115564b = z;
        this.f115565c = animation;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f115563a, yVar.f115563a) && this.f115564b == yVar.f115564b && Intrinsics.f(this.f115565c, yVar.f115565c) && this.d == yVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f115565c.hashCode() + j6.a.c(this.f115563a.hashCode() * 31, 31, this.f115564b)) * 31);
    }
}
