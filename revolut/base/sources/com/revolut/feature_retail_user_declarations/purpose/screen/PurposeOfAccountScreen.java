package com.revolut.feature_retail_user_declarations.purpose.screen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreen;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import dli.a;
import f9d.c;
import fci.d;
import fci.f;
import fci.h;
import fci.j;
import fci.k;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import oai.z;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/purpose/screen/PurposeOfAccountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfci/h;", "Lno/m;", "Ldli/a;", "Lfci/k;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurposeOfAccountScreen extends ViewController<h> implements m, a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(PurposeOfAccountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PurposeOfAccountScreenContract$InputData K;
    public final ao.h L;
    public final int M;
    public final FiltersDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public PurposeOfAccountScreen(PurposeOfAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d.f);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = new FiltersDelegate();
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: fci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountScreen f133766b;

            {
                this.f133766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PurposeOfAccountScreen purposeOfAccountScreen = this.f133766b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountScreen.T;
                        qji.b bVarU2 = purposeOfAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = purposeOfAccountScreen.K;
                        purposeOfAccountScreenContract$InputData.getClass();
                        return new oai.z(i0Var, yVar2, purposeOfAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountScreen.T;
                        return (j) ((oai.z) purposeOfAccountScreen.P.getValue()).f223791c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountScreen.T;
                        PurposeOfAccountScreen purposeOfAccountScreen2 = this.f133766b;
                        return dli.f.a(purposeOfAccountScreen2, purposeOfAccountScreen2.R2(), zhm.v.k(purposeOfAccountScreen2.N, new ListSubheaderDelegate(), purposeOfAccountScreen2.O), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = PurposeOfAccountScreen.T;
                        yji.o oVar = purposeOfAccountScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getK();
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: fci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountScreen f133766b;

            {
                this.f133766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PurposeOfAccountScreen purposeOfAccountScreen = this.f133766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountScreen.T;
                        qji.b bVarU2 = purposeOfAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = purposeOfAccountScreen.K;
                        purposeOfAccountScreenContract$InputData.getClass();
                        return new oai.z(i0Var, yVar2, purposeOfAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountScreen.T;
                        return (j) ((oai.z) purposeOfAccountScreen.P.getValue()).f223791c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountScreen.T;
                        PurposeOfAccountScreen purposeOfAccountScreen2 = this.f133766b;
                        return dli.f.a(purposeOfAccountScreen2, purposeOfAccountScreen2.R2(), zhm.v.k(purposeOfAccountScreen2.N, new ListSubheaderDelegate(), purposeOfAccountScreen2.O), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = PurposeOfAccountScreen.T;
                        yji.o oVar = purposeOfAccountScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getK();
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountScreen f133766b;

            {
                this.f133766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PurposeOfAccountScreen purposeOfAccountScreen = this.f133766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountScreen.T;
                        qji.b bVarU2 = purposeOfAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = purposeOfAccountScreen.K;
                        purposeOfAccountScreenContract$InputData.getClass();
                        return new oai.z(i0Var, yVar2, purposeOfAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountScreen.T;
                        return (j) ((oai.z) purposeOfAccountScreen.P.getValue()).f223791c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountScreen.T;
                        PurposeOfAccountScreen purposeOfAccountScreen2 = this.f133766b;
                        return dli.f.a(purposeOfAccountScreen2, purposeOfAccountScreen2.R2(), zhm.v.k(purposeOfAccountScreen2.N, new ListSubheaderDelegate(), purposeOfAccountScreen2.O), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = PurposeOfAccountScreen.T;
                        yji.o oVar = purposeOfAccountScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getK();
                        }
                        return null;
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: fci.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PurposeOfAccountScreen f133766b;

            {
                this.f133766b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                PurposeOfAccountScreen purposeOfAccountScreen = this.f133766b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PurposeOfAccountScreen.T;
                        qji.b bVarU2 = purposeOfAccountScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature_retail_user_declarations.purpose.screen.di.PurposeOfAccountScreenInjector");
                        oai.y yVar = (oai.y) bVarU2;
                        oai.i0 i0Var = yVar.f223787b;
                        oai.y yVar2 = yVar.f223788c;
                        PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = purposeOfAccountScreen.K;
                        purposeOfAccountScreenContract$InputData.getClass();
                        return new oai.z(i0Var, yVar2, purposeOfAccountScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PurposeOfAccountScreen.T;
                        return (j) ((oai.z) purposeOfAccountScreen.P.getValue()).f223791c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = PurposeOfAccountScreen.T;
                        PurposeOfAccountScreen purposeOfAccountScreen2 = this.f133766b;
                        return dli.f.a(purposeOfAccountScreen2, purposeOfAccountScreen2.R2(), zhm.v.k(purposeOfAccountScreen2.N, new ListSubheaderDelegate(), purposeOfAccountScreen2.O), 0, null, null, null, 60);
                    default:
                        KProperty[] kPropertyArr4 = PurposeOfAccountScreen.T;
                        yji.o oVar = purposeOfAccountScreen.f98405m;
                        no.m mVar = oVar instanceof no.m ? (no.m) oVar : null;
                        if (mVar != null) {
                            return mVar.getK();
                        }
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f133787b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TextLocalisedClause textLocalisedClause = uiState.f133788c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(uiState.d);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getK() {
        return (AnalyticsProduct) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f52338c.f121375b), new c(this, (Continuation) null, 7), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new fci.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, null, 0), 3);
        d3().f174565c.setNavigationButtonIcon(this.K.d.a());
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
