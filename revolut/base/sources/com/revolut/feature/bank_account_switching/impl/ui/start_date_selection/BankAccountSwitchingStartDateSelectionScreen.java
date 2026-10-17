package com.revolut.feature.bank_account_switching.impl.ui.start_date_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.BankAccountSwitchingStartDateSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
import hp2.b;
import hp2.c;
import hp2.d;
import hp2.g;
import hp2.j;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vn2.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/start_date_selection/BankAccountSwitchingStartDateSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhp2/g;", "Ldli/a;", "Lhp2/h;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingStartDateSelectionScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BankAccountSwitchingStartDateSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BankAccountSwitchingStartDateSelectionScreenContract$InputData K;
    public final int L;
    public final DatePickerDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public BankAccountSwitchingStartDateSelectionScreen(BankAccountSwitchingStartDateSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new DatePickerDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: hp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingStartDateSelectionScreen f154384b;

            {
                this.f154384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = this.f154384b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingStartDateSelectionScreen.S;
                        BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen2 = this.f154384b;
                        return dli.f.a(bankAccountSwitchingStartDateSelectionScreen2, (j) bankAccountSwitchingStartDateSelectionScreen2.R.getValue(), v.k(bankAccountSwitchingStartDateSelectionScreen2.M, bankAccountSwitchingStartDateSelectionScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingStartDateSelectionScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingStartDateSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingStartDateSelectionScreenContract$InputData bankAccountSwitchingStartDateSelectionScreenContract$InputData = bankAccountSwitchingStartDateSelectionScreen.K;
                        bankAccountSwitchingStartDateSelectionScreenContract$InputData.getClass();
                        return new q(hVar, bankAccountSwitchingStartDateSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingStartDateSelectionScreen.S;
                        return (j) ((q) bankAccountSwitchingStartDateSelectionScreen.Q.getValue()).d.get();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingStartDateSelectionScreen f154384b;

            {
                this.f154384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = this.f154384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingStartDateSelectionScreen.S;
                        BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen2 = this.f154384b;
                        return dli.f.a(bankAccountSwitchingStartDateSelectionScreen2, (j) bankAccountSwitchingStartDateSelectionScreen2.R.getValue(), v.k(bankAccountSwitchingStartDateSelectionScreen2.M, bankAccountSwitchingStartDateSelectionScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingStartDateSelectionScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingStartDateSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingStartDateSelectionScreenContract$InputData bankAccountSwitchingStartDateSelectionScreenContract$InputData = bankAccountSwitchingStartDateSelectionScreen.K;
                        bankAccountSwitchingStartDateSelectionScreenContract$InputData.getClass();
                        return new q(hVar, bankAccountSwitchingStartDateSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingStartDateSelectionScreen.S;
                        return (j) ((q) bankAccountSwitchingStartDateSelectionScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hp2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingStartDateSelectionScreen f154384b;

            {
                this.f154384b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen = this.f154384b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingStartDateSelectionScreen.S;
                        BankAccountSwitchingStartDateSelectionScreen bankAccountSwitchingStartDateSelectionScreen2 = this.f154384b;
                        return dli.f.a(bankAccountSwitchingStartDateSelectionScreen2, (j) bankAccountSwitchingStartDateSelectionScreen2.R.getValue(), v.k(bankAccountSwitchingStartDateSelectionScreen2.M, bankAccountSwitchingStartDateSelectionScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingStartDateSelectionScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingStartDateSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingStartDateSelectionScreenContract$InputData bankAccountSwitchingStartDateSelectionScreenContract$InputData = bankAccountSwitchingStartDateSelectionScreen.K;
                        bankAccountSwitchingStartDateSelectionScreenContract$InputData.getClass();
                        return new q(hVar, bankAccountSwitchingStartDateSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingStartDateSelectionScreen.S;
                        return (j) ((q) bankAccountSwitchingStartDateSelectionScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        hp2.h uiState = (hp2.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        boolean z = uiState.d;
        TextLocalisedClause textLocalisedClause = uiState.f154391b;
        goToButton.setVisibility(z ? 0 : 8);
        d3().f174564b.setEnabled(uiState.e);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        String str = uiState.f154392c;
        if (str == null || str.length() == 0) {
            navBarWithToolbar.setSecondDescriptionVisible(false);
        } else {
            navBarWithToolbar.setSecondDescriptionText(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            navBarWithToolbar.setSecondDescriptionVisible(true);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52176c.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new hp2.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
