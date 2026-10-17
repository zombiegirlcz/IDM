package com.revolut.feature_retail_user_declarations.gender;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.gender.GenderScreen;
import com.revolut.feature_retail_user_declarations.gender.GenderScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mbi.d;
import mbi.i;
import mbi.j;
import mbi.k;
import no.m;
import oai.i0;
import oai.p;
import oai.q;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/gender/GenderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmbi/i;", "Ltki/c;", "Lmbi/k;", "Lno/m;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GenderScreen extends ViewController<i> implements c, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(GenderScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final GenderScreenContract$InputData K;
    public final Object L;
    public final int M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public GenderScreen(GenderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: mbi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GenderScreen f204221b;

            {
                this.f204221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GenderScreen genderScreen = this.f204221b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GenderScreen.U;
                        qji.c cVarZ2 = genderScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = GenderScreen.U;
                        qji.b bVarU2 = genderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.gender.di.GenderScreenInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        GenderScreenContract$InputData genderScreenContract$InputData = genderScreen.K;
                        genderScreenContract$InputData.getClass();
                        return new p(i0Var, qVar2, genderScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = GenderScreen.U;
                        return (j) ((p) genderScreen.O.getValue()).f223754b.get();
                    case 3:
                        KProperty[] kPropertyArr4 = GenderScreen.U;
                        return new SelectableDelegate((RowDelegate) genderScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr5 = GenderScreen.U;
                        GenderScreen genderScreen2 = this.f204221b;
                        return tki.g.a(genderScreen2, genderScreen2.R2(), u.c((SelectableDelegate) genderScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = true;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mbi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GenderScreen f204221b;

            {
                this.f204221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GenderScreen genderScreen = this.f204221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GenderScreen.U;
                        qji.c cVarZ2 = genderScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = GenderScreen.U;
                        qji.b bVarU2 = genderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.gender.di.GenderScreenInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        GenderScreenContract$InputData genderScreenContract$InputData = genderScreen.K;
                        genderScreenContract$InputData.getClass();
                        return new p(i0Var, qVar2, genderScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = GenderScreen.U;
                        return (j) ((p) genderScreen.O.getValue()).f223754b.get();
                    case 3:
                        KProperty[] kPropertyArr4 = GenderScreen.U;
                        return new SelectableDelegate((RowDelegate) genderScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr5 = GenderScreen.U;
                        GenderScreen genderScreen2 = this.f204221b;
                        return tki.g.a(genderScreen2, genderScreen2.R2(), u.c((SelectableDelegate) genderScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mbi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GenderScreen f204221b;

            {
                this.f204221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GenderScreen genderScreen = this.f204221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GenderScreen.U;
                        qji.c cVarZ2 = genderScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = GenderScreen.U;
                        qji.b bVarU2 = genderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.gender.di.GenderScreenInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        GenderScreenContract$InputData genderScreenContract$InputData = genderScreen.K;
                        genderScreenContract$InputData.getClass();
                        return new p(i0Var, qVar2, genderScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = GenderScreen.U;
                        return (j) ((p) genderScreen.O.getValue()).f223754b.get();
                    case 3:
                        KProperty[] kPropertyArr4 = GenderScreen.U;
                        return new SelectableDelegate((RowDelegate) genderScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr5 = GenderScreen.U;
                        GenderScreen genderScreen2 = this.f204221b;
                        return tki.g.a(genderScreen2, genderScreen2.R2(), u.c((SelectableDelegate) genderScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = s.t(this, mbi.c.f);
        this.R = w.y0(new m3g.c(18));
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: mbi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GenderScreen f204221b;

            {
                this.f204221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                GenderScreen genderScreen = this.f204221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GenderScreen.U;
                        qji.c cVarZ2 = genderScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = GenderScreen.U;
                        qji.b bVarU2 = genderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.gender.di.GenderScreenInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        GenderScreenContract$InputData genderScreenContract$InputData = genderScreen.K;
                        genderScreenContract$InputData.getClass();
                        return new p(i0Var, qVar2, genderScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = GenderScreen.U;
                        return (j) ((p) genderScreen.O.getValue()).f223754b.get();
                    case 3:
                        KProperty[] kPropertyArr4 = GenderScreen.U;
                        return new SelectableDelegate((RowDelegate) genderScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr5 = GenderScreen.U;
                        GenderScreen genderScreen2 = this.f204221b;
                        return tki.g.a(genderScreen2, genderScreen2.R2(), u.c((SelectableDelegate) genderScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: mbi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GenderScreen f204221b;

            {
                this.f204221b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                GenderScreen genderScreen = this.f204221b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GenderScreen.U;
                        qji.c cVarZ2 = genderScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getR();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = GenderScreen.U;
                        qji.b bVarU2 = genderScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.gender.di.GenderScreenInjector");
                        q qVar = (q) bVarU2;
                        i0 i0Var = qVar.f223759b;
                        q qVar2 = qVar.f223760c;
                        GenderScreenContract$InputData genderScreenContract$InputData = genderScreen.K;
                        genderScreenContract$InputData.getClass();
                        return new p(i0Var, qVar2, genderScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = GenderScreen.U;
                        return (j) ((p) genderScreen.O.getValue()).f223754b.get();
                    case 3:
                        KProperty[] kPropertyArr4 = GenderScreen.U;
                        return new SelectableDelegate((RowDelegate) genderScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr5 = GenderScreen.U;
                        GenderScreen genderScreen2 = this.f204221b;
                        return tki.g.a(genderScreen2, genderScreen2.R2(), u.c((SelectableDelegate) genderScreen2.S.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f204226b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return (AnalyticsProduct) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        GenderScreenContract$InputData genderScreenContract$InputData = this.K;
        this.z = genderScreenContract$InputData.f97651c.b();
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(genderScreenContract$InputData.f97651c.a());
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.gender_selection_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.gender_selection_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.gender_selection_subtitle, u.c(new TextLocalisedClause(R$string.gender_selection_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "ID_NAVBAR_DESCRIPTION_LINK", false), 10)), null, 12));
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.x0()), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(((SelectableDelegate) this.S.getValue()).r()), new mbi.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
