package aii;

import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements u, d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f5282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f5283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5284c;

    public e0(u destination, TransitionAnimation transitionAnimation, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f5282a = destination;
        this.f5283b = transitionAnimation;
        this.f5284c = z;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0 */
    public final TransitionAnimation getD() {
        return this.f5283b;
    }

    public final u a() {
        return this.f5282a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f5282a, e0Var.f5282a) && Intrinsics.f(this.f5283b, e0Var.f5283b) && this.f5284c == e0Var.f5284c;
    }

    public final int hashCode() {
        int iHashCode = this.f5282a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f5283b;
        return Boolean.hashCode(this.f5284c) + ((iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode())) * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1 */
    public final boolean getF106015b() {
        return this.f5284c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e0(u uVar, ZoomTransitionAnimation.Widgets widgets, boolean z, int i) {
        TransitionAnimation d = widgets;
        if ((i & 2) != 0) {
            StackDestination stackDestination = uVar instanceof StackDestination ? (StackDestination) uVar : null;
            d = stackDestination != null ? stackDestination.getD() : null;
        }
        if ((i & 4) != 0) {
            StackDestination stackDestination2 = uVar instanceof StackDestination ? (StackDestination) uVar : null;
            z = stackDestination2 != null ? stackDestination2.getF106015b() : true;
        }
        this(uVar, d, z);
    }
}
