package com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.impl.R$layout;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eyd.i0;
import izd.b;
import izd.c;
import izd.d;
import izd.g;
import izd.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/statements/impl/ui/consolidated/customisation/all_products/AllProductsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lizd/g;", "Ldli/a;", "Lizd/h;", "Companion", "a", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AllProductsScreen extends ViewController<g> implements a {
    public final AllProductsScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final SelectableDelegate N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AllProductsScreen.class, "binding", "getBinding()Lcom/revolut/feature/statements/impl/databinding/ScreenAllItemsBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AllProductsScreen(AllProductsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_all_items;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: izd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllProductsScreen f169870b;

            {
                this.f169870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AllProductsScreen allProductsScreen = this.f169870b;
                switch (i2) {
                    case 0:
                        AllProductsScreen.Companion companion = AllProductsScreen.INSTANCE;
                        AllProductsScreen allProductsScreen2 = this.f169870b;
                        return dli.f.a(allProductsScreen2, allProductsScreen2.R2(), u.c(allProductsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllProductsScreen.Companion companion2 = AllProductsScreen.INSTANCE;
                        qji.b bVarU2 = allProductsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.di.AllProductsScreenInjector");
                        eyd.h0 h0Var = (eyd.h0) ((jzd.a) bVarU2).j().mo3808a(allProductsScreen);
                        AllProductsScreenContract$InputData allProductsScreenContract$InputData = allProductsScreen.K;
                        switch (h0Var.f130755a) {
                            case 0:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                            default:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                        }
                        return (i0) h0Var.mo3783build();
                    default:
                        AllProductsScreen.Companion companion3 = AllProductsScreen.INSTANCE;
                        i0 i0Var = (i0) allProductsScreen.P.getValue();
                        switch (i0Var.f130759a) {
                            case 0:
                                return (i) i0Var.f.get();
                            default:
                                return (i) i0Var.f.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: izd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllProductsScreen f169870b;

            {
                this.f169870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AllProductsScreen allProductsScreen = this.f169870b;
                switch (i22) {
                    case 0:
                        AllProductsScreen.Companion companion = AllProductsScreen.INSTANCE;
                        AllProductsScreen allProductsScreen2 = this.f169870b;
                        return dli.f.a(allProductsScreen2, allProductsScreen2.R2(), u.c(allProductsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllProductsScreen.Companion companion2 = AllProductsScreen.INSTANCE;
                        qji.b bVarU2 = allProductsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.di.AllProductsScreenInjector");
                        eyd.h0 h0Var = (eyd.h0) ((jzd.a) bVarU2).j().mo3808a(allProductsScreen);
                        AllProductsScreenContract$InputData allProductsScreenContract$InputData = allProductsScreen.K;
                        switch (h0Var.f130755a) {
                            case 0:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                            default:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                        }
                        return (i0) h0Var.mo3783build();
                    default:
                        AllProductsScreen.Companion companion3 = AllProductsScreen.INSTANCE;
                        i0 i0Var = (i0) allProductsScreen.P.getValue();
                        switch (i0Var.f130759a) {
                            case 0:
                                return (i) i0Var.f.get();
                            default:
                                return (i) i0Var.f.get();
                        }
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: izd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AllProductsScreen f169870b;

            {
                this.f169870b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AllProductsScreen allProductsScreen = this.f169870b;
                switch (i22) {
                    case 0:
                        AllProductsScreen.Companion companion = AllProductsScreen.INSTANCE;
                        AllProductsScreen allProductsScreen2 = this.f169870b;
                        return dli.f.a(allProductsScreen2, allProductsScreen2.R2(), u.c(allProductsScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        AllProductsScreen.Companion companion2 = AllProductsScreen.INSTANCE;
                        qji.b bVarU2 = allProductsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.di.AllProductsScreenInjector");
                        eyd.h0 h0Var = (eyd.h0) ((jzd.a) bVarU2).j().mo3808a(allProductsScreen);
                        AllProductsScreenContract$InputData allProductsScreenContract$InputData = allProductsScreen.K;
                        switch (h0Var.f130755a) {
                            case 0:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                            default:
                                allProductsScreenContract$InputData.getClass();
                                h0Var.d = allProductsScreenContract$InputData;
                                break;
                        }
                        return (i0) h0Var.mo3783build();
                    default:
                        AllProductsScreen.Companion companion3 = AllProductsScreen.INSTANCE;
                        i0 i0Var = (i0) allProductsScreen.P.getValue();
                        switch (i0Var.f130759a) {
                            case 0:
                                return (i) i0Var.f.get();
                            default:
                                return (i) i0Var.f.get();
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
        izd.h uiState = (izd.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f110088c.setMenuItems(u.c(new TextNavBarMenuItem("ID_NAVBAR_MENU_ITEM", uiState.d, null, null, 12)));
        d3().f110087b.setText((Clause) uiState.f169877b);
        d3().f110087b.setEnabled(uiState.f169878c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        BasicNavBar basicNavBar = d3().f110088c;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.consolidated_statement_filters_accounts_title, null, null, 14));
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
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.r()), null, new izd.e(this, null), 3);
    }

    public final cyd.a d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cyd.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
