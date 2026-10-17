package com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreen;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ro2.d;
import ro2.f;
import ro2.g;
import ro2.i;
import ro2.j;
import te0.w;
import vc.s;
import vn2.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/payments_review/payment_schedule/BankAccountSwitchingPaymentScheduleScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lro2/i;", "Ldli/a;", "Lro2/j;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingPaymentScheduleScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(BankAccountSwitchingPaymentScheduleScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BankAccountSwitchingPaymentScheduleScreenContract$InputData K;
    public final int L;
    public final InputTextDelegate M;
    public final SingleChoiceDelegate N;
    public final DatePickerDelegate O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;

    public BankAccountSwitchingPaymentScheduleScreen(BankAccountSwitchingPaymentScheduleScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new InputTextDelegate(null);
        this.N = new SingleChoiceDelegate();
        this.O = new DatePickerDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: ro2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentScheduleScreen f255809b;

            {
                this.f255809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen = this.f255809b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentScheduleScreen.T;
                        BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen2 = this.f255809b;
                        return dli.f.a(bankAccountSwitchingPaymentScheduleScreen2, bankAccountSwitchingPaymentScheduleScreen2.R2(), v.k(bankAccountSwitchingPaymentScheduleScreen2.M, bankAccountSwitchingPaymentScheduleScreen2.N, bankAccountSwitchingPaymentScheduleScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentScheduleScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentScheduleScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentScheduleScreenContract$InputData bankAccountSwitchingPaymentScheduleScreenContract$InputData = bankAccountSwitchingPaymentScheduleScreen.K;
                        bankAccountSwitchingPaymentScheduleScreenContract$InputData.getClass();
                        return new vn2.k(hVar, bankAccountSwitchingPaymentScheduleScreen, bankAccountSwitchingPaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentScheduleScreen.T;
                        return (k) ((vn2.k) bankAccountSwitchingPaymentScheduleScreen.Q.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ro2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentScheduleScreen f255809b;

            {
                this.f255809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen = this.f255809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentScheduleScreen.T;
                        BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen2 = this.f255809b;
                        return dli.f.a(bankAccountSwitchingPaymentScheduleScreen2, bankAccountSwitchingPaymentScheduleScreen2.R2(), v.k(bankAccountSwitchingPaymentScheduleScreen2.M, bankAccountSwitchingPaymentScheduleScreen2.N, bankAccountSwitchingPaymentScheduleScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentScheduleScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentScheduleScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentScheduleScreenContract$InputData bankAccountSwitchingPaymentScheduleScreenContract$InputData = bankAccountSwitchingPaymentScheduleScreen.K;
                        bankAccountSwitchingPaymentScheduleScreenContract$InputData.getClass();
                        return new vn2.k(hVar, bankAccountSwitchingPaymentScheduleScreen, bankAccountSwitchingPaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentScheduleScreen.T;
                        return (k) ((vn2.k) bankAccountSwitchingPaymentScheduleScreen.Q.getValue()).i.get();
                }
            }
        });
        this.R = s.t(this, d.f);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ro2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingPaymentScheduleScreen f255809b;

            {
                this.f255809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen = this.f255809b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingPaymentScheduleScreen.T;
                        BankAccountSwitchingPaymentScheduleScreen bankAccountSwitchingPaymentScheduleScreen2 = this.f255809b;
                        return dli.f.a(bankAccountSwitchingPaymentScheduleScreen2, bankAccountSwitchingPaymentScheduleScreen2.R2(), v.k(bankAccountSwitchingPaymentScheduleScreen2.M, bankAccountSwitchingPaymentScheduleScreen2.N, bankAccountSwitchingPaymentScheduleScreen2.O), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingPaymentScheduleScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingPaymentScheduleScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingPaymentScheduleScreenContract$InputData bankAccountSwitchingPaymentScheduleScreenContract$InputData = bankAccountSwitchingPaymentScheduleScreen.K;
                        bankAccountSwitchingPaymentScheduleScreenContract$InputData.getClass();
                        return new vn2.k(hVar, bankAccountSwitchingPaymentScheduleScreen, bankAccountSwitchingPaymentScheduleScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingPaymentScheduleScreen.T;
                        return (k) ((vn2.k) bankAccountSwitchingPaymentScheduleScreen.Q.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f255816b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_set_payment_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_set_payment_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.account_switch_set_payment_set_schedule, null, null, 14));
        ((j60.a) ((k) this.Q.getValue()).f290695h.get()).d(v.k(this.N, this.O));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new ro2.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new ro2.e(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52575g.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.p()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52176c.f121375b), null, new rk9.d(this, null, 11), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ro2.k R2() {
        return (ro2.k) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
