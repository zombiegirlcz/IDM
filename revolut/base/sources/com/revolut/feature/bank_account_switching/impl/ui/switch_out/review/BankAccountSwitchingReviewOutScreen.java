package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreen;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import jii.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import up2.b;
import up2.c;
import up2.d;
import up2.h;
import up2.i;
import up2.j;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/BankAccountSwitchingReviewOutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lup2/h;", "Ldli/a;", "Lup2/j;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingReviewOutScreen extends ViewController<h> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BankAccountSwitchingReviewOutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final BankAccountSwitchingReviewOutScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public BankAccountSwitchingReviewOutScreen(BankAccountSwitchingReviewOutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: up2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewOutScreen f281815b;

            {
                this.f281815b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen = this.f281815b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewOutScreen.S;
                        BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen2 = this.f281815b;
                        return dli.f.a(bankAccountSwitchingReviewOutScreen2, bankAccountSwitchingReviewOutScreen2.R2(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), bankAccountSwitchingReviewOutScreen2.N, new RowLoadingDelegate(), bankAccountSwitchingReviewOutScreen2.M, new TextDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewOutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewOutScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewOutScreenContract$InputData bankAccountSwitchingReviewOutScreenContract$InputData = bankAccountSwitchingReviewOutScreen.K;
                        bankAccountSwitchingReviewOutScreenContract$InputData.getClass();
                        return new vn2.o(hVar, bankAccountSwitchingReviewOutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewOutScreen.S;
                        return (i) ((vn2.o) bankAccountSwitchingReviewOutScreen.Q.getValue()).d.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: up2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewOutScreen f281815b;

            {
                this.f281815b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen = this.f281815b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewOutScreen.S;
                        BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen2 = this.f281815b;
                        return dli.f.a(bankAccountSwitchingReviewOutScreen2, bankAccountSwitchingReviewOutScreen2.R2(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), bankAccountSwitchingReviewOutScreen2.N, new RowLoadingDelegate(), bankAccountSwitchingReviewOutScreen2.M, new TextDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewOutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewOutScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewOutScreenContract$InputData bankAccountSwitchingReviewOutScreenContract$InputData = bankAccountSwitchingReviewOutScreen.K;
                        bankAccountSwitchingReviewOutScreenContract$InputData.getClass();
                        return new vn2.o(hVar, bankAccountSwitchingReviewOutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewOutScreen.S;
                        return (i) ((vn2.o) bankAccountSwitchingReviewOutScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: up2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewOutScreen f281815b;

            {
                this.f281815b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen = this.f281815b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewOutScreen.S;
                        BankAccountSwitchingReviewOutScreen bankAccountSwitchingReviewOutScreen2 = this.f281815b;
                        return dli.f.a(bankAccountSwitchingReviewOutScreen2, bankAccountSwitchingReviewOutScreen2.R2(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), bankAccountSwitchingReviewOutScreen2.N, new RowLoadingDelegate(), bankAccountSwitchingReviewOutScreen2.M, new TextDelegate()), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewOutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewOutScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewOutScreenContract$InputData bankAccountSwitchingReviewOutScreenContract$InputData = bankAccountSwitchingReviewOutScreen.K;
                        bankAccountSwitchingReviewOutScreenContract$InputData.getClass();
                        return new vn2.o(hVar, bankAccountSwitchingReviewOutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewOutScreen.S;
                        return (i) ((vn2.o) bankAccountSwitchingReviewOutScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Clause clause = uiState.f281824c;
        boolean z = uiState.f281823b;
        if (clause == null) {
            d3().f174574c.setTitleVisible(false);
        } else {
            NavBarWithToolbar navBarWithToolbar = d3().f174574c;
            navBarWithToolbar.setTitleVisible(true);
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setTitle(clause, null);
        }
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = d3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setVisibility(z ? 0 : 8);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vn2.o) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174574c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174573b);
        d3().e.setText(new TextLocalisedClause(R$string.account_switch_request_review_decline, null, null, 14));
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53226s), null, new uf0.d(this, null, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new c(this, continuation, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
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
