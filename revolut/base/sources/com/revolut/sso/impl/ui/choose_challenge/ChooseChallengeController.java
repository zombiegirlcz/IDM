package com.revolut.sso.impl.ui.choose_challenge;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeContract$InputData;
import com.revolut.sso.impl.ui.choose_challenge.ChooseChallengeController;
import dli.a;
import dli.c;
import ill.d;
import ill.e;
import ill.g;
import ill.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.i;
import ljl.q0;
import te0.w;
import tx0.j0;
import vc.s;
import wii.b;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/choose_challenge/ChooseChallengeController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lill/d;", "Ldli/a;", "Lill/e;", "Lwii/b;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChooseChallengeController extends ViewController<d> implements a, b {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ChooseChallengeController.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenChooseChallengeBinding;", 0))};
    public final ChooseChallengeContract$InputData K;
    public final h L;
    public final RowDelegate M;
    public final LargeActionButtonDelegate N;
    public final int O;
    public final ModalTransitionAnimation.Style.POPUP P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public ChooseChallengeController(ChooseChallengeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, g.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new LargeActionButtonDelegate();
        this.O = R$layout.screen_choose_challenge;
        this.P = ModalTransitionAnimation.Style.POPUP.f98391a;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ill.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseChallengeController f162267b;

            {
                this.f162267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChooseChallengeController chooseChallengeController = this.f162267b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseChallengeController.T;
                        return (j) ((ljl.i) chooseChallengeController.S.getValue()).f195976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseChallengeController.T;
                        ChooseChallengeController chooseChallengeController2 = this.f162267b;
                        return dli.f.a(chooseChallengeController2, (j) chooseChallengeController2.Q.getValue(), v.k(chooseChallengeController2.M, chooseChallengeController2.N), R$id.chooseChallengeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChooseChallengeController.T;
                        qji.b bVarU2 = chooseChallengeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.choose_challenge.di.ChooseChallengeControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        ChooseChallengeContract$InputData chooseChallengeContract$InputData = chooseChallengeController.K;
                        chooseChallengeContract$InputData.getClass();
                        return new ljl.i(q0Var, cVar2, chooseChallengeContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ill.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseChallengeController f162267b;

            {
                this.f162267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChooseChallengeController chooseChallengeController = this.f162267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseChallengeController.T;
                        return (j) ((ljl.i) chooseChallengeController.S.getValue()).f195976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseChallengeController.T;
                        ChooseChallengeController chooseChallengeController2 = this.f162267b;
                        return dli.f.a(chooseChallengeController2, (j) chooseChallengeController2.Q.getValue(), v.k(chooseChallengeController2.M, chooseChallengeController2.N), R$id.chooseChallengeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChooseChallengeController.T;
                        qji.b bVarU2 = chooseChallengeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.choose_challenge.di.ChooseChallengeControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        ChooseChallengeContract$InputData chooseChallengeContract$InputData = chooseChallengeController.K;
                        chooseChallengeContract$InputData.getClass();
                        return new ljl.i(q0Var, cVar2, chooseChallengeContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ill.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChooseChallengeController f162267b;

            {
                this.f162267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChooseChallengeController chooseChallengeController = this.f162267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChooseChallengeController.T;
                        return (j) ((ljl.i) chooseChallengeController.S.getValue()).f195976c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ChooseChallengeController.T;
                        ChooseChallengeController chooseChallengeController2 = this.f162267b;
                        return dli.f.a(chooseChallengeController2, (j) chooseChallengeController2.Q.getValue(), v.k(chooseChallengeController2.M, chooseChallengeController2.N), R$id.chooseChallengeScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = ChooseChallengeController.T;
                        qji.b bVarU2 = chooseChallengeController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.sso.impl.ui.choose_challenge.di.ChooseChallengeControllerInjector");
                        ljl.c cVar = (ljl.c) bVarU2;
                        q0 q0Var = cVar.f;
                        ljl.c cVar2 = cVar.f195894g;
                        ChooseChallengeContract$InputData chooseChallengeContract$InputData = chooseChallengeController.K;
                        chooseChallengeContract$InputData.getClass();
                        return new ljl.i(q0Var, cVar2, chooseChallengeContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    @Override // wii.b
    /* JADX INFO: renamed from: P0 */
    public final Boolean getL() {
        return Boolean.FALSE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((dkl.b) value).f115637b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_choose_verify_method_title, null, null, 14);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((dkl.b) value).f115637b.f59410q), null, new iaf.d(this, null, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new ill.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new ill.i(this, null), 3);
    }

    @Override // wii.b
    public final ModalTransitionAnimation.Style d2() {
        return this.P;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF91487e0() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
