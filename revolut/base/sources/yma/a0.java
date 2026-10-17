package yma;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.profile.impl.ui.details.emailverification.EmailVerificationActivity;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sri.m f314892j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f314893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f314894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ypi.i f314895n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final msb.a f314896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tpi.j f314897q;

    public a0(sri.m navigator, b router, p presentationModel, xpi.g navBarWithToolbarView, ypi.i nextButtonView, f9b.f commandView, msb.a twoFaView, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(commandView, "commandView");
        Intrinsics.checkNotNullParameter(twoFaView, "twoFaView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f314892j = navigator;
        this.k = router;
        this.f314893l = presentationModel;
        this.f314894m = navBarWithToolbarView;
        this.f314895n = nextButtonView;
        this.o = commandView;
        this.f314896p = twoFaView;
        this.f314897q = progressView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        p pVar = this.f314893l;
        pVar.init();
        e0 e0Var = (e0) this.k;
        efm.r rVarMerge = efm.r.merge(e0Var.i.hide(), e0Var.f314903a.k3().flatMap(new r(new b0(e0Var, 5), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r rVarF = o70.a.f(rVarMerge);
        yea.l lVar = new yea.l(1, this.f314892j, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 7);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new twl.o(11, new xy7.n(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        wl3.e eVar = new wl3.e(6, lVar);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(eVar, new wl3.e(6, sVar), new t1i.n(29, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarHide = pVar.i.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarS = mo3.a.s(o70.a.f(rVarHide), this.f314897q);
        f9b.f fVar = this.o;
        fVar.getClass();
        efm.r rVarCompose = rVarS.compose(new f9b.b(true, fVar, (Function1) null, false));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarCompose.onErrorResumeNext(new twl.o(11, new xy7.n(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new wl3.e(6, u.f314935a), new wl3.e(6, sVar), new t1i.n(29, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar2 = new pfm.a(te0.w.D(this.f314895n.s(), new q(this, 0)), new twl.o(11, new w(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new wl3.e(6, sVar), new t1i.n(29, v.f314936a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        efm.r rVarHide2 = ((EmailVerificationActivity) view).f81396w0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        pfm.a aVar3 = new pfm.a(te0.w.D(rVarHide2, new q(this, 1)), new twl.o(11, new w(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new wl3.e(6, sVar), new t1i.n(29, x.f314939a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        xpi.c cVar = (xpi.c) this.f314894m;
        pfm.a aVar4 = new pfm.a(te0.w.D(cVar.b(), new q(this, 2)), new twl.o(11, new w(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new wl3.e(6, sVar), new t1i.n(29, y.f314940a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        pfm.a aVar5 = new pfm.a(te0.w.D(cVar.Q(), new q(this, 3)), new twl.o(11, new xy7.n(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new wl3.e(6, sVar), new t1i.n(29, z.f314941a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.b bVarFlatMapCompletable = efm.r.interval(0L, 1000L, TimeUnit.MILLISECONDS, hhm.f.f152431c).switchMap(new yj2.a(29, new q(this, 4))).distinctUntilChanged().flatMapCompletable(new r(new q(this, 5), 0));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        twl.o oVar = new twl.o(11, new xy7.n(new BreadcrumbException(), 27));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar6 = new pfm.a(bVarFlatMapCompletable, oVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new wl3.e(6, sVar), new t1i.n(29, s.f314933a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        efm.r rVarA = msb.a.a(this.f314896p);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarA.onErrorResumeNext(new twl.o(11, new xy7.n(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new wl3.e(6, t.f314934a), new wl3.e(6, sVar), new t1i.n(29, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
