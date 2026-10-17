package y99;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends ori.a implements g, o89.a, aa9.a, n89.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ea9.a f311789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa9.b f311790c;
    public final ba9.a d;
    public final yme.a e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ang.f f311791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t70.g f311792h;
    public final eli.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v60.i f311793j;
    public final v60.g k;

    public o(ea9.a emailPresentationModel, aa9.b ltPersonalCodePresentationModel, ba9.a usIdentificationNumbersPresentationModel, yme.a taxResidencyInteractor, i state, ang.f userInteractor, t70.g localization, eli.j twoFaErrorHandler, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(emailPresentationModel, "emailPresentationModel");
        Intrinsics.checkNotNullParameter(ltPersonalCodePresentationModel, "ltPersonalCodePresentationModel");
        Intrinsics.checkNotNullParameter(usIdentificationNumbersPresentationModel, "usIdentificationNumbersPresentationModel");
        Intrinsics.checkNotNullParameter(taxResidencyInteractor, "taxResidencyInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f311789b = emailPresentationModel;
        this.f311790c = ltPersonalCodePresentationModel;
        this.d = usIdentificationNumbersPresentationModel;
        this.e = taxResidencyInteractor;
        this.f = state;
        this.f311791g = userInteractor;
        this.f311792h = localization;
        this.i = twoFaErrorHandler;
        this.f311793j = new v60.i();
        this.k = new v60.g(compositeDisposable, new m(this, 1));
    }

    @Override // n89.b
    public final efm.r A() {
        return this.d.A();
    }

    @Override // o89.a
    public final efm.b B(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return this.f311789b.B(email);
    }

    @Override // n89.b
    public final efm.r D1() {
        return this.d.D1();
    }

    @Override // o89.a
    public final efm.r G0() {
        return this.f311789b.G0();
    }

    @Override // o89.a
    public final efm.r W2() {
        efm.r rVarFromCallable = efm.r.fromCallable(new s2i.i(this, 20));
        Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
        return rVarFromCallable;
    }

    @Override // aa9.a
    public final efm.r Z2() {
        return this.f311790c.Z2();
    }

    @Override // o89.a
    public final efm.r a1() {
        return this.f311789b.a1();
    }

    @Override // aa9.a
    public final void c3(String personalCode, boolean z) {
        Intrinsics.checkNotNullParameter(personalCode, "personalCode");
        this.f311790c.c3(personalCode, z);
    }

    @Override // n89.b
    public final efm.d0 i2() {
        return this.d.i2();
    }

    public final pfm.a j3() {
        efm.k kVarFirstElement = ((g0) this.f).w0().c(te0.s.f270018a).firstElement();
        y25.c cVar = new y25.c(new m(this, 0), 14);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, cVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.r k3() {
        efm.r map = te0.w.l(l3(), ((g0) this.f).z0().c(te0.s.f270018a)).map(new y25.c(new y66.p(28), 18));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r l3() {
        return ((g0) this.f).w0().c(te0.s.f270018a);
    }

    public final pfm.t m3(String str, wi0.b bVar) {
        hoe.a aVar = (hoe.a) this.e;
        w4l.f fVar = ((joe.o) aVar.f154277a).e;
        Unit unit = Unit.f186387a;
        efm.k kVarFirstElement = m70.a.g(pd.b.r(fVar.f(unit, false), new hg4.a(aVar, 24)), null, null, 3).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement, "firstElement(...)");
        efm.k kVarFirstElement2 = m70.a.g(nim.a.w(((joe.o) aVar.f154277a).d.f(unit, false), new hmc.a(24)), null, null, 3).firstElement();
        Intrinsics.checkNotNullExpressionValue(kVarFirstElement2, "firstElement(...)");
        pfm.t tVarL = new pfm.a(te0.w.D0(kVarFirstElement, kVarFirstElement2), new y25.c(new xwd.o(bVar, 8, str, this), 15), 3).l(new l(this, 1));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    @Override // n89.b
    public final void y(String code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.d.y(code, z);
    }

    @Override // aa9.a
    public final efm.r z1() {
        return this.f311790c.z1();
    }
}
