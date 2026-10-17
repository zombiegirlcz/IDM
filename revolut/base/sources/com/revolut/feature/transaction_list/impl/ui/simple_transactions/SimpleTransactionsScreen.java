package com.revolut.feature.transaction_list.impl.ui.simple_transactions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction_list.impl.R$string;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreen;
import com.revolut.feature.transaction_list.impl.ui.simple_transactions.SimpleTransactionsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import ff4.z;
import fhf.b;
import fhf.c;
import fhf.f;
import fhf.g;
import foh.i;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pgf.d;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/simple_transactions/SimpleTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfhf/g;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleTransactionsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SimpleTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SimpleTransactionsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final boolean N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final Object R;

    public SimpleTransactionsScreen(SimpleTransactionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = true;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: fhf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTransactionsScreen f135212b;

            {
                this.f135212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SimpleTransactionsScreen simpleTransactionsScreen = this.f135212b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTransactionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTransactionsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = simpleTransactionsScreen.K;
                        simpleTransactionsScreenContract$InputData.getClass();
                        return new pgf.d(eVar, simpleTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTransactionsScreen.S;
                        return (f) ((pgf.d) simpleTransactionsScreen.O.getValue()).f235893c.get();
                    default:
                        KProperty[] kPropertyArr3 = SimpleTransactionsScreen.S;
                        SimpleTransactionsScreen simpleTransactionsScreen2 = this.f135212b;
                        return dli.f.a(simpleTransactionsScreen2, (f) simpleTransactionsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), new SwipeToActionDelegate(simpleTransactionsScreen2.Q, false)), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fhf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTransactionsScreen f135212b;

            {
                this.f135212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SimpleTransactionsScreen simpleTransactionsScreen = this.f135212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTransactionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTransactionsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = simpleTransactionsScreen.K;
                        simpleTransactionsScreenContract$InputData.getClass();
                        return new pgf.d(eVar, simpleTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTransactionsScreen.S;
                        return (f) ((pgf.d) simpleTransactionsScreen.O.getValue()).f235893c.get();
                    default:
                        KProperty[] kPropertyArr3 = SimpleTransactionsScreen.S;
                        SimpleTransactionsScreen simpleTransactionsScreen2 = this.f135212b;
                        return dli.f.a(simpleTransactionsScreen2, (f) simpleTransactionsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), new SwipeToActionDelegate(simpleTransactionsScreen2.Q, false)), 0, null, null, null, 60);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: fhf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SimpleTransactionsScreen f135212b;

            {
                this.f135212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SimpleTransactionsScreen simpleTransactionsScreen = this.f135212b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SimpleTransactionsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(simpleTransactionsScreen.m2()).a().get(phf.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", phf.a.class, " is not found"));
                        }
                        pgf.e eVar = ((pgf.e) aVar2.b()).V;
                        SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = simpleTransactionsScreen.K;
                        simpleTransactionsScreenContract$InputData.getClass();
                        return new pgf.d(eVar, simpleTransactionsScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = SimpleTransactionsScreen.S;
                        return (f) ((pgf.d) simpleTransactionsScreen.O.getValue()).f235893c.get();
                    default:
                        KProperty[] kPropertyArr3 = SimpleTransactionsScreen.S;
                        SimpleTransactionsScreen simpleTransactionsScreen2 = this.f135212b;
                        return dli.f.a(simpleTransactionsScreen2, (f) simpleTransactionsScreen2.P.getValue(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate(), new SwipeToActionDelegate(simpleTransactionsScreen2.Q, false)), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setEndIconImage(uiState.f135217b);
        navBarWithToolbar.setEndIconBadge(uiState.f135218c);
        navBarWithToolbar.setFilters(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        SimpleTransactionsScreenContract$InputData simpleTransactionsScreenContract$InputData = this.K;
        navBarWithToolbar.setTitle(simpleTransactionsScreenContract$InputData.f91948a, null);
        navBarWithToolbar.setToolbarTitle(simpleTransactionsScreenContract$InputData.f91948a);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setDescriptionText(simpleTransactionsScreenContract$InputData.f91949b);
        navBarWithToolbar.setDescriptionVisible(true);
        pd.b.p(view, new TextLocalisedClause(R$string.transaction_statistics_list_title_placeholder, null, null, 14));
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        knm.b.v(i.j(16), recyclerView);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new z(this, null, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.s0()), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f53218h), null, new fhf.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
