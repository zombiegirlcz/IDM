package l3l;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wli.x;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f191979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho.t f191980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f191981c;
    public final v60.i d;
    public final v60.i e;

    public s(h presentationModel, ifm.b compositeDisposable, ho.t appAnalyticsTracker, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(appAnalyticsTracker, "appAnalyticsTracker");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f191979a = presentationModel;
        this.f191980b = appAnalyticsTracker;
        this.f191981c = deeplinkHandler;
        this.d = new v60.i();
        this.e = new v60.i();
        t tVar = (t) presentationModel.f191961b;
        efm.k kVarFirstElement = tVar.d.getValue(tVar, t.f191982j[1]).c(te0.s.f270018a).firstElement();
        l2d.b bVar = new l2d.b(new p(this, 1), 22);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, bVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        pfm.a aVar2 = new pfm.a(aVar, new c0(new j2i.c(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a08.s(22, r.f191978a), q.f191977a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(compositeDisposable, hVarW);
    }

    @Override // o3l.e
    public final efm.b a() {
        h hVar = this.f191979a;
        efm.r rVarK1 = hVar.f191960a.K1();
        v60.i naviCommandsSubject = this.d;
        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
        efm.r rVarMerge = efm.r.merge(rVarK1.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 9), 13)), hVar.f191960a.d0(), ((t) hVar.f191961b).f191986h.c(te0.s.f270018a).doOnNext(new l2d.b(new m(1, this.f191980b, ho.t.class, "trackEvent", "trackEvent(Lcom/revolut/analytics/tracking/AnalyticsEvent;)V", 0, 10), 21)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.b bVarIgnoreElements = w.z(rVarMerge, new p(this, 2)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.e
    public final efm.b c(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        pfm.h hVar = new pfm.h(new hc7.a(this, clickData, 28), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // o3l.e
    public final efm.b d() {
        efm.r rVarV2 = this.f191979a.f191960a.v2();
        v60.i naviCommandsSubject = this.d;
        Intrinsics.checkNotNullExpressionValue(naviCommandsSubject, "naviCommandsSubject");
        efm.b bVarIgnoreElements = rVarV2.doOnNext(new l2d.b(new m(1, naviCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 8), 23)).flatMapMaybe(new l2d.b(new p(this, 3), 24)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}
