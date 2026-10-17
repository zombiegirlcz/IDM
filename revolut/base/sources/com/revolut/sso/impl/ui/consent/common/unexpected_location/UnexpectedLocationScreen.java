package com.revolut.sso.impl.ui.consent.common.unexpected_location;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.consent.common.unexpected_location.UnexpectedLocationScreen;
import dkl.t;
import dli.a;
import fb6.j;
import fml.b;
import fml.c;
import fml.f;
import fml.g;
import fml.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.g1;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/consent/common/unexpected_location/UnexpectedLocationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfml/f;", "Ldli/a;", "Lfml/h;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnexpectedLocationScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(UnexpectedLocationScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenUnexpectedLocationBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public UnexpectedLocationScreen(UnexpectedLocationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_unexpected_location;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnexpectedLocationScreen f136477b;

            {
                this.f136477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = UnexpectedLocationScreen.P;
                        UnexpectedLocationScreen unexpectedLocationScreen = this.f136477b;
                        return dli.f.a(unexpectedLocationScreen, (i) unexpectedLocationScreen.O.getValue(), v.k(new MapPlainDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.unexpectedLocationScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = UnexpectedLocationScreen.P;
                        g1 g1Var = (g1) this.f136477b.N.getValue();
                        switch (g1Var.f195951a) {
                            case 0:
                                return (i) g1Var.f195953c.get();
                            default:
                                return (i) g1Var.f195953c.get();
                        }
                }
            }
        });
        this.N = w.y0(new j(this, inputData, 15));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: fml.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UnexpectedLocationScreen f136477b;

            {
                this.f136477b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UnexpectedLocationScreen.P;
                        UnexpectedLocationScreen unexpectedLocationScreen = this.f136477b;
                        return dli.f.a(unexpectedLocationScreen, (i) unexpectedLocationScreen.O.getValue(), v.k(new MapPlainDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate()), R$id.unexpectedLocationScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = UnexpectedLocationScreen.P;
                        g1 g1Var = (g1) this.f136477b.N.getValue();
                        switch (g1Var.f195951a) {
                            case 0:
                                return (i) g1Var.f195953c.get();
                            default:
                                return (i) g1Var.f195953c.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        fml.h uiState = (fml.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f115686c;
        TextLocalisedClause textLocalisedClause = uiState.f136480a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        TwinVerticalButton twinVerticalButton = d3().f115685b;
        g gVar = uiState.f136482c;
        twinVerticalButton.setMainButtonText(gVar.f136478a);
        twinVerticalButton.setMainButtonLoadingTag(gVar.f136479b);
        g gVar2 = uiState.d;
        twinVerticalButton.setSecondaryButtonText(gVar2.f136478a);
        twinVerticalButton.setSecondaryButtonLoadingTag(gVar2.f136479b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f115686c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TwinVerticalButton twinVerticalButton = d3().f115685b;
        twinVerticalButton.setMainButtonStyle(LargeActionButton.ButtonStyle.f58725a);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f115686c.f59410q), null, new c(this, null, 0), 3);
        TwinVerticalButton twinVerticalButton = d3().f115685b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.o0()), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinVerticalButton.p0()), null, new c(this, null, 2), 3);
    }

    public final t d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
