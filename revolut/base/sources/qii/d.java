package qii;

import com.revolut.kompot.common.flow.WrapperFlowStep;
import kotlin.jvm.internal.Intrinsics;
import q5g.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends b {
    public final com.revolut.kompot.navigable.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f246724p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f246725q;

    public d(com.revolut.kompot.navigable.a controller, a resultHandler) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        this.o = controller;
        this.f246724p = resultHandler;
        f0 f0Var = new f0(this, 24);
        this.f246725q = cp5.d.a(this, WrapperFlowStep.f98333a, zhm.f0.f322471a, f0Var);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f246725q;
    }
}
