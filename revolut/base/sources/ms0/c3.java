package ms0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2 f208214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RuntimeException f208215b;

    public c3(t2 model, RuntimeException error) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f208214a = model;
        this.f208215b = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f208214a, c3Var.f208214a) && this.f208215b.equals(c3Var.f208215b);
    }

    public final int hashCode() {
        return this.f208215b.hashCode() + (this.f208214a.hashCode() * 31);
    }

    @Override // ms0.h3
    public final t2 n() {
        return this.f208214a;
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
            return new f3(null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
