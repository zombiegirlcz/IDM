package e05;

import a08.q;
import a08.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.credit.core.ui.progress.CreditProgressContract$Configuration;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract$Configuration;
import cu8.u;
import dz7.k;
import efm.d0;
import efm.r;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.t;
import qfm.r0;
import te0.w;
import tfm.l;
import vz4.j;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends pri.b implements hy4.a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CreditProgressContract$Configuration f121418h;
    public final vz4.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f9b.f f121419j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ln.a f121420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mz4.a f121421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3l.b f121422n;

    public i(CreditProgressContract$Configuration config, vz4.a presentationModel, f9b.f errorView, b router, ln.a navigationCommandsDispatcher, mz4.a commandsFactory, k3l.b statusDialogView) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(commandsFactory, "commandsFactory");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        this.f121418h = config;
        this.i = presentationModel;
        this.f121419j = errorView;
        this.k = router;
        this.f121420l = navigationCommandsDispatcher;
        this.f121421m = commandsFactory;
        this.f121422n = statusDialogView;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        hy4.b view = (hy4.b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ((j) this.i).init();
        CreditProgressContract$Configuration creditProgressContract$Configuration = this.f121418h;
        Intrinsics.i(creditProgressContract$Configuration, "null cannot be cast to non-null type com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract.Configuration");
        ForbearanceSpinnerContract$Configuration forbearanceSpinnerContract$Configuration = (ForbearanceSpinnerContract$Configuration) creditProgressContract$Configuration;
        ufm.b bVarM = d0.m(forbearanceSpinnerContract$Configuration);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        l lVar = new l(bVarM, new dz7.l(new k(8), 5), 4);
        long size = forbearanceSpinnerContract$Configuration.f69946a.size();
        long j2 = forbearanceSpinnerContract$Configuration.f69948c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r rVarZip = r.zip(lVar, r.intervalRange(0L, size, 0L, j2, timeUnit), new dz7.l(new dug.d(29), 6));
        Intrinsics.checkNotNullExpressionValue(rVarZip, "zip(...)");
        r rVarF = o70.a.f(rVarZip);
        f9b.f fVar = this.f121419j;
        r rVarN = hx7.a.N(rVarF, fVar, false, false);
        dug.a aVar2 = new dug.a(view, 21);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new s(8, new h(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.r(15, aVar2), new a08.r(15, function1K), new q(26, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        Intrinsics.i(creditProgressContract$Configuration, "null cannot be cast to non-null type com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerContract.Configuration");
        ForbearanceSpinnerContract$Configuration forbearanceSpinnerContract$Configuration2 = (ForbearanceSpinnerContract$Configuration) creditProgressContract$Configuration;
        long j3 = forbearanceSpinnerContract$Configuration2.f69950h;
        r rVarSkipWhile = r.interval(j3, j3, timeUnit).flatMap(new dz7.l(new doe.c(forbearanceSpinnerContract$Configuration2, this, 26), 9)).skipWhile(new dz7.l(new dkm.a(1, this, i.class, "checkInProgress", "checkInProgress(Lcom/revolut/data/model/Data;)Z", 0, 10), 10));
        Intrinsics.checkNotNullExpressionValue(rVarSkipWhile, "skipWhile(...)");
        d0 d0VarFirstOrError = m70.a.g(rVarSkipWhile, null, null, 3).firstOrError();
        dz7.l lVar2 = new dz7.l(new d(this, 1), 11);
        d0VarFirstOrError.getClass();
        pfm.a aVar3 = new pfm.a(new ufm.i(d0VarFirstOrError, lVar2, 0), new dz7.l(new dkm.a(1, this.f121420l, ln.a.class, "dispatchNavigationAsync", "dispatchNavigationAsync(Lcom/revolut/retail/core/navigation/NaviCommand;)Lio/reactivex/Completable;", 0, 11), 12), 4);
        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
        pfm.a aVar4 = new pfm.a(hx7.a.L(o70.a.g(aVar3), fVar, false, null, 24).m(new dz7.l(new d(this, 2), 13)), new dz7.l(new k(11), 14), 1);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorComplete(...)");
        t tVarR = ue0.e.r(aVar4, h0.f322473a);
        Function1 function1K2 = K();
        pfm.a aVar5 = new pfm.a(tVarR, new s(8, new u(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar5.w(new a08.r(15, function1K2), new q(26, f.f121414a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r rVarFilter = ((k3l.d) this.f121422n).f180813j.filter(new dz7.l(new k(9), 7));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = w.D(rVarFilter, new d(this, 0));
        Function1 function1K3 = K();
        pfm.a aVar6 = new pfm.a(r0VarD, new s(8, new u(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar6.w(new a08.r(15, function1K3), new q(26, g.f121415a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
