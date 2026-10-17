package gjg;

import com.google.firebase.messaging.t;
import com.revolut.core.extensions.rx.BreadcrumbException;
import fnc.s;
import g0d.m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends nri.a implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yig.a f144286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eli.j f144287c;
    public final ifm.b d;
    public final c e;
    public final tm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tm.g f144288g;

    public j(yig.a trustedMerchantsRepository, eli.j twoFaErrorHandler, ifm.b compositeDisposable, c state, t actionDelegateFactory) {
        Intrinsics.checkNotNullParameter(trustedMerchantsRepository, "trustedMerchantsRepository");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        this.f144286b = trustedMerchantsRepository;
        this.f144287c = twoFaErrorHandler;
        this.d = compositeDisposable;
        this.e = state;
        this.f = actionDelegateFactory.f(new d(this, 2));
        this.f144288g = actionDelegateFactory.f(new d(this, 3));
    }

    @Override // nri.a
    public final void i3() {
        bjg.f fVar = (bjg.f) this.f144286b;
        w4l.f fVar2 = fVar.d;
        Unit unit = Unit.f186387a;
        efm.b bVarFlatMapCompletable = w.l(fVar2.f(unit, true), fVar.e.f(unit, true)).map(new e(new d(this, 0), 0)).flatMapCompletable(new e(new d(this, 1), 1));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        s sVar = new s(new m(new BreadcrumbException(), 28));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarFlatMapCompletable, sVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new a0d.g(15, i.f144285a), h.f144284a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.d, hVarW);
    }

    public final pfm.f j3() {
        bjg.f fVar = (bjg.f) this.f144286b;
        w4l.f fVar2 = fVar.d;
        Unit unit = Unit.f186387a;
        pfm.f fVarO = efm.b.o(v.k(fVar2.g(unit, false), fVar.e.g(unit, false)));
        Intrinsics.checkNotNullExpressionValue(fVarO, "merge(...)");
        return fVarO;
    }
}
