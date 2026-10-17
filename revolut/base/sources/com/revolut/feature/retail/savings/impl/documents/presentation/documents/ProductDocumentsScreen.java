package com.revolut.feature.retail.savings.impl.documents.presentation.documents;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import grl.k9;
import jnb.c;
import jnb.d;
import jnb.e;
import jnb.f;
import jnb.g;
import jnb.j;
import jnb.k;
import jnb.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import pki.b;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/documents/presentation/documents/ProductDocumentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lno/m;", "Ldli/a;", "Ljnb/h;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductDocumentsScreen extends ViewController<q> implements m, a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ProductDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ProductDocumentsContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int S;
    public final boolean T;

    public ProductDocumentsScreen(ProductDocumentsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137504q;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.M = s.t(this, j.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: jnb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductDocumentsScreen f176676b;

            {
                this.f176676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductDocumentsScreen productDocumentsScreen = this.f176676b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProductDocumentsScreen.U;
                        ProductDocumentsScreen productDocumentsScreen2 = this.f176676b;
                        return dli.f.a(productDocumentsScreen2, (g) productDocumentsScreen2.R.getValue(), v.k(productDocumentsScreen2.O, productDocumentsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductDocumentsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(productDocumentsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        ProductDocumentsContract$InputData productDocumentsContract$InputData = productDocumentsScreen.K;
                        productDocumentsContract$InputData.getClass();
                        return new fnb.c(eVar, productDocumentsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductDocumentsScreen.U;
                        return (g) ((fnb.c) productDocumentsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: jnb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductDocumentsScreen f176676b;

            {
                this.f176676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductDocumentsScreen productDocumentsScreen = this.f176676b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductDocumentsScreen.U;
                        ProductDocumentsScreen productDocumentsScreen2 = this.f176676b;
                        return dli.f.a(productDocumentsScreen2, (g) productDocumentsScreen2.R.getValue(), v.k(productDocumentsScreen2.O, productDocumentsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductDocumentsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(productDocumentsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        ProductDocumentsContract$InputData productDocumentsContract$InputData = productDocumentsScreen.K;
                        productDocumentsContract$InputData.getClass();
                        return new fnb.c(eVar, productDocumentsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductDocumentsScreen.U;
                        return (g) ((fnb.c) productDocumentsScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: jnb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductDocumentsScreen f176676b;

            {
                this.f176676b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductDocumentsScreen productDocumentsScreen = this.f176676b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductDocumentsScreen.U;
                        ProductDocumentsScreen productDocumentsScreen2 = this.f176676b;
                        return dli.f.a(productDocumentsScreen2, (g) productDocumentsScreen2.R.getValue(), v.k(productDocumentsScreen2.O, productDocumentsScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductDocumentsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(productDocumentsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        ProductDocumentsContract$InputData productDocumentsContract$InputData = productDocumentsScreen.K;
                        productDocumentsContract$InputData.getClass();
                        return new fnb.c(eVar, productDocumentsContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ProductDocumentsScreen.U;
                        return (g) ((fnb.c) productDocumentsScreen.Q.getValue()).d.get();
                }
            }
        });
        this.S = R$layout.screen_recycler_navbar;
        this.T = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, cli.q qVar) {
        jnb.h uiState = (jnb.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        f fVar = uiState.f176674b;
        if (fVar instanceof e) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (fVar instanceof d) {
            d3().f174539b.l0();
            return;
        }
        if (!(fVar instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.l0();
        c cVar = (c) fVar;
        Clause clause = cVar.f176670b;
        ?? r4 = cVar.f176669a;
        navBarWithToolbar2.setTitle(r4, null);
        navBarWithToolbar2.setToolbarTitle(r4);
        navBarWithToolbar2.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar2.setSecondDescriptionText(clause);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (fnb.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174538a.setBackground(null);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new jkc.g(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new l(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.T);
    }
}
