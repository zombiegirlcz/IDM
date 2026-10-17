package ux0;

import ix0.v1;
import ix0.w1;
import ix0.x1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1 f283845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f283846b;

    public z(s0 s0Var, x1 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f283846b = s0Var;
        this.f283845a = provider;
    }

    @Override // ix0.w1
    public final void a(v1 transientState) {
        Intrinsics.checkNotNullParameter(transientState, "newState");
        s0 s0Var = this.f283846b;
        l0 l0Var = s0Var.i;
        j0 j0VarP = l0Var instanceof j0 ? (j0) l0Var : null;
        if (j0VarP == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(transientState, "transientState");
        boolean z = transientState != v1.NONE;
        if (j0VarP.i != z) {
            j0VarP = j0.p(j0VarP, null, null, null, null, false, false, z, null, 767);
        }
        s0Var.i(j0VarP);
    }
}
