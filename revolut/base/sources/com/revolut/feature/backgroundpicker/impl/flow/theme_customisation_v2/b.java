package com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2;

import bbk.z;
import bn2.a0;
import bn2.e0;
import bn2.j0;
import boh.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ModalStep;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$PostRecreationAction;
import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import com.revolut.kompot.common.ModalDestination;
import com.youTransactor.uCube.rpc.Constants;
import efm.r;
import hm2.e;
import java.util.Set;
import km2.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mra.d;
import oki.h;
import r10.v;
import rla.c;
import tk9.i;
import tnb.k;
import u7k.w;
import um2.c0;
import um2.f0;
import um2.h0;
import um2.k0;
import vjg.g;
import vkm.j2;
import vkm.q;
import yji.l;
import zh9.u0;
import zhm.z0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements um2.b {
    public final k0 A;
    public final y B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final ThemeCustomisationContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k70.a f63788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f63789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h0 f63790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f63791s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f63792t;
    public final e0 u;
    public final j0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lg3.a f63793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f63794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wm2.b f63795y;
    public final gm2.a z;

    public b(ThemeCustomisationContract$InputData inputData, um2.j0 mapper, k70.a themeCompatibilityProvider, v premiumStatusProvider, h0 themeCustomisationDialogProvider, e externalNavigationProvider, x themeCustomisationRepository, e0 themeCustomisationInteractor, j0 themesInteractor, lg3.a checklistChallengesInteractor, g themeCatalog, wm2.b themesHelper, gm2.a backgroundPickerConfig) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(themeCompatibilityProvider, "themeCompatibilityProvider");
        Intrinsics.checkNotNullParameter(premiumStatusProvider, "premiumStatusProvider");
        Intrinsics.checkNotNullParameter(themeCustomisationDialogProvider, "themeCustomisationDialogProvider");
        Intrinsics.checkNotNullParameter(externalNavigationProvider, "externalNavigationProvider");
        Intrinsics.checkNotNullParameter(themeCustomisationRepository, "themeCustomisationRepository");
        Intrinsics.checkNotNullParameter(themeCustomisationInteractor, "themeCustomisationInteractor");
        Intrinsics.checkNotNullParameter(themesInteractor, "themesInteractor");
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(themeCatalog, "themeCatalog");
        Intrinsics.checkNotNullParameter(themesHelper, "themesHelper");
        Intrinsics.checkNotNullParameter(backgroundPickerConfig, "backgroundPickerConfig");
        this.o = inputData;
        this.f63788p = themeCompatibilityProvider;
        this.f63789q = premiumStatusProvider;
        this.f63790r = themeCustomisationDialogProvider;
        this.f63791s = externalNavigationProvider;
        this.f63792t = themeCustomisationRepository;
        this.u = themeCustomisationInteractor;
        this.v = themesInteractor;
        this.f63793w = checklistChallengesInteractor;
        this.f63794x = themeCatalog;
        this.f63795y = themesHelper;
        this.z = backgroundPickerConfig;
        k0 k0Var = new k0();
        this.A = k0Var;
        this.B = d.b(this, new um2.a(new Data(null, null, true, 3, null), inputData.f63760c, inputData.f63758a, Constants.TAG_BOOT_LOADER_VERSION), mapper, k0Var, false, 8);
        this.C = hx7.e.a(this, new w(this, 27));
    }

    @Override // yji.l
    public final void I1() {
        e0 e0Var = this.u;
        Continuation continuation = null;
        l.a1(this, f.e(new t38.e(e0Var.d.a(), 24, e0Var.f17005j, new a0(e0Var, null)), new um2.a0(this, 0)), null, null, new f0(this, continuation, 1), 3);
        Flow flowQ = q.q(new k(e0Var.f17005j, 8));
        v vVar = this.f63789q;
        hma.g gVar = (hma.g) ((c) vVar.f250863b);
        Flow flowQ2 = q.q(rd0.e.b(pd.b.r((r) gVar.f153602h.getValue(), new hg4.a(gVar, 17))));
        Flow flowQ3 = q.q(rd0.e.b((r) ((hma.g) ((c) vVar.f250863b)).f153602h.getValue()));
        l.a1(this, nim.a.v(nim.a.u(new i(2, 9, continuation), u0.m(u0.i(flowQ, flowQ2, flowQ3), q.q(new k(this.v.a(), 9)))), new um2.a0(this, 1)), null, null, new f0(this, continuation, 2), 3);
        l.a1(this, q.q(new z(e0Var.f17005j, 9)), null, null, new rf9.h(this, continuation, 10), 3);
        l.a1(this, q.q(new ba4.x(e0Var.f17005j, e0Var, 6)), null, null, new f0(this, continuation, 0), 3);
        l.a1(this, new i5b.d(rd0.e.b(((sfk.a) vVar.d).a()), 27), null, null, new c0(this, continuation, 2), 3);
    }

    public final void I2() {
        Object value;
        e0 e0Var = this.u;
        j2 j2Var = e0Var.f17005j;
        do {
            value = j2Var.getValue();
        } while (!j2Var.h(value, new ThemeCustomisationSandboxInteractorImpl$SandboxState(e0Var.f17002c.j())));
    }

    public final void J2() {
        h.v2(this.C, new ThemeCustomisationContract$ModalStep.ThemesGallery(((ThemeCustomisationContract$ThemeInfo) zi0.c.I(((um2.a) ((j2) this.B.f22677a).getValue()).f281178b)).f63779b.f94561a.getF94454a()), ModalDestination.Style.POPUP.f98311a);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    public final void K2() {
        ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo;
        y yVar = this.B;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        boolean z = ((um2.a) j2Var.getValue()).f281181h != null;
        this.z.getClass();
        boolean z3 = (((um2.a) j2Var2.getValue()).f281179c == ThemeCustomisationContract$Page.THEME && (themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) ((um2.a) j2Var2.getValue()).f281178b.getContent()) != null) ? !Intrinsics.f(themeCustomisationContract$ThemeInfo.f63779b.f94561a, themeCustomisationContract$ThemeInfo.f63778a.f94561a) : false;
        if (!z) {
            H2(yVar, new uj6.v(22));
            I2();
            if (z3) {
                J2();
                return;
            }
            return;
        }
        Set setI = z0.i(ThemeCustomisationContract$PostRecreationAction.BackToMenu.f63767a, z3 ? ThemeCustomisationContract$PostRecreationAction.OpenThemeGallery.f63769a : null);
        k0 k0Var = this.A;
        k0Var.getClass();
        Intrinsics.checkNotNullParameter(setI, "<set-?>");
        k0Var.f281206c = setI;
        I2();
    }

    public final void L2() {
        X1(new mii.e("sandboxChangesAppliedDialog", new TextLocalisedClause(R$string.appearance_theme_customisation_tooltip_changes_applied_message, null, null, 14), null, 28));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.B;
    }
}
