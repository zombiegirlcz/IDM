package y99;

import com.revolut.core.extensions.rx.BreadcrumbException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends nri.a implements h, n89.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f311771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f311772c;
    public final ifm.b d;
    public final v60.i e;

    public e0(i state, g presentationModel, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f311771b = state;
        this.f311772c = presentationModel;
        this.d = compositeDisposable;
        this.e = new v60.i();
    }

    @Override // ln.d
    public final efm.r T() {
        v60.i navigationCommandsSubject = this.e;
        Intrinsics.checkNotNullExpressionValue(navigationCommandsSubject, "navigationCommandsSubject");
        return navigationCommandsSubject;
    }

    @Override // nri.a
    public final void i3() {
        o oVar = (o) this.f311772c;
        efm.r rVarFlatMapMaybe = te0.w.r0(oVar.l3(), -1).skip(1L).flatMapMaybe(new y25.c(new y(this, 0), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapMaybe, "flatMapMaybe(...)");
        v60.i navigationCommandsSubject = this.e;
        Intrinsics.checkNotNullExpressionValue(navigationCommandsSubject, "navigationCommandsSubject");
        xlb.o oVar2 = new xlb.o(1, navigationCommandsSubject, v60.i.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 26);
        efm.r rVarOnErrorResumeNext = rVarFlatMapMaybe.onErrorResumeNext(new nw8.d(26, new xy7.n(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new xy7.l(2, oVar2), new xy7.l(2, d0.f311769a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar = this.d;
        te0.w.j0(bVar, cVarSubscribe);
        v60.i iVar = oVar.f311793j;
        efm.r rVarHide = ((ihm.j) oVar.k.d).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarMerge = efm.r.merge(iVar, rVarHide);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r map = te0.w.l(oVar.l3(), ((g0) oVar.f).z0().c(te0.s.f270018a)).map(new y25.c(new y66.p(27), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarFlatMapCompletable = te0.w.B0(rVarMerge, map).flatMapCompletable(new y25.c(new y(this, 1), 21));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        nw8.d dVar = new nw8.d(26, new xy7.n(new BreadcrumbException(), 19));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new xy7.l(2, c0.f311768a), b0.f311765a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
    }

    public final efm.k j3() {
        efm.r map = ((o) this.f311772c).l3().map(new y25.c(new y66.p(29), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.k kVarFirstElement = map.firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        return kVarFirstElement;
    }

    public final pfm.a k3() {
        o oVar = (o) this.f311772c;
        efm.k kVarFirstElement = oVar.k3().firstElement();
        y25.c cVar = new y25.c(new m(oVar, 2), 17);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, cVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
