package com.revolut.feature.credit.application.plugins.impl.ui.how_it_works;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanLargeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreen;
import com.revolut.kompot.common.R$layout;
import dli.a;
import dw3.n3;
import gaa.g;
import gc4.b;
import gc4.c;
import gc4.d;
import gc4.f;
import gc4.h;
import gc4.i;
import gc4.l;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/how_it_works/HowItWorksScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lgc4/h;", "Ldli/a;", "Lgc4/i;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HowItWorksScreen extends PluginScreenController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(HowItWorksScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int L;
    public final Object M;
    public final Object N;
    public final ao.h O;
    public final FullScreenStateDelegate P;
    public final TextDelegate Q;
    public final Object R;

    public HowItWorksScreen(HowItWorksScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new fx5.a(this, inputData, 20));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowItWorksScreen f142324b;

            {
                this.f142324b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = HowItWorksScreen.S;
                        return (l) ((n3) this.f142324b.M.getValue()).f119336h.get();
                    default:
                        KProperty[] kPropertyArr2 = HowItWorksScreen.S;
                        HowItWorksScreen howItWorksScreen = this.f142324b;
                        return dli.f.a(howItWorksScreen, howItWorksScreen.d(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), howItWorksScreen.Q, howItWorksScreen.P, new PlanLargeDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = s.t(this, b.f);
        this.P = new FullScreenStateDelegate();
        this.Q = new TextDelegate();
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: gc4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HowItWorksScreen f142324b;

            {
                this.f142324b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HowItWorksScreen.S;
                        return (l) ((n3) this.f142324b.M.getValue()).f119336h.get();
                    default:
                        KProperty[] kPropertyArr2 = HowItWorksScreen.S;
                        HowItWorksScreen howItWorksScreen = this.f142324b;
                        return dli.f.a(howItWorksScreen, howItWorksScreen.d(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), howItWorksScreen.Q, howItWorksScreen.P, new PlanLargeDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        LargeActionButton largeActionButton = uVarD3.f174564b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = uiState.f142329b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        NavBarWithToolbar navBarWithToolbar2 = uVarD3.f174565c;
        navBarWithToolbar2.setToolbarTitle(textLocalisedClause);
        Clause clause = uiState.f142330c;
        navBarWithToolbar2.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar2.setSecondDescriptionText(clause);
        largeActionButton.setEnabled(uiState.e);
        largeActionButton.setText((Clause) uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        d().C2(f.f142326a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n3) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174565c.setEnabled(false);
        d3().f174565c.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new g(this, null, 5), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
