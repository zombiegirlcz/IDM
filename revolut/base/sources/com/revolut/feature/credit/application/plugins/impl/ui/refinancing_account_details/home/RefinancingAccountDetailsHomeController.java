package com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bx4.b;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import d83.i;
import dh4.d;
import dh4.g;
import dh4.j;
import dh4.k;
import dh4.l;
import dw3.l5;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/refinancing_account_details/home/RefinancingAccountDetailsHomeController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Ldh4/j;", "Ltki/c;", "Ldh4/l;", "Lbx4/b;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RefinancingAccountDetailsHomeController extends PluginScreenController<j> implements c, b {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(RefinancingAccountDetailsHomeController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final FullScreenStateDelegate R;
    public final Object S;

    public RefinancingAccountDetailsHomeController(RefinancingAccountDetailsHomeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new dgg.b(this, inputData, 1));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsHomeController f114742b;

            {
                this.f114742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = this.f114742b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsHomeController.T;
                        return (l5) refinancingAccountDetailsHomeController.M.getValue();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsHomeController.T;
                        return (k) ((l5) refinancingAccountDetailsHomeController.M.getValue()).f119208j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsHomeController.T;
                        return (k) refinancingAccountDetailsHomeController.O.getValue();
                    default:
                        KProperty[] kPropertyArr4 = RefinancingAccountDetailsHomeController.T;
                        RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController2 = this.f114742b;
                        return tki.g.a(refinancingAccountDetailsHomeController2, (k) refinancingAccountDetailsHomeController2.O.getValue(), d0.F0(refinancingAccountDetailsHomeController2.R, ((l5) refinancingAccountDetailsHomeController2.N.getValue()).c().Q()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: dh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsHomeController f114742b;

            {
                this.f114742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = this.f114742b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsHomeController.T;
                        return (l5) refinancingAccountDetailsHomeController.M.getValue();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsHomeController.T;
                        return (k) ((l5) refinancingAccountDetailsHomeController.M.getValue()).f119208j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsHomeController.T;
                        return (k) refinancingAccountDetailsHomeController.O.getValue();
                    default:
                        KProperty[] kPropertyArr4 = RefinancingAccountDetailsHomeController.T;
                        RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController2 = this.f114742b;
                        return tki.g.a(refinancingAccountDetailsHomeController2, (k) refinancingAccountDetailsHomeController2.O.getValue(), d0.F0(refinancingAccountDetailsHomeController2.R, ((l5) refinancingAccountDetailsHomeController2.N.getValue()).c().Q()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: dh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsHomeController f114742b;

            {
                this.f114742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = this.f114742b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsHomeController.T;
                        return (l5) refinancingAccountDetailsHomeController.M.getValue();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsHomeController.T;
                        return (k) ((l5) refinancingAccountDetailsHomeController.M.getValue()).f119208j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsHomeController.T;
                        return (k) refinancingAccountDetailsHomeController.O.getValue();
                    default:
                        KProperty[] kPropertyArr4 = RefinancingAccountDetailsHomeController.T;
                        RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController2 = this.f114742b;
                        return tki.g.a(refinancingAccountDetailsHomeController2, (k) refinancingAccountDetailsHomeController2.O.getValue(), d0.F0(refinancingAccountDetailsHomeController2.R, ((l5) refinancingAccountDetailsHomeController2.N.getValue()).c().Q()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = s.t(this, dh4.b.f);
        this.R = new FullScreenStateDelegate();
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: dh4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RefinancingAccountDetailsHomeController f114742b;

            {
                this.f114742b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController = this.f114742b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RefinancingAccountDetailsHomeController.T;
                        return (l5) refinancingAccountDetailsHomeController.M.getValue();
                    case 1:
                        KProperty[] kPropertyArr2 = RefinancingAccountDetailsHomeController.T;
                        return (k) ((l5) refinancingAccountDetailsHomeController.M.getValue()).f119208j.get();
                    case 2:
                        KProperty[] kPropertyArr3 = RefinancingAccountDetailsHomeController.T;
                        return (k) refinancingAccountDetailsHomeController.O.getValue();
                    default:
                        KProperty[] kPropertyArr4 = RefinancingAccountDetailsHomeController.T;
                        RefinancingAccountDetailsHomeController refinancingAccountDetailsHomeController2 = this.f114742b;
                        return tki.g.a(refinancingAccountDetailsHomeController2, (k) refinancingAccountDetailsHomeController2.O.getValue(), d0.F0(refinancingAccountDetailsHomeController2.R, ((l5) refinancingAccountDetailsHomeController2.N.getValue()).c().Q()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f114751b, null);
        navBarWithToolbar.setToolbarTitle(uiState.f114751b);
        Clause clause = uiState.f114752c;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setEnabled(uiState.e);
        largeActionButton.setText((Clause) uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((a) a()).C2(g.f114746a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l5) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setHeaderTitleMode(j0.MULTILINE);
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().f174565c.setEnabled(false);
        d3().f174565c.setDescriptionVisible(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52371h.f121375b), null, new dh4.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new i(rd0.e.b(d3().f174565c.x0()), 23), null, new d8j.c(this, (Continuation) null, 17), 3);
    }

    public final u d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // bx4.b
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k a() {
        return (k) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
