package com.revolut.feature.bank_account_switching.impl.ui.form;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import do2.b;
import do2.c;
import do2.d;
import do2.f;
import do2.h;
import do2.j;
import jii.u;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import vn2.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/form/BankAccountSwitchingFormScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldo2/h;", "Ldli/a;", "Ldo2/j;", "Companion", "a", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingFormScreen extends ViewController<h> implements dli.a {
    public final BankAccountSwitchingFormScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final FixedTabsDelegate N;
    public final FullScreenStateDelegate O;
    public final InputTextDelegate P;
    public final Object Q;
    public final ao.h R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(BankAccountSwitchingFormScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public BankAccountSwitchingFormScreen(BankAccountSwitchingFormScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        Lazy lazyY0 = w.y0(new Function0(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingFormScreen f116373b;

            {
                this.f116373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = this.f116373b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingFormScreen.U;
                        return new dgj.h(bankAccountSwitchingFormScreen, 14);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingFormScreen.U;
                        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen2 = this.f116373b;
                        return dli.f.a(bankAccountSwitchingFormScreen2, bankAccountSwitchingFormScreen2.R2(), v.k(bankAccountSwitchingFormScreen2.N, bankAccountSwitchingFormScreen2.P, bankAccountSwitchingFormScreen2.O, new ListSubheaderDelegate(), new FixedTabsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingFormScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingFormScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = bankAccountSwitchingFormScreen.K;
                        bankAccountSwitchingFormScreenContract$InputData.getClass();
                        return new vn2.i(hVar, bankAccountSwitchingFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BankAccountSwitchingFormScreen.U;
                        return (i) ((vn2.i) bankAccountSwitchingFormScreen.S.getValue()).d.get();
                }
            }
        });
        this.M = lazyY0;
        this.N = new FixedTabsDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = new InputTextDelegate((Function2) lazyY0.getValue());
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingFormScreen f116373b;

            {
                this.f116373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = this.f116373b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingFormScreen.U;
                        return new dgj.h(bankAccountSwitchingFormScreen, 14);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingFormScreen.U;
                        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen2 = this.f116373b;
                        return dli.f.a(bankAccountSwitchingFormScreen2, bankAccountSwitchingFormScreen2.R2(), v.k(bankAccountSwitchingFormScreen2.N, bankAccountSwitchingFormScreen2.P, bankAccountSwitchingFormScreen2.O, new ListSubheaderDelegate(), new FixedTabsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingFormScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingFormScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = bankAccountSwitchingFormScreen.K;
                        bankAccountSwitchingFormScreenContract$InputData.getClass();
                        return new vn2.i(hVar, bankAccountSwitchingFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BankAccountSwitchingFormScreen.U;
                        return (i) ((vn2.i) bankAccountSwitchingFormScreen.S.getValue()).d.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingFormScreen f116373b;

            {
                this.f116373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = this.f116373b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingFormScreen.U;
                        return new dgj.h(bankAccountSwitchingFormScreen, 14);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingFormScreen.U;
                        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen2 = this.f116373b;
                        return dli.f.a(bankAccountSwitchingFormScreen2, bankAccountSwitchingFormScreen2.R2(), v.k(bankAccountSwitchingFormScreen2.N, bankAccountSwitchingFormScreen2.P, bankAccountSwitchingFormScreen2.O, new ListSubheaderDelegate(), new FixedTabsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingFormScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingFormScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = bankAccountSwitchingFormScreen.K;
                        bankAccountSwitchingFormScreenContract$InputData.getClass();
                        return new vn2.i(hVar, bankAccountSwitchingFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BankAccountSwitchingFormScreen.U;
                        return (i) ((vn2.i) bankAccountSwitchingFormScreen.S.getValue()).d.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: do2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingFormScreen f116373b;

            {
                this.f116373b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = this.f116373b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingFormScreen.U;
                        return new dgj.h(bankAccountSwitchingFormScreen, 14);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingFormScreen.U;
                        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen2 = this.f116373b;
                        return dli.f.a(bankAccountSwitchingFormScreen2, bankAccountSwitchingFormScreen2.R2(), v.k(bankAccountSwitchingFormScreen2.N, bankAccountSwitchingFormScreen2.P, bankAccountSwitchingFormScreen2.O, new ListSubheaderDelegate(), new FixedTabsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingFormScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingFormScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = bankAccountSwitchingFormScreen.K;
                        bankAccountSwitchingFormScreenContract$InputData.getClass();
                        return new vn2.i(hVar, bankAccountSwitchingFormScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = BankAccountSwitchingFormScreen.U;
                        return (i) ((vn2.i) bankAccountSwitchingFormScreen.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f116381c);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(uiState.f116380b ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.account_switch_account_details_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.account_switch_account_details_title, null, null, 14));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.account_switch_account_details_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().f174564b.setLoadingButtonTag("CONTINUE_BUTTON_LOADING");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52339c.f121375b), null, new d8j.c(this, continuation, 28), 3);
        InputTextDelegate inputTextDelegate = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.e.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(inputTextDelegate.f52575g.f121375b), null, new do2.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final do2.i R2() {
        return (do2.i) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getS() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
