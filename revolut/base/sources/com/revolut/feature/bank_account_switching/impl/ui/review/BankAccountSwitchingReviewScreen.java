package com.revolut.feature.bank_account_switching.impl.ui.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
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
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import vn2.p;
import zhm.u;
import zhm.v;
import zo2.c;
import zo2.e;
import zo2.f;
import zo2.g;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/review/BankAccountSwitchingReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzo2/e;", "Ldli/a;", "Lzo2/g;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingReviewScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankAccountSwitchingReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BankAccountSwitchingReviewScreenContract$InputData K;
    public final int L;
    public final TextDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public BankAccountSwitchingReviewScreen(BankAccountSwitchingReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new TextDelegate();
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: zo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewScreen f323857b;

            {
                this.f323857b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = this.f323857b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewScreen.R;
                        BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen2 = this.f323857b;
                        return dli.f.a(bankAccountSwitchingReviewScreen2, (f) bankAccountSwitchingReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), bankAccountSwitchingReviewScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = bankAccountSwitchingReviewScreen.K;
                        bankAccountSwitchingReviewScreenContract$InputData.getClass();
                        return new p(hVar, bankAccountSwitchingReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewScreen.R;
                        return (f) ((p) bankAccountSwitchingReviewScreen.P.getValue()).d.get();
                }
            }
        });
        this.O = s.t(this, zo2.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: zo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewScreen f323857b;

            {
                this.f323857b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = this.f323857b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewScreen.R;
                        BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen2 = this.f323857b;
                        return dli.f.a(bankAccountSwitchingReviewScreen2, (f) bankAccountSwitchingReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), bankAccountSwitchingReviewScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = bankAccountSwitchingReviewScreen.K;
                        bankAccountSwitchingReviewScreenContract$InputData.getClass();
                        return new p(hVar, bankAccountSwitchingReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewScreen.R;
                        return (f) ((p) bankAccountSwitchingReviewScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: zo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingReviewScreen f323857b;

            {
                this.f323857b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen = this.f323857b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingReviewScreen.R;
                        BankAccountSwitchingReviewScreen bankAccountSwitchingReviewScreen2 = this.f323857b;
                        return dli.f.a(bankAccountSwitchingReviewScreen2, (f) bankAccountSwitchingReviewScreen2.Q.getValue(), v.k(new ScrollerDelegate(v.k(new SmallStockCardDelegate(), new ActionCardLoadingDelegate()), false), new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate(), bankAccountSwitchingReviewScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingReviewScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingReviewScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = bankAccountSwitchingReviewScreen.K;
                        bankAccountSwitchingReviewScreenContract$InputData.getClass();
                        return new p(hVar, bankAccountSwitchingReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingReviewScreen.R;
                        return (f) ((p) bankAccountSwitchingReviewScreen.P.getValue()).d.get();
                }
            }
        });
    }

    public static TextLocalisedClause e3() {
        return new TextLocalisedClause(R$string.account_switch_request_review_title, u.c(new TextLocalisedClause(R.string.common_merchant_Revolut, null, null, 14)), null, 12);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        boolean z = uiState.f323864c;
        boolean z3 = uiState.f323863b;
        largeActionButton.setVisibility(z ? 0 : 8);
        largeActionButton.setEnabled(!z3);
        if (z3) {
            largeActionButton.o(LargeActionButton.ButtonStyle.f58737s);
        } else {
            largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(e3());
        navBarWithToolbar.setTitle(e3(), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        d3().f174564b.setText(new TextLocalisedClause(R$string.account_switch_request_review_submit, null, null, 14));
        d3().f174564b.setLoadingButtonTag("SUBMIT_BUTTON_LOADING");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d), null, new c(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
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
