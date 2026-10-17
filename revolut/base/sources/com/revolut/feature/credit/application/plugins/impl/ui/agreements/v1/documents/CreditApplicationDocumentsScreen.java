package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.y7;
import dw3.z7;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import wp5.y;
import xki.e;
import y44.c;
import y44.d;
import y44.f;
import y44.k;
import y44.l;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/documents/CreditApplicationDocumentsScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ly44/k;", "Ldli/a;", "Ly44/l;", "Lno/k;", "Lno/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditApplicationDocumentsScreen extends PluginScreenController<k> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditApplicationDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CreditApplicationDocumentsScreenContract$InputData L;
    public AnalyticsContext M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final FullScreenStateDelegate S;
    public final RowDelegate T;

    public CreditApplicationDocumentsScreen(CreditApplicationDocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        this.M = inputData.f67008b;
        this.N = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: y44.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentsScreen f310775b;

            {
                this.f310775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = this.f310775b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentsScreen.U;
                        qji.b bVarU2 = creditApplicationDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.di.CreditApplicationDocumentsScreenInjector");
                        y7 y7Var = (y7) ((z44.a) bVarU2).b().mo3808a(creditApplicationDocumentsScreen);
                        CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData = creditApplicationDocumentsScreen.L;
                        switch (y7Var.f120239a) {
                            case 0:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                        }
                        return (z7) y7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentsScreen.U;
                        z7 z7Var = (z7) creditApplicationDocumentsScreen.O.getValue();
                        switch (z7Var.f120317a) {
                            case 0:
                                return (m) z7Var.d.get();
                            case 1:
                                return (m) z7Var.d.get();
                            default:
                                return (m) z7Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentsScreen.U;
                        CreditApplicationDocumentsScreen creditApplicationDocumentsScreen2 = this.f310775b;
                        return dli.f.a(creditApplicationDocumentsScreen2, creditApplicationDocumentsScreen2.R2(), v.k(creditApplicationDocumentsScreen2.T, new RowLoadingDelegate(), new TextDelegate(), creditApplicationDocumentsScreen2.S, new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: y44.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentsScreen f310775b;

            {
                this.f310775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = this.f310775b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentsScreen.U;
                        qji.b bVarU2 = creditApplicationDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.di.CreditApplicationDocumentsScreenInjector");
                        y7 y7Var = (y7) ((z44.a) bVarU2).b().mo3808a(creditApplicationDocumentsScreen);
                        CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData = creditApplicationDocumentsScreen.L;
                        switch (y7Var.f120239a) {
                            case 0:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                        }
                        return (z7) y7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentsScreen.U;
                        z7 z7Var = (z7) creditApplicationDocumentsScreen.O.getValue();
                        switch (z7Var.f120317a) {
                            case 0:
                                return (m) z7Var.d.get();
                            case 1:
                                return (m) z7Var.d.get();
                            default:
                                return (m) z7Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentsScreen.U;
                        CreditApplicationDocumentsScreen creditApplicationDocumentsScreen2 = this.f310775b;
                        return dli.f.a(creditApplicationDocumentsScreen2, creditApplicationDocumentsScreen2.R2(), v.k(creditApplicationDocumentsScreen2.T, new RowLoadingDelegate(), new TextDelegate(), creditApplicationDocumentsScreen2.S, new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, c.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: y44.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditApplicationDocumentsScreen f310775b;

            {
                this.f310775b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditApplicationDocumentsScreen creditApplicationDocumentsScreen = this.f310775b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditApplicationDocumentsScreen.U;
                        qji.b bVarU2 = creditApplicationDocumentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.di.CreditApplicationDocumentsScreenInjector");
                        y7 y7Var = (y7) ((z44.a) bVarU2).b().mo3808a(creditApplicationDocumentsScreen);
                        CreditApplicationDocumentsScreenContract$InputData creditApplicationDocumentsScreenContract$InputData = creditApplicationDocumentsScreen.L;
                        switch (y7Var.f120239a) {
                            case 0:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            case 1:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                            default:
                                creditApplicationDocumentsScreenContract$InputData.getClass();
                                y7Var.d = creditApplicationDocumentsScreenContract$InputData;
                                break;
                        }
                        return (z7) y7Var.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditApplicationDocumentsScreen.U;
                        z7 z7Var = (z7) creditApplicationDocumentsScreen.O.getValue();
                        switch (z7Var.f120317a) {
                            case 0:
                                return (m) z7Var.d.get();
                            case 1:
                                return (m) z7Var.d.get();
                            default:
                                return (m) z7Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = CreditApplicationDocumentsScreen.U;
                        CreditApplicationDocumentsScreen creditApplicationDocumentsScreen2 = this.f310775b;
                        return dli.f.a(creditApplicationDocumentsScreen2, creditApplicationDocumentsScreen2.R2(), v.k(creditApplicationDocumentsScreen2.T, new RowLoadingDelegate(), new TextDelegate(), creditApplicationDocumentsScreen2.S, new FooterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = new FullScreenStateDelegate();
        this.T = new RowDelegate(null, null, 7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f310781b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f310782c;
        navBarWithToolbar.setDescriptionText(clause);
        f0.t(navBarWithToolbar, uiState.d, false, 2);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(uiState.e);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText((Clause) uiState.f);
        goToButton.setEnabled(uiState.f310783g);
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.M = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z7) this.O.getValue();
    }

    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController, no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getO() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setEnabled(false);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setBackgroundColor(R$attr.uikit_colorTransparent);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = U;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.Q;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new f(this, null, 1), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(goToButton.o), null, new f(this, null, 0), 3);
        RowDelegate rowDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, y.x(rowDelegate.f53218h, rowDelegate.f53220l, "mergeWith(...)"), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new y44.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final y44.m R2() {
        return (y44.m) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
