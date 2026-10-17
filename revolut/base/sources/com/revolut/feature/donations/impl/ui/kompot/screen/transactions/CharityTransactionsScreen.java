package com.revolut.feature.donations.impl.ui.kompot.screen.transactions;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsContract$InputData;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pa6.g;
import pa6.m;
import pa6.n;
import pki.b;
import qa9.r;
import qc6.c;
import qc6.e;
import qc6.f;
import te0.w;
import vc.s;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/transactions/CharityTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqc6/c;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CharityTransactionsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CharityTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CharityTransactionsContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final RowDelegate P;
    public v Q;
    public final Object R;

    public CharityTransactionsScreen(CharityTransactionsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: qc6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharityTransactionsScreen f244572b;

            {
                this.f244572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CharityTransactionsScreen charityTransactionsScreen = this.f244572b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CharityTransactionsScreen.S;
                        qji.b bVarU2 = charityTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.transactions.di.CharityTransactionsScreenComponent.Injector");
                        n nVar = (n) bVarU2;
                        m mVar = nVar.f234406b;
                        n nVar2 = nVar.f234407c;
                        CharityTransactionsContract$InputData charityTransactionsContract$InputData = charityTransactionsScreen.K;
                        charityTransactionsContract$InputData.getClass();
                        return new pa6.g(mVar, nVar2, charityTransactionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CharityTransactionsScreen.S;
                        return (b) ((pa6.g) charityTransactionsScreen.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharityTransactionsScreen.S;
                        CharityTransactionsScreen charityTransactionsScreen2 = this.f244572b;
                        return dli.f.a(charityTransactionsScreen2, (b) charityTransactionsScreen2.M.getValue(), zhm.v.k(new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate(), charityTransactionsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: qc6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharityTransactionsScreen f244572b;

            {
                this.f244572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CharityTransactionsScreen charityTransactionsScreen = this.f244572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CharityTransactionsScreen.S;
                        qji.b bVarU2 = charityTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.transactions.di.CharityTransactionsScreenComponent.Injector");
                        n nVar = (n) bVarU2;
                        m mVar = nVar.f234406b;
                        n nVar2 = nVar.f234407c;
                        CharityTransactionsContract$InputData charityTransactionsContract$InputData = charityTransactionsScreen.K;
                        charityTransactionsContract$InputData.getClass();
                        return new pa6.g(mVar, nVar2, charityTransactionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CharityTransactionsScreen.S;
                        return (b) ((pa6.g) charityTransactionsScreen.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharityTransactionsScreen.S;
                        CharityTransactionsScreen charityTransactionsScreen2 = this.f244572b;
                        return dli.f.a(charityTransactionsScreen2, (b) charityTransactionsScreen2.M.getValue(), zhm.v.k(new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate(), charityTransactionsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, e.f);
        this.P = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: qc6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CharityTransactionsScreen f244572b;

            {
                this.f244572b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CharityTransactionsScreen charityTransactionsScreen = this.f244572b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CharityTransactionsScreen.S;
                        qji.b bVarU2 = charityTransactionsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.donations.impl.ui.kompot.screen.transactions.di.CharityTransactionsScreenComponent.Injector");
                        n nVar = (n) bVarU2;
                        m mVar = nVar.f234406b;
                        n nVar2 = nVar.f234407c;
                        CharityTransactionsContract$InputData charityTransactionsContract$InputData = charityTransactionsScreen.K;
                        charityTransactionsContract$InputData.getClass();
                        return new pa6.g(mVar, nVar2, charityTransactionsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CharityTransactionsScreen.S;
                        return (b) ((pa6.g) charityTransactionsScreen.L.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CharityTransactionsScreen.S;
                        CharityTransactionsScreen charityTransactionsScreen2 = this.f244572b;
                        return dli.f.a(charityTransactionsScreen2, (b) charityTransactionsScreen2.M.getValue(), zhm.v.k(new ListSubheaderDelegate(), new FullScreenStateDelegate(), new RowLoadingDelegate(), charityTransactionsScreen2.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f244570b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (qc6.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        v vVar = this.Q;
        if (vVar != null) {
            screenContentRecyclerView.removeOnScrollListener(vVar);
        } else {
            Intrinsics.r("paginationScrollListener");
            throw null;
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.Q = y.a(recyclerView, this.K.f72111a.f71990a / 2, true, new r(this, 15));
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new q43.m(this, null, 22), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53218h), new f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
