package o3l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f221854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c70.a f221855b;

    public j(f state, c70.a clipboard) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        this.f221854a = state;
        this.f221855b = clipboard;
    }

    @Override // o3l.d
    public final efm.r B1() {
        return this.f221854a.X().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r D0() {
        return this.f221854a.m0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b E() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // o3l.d
    public final efm.b F0(boolean z) {
        efm.b bVarIgnoreElements = this.f221854a.W().b(Boolean.valueOf(z)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r F1() {
        return this.f221854a.u().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r F2() {
        return this.f221854a.M().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r H2() {
        return this.f221854a.c().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b J(TextLocalisedClause nextButtonText) {
        Intrinsics.checkNotNullParameter(nextButtonText, "nextButtonText");
        efm.b bVarIgnoreElements = this.f221854a.m0().b(nextButtonText).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r K1() {
        return this.f221854a.I().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r L2() {
        return this.f221854a.p0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b M0() {
        efm.b bVarIgnoreElements = this.f221854a.e0().b(Boolean.FALSE).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r O2() {
        return this.f221854a.W().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r Q1() {
        return this.f221854a.L().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b S2(FinishCommand toolbarNextNavigationCommand) {
        Intrinsics.checkNotNullParameter(toolbarNextNavigationCommand, "toolbarNextNavigationCommand");
        efm.b bVarIgnoreElements = this.f221854a.Q().b(toolbarNextNavigationCommand).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.b U(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        efm.b bVarIgnoreElements = this.f221854a.r().b(title).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.b U2() {
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return mVar;
    }

    @Override // o3l.d
    public final efm.r X() {
        return this.f221854a.d0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b X1(int i) {
        efm.b bVarIgnoreElements = this.f221854a.T().b(Integer.valueOf(i)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r Y1() {
        return this.f221854a.l().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r Y2() {
        return this.f221854a.getImage().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b Z(TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        efm.b bVarIgnoreElements = this.f221854a.c().b(subtitle).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r a() {
        return this.f221854a.r().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r b0() {
        return this.f221854a.w().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r d0() {
        efm.r rVarFlatMap = this.f221854a.B().c(te0.s.f270018a).flatMap(new o28.g(new i(this, 0), 19), new o28.g(new nz7.g(26), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // o3l.d
    public final efm.r g1() {
        return this.f221854a.o0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r g2() {
        return this.f221854a.getProgress().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b h(boolean z) {
        efm.b bVarIgnoreElements = this.f221854a.w().b(Boolean.valueOf(z)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.b h1(CharSequence linkText) {
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        efm.b bVarIgnoreElements = this.f221854a.p0().b(linkText).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r i0() {
        return this.f221854a.e0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r i1() {
        return this.f221854a.R().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b j0() {
        Intrinsics.checkNotNullParameter("", "title");
        efm.b bVarIgnoreElements = this.f221854a.R().b("").ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r j1() {
        return this.f221854a.T().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final boolean k1() {
        return ((Boolean) this.f221854a.C().get()).booleanValue();
    }

    @Override // o3l.d
    public final efm.b k2() {
        efm.b bVarIgnoreElements = this.f221854a.X().b(-1).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r l() {
        return this.f221854a.m().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r l1() {
        return this.f221854a.Y().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b l2() {
        efm.b bVarIgnoreElements = this.f221854a.l().b(Boolean.TRUE).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r o0() {
        return this.f221854a.Q().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r p() {
        return this.f221854a.N().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r r1() {
        return this.f221854a.t().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.b s0(CdnImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        efm.b bVarIgnoreElements = this.f221854a.getImage().b(image).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    @Override // o3l.d
    public final efm.r v2() {
        return this.f221854a.p().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r x() {
        return this.f221854a.k0().c(te0.s.f270018a);
    }

    @Override // o3l.d
    public final efm.r z() {
        return this.f221854a.O().c(te0.s.f270018a);
    }
}
