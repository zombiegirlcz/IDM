package nw8;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kl.c0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nb6.p;
import te0.w;
import tpi.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f219795j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f219796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f219797m;

    public e(g presentationModel, h router, f9b.f errorView, j progressView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f219795j = presentationModel;
        this.k = router;
        this.f219796l = errorView;
        this.f219797m = progressView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.f219795j;
        ((nri.a) obj2).init();
        r rVarHide = ((c) obj2).e.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r rVarTake = rVarHide.take(1L);
        Intrinsics.checkNotNullExpressionValue(rVarTake, "take(...)");
        r rVarN = hx7.a.N(o70.a.f(rVarTake), this.f219796l, false, false);
        Intrinsics.checkNotNullParameter(rVarN, "<this>");
        j progressView = this.f219797m;
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        tpi.i iVar = (tpi.i) progressView;
        iVar.getClass();
        r rVarCompose = rVarN.compose(new tpi.b(iVar, 3));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "withProgress(...)");
        p pVar = new p(1, this.k, h.class, "navigateByVerificationResult", "navigateByVerificationResult(Lcom/revolut/feature/kyc/core/models/VerificationResult;)V", 0, 17);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarCompose.onErrorResumeNext(new c0(new ne0.e(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new d(0, pVar), new d(0, this.i), new j7a.j(20, function0J));
        w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
