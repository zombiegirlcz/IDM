package com.revolut.feature_retail_user_declarations.risk_assessment.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.risk_assessment.screen.RiskAssessmentScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jci.d;
import jci.f;
import jci.g;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.d0;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/risk_assessment/screen/RiskAssessmentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljci/f;", "Lno/m;", "Ltki/c;", "Ljci/g;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RiskAssessmentScreen extends ViewController<f> implements m, tki.c {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(RiskAssessmentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final RiskAssessmentScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Lazy N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public RiskAssessmentScreen(RiskAssessmentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, jci.b.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = j.b(new Function0(this) { // from class: jci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentScreen f172814b;

            {
                this.f172814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RiskAssessmentScreen riskAssessmentScreen = this.f172814b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RiskAssessmentScreen.S;
                        qji.c cVarZ2 = riskAssessmentScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getT();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskAssessmentScreen.S;
                        qji.b bVarU2 = riskAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.risk_assessment.screen.di.RiskAssessmentScreenInjector");
                        riskAssessmentScreen.K.getClass();
                        d0 d0Var = new d0();
                        d0Var.f223673a = e4m.b.b(new m0m.a(21));
                        return d0Var;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskAssessmentScreen.S;
                        return (com.revolut.feature_retail_user_declarations.risk_assessment.screen.b) ((d0) riskAssessmentScreen.P.getValue()).f223673a.get();
                    default:
                        KProperty[] kPropertyArr4 = RiskAssessmentScreen.S;
                        RiskAssessmentScreen riskAssessmentScreen2 = this.f172814b;
                        return tki.g.a(riskAssessmentScreen2, riskAssessmentScreen2.R2(), u.c((InputChecklistDelegate) riskAssessmentScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.O = w.y0(new ja3.b(3));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentScreen f172814b;

            {
                this.f172814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RiskAssessmentScreen riskAssessmentScreen = this.f172814b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskAssessmentScreen.S;
                        qji.c cVarZ2 = riskAssessmentScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getT();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskAssessmentScreen.S;
                        qji.b bVarU2 = riskAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.risk_assessment.screen.di.RiskAssessmentScreenInjector");
                        riskAssessmentScreen.K.getClass();
                        d0 d0Var = new d0();
                        d0Var.f223673a = e4m.b.b(new m0m.a(21));
                        return d0Var;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskAssessmentScreen.S;
                        return (com.revolut.feature_retail_user_declarations.risk_assessment.screen.b) ((d0) riskAssessmentScreen.P.getValue()).f223673a.get();
                    default:
                        KProperty[] kPropertyArr4 = RiskAssessmentScreen.S;
                        RiskAssessmentScreen riskAssessmentScreen2 = this.f172814b;
                        return tki.g.a(riskAssessmentScreen2, riskAssessmentScreen2.R2(), u.c((InputChecklistDelegate) riskAssessmentScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentScreen f172814b;

            {
                this.f172814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RiskAssessmentScreen riskAssessmentScreen = this.f172814b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskAssessmentScreen.S;
                        qji.c cVarZ2 = riskAssessmentScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getT();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskAssessmentScreen.S;
                        qji.b bVarU2 = riskAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.risk_assessment.screen.di.RiskAssessmentScreenInjector");
                        riskAssessmentScreen.K.getClass();
                        d0 d0Var = new d0();
                        d0Var.f223673a = e4m.b.b(new m0m.a(21));
                        return d0Var;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskAssessmentScreen.S;
                        return (com.revolut.feature_retail_user_declarations.risk_assessment.screen.b) ((d0) riskAssessmentScreen.P.getValue()).f223673a.get();
                    default:
                        KProperty[] kPropertyArr4 = RiskAssessmentScreen.S;
                        RiskAssessmentScreen riskAssessmentScreen2 = this.f172814b;
                        return tki.g.a(riskAssessmentScreen2, riskAssessmentScreen2.R2(), u.c((InputChecklistDelegate) riskAssessmentScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: jci.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RiskAssessmentScreen f172814b;

            {
                this.f172814b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RiskAssessmentScreen riskAssessmentScreen = this.f172814b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RiskAssessmentScreen.S;
                        qji.c cVarZ2 = riskAssessmentScreen.z2();
                        m mVar = cVarZ2 instanceof m ? (m) cVarZ2 : null;
                        if (mVar != null) {
                            return mVar.getT();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = RiskAssessmentScreen.S;
                        qji.b bVarU2 = riskAssessmentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.risk_assessment.screen.di.RiskAssessmentScreenInjector");
                        riskAssessmentScreen.K.getClass();
                        d0 d0Var = new d0();
                        d0Var.f223673a = e4m.b.b(new m0m.a(21));
                        return d0Var;
                    case 2:
                        KProperty[] kPropertyArr3 = RiskAssessmentScreen.S;
                        return (com.revolut.feature_retail_user_declarations.risk_assessment.screen.b) ((d0) riskAssessmentScreen.P.getValue()).f223673a.get();
                    default:
                        KProperty[] kPropertyArr4 = RiskAssessmentScreen.S;
                        RiskAssessmentScreen riskAssessmentScreen2 = this.f172814b;
                        return tki.g.a(riskAssessmentScreen2, riskAssessmentScreen2.R2(), u.c((InputChecklistDelegate) riskAssessmentScreen2.O.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f172820b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return (AnalyticsProduct) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RiskAssessmentScreenContract$InputData riskAssessmentScreenContract$InputData = this.K;
        this.z = riskAssessmentScreenContract$InputData.f97731a.b();
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(riskAssessmentScreenContract$InputData.f97731a.a());
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.onboarding_risk_assessment_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.onboarding_risk_assessment_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new jci.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new jci.c(this, null, 1), 3);
        ?? r56 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r56.getValue()).f52518c), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r56.getValue()).d), null, new a(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final b R2() {
        return (b) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }

    public RiskAssessmentScreen() {
        this(new RiskAssessmentScreenContract$InputData(0));
    }
}
