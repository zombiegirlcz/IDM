package com.revolut.feature.bank_account_switching.impl.ui.payments_review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oo2.b;
import oo2.c;
import oo2.d;
import oo2.f;
import oo2.g;
import oo2.l;
import oo2.n;
import te0.w;
import vc.s;
import vn2.m;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/payments_review/BankAccountSwitchingPaymentsReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loo2/l;", "Ldli/a;", "Loo2/n;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingPaymentsReviewScreen extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(BankAccountSwitchingPaymentsReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BankAccountSwitchingPaymentsReviewScreenContract$InputData K;
    public final int L;
    public final RowDelegate M;
    public final SelectableDelegate N;
    public final FullScreenStateDelegate O;
    public final RowLoadingDelegate P;
    public final CellDetailsSwitcherDelegate Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public BankAccountSwitchingPaymentsReviewScreen(BankAccountSwitchingPaymentsReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.M = rowDelegate;
        this.N = new SelectableDelegate(rowDelegate);
        this.O = new FullScreenStateDelegate();
        this.P = new RowLoadingDelegate();
        this.Q = new CellDetailsSwitcherDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: oo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen f226995b;

            {
                this.f226995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen = this.f226995b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentsReviewScreen.V;
                        BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen2 = this.f226995b;
                        return dli.f.a(bankAccountSwitchingPaymentsReviewScreen2, bankAccountSwitchingPaymentsReviewScreen2.d(), v.k(new ListSubheaderDelegate(), bankAccountSwitchingPaymentsReviewScreen2.M, bankAccountSwitchingPaymentsReviewScreen2.Q, bankAccountSwitchingPaymentsReviewScreen2.N, bankAccountSwitchingPaymentsReviewScreen2.O, bankAccountSwitchingPaymentsReviewScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentsReviewScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentsReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentsReviewScreenContract$InputData bankAccountSwitchingPaymentsReviewScreenContract$InputData = bankAccountSwitchingPaymentsReviewScreen.K;
                        bankAccountSwitchingPaymentsReviewScreenContract$InputData.getClass();
                        return new vn2.m(hVar, bankAccountSwitchingPaymentsReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentsReviewScreen.V;
                        return (m) ((vn2.m) bankAccountSwitchingPaymentsReviewScreen.T.getValue()).d.get();
                }
            }
        });
        this.S = s.t(this, b.f);
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: oo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen f226995b;

            {
                this.f226995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen = this.f226995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentsReviewScreen.V;
                        BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen2 = this.f226995b;
                        return dli.f.a(bankAccountSwitchingPaymentsReviewScreen2, bankAccountSwitchingPaymentsReviewScreen2.d(), v.k(new ListSubheaderDelegate(), bankAccountSwitchingPaymentsReviewScreen2.M, bankAccountSwitchingPaymentsReviewScreen2.Q, bankAccountSwitchingPaymentsReviewScreen2.N, bankAccountSwitchingPaymentsReviewScreen2.O, bankAccountSwitchingPaymentsReviewScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentsReviewScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentsReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentsReviewScreenContract$InputData bankAccountSwitchingPaymentsReviewScreenContract$InputData = bankAccountSwitchingPaymentsReviewScreen.K;
                        bankAccountSwitchingPaymentsReviewScreenContract$InputData.getClass();
                        return new vn2.m(hVar, bankAccountSwitchingPaymentsReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentsReviewScreen.V;
                        return (m) ((vn2.m) bankAccountSwitchingPaymentsReviewScreen.T.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: oo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen f226995b;

            {
                this.f226995b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen = this.f226995b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentsReviewScreen.V;
                        BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen2 = this.f226995b;
                        return dli.f.a(bankAccountSwitchingPaymentsReviewScreen2, bankAccountSwitchingPaymentsReviewScreen2.d(), v.k(new ListSubheaderDelegate(), bankAccountSwitchingPaymentsReviewScreen2.M, bankAccountSwitchingPaymentsReviewScreen2.Q, bankAccountSwitchingPaymentsReviewScreen2.N, bankAccountSwitchingPaymentsReviewScreen2.O, bankAccountSwitchingPaymentsReviewScreen2.P), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentsReviewScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentsReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentsReviewScreenContract$InputData bankAccountSwitchingPaymentsReviewScreenContract$InputData = bankAccountSwitchingPaymentsReviewScreen.K;
                        bankAccountSwitchingPaymentsReviewScreenContract$InputData.getClass();
                        return new vn2.m(hVar, bankAccountSwitchingPaymentsReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentsReviewScreen.V;
                        return (m) ((vn2.m) bankAccountSwitchingPaymentsReviewScreen.T.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Clause clause = uiState.f227002b;
        Clause clause2 = uiState.f227003c;
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        d3().f174565c.setSecondDescriptionText(clause);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(clause2 == null ? 8 : 0);
        d3().f174564b.setText(clause2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_review_payments_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_review_payments_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new oo2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53225r), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.r()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new oo2.h(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final oo2.m d() {
        return (oo2.m) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
