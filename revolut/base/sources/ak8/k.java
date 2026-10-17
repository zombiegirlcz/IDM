package ak8;

import cli.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements g {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f5744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f5745q;

    public k(l stateMapper, f inputData, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.o = inputData;
        this.f5744p = juniorProfileInteractor;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f5745q = mra.d.b(this, new e("", ""), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new j(this, null, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f5745q;
    }
}
