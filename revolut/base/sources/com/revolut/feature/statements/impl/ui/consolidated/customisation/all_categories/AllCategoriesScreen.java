package com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.statements.impl.R$id;
import com.revolut.feature.statements.impl.R$layout;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.f0;
import eyd.g0;
import gzd.b;
import gzd.c;
import gzd.d;
import gzd.f;
import gzd.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/customisation/all_categories/AllCategoriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgzd/f;", "Ldli/a;", "Lgzd/g;", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllCategoriesScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AllCategoriesScreen.class, "binding", "getBinding()Lcom/revolut/feature/statements/impl/databinding/ScreenAllItemsBinding;", 0))};
    public final AllCategoriesScreenContract$InputData K;
    public final int L;
    public final SelectableDelegate M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public AllCategoriesScreen(AllCategoriesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_all_items;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllCategoriesScreen f148052b;

            {
                this.f148052b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AllCategoriesScreen allCategoriesScreen = this.f148052b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AllCategoriesScreen.R;
                        AllCategoriesScreen allCategoriesScreen2 = this.f148052b;
                        return dli.f.a(allCategoriesScreen2, (h) allCategoriesScreen2.Q.getValue(), u.c(allCategoriesScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AllCategoriesScreen.R;
                        qji.b bVarU2 = allCategoriesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.di.AllCategoriesScreenInjector");
                        f0 f0Var = (f0) ((hzd.a) bVarU2).b().mo3808a(allCategoriesScreen);
                        AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData = allCategoriesScreen.K;
                        switch (f0Var.f130741a) {
                            case 0:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                            default:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                        }
                        return (g0) f0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AllCategoriesScreen.R;
                        g0 g0Var = (g0) allCategoriesScreen.O.getValue();
                        switch (g0Var.f130750a) {
                            case 0:
                                return (h) g0Var.f.get();
                            default:
                                return (h) g0Var.f.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllCategoriesScreen f148052b;

            {
                this.f148052b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AllCategoriesScreen allCategoriesScreen = this.f148052b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllCategoriesScreen.R;
                        AllCategoriesScreen allCategoriesScreen2 = this.f148052b;
                        return dli.f.a(allCategoriesScreen2, (h) allCategoriesScreen2.Q.getValue(), u.c(allCategoriesScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AllCategoriesScreen.R;
                        qji.b bVarU2 = allCategoriesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.di.AllCategoriesScreenInjector");
                        f0 f0Var = (f0) ((hzd.a) bVarU2).b().mo3808a(allCategoriesScreen);
                        AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData = allCategoriesScreen.K;
                        switch (f0Var.f130741a) {
                            case 0:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                            default:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                        }
                        return (g0) f0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AllCategoriesScreen.R;
                        g0 g0Var = (g0) allCategoriesScreen.O.getValue();
                        switch (g0Var.f130750a) {
                            case 0:
                                return (h) g0Var.f.get();
                            default:
                                return (h) g0Var.f.get();
                        }
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gzd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllCategoriesScreen f148052b;

            {
                this.f148052b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AllCategoriesScreen allCategoriesScreen = this.f148052b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AllCategoriesScreen.R;
                        AllCategoriesScreen allCategoriesScreen2 = this.f148052b;
                        return dli.f.a(allCategoriesScreen2, (h) allCategoriesScreen2.Q.getValue(), u.c(allCategoriesScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AllCategoriesScreen.R;
                        qji.b bVarU2 = allCategoriesScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.di.AllCategoriesScreenInjector");
                        f0 f0Var = (f0) ((hzd.a) bVarU2).b().mo3808a(allCategoriesScreen);
                        AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData = allCategoriesScreen.K;
                        switch (f0Var.f130741a) {
                            case 0:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                            default:
                                allCategoriesScreenContract$InputData.getClass();
                                f0Var.d = allCategoriesScreenContract$InputData;
                                break;
                        }
                        return (g0) f0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = AllCategoriesScreen.R;
                        g0 g0Var = (g0) allCategoriesScreen.O.getValue();
                        switch (g0Var.f130750a) {
                            case 0:
                                return (h) g0Var.f.get();
                            default:
                                return (h) g0Var.f.get();
                        }
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f110088c.setMenuItems(u.c(new TextNavBarMenuItem("ID_NAVBAR_MENU_ITEM", uiState.d, null, null, 12)));
        LargeActionButton largeActionButton = d3().f110087b;
        largeActionButton.setText((Clause) uiState.f148058b);
        largeActionButton.setEnabled(uiState.f148059c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g0) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (gzd.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f110088c;
        basicNavBar.setTitle(this.K.f88303a);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f110088c.f59211b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f110088c.f59210a.f57403b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f110087b.o), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.r()), null, new d(this, null), 3);
    }

    public final cyd.a d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cyd.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
