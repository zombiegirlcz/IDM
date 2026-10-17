package nzj;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import efm.r;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements mzj.a, e0m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mzj.a f221077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f221078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f221079c;
    public final t d;

    public i(ifm.b flowDisposable, d state, t pricingPlanInteractor, mzj.a limitsPromptDelegatePresentationModel) {
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(limitsPromptDelegatePresentationModel, "limitsPromptDelegatePresentationModel");
        this.f221077a = limitsPromptDelegatePresentationModel;
        this.f221078b = flowDisposable;
        this.f221079c = state;
        this.d = pricingPlanInteractor;
    }

    @Override // mzj.a
    public final r a() {
        return this.f221077a.a();
    }

    @Override // mzj.a
    public final r b() {
        return this.f221077a.b();
    }

    @Override // mzj.a
    public final r c(mha.m limitType) {
        Intrinsics.checkNotNullParameter(limitType, "limitType");
        return this.f221077a.c(limitType);
    }

    @Override // mzj.a
    public final r d() {
        return this.f221077a.d();
    }

    @Override // mzj.a
    public final AccountId getAccountId() {
        return this.f221077a.getAccountId();
    }

    @Override // e0m.d
    public final void init() {
        r rVarOnErrorResumeNext = this.d.t(true).onErrorResumeNext(new kye.e(new ny7.t(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n1i.b(5, g.f221075a), new n1i.b(5, h.f221076a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        w.j0(this.f221078b, cVarSubscribe);
    }
}
