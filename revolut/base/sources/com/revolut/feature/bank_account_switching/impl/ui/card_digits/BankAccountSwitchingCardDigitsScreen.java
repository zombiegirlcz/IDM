package com.revolut.feature.bank_account_switching.impl.ui.card_digits;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bhi.c;
import bo2.b;
import bo2.e;
import bo2.g;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreen;
import com.revolut.feature.bank_account_switching.impl.ui.card_digits.BankAccountSwitchingCardDigitsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import jii.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import vn2.f;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/card_digits/BankAccountSwitchingCardDigitsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbo2/e;", "Ldli/a;", "Lbo2/g;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingCardDigitsScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankAccountSwitchingCardDigitsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final BankAccountSwitchingCardDigitsScreenContract$InputData K;
    public final int L;
    public final InputTextDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public BankAccountSwitchingCardDigitsScreen(BankAccountSwitchingCardDigitsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = new InputTextDelegate(new c(this, 11));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingCardDigitsScreen f17271b;

            {
                this.f17271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = this.f17271b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingCardDigitsScreen.R;
                        BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen2 = this.f17271b;
                        return dli.f.a(bankAccountSwitchingCardDigitsScreen2, (f) bankAccountSwitchingCardDigitsScreen2.Q.getValue(), u.c(bankAccountSwitchingCardDigitsScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingCardDigitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingCardDigitsScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingCardDigitsScreenContract$InputData bankAccountSwitchingCardDigitsScreenContract$InputData = bankAccountSwitchingCardDigitsScreen.K;
                        bankAccountSwitchingCardDigitsScreenContract$InputData.getClass();
                        return new vn2.f(hVar, bankAccountSwitchingCardDigitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingCardDigitsScreen.R;
                        return (f) ((vn2.f) bankAccountSwitchingCardDigitsScreen.P.getValue()).f290672c.get();
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingCardDigitsScreen f17271b;

            {
                this.f17271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = this.f17271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingCardDigitsScreen.R;
                        BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen2 = this.f17271b;
                        return dli.f.a(bankAccountSwitchingCardDigitsScreen2, (f) bankAccountSwitchingCardDigitsScreen2.Q.getValue(), u.c(bankAccountSwitchingCardDigitsScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingCardDigitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingCardDigitsScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingCardDigitsScreenContract$InputData bankAccountSwitchingCardDigitsScreenContract$InputData = bankAccountSwitchingCardDigitsScreen.K;
                        bankAccountSwitchingCardDigitsScreenContract$InputData.getClass();
                        return new vn2.f(hVar, bankAccountSwitchingCardDigitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingCardDigitsScreen.R;
                        return (f) ((vn2.f) bankAccountSwitchingCardDigitsScreen.P.getValue()).f290672c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bo2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingCardDigitsScreen f17271b;

            {
                this.f17271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen = this.f17271b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingCardDigitsScreen.R;
                        BankAccountSwitchingCardDigitsScreen bankAccountSwitchingCardDigitsScreen2 = this.f17271b;
                        return dli.f.a(bankAccountSwitchingCardDigitsScreen2, (f) bankAccountSwitchingCardDigitsScreen2.Q.getValue(), u.c(bankAccountSwitchingCardDigitsScreen2.M), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingCardDigitsScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingCardDigitsScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingCardDigitsScreenContract$InputData bankAccountSwitchingCardDigitsScreenContract$InputData = bankAccountSwitchingCardDigitsScreen.K;
                        bankAccountSwitchingCardDigitsScreenContract$InputData.getClass();
                        return new vn2.f(hVar, bankAccountSwitchingCardDigitsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingCardDigitsScreen.R;
                        return (f) ((vn2.f) bankAccountSwitchingCardDigitsScreen.P.getValue()).f290672c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174574c.setSecondDescriptionText(uiState.f17277b);
        d3().f174573b.setEnabled(uiState.f17278c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bo2.f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_card_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_card_details_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174573b);
        d3().e.setText(new TextLocalisedClause(R$string.account_switch_card_details_noCard, null, null, 14));
        d3().e.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new bo2.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174573b.o), null, new bo2.c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o), null, new bo2.c(this, null, 2), 3);
    }

    public final x d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
