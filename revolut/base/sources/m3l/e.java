package m3l;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import f9b.f;
import iqi.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l3l.m;
import l3l.p;
import l3l.s;
import l3l.t;
import qfm.r0;
import te0.w;
import tpi.j;
import v60.i;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends pri.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f202609h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f202610j;
    public final l3l.b k;

    public e(h twinVerticalButtonView, f errorView, j progressView, l3l.b router, l3l.h presentationModel) {
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f202609h = twinVerticalButtonView;
        this.i = errorView;
        this.f202610j = progressView;
        this.k = router;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        l3l.d view = (l3l.d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        iqi.b bVar = (iqi.b) this.f202609h;
        bVar.V(false);
        final int i = 0;
        r0 r0VarD = w.D(bVar.O(), new Function1(this) { // from class: m3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f202604b;

            {
                this.f202604b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVar = this.f202604b;
                        s sVar = (s) eVar.k;
                        l3l.h hVar = sVar.f191979a;
                        r rVarX = hVar.f191960a.x();
                        i naviCommandsSubject = sVar.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        r rVarDoOnNext = rVarX.doOnNext(new l2d.b(new m(1, naviCommandsSubject, i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 2), 18));
                        o3l.d dVar = hVar.f191960a;
                        efm.b bVarIgnoreElements = r.merge(rVarDoOnNext, dVar.l().flatMapSingle(new l2d.b(new p(sVar, 0), 19)), ((t) hVar.f191961b).f.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 3), 20)), dVar.U2().C()).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), eVar.i, false, null, 24), eVar.f202610j, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVar2 = this.f202604b;
                        s sVar2 = (s) eVar2.k;
                        l3l.h hVar2 = sVar2.f191979a;
                        r rVarX2 = hVar2.f191960a.X();
                        i naviCommandsSubject2 = sVar2.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject2, "naviCommandsSubject");
                        efm.b bVarIgnoreElements2 = r.merge(rVarX2.doOnNext(new l2d.b(new m(1, naviCommandsSubject2, i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 4), 16)), ((t) hVar2.f191961b).f.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar2.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 5), 17)), hVar2.f191960a.E().C()).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements2), eVar2.i, false, null, 24), eVar2.f202610j, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        });
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new lhi.b(4, new m08.i(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new d(0, function1K), new j7a.j(8, b.f202605a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        final int i2 = 1;
        r0 r0VarD2 = w.D(bVar.Q(), new Function1(this) { // from class: m3l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f202604b;

            {
                this.f202604b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Unit it8 = (Unit) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVar = this.f202604b;
                        s sVar = (s) eVar.k;
                        l3l.h hVar = sVar.f191979a;
                        r rVarX = hVar.f191960a.x();
                        i naviCommandsSubject = sVar.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
                        r rVarDoOnNext = rVarX.doOnNext(new l2d.b(new m(1, naviCommandsSubject, i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 2), 18));
                        o3l.d dVar = hVar.f191960a;
                        efm.b bVarIgnoreElements = r.merge(rVarDoOnNext, dVar.l().flatMapSingle(new l2d.b(new p(sVar, 0), 19)), ((t) hVar.f191961b).f.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 3), 20)), dVar.U2().C()).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                        efm.b bVarU = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements), eVar.i, false, null, 24), eVar.f202610j, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU, "withProgress$default(...)");
                        return bVarU;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e eVar2 = this.f202604b;
                        s sVar2 = (s) eVar2.k;
                        l3l.h hVar2 = sVar2.f191979a;
                        r rVarX2 = hVar2.f191960a.X();
                        i naviCommandsSubject2 = sVar2.d;
                        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject2, "naviCommandsSubject");
                        efm.b bVarIgnoreElements2 = r.merge(rVarX2.doOnNext(new l2d.b(new m(1, naviCommandsSubject2, i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 4), 16)), ((t) hVar2.f191961b).f.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, sVar2.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 5), 17)), hVar2.f191960a.E().C()).ignoreElements();
                        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                        efm.b bVarU2 = mo3.a.u(hx7.a.L(o70.a.g(bVarIgnoreElements2), eVar2.i, false, null, 24), eVar2.f202610j, true);
                        Intrinsics.checkNotNullExpressionValue(bVarU2, "withProgress$default(...)");
                        return bVarU2;
                }
            }
        });
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD2, new lhi.b(4, new m08.i(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new d(0, function1K2), new j7a.j(8, c.f202606a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
    }
}
