package yma;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends ori.a implements o3l.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o3l.d f314924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f314925c;
    public final c d;
    public final ang.f e;
    public final sf0.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l80.h f314926g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final eli.j f314927h;
    public final ihm.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v60.g f314928j;

    public p(ifm.b compositeDisposable, c state, o3l.d operationStatusPresentationModel, ang.f userInteractor, sf0.h serverErrorParser, l80.h timeProvider, eli.j twoFaErrorHandler) {
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(operationStatusPresentationModel, "operationStatusPresentationModel");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        this.f314924b = operationStatusPresentationModel;
        this.f314925c = compositeDisposable;
        this.d = state;
        this.e = userInteractor;
        this.f = serverErrorParser;
        this.f314926g = timeProvider;
        this.f314927h = twoFaErrorHandler;
        this.i = p.a.D("toSerialized(...)");
        this.f314928j = new v60.g(compositeDisposable, new j(this, 2));
    }

    @Override // o3l.d
    public final efm.r B1() {
        return this.f314924b.B1();
    }

    @Override // o3l.d
    public final efm.r D0() {
        return this.f314924b.D0();
    }

    @Override // o3l.d
    public final efm.b E() {
        return this.f314924b.E();
    }

    @Override // o3l.d
    public final efm.b F0(boolean z) {
        return this.f314924b.F0(z);
    }

    @Override // o3l.d
    public final efm.r F1() {
        return this.f314924b.F1();
    }

    @Override // o3l.d
    public final efm.r F2() {
        return this.f314924b.F2();
    }

    @Override // o3l.d
    public final efm.r H2() {
        return this.f314924b.H2();
    }

    @Override // o3l.d
    public final efm.b J(TextLocalisedClause nextButtonText) {
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        return this.f314924b.J(nextButtonText);
    }

    @Override // o3l.d
    public final efm.r K1() {
        return this.f314924b.K1();
    }

    @Override // o3l.d
    public final efm.r L2() {
        return this.f314924b.L2();
    }

    @Override // o3l.d
    public final efm.b M0() {
        return this.f314924b.M0();
    }

    @Override // o3l.d
    public final efm.r O2() {
        return this.f314924b.O2();
    }

    @Override // o3l.d
    public final efm.r Q1() {
        return this.f314924b.Q1();
    }

    @Override // o3l.d
    public final efm.b S2(FinishCommand toolbarNextNavigationCommand) {
        Intrinsics.checkNotNullParameter(toolbarNextNavigationCommand, "toolbarNextNavigationCommand");
        return this.f314924b.S2(toolbarNextNavigationCommand);
    }

    @Override // o3l.d
    public final efm.b U(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return this.f314924b.U(title);
    }

    @Override // o3l.d
    public final efm.b U2() {
        return this.f314924b.U2();
    }

    @Override // o3l.d
    public final efm.r X() {
        return this.f314924b.X();
    }

    @Override // o3l.d
    public final efm.b X1(int i) {
        return this.f314924b.X1(i);
    }

    @Override // o3l.d
    public final efm.r Y1() {
        return this.f314924b.Y1();
    }

    @Override // o3l.d
    public final efm.r Y2() {
        return this.f314924b.Y2();
    }

    @Override // o3l.d
    public final efm.b Z(TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return this.f314924b.Z(subtitle);
    }

    @Override // o3l.d
    public final efm.r a() {
        return this.f314924b.a();
    }

    @Override // o3l.d
    public final efm.r b0() {
        return this.f314924b.b0();
    }

    @Override // o3l.d
    public final efm.r d0() {
        return this.f314924b.d0();
    }

    @Override // o3l.d
    public final efm.r g1() {
        return this.f314924b.g1();
    }

    @Override // o3l.d
    public final efm.r g2() {
        return this.f314924b.g2();
    }

    @Override // o3l.d
    public final efm.b h(boolean z) {
        return this.f314924b.h(z);
    }

    @Override // o3l.d
    public final efm.b h1(CharSequence linkText) {
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        return this.f314924b.h1(linkText);
    }

    @Override // o3l.d
    public final efm.r i0() {
        return this.f314924b.i0();
    }

    @Override // o3l.d
    public final efm.r i1() {
        return this.f314924b.i1();
    }

    @Override // ori.a, nri.a
    public final void i3() {
        efm.r rVarC = ((g) this.d).w0().c(te0.s.f270018a);
        j jVar = new j(this, 3);
        efm.r rVarOnErrorResumeNext = rVarC.onErrorResumeNext(new xz7.f(1, new xy7.n(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(27, jVar), new nw8.d(27, l.f314920a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar = this.f314925c;
        te0.w.j0(bVar, cVarSubscribe);
        efm.d0 d0VarF = this.e.f(false);
        j jVar2 = new j(this, 4);
        ufm.i iVar = new ufm.i(d0VarF, new xz7.f(1, new xy7.n(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new nw8.d(27, jVar2), new nw8.d(27, m.f314921a), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        te0.w.j0(bVar, iVar2);
    }

    @Override // o3l.d
    public final efm.b j0() {
        Intrinsics.checkNotNullParameter("", "title");
        return this.f314924b.j0();
    }

    @Override // o3l.d
    public final efm.r j1() {
        return this.f314924b.j1();
    }

    public final efm.r j3() {
        g gVar = (g) this.d;
        te0.j jVar = gVar.i;
        KProperty[] kPropertyArr = g.k;
        te0.e value = jVar.getValue(gVar, kPropertyArr[6]);
        te0.s sVar = te0.s.f270018a;
        efm.r rVarDistinctUntilChanged = te0.w.l(value.c(sVar), gVar.f314913j.getValue(gVar, kPropertyArr[7]).c(sVar)).map(new yj2.a(24, new j(this, 6))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    @Override // o3l.d
    public final boolean k1() {
        return this.f314924b.k1();
    }

    @Override // o3l.d
    public final efm.b k2() {
        return this.f314924b.k2();
    }

    public final efm.r k3() {
        return ((g) this.d).y0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r l() {
        return this.f314924b.l();
    }

    @Override // o3l.d
    public final efm.r l1() {
        return this.f314924b.l1();
    }

    @Override // o3l.d
    public final efm.b l2() {
        return this.f314924b.l2();
    }

    public final pfm.a l3() {
        efm.d0 d0VarFirstOrError = ((g) this.d).x0().c(te0.s.f270018a).firstOrError();
        yj2.a aVar = new yj2.a(28, new j(this, 9));
        d0VarFirstOrError.getClass();
        pfm.a aVar2 = new pfm.a(d0VarFirstOrError, aVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        return aVar2;
    }

    @Override // o3l.d
    public final efm.r o0() {
        return this.f314924b.o0();
    }

    @Override // o3l.d
    public final efm.r p() {
        return this.f314924b.p();
    }

    @Override // o3l.d
    public final efm.r r1() {
        return this.f314924b.r1();
    }

    @Override // o3l.d
    public final efm.b s0(CdnImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return this.f314924b.s0(image);
    }

    @Override // o3l.d
    public final efm.r v2() {
        return this.f314924b.v2();
    }

    @Override // o3l.d
    public final efm.r x() {
        return this.f314924b.x();
    }

    @Override // o3l.d
    public final efm.r z() {
        return this.f314924b.z();
    }
}
