package l3l;

import a08.o0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements o3l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3l.d f191960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f191961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f191962c;

    public h(o3l.d operationStatusStepPresentationModel, c state, tul.b successScreenTrackerInteractor, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(operationStatusStepPresentationModel, "operationStatusStepPresentationModel");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(successScreenTrackerInteractor, "successScreenTrackerInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f191960a = operationStatusStepPresentationModel;
        this.f191961b = state;
        this.f191962c = v0.a.d("create(...)");
        t tVar = (t) state;
        if (Intrinsics.f(w.O(tVar.f191984c.getValue(tVar, t.f191982j[0])), Boolean.TRUE)) {
            pfm.a aVar = new pfm.a(((aua.f) successScreenTrackerInteractor.f274637b).b(), new yta.c(0, new yo7.p(successScreenTrackerInteractor, 25)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            pfm.a aVar2 = new pfm.a(aVar, new kgm.c(new j2i.c(new BreadcrumbException(), 16), (byte) 0), 2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar2.w(new o0(29, g.f191959a), f.f191958a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            w.j0(compositeDisposable, hVarW);
        }
    }

    @Override // o3l.d
    public final efm.r B1() {
        return this.f191960a.B1();
    }

    @Override // o3l.d
    public final efm.r D0() {
        return this.f191960a.D0();
    }

    @Override // o3l.d
    public final efm.b E() {
        return this.f191960a.E();
    }

    @Override // o3l.d
    public final efm.b F0(boolean z) {
        return this.f191960a.F0(z);
    }

    @Override // o3l.d
    public final efm.r F1() {
        return this.f191960a.F1();
    }

    @Override // o3l.d
    public final efm.r F2() {
        return this.f191960a.F2();
    }

    @Override // o3l.d
    public final efm.r H2() {
        return this.f191960a.H2();
    }

    @Override // o3l.d
    public final efm.b J(TextLocalisedClause nextButtonText) {
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        return this.f191960a.J(nextButtonText);
    }

    @Override // o3l.d
    public final efm.r K1() {
        return this.f191960a.K1();
    }

    @Override // o3l.d
    public final efm.r L2() {
        return this.f191960a.L2();
    }

    @Override // o3l.d
    public final efm.b M0() {
        return this.f191960a.M0();
    }

    @Override // o3l.d
    public final efm.r O2() {
        return this.f191960a.O2();
    }

    @Override // o3l.d
    public final efm.r Q1() {
        return this.f191960a.Q1();
    }

    @Override // o3l.d
    public final efm.b S2(FinishCommand toolbarNextNavigationCommand) {
        Intrinsics.checkNotNullParameter(toolbarNextNavigationCommand, "toolbarNextNavigationCommand");
        return this.f191960a.S2(toolbarNextNavigationCommand);
    }

    @Override // o3l.d
    public final efm.b U(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return this.f191960a.U(title);
    }

    @Override // o3l.d
    public final efm.b U2() {
        return this.f191960a.U2();
    }

    @Override // o3l.d
    public final efm.r X() {
        return this.f191960a.X();
    }

    @Override // o3l.d
    public final efm.b X1(int i) {
        return this.f191960a.X1(i);
    }

    @Override // o3l.d
    public final efm.r Y1() {
        return this.f191960a.Y1();
    }

    @Override // o3l.d
    public final efm.r Y2() {
        return this.f191960a.Y2();
    }

    @Override // o3l.d
    public final efm.b Z(TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return this.f191960a.Z(subtitle);
    }

    @Override // o3l.d
    public final efm.r a() {
        return this.f191960a.a();
    }

    @Override // o3l.d
    public final efm.r b0() {
        return this.f191960a.b0();
    }

    @Override // o3l.d
    public final efm.r d0() {
        return this.f191960a.d0();
    }

    @Override // o3l.d
    public final efm.r g1() {
        return this.f191960a.g1();
    }

    @Override // o3l.d
    public final efm.r g2() {
        return this.f191960a.g2();
    }

    @Override // o3l.d
    public final efm.b h(boolean z) {
        return this.f191960a.h(z);
    }

    @Override // o3l.d
    public final efm.b h1(CharSequence linkText) {
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        return this.f191960a.h1(linkText);
    }

    @Override // o3l.d
    public final efm.r i0() {
        return this.f191960a.i0();
    }

    @Override // o3l.d
    public final efm.r i1() {
        return this.f191960a.i1();
    }

    @Override // o3l.d
    public final efm.b j0() {
        Intrinsics.checkNotNullParameter("", "title");
        return this.f191960a.j0();
    }

    @Override // o3l.d
    public final efm.r j1() {
        return this.f191960a.j1();
    }

    @Override // o3l.d
    public final boolean k1() {
        return this.f191960a.k1();
    }

    @Override // o3l.d
    public final efm.b k2() {
        return this.f191960a.k2();
    }

    @Override // o3l.d
    public final efm.r l() {
        return this.f191960a.l();
    }

    @Override // o3l.d
    public final efm.r l1() {
        return this.f191960a.l1();
    }

    @Override // o3l.d
    public final efm.b l2() {
        return this.f191960a.l2();
    }

    @Override // o3l.d
    public final efm.r o0() {
        return this.f191960a.o0();
    }

    @Override // o3l.d
    public final efm.r p() {
        return this.f191960a.p();
    }

    @Override // o3l.d
    public final efm.r r1() {
        return this.f191960a.r1();
    }

    @Override // o3l.d
    public final efm.b s0(CdnImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return this.f191960a.s0(image);
    }

    @Override // o3l.d
    public final efm.r v2() {
        return this.f191960a.v2();
    }

    @Override // o3l.d
    public final efm.r x() {
        return this.f191960a.x();
    }

    @Override // o3l.d
    public final efm.r z() {
        return this.f191960a.z();
    }
}
