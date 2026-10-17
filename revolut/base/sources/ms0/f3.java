package ms0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f208250a;

    public f3(o2 o2Var) {
        this.f208250a = o2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f3) && Intrinsics.f(this.f208250a, ((f3) obj2).f208250a);
    }

    public final int hashCode() {
        o2 o2Var = this.f208250a;
        if (o2Var == null) {
            return 0;
        }
        return o2Var.hashCode();
    }

    @Override // ms0.h3
    public final h3 p(boolean z, u2 sharedState) {
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        o2 o2Var = this.f208250a;
        return o2Var == null ? this : z ? v4.a(o2Var, sharedState) : new c3(o2Var, new RuntimeException("Video failed to load"));
    }

    @Override // ms0.h3
    public final h3 q(t2 model, u2 sharedState) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(sharedState, "sharedState");
        if (model instanceof o2) {
            return v4.a((o2) model, sharedState);
        }
        if (model instanceof p2) {
            return new c3(model, new RuntimeException("Model.Error received"));
        }
        if (model instanceof q2) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }
}
