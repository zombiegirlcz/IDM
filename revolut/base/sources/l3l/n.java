package l3l;

import com.google.android.material.snackbar.Snackbar;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.operation_status.R$id;
import com.revolut.retail.operation_status.screen.OperationStatusActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import qfm.r0;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends pri.a {
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sri.m f191968j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hqi.l f191969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r70.c f191970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f191971n;
    public final npi.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tpi.j f191972p;

    public n(b router, sri.m navigator, h presentationModel, hqi.l toolbarView, r70.c hapticEngine, f9b.f errorView, npi.f dialogView, tpi.j progressView, m3l.e buttonPresenterDelegate) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(buttonPresenterDelegate, "buttonPresenterDelegate");
        this.i = router;
        this.f191968j = navigator;
        this.k = presentationModel;
        this.f191969l = toolbarView;
        this.f191970m = hapticEngine;
        this.f191971n = errorView;
        this.o = dialogView;
        this.f191972p = progressView;
        P(u.c(buttonPresenterDelegate));
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        s sVar = (s) this.i;
        efm.r rVarHide = sVar.e.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarF = o70.a.f(rVarHide);
        m mVar = new m(1, this.o, npi.f.class, "showDialog", "showDialog(Lcom/revolut/retail/common/ui/activity/delegate/dialog/DialogConfiguration;)V", 0, 0);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.r(28, new j2i.c(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(21, mVar), new a0d.g(21, function1K), new j7a.j(2, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        KClass clazz = o0.f186429a.b(npi.e.class);
        npi.c cVar = (npi.c) this.o;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        efm.r rVarOfType = cVar.f218224m.ofType(nim.a.o(clazz));
        Intrinsics.checkNotNullExpressionValue(rVarOfType, "ofType(...)");
        final int i = 0;
        r0 r0VarD = w.D(rVarOfType, new Function1(this) { // from class: l3l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191964b;

            {
                this.f191964b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        npi.e dialogResult = (npi.e) obj2;
                        Intrinsics.checkNotNullParameter(dialogResult, "result");
                        ((s) this.f191964b.i).getClass();
                        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                        pfm.m mVar2 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                        return mVar2;
                    case 1:
                        n nVar = this.f191964b;
                        s sVar2 = (s) nVar.i;
                        sVar2.getClass();
                        pfm.h hVar = new pfm.h(new o(sVar2, 0), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(hVar), nVar.f191971n, false, null, 24), nVar.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    case 2:
                        String message = (String) obj2;
                        Intrinsics.checkNotNullParameter(message, "it");
                        n nVar2 = this.f191964b;
                        r70.c.b(nVar2.f191970m, 3);
                        d dVar = (d) nVar2.L();
                        if (dVar != null) {
                            OperationStatusActivity operationStatusActivity = (OperationStatusActivity) dVar;
                            Intrinsics.checkNotNullParameter(message, "message");
                            Snackbar snackbarMake = Snackbar.make(operationStatusActivity.findViewById(R$id.rootCoordinator), message, -1);
                            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
                            w01.a.a(snackbarMake, operationStatusActivity, 32);
                            snackbarMake.show();
                        }
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        n nVar3 = this.f191964b;
                        s sVar3 = (s) nVar3.i;
                        h hVar2 = sVar3.f191979a;
                        efm.r rVarDoOnNext = ((t) hVar2.f191961b).f191985g.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar3.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 6), 14));
                        efm.r rVarO0 = hVar2.f191960a.o0();
                        v60.i naviCommandsSubject = sVar3.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        efm.b bVarIgnoreElements = efm.r.merge(rVarDoOnNext, rVarO0.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 7), 15))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), nVar3.f191971n, false, null, 24), nVar3.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new a08.r(28, new j2i.c(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a0d.g(21, function1K2), new j7a.j(2, j.f191965a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        efm.r rVarHide2 = sVar.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide2, "hide(...)");
        efm.r rVarF2 = o70.a.f(rVarHide2);
        m mVar2 = new m(1, this.f191968j, sri.m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 1);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new a08.r(28, new j2i.c(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(21, mVar2), new a0d.g(21, function1K3), new j7a.j(2, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r rVarHide3 = ((OperationStatusActivity) view).f104401t0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide3, "hide(...)");
        hqi.l lVar = this.f191969l;
        efm.r rVarMergeWith = rVarHide3.mergeWith(lVar.i());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        final int i2 = 1;
        r0 r0VarD2 = w.D(rVarMergeWith, new Function1(this) { // from class: l3l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191964b;

            {
                this.f191964b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        npi.e dialogResult = (npi.e) obj2;
                        Intrinsics.checkNotNullParameter(dialogResult, "result");
                        ((s) this.f191964b.i).getClass();
                        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                        pfm.m mVar22 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar22, "complete(...)");
                        return mVar22;
                    case 1:
                        n nVar = this.f191964b;
                        s sVar2 = (s) nVar.i;
                        sVar2.getClass();
                        pfm.h hVar = new pfm.h(new o(sVar2, 0), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(hVar), nVar.f191971n, false, null, 24), nVar.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    case 2:
                        String message = (String) obj2;
                        Intrinsics.checkNotNullParameter(message, "it");
                        n nVar2 = this.f191964b;
                        r70.c.b(nVar2.f191970m, 3);
                        d dVar = (d) nVar2.L();
                        if (dVar != null) {
                            OperationStatusActivity operationStatusActivity = (OperationStatusActivity) dVar;
                            Intrinsics.checkNotNullParameter(message, "message");
                            Snackbar snackbarMake = Snackbar.make(operationStatusActivity.findViewById(R$id.rootCoordinator), message, -1);
                            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
                            w01.a.a(snackbarMake, operationStatusActivity, 32);
                            snackbarMake.show();
                        }
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        n nVar3 = this.f191964b;
                        s sVar3 = (s) nVar3.i;
                        h hVar2 = sVar3.f191979a;
                        efm.r rVarDoOnNext = ((t) hVar2.f191961b).f191985g.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar3.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 6), 14));
                        efm.r rVarO0 = hVar2.f191960a.o0();
                        v60.i naviCommandsSubject = sVar3.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        efm.b bVarIgnoreElements = efm.r.merge(rVarDoOnNext, rVarO0.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 7), 15))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), nVar3.f191971n, false, null, 24), nVar3.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        });
        Function1 function1K4 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new a08.r(28, new j2i.c(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(21, function1K4), new j7a.j(2, k.f191966a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        h hVar = this.k;
        efm.r map = hVar.f191962c.flatMap(new l2d.b(new l0c.s(hVar, 10), 11)).map(new l2d.b(new l2d.a(18), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        final int i3 = 2;
        Function1 function1 = new Function1(this) { // from class: l3l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191964b;

            {
                this.f191964b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        npi.e dialogResult = (npi.e) obj2;
                        Intrinsics.checkNotNullParameter(dialogResult, "result");
                        ((s) this.f191964b.i).getClass();
                        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                        pfm.m mVar22 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar22, "complete(...)");
                        return mVar22;
                    case 1:
                        n nVar = this.f191964b;
                        s sVar2 = (s) nVar.i;
                        sVar2.getClass();
                        pfm.h hVar2 = new pfm.h(new o(sVar2, 0), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(hVar2), nVar.f191971n, false, null, 24), nVar.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    case 2:
                        String message = (String) obj2;
                        Intrinsics.checkNotNullParameter(message, "it");
                        n nVar2 = this.f191964b;
                        r70.c.b(nVar2.f191970m, 3);
                        d dVar = (d) nVar2.L();
                        if (dVar != null) {
                            OperationStatusActivity operationStatusActivity = (OperationStatusActivity) dVar;
                            Intrinsics.checkNotNullParameter(message, "message");
                            Snackbar snackbarMake = Snackbar.make(operationStatusActivity.findViewById(R$id.rootCoordinator), message, -1);
                            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
                            w01.a.a(snackbarMake, operationStatusActivity, 32);
                            snackbarMake.show();
                        }
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        n nVar3 = this.f191964b;
                        s sVar3 = (s) nVar3.i;
                        h hVar22 = sVar3.f191979a;
                        efm.r rVarDoOnNext = ((t) hVar22.f191961b).f191985g.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar3.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 6), 14));
                        efm.r rVarO0 = hVar22.f191960a.o0();
                        v60.i naviCommandsSubject = sVar3.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        efm.b bVarIgnoreElements = efm.r.merge(rVarDoOnNext, rVarO0.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 7), 15))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), nVar3.f191971n, false, null, 24), nVar3.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        };
        Function1 function1K5 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = map.onErrorResumeNext(new a08.r(28, new j2i.c(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0d.g(21, function1), new a0d.g(21, function1K5), new j7a.j(2, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        final int i5 = 3;
        r0 r0VarD3 = w.D(lVar.b(), new Function1(this) { // from class: l3l.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f191964b;

            {
                this.f191964b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        npi.e dialogResult = (npi.e) obj2;
                        Intrinsics.checkNotNullParameter(dialogResult, "result");
                        ((s) this.f191964b.i).getClass();
                        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
                        pfm.m mVar22 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar22, "complete(...)");
                        return mVar22;
                    case 1:
                        n nVar = this.f191964b;
                        s sVar2 = (s) nVar.i;
                        sVar2.getClass();
                        pfm.h hVar2 = new pfm.h(new o(sVar2, 0), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(hVar2), nVar.f191971n, false, null, 24), nVar.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    case 2:
                        String message = (String) obj2;
                        Intrinsics.checkNotNullParameter(message, "it");
                        n nVar2 = this.f191964b;
                        r70.c.b(nVar2.f191970m, 3);
                        d dVar = (d) nVar2.L();
                        if (dVar != null) {
                            OperationStatusActivity operationStatusActivity = (OperationStatusActivity) dVar;
                            Intrinsics.checkNotNullParameter(message, "message");
                            Snackbar snackbarMake = Snackbar.make(operationStatusActivity.findViewById(R$id.rootCoordinator), message, -1);
                            Intrinsics.checkNotNullExpressionValue(snackbarMake, "make(...)");
                            w01.a.a(snackbarMake, operationStatusActivity, 32);
                            snackbarMake.show();
                        }
                        return Unit.f186387a;
                    default:
                        ((Integer) obj2).getClass();
                        n nVar3 = this.f191964b;
                        s sVar3 = (s) nVar3.i;
                        h hVar22 = sVar3.f191979a;
                        efm.r rVarDoOnNext = ((t) hVar22.f191961b).f191985g.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar3.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 6), 14));
                        efm.r rVarO0 = hVar22.f191960a.o0();
                        v60.i naviCommandsSubject = sVar3.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        efm.b bVarIgnoreElements = efm.r.merge(rVarDoOnNext, rVarO0.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 7), 15))).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), nVar3.f191971n, false, null, 24), nVar3.f191972p, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        });
        Function1 function1K6 = K();
        pfm.a aVar4 = new pfm.a(r0VarD3, new a08.r(28, new j2i.c(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(21, function1K6), new j7a.j(2, l.f191967a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
