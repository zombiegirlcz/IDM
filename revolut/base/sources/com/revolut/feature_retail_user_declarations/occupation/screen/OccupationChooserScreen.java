package com.revolut.feature_retail_user_declarations.occupation.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreen;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.i0;
import oai.u;
import te0.w;
import u7k.f0;
import ubi.b;
import ubi.c;
import ubi.d;
import ubi.g;
import ubi.l;
import vc.s;
import xki.e;
import yji.o;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/occupation/screen/OccupationChooserScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lubi/g;", "Ldli/a;", "Lubi/h;", "Lno/m;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OccupationChooserScreen extends ViewController<g> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(OccupationChooserScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final OccupationChooserScreenContract$InputData K;
    public final h L;
    public final FiltersDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;

    public OccupationChooserScreen(OccupationChooserScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new FiltersDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ubi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserScreen f278899b;

            {
                this.f278899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OccupationChooserScreen occupationChooserScreen = this.f278899b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationChooserScreen.T;
                        o oVar = occupationChooserScreen.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = OccupationChooserScreen.T;
                        qji.b bVarU2 = occupationChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.occupation.screen.di.OccupationChooserScreenInjector");
                        u uVar = (u) bVarU2;
                        i0 i0Var = uVar.f223776b;
                        u uVar2 = uVar.f223777c;
                        OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = occupationChooserScreen.K;
                        occupationChooserScreenContract$InputData.getClass();
                        return new oai.w(i0Var, uVar2, occupationChooserScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OccupationChooserScreen.T;
                        return (l) ((oai.w) occupationChooserScreen.P.getValue()).f223782b.get();
                    default:
                        KProperty[] kPropertyArr4 = OccupationChooserScreen.T;
                        OccupationChooserScreen occupationChooserScreen2 = this.f278899b;
                        return dli.f.a(occupationChooserScreen2, occupationChooserScreen2.R2(), v.k(occupationChooserScreen2.M, occupationChooserScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ubi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserScreen f278899b;

            {
                this.f278899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OccupationChooserScreen occupationChooserScreen = this.f278899b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationChooserScreen.T;
                        o oVar = occupationChooserScreen.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = OccupationChooserScreen.T;
                        qji.b bVarU2 = occupationChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.occupation.screen.di.OccupationChooserScreenInjector");
                        u uVar = (u) bVarU2;
                        i0 i0Var = uVar.f223776b;
                        u uVar2 = uVar.f223777c;
                        OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = occupationChooserScreen.K;
                        occupationChooserScreenContract$InputData.getClass();
                        return new oai.w(i0Var, uVar2, occupationChooserScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OccupationChooserScreen.T;
                        return (l) ((oai.w) occupationChooserScreen.P.getValue()).f223782b.get();
                    default:
                        KProperty[] kPropertyArr4 = OccupationChooserScreen.T;
                        OccupationChooserScreen occupationChooserScreen2 = this.f278899b;
                        return dli.f.a(occupationChooserScreen2, occupationChooserScreen2.R2(), v.k(occupationChooserScreen2.M, occupationChooserScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ubi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserScreen f278899b;

            {
                this.f278899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OccupationChooserScreen occupationChooserScreen = this.f278899b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationChooserScreen.T;
                        o oVar = occupationChooserScreen.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = OccupationChooserScreen.T;
                        qji.b bVarU2 = occupationChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.occupation.screen.di.OccupationChooserScreenInjector");
                        u uVar = (u) bVarU2;
                        i0 i0Var = uVar.f223776b;
                        u uVar2 = uVar.f223777c;
                        OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = occupationChooserScreen.K;
                        occupationChooserScreenContract$InputData.getClass();
                        return new oai.w(i0Var, uVar2, occupationChooserScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OccupationChooserScreen.T;
                        return (l) ((oai.w) occupationChooserScreen.P.getValue()).f223782b.get();
                    default:
                        KProperty[] kPropertyArr4 = OccupationChooserScreen.T;
                        OccupationChooserScreen occupationChooserScreen2 = this.f278899b;
                        return dli.f.a(occupationChooserScreen2, occupationChooserScreen2.R2(), v.k(occupationChooserScreen2.M, occupationChooserScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: ubi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OccupationChooserScreen f278899b;

            {
                this.f278899b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                OccupationChooserScreen occupationChooserScreen = this.f278899b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OccupationChooserScreen.T;
                        o oVar = occupationChooserScreen.f98405m;
                        m mVar = oVar instanceof m ? (m) oVar : null;
                        if (mVar != null) {
                            return mVar.getL();
                        }
                        return null;
                    case 1:
                        KProperty[] kPropertyArr2 = OccupationChooserScreen.T;
                        qji.b bVarU2 = occupationChooserScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.occupation.screen.di.OccupationChooserScreenInjector");
                        u uVar = (u) bVarU2;
                        i0 i0Var = uVar.f223776b;
                        u uVar2 = uVar.f223777c;
                        OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = occupationChooserScreen.K;
                        occupationChooserScreenContract$InputData.getClass();
                        return new oai.w(i0Var, uVar2, occupationChooserScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = OccupationChooserScreen.T;
                        return (l) ((oai.w) occupationChooserScreen.P.getValue()).f223782b.get();
                    default:
                        KProperty[] kPropertyArr4 = OccupationChooserScreen.T;
                        OccupationChooserScreen occupationChooserScreen2 = this.f278899b;
                        return dli.f.a(occupationChooserScreen2, occupationChooserScreen2.R2(), v.k(occupationChooserScreen2.M, occupationChooserScreen2.N), 0, null, null, null, 60);
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar_nextbutton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        ubi.h uiState = (ubi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.onboarding_occupation_chooser_title_placeholder, zhm.u.c(uiState.f278906c), null, 12);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174565c;
        navBarWithToolbar2.setSecondDescriptionText(uiState.d);
        navBarWithToolbar2.setSecondDescriptionVisible(true);
        d3().f174564b.setEnabled(uiState.f278905b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return (AnalyticsProduct) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oai.w) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextLocalisedClause(R$string.onboarding_occupation_chooser_title_placeholder, null, null, 14));
        d3().f174565c.setNavigationButtonImage(this.K.f97703b);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52338c.f121375b), new f0(this, continuation, 16), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
