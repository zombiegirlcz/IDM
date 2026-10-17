package com.revolut.feature.bank_account_switching.impl.ui.target_account_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreen;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import eq2.b;
import eq2.c;
import eq2.d;
import eq2.f;
import eq2.g;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vn2.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/target_account_selection/BankAccountSwitchingTargetSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Leq2/f;", "Ldli/a;", "Leq2/g;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankAccountSwitchingTargetSelectionScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(BankAccountSwitchingTargetSelectionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final BankAccountSwitchingTargetSelectionScreenContract$InputData K;
    public final int L;
    public final SelectableDelegate M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public BankAccountSwitchingTargetSelectionScreen(BankAccountSwitchingTargetSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingTargetSelectionScreen f128224b;

            {
                this.f128224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = this.f128224b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingTargetSelectionScreen.R;
                        BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen2 = this.f128224b;
                        return dli.f.a(bankAccountSwitchingTargetSelectionScreen2, (h) bankAccountSwitchingTargetSelectionScreen2.Q.getValue(), u.c(bankAccountSwitchingTargetSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingTargetSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingTargetSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingTargetSelectionScreenContract$InputData bankAccountSwitchingTargetSelectionScreenContract$InputData = bankAccountSwitchingTargetSelectionScreen.K;
                        bankAccountSwitchingTargetSelectionScreenContract$InputData.getClass();
                        return new s(hVar, bankAccountSwitchingTargetSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingTargetSelectionScreen.R;
                        return (h) ((s) bankAccountSwitchingTargetSelectionScreen.O.getValue()).f290719c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingTargetSelectionScreen f128224b;

            {
                this.f128224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = this.f128224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingTargetSelectionScreen.R;
                        BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen2 = this.f128224b;
                        return dli.f.a(bankAccountSwitchingTargetSelectionScreen2, (h) bankAccountSwitchingTargetSelectionScreen2.Q.getValue(), u.c(bankAccountSwitchingTargetSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingTargetSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingTargetSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingTargetSelectionScreenContract$InputData bankAccountSwitchingTargetSelectionScreenContract$InputData = bankAccountSwitchingTargetSelectionScreen.K;
                        bankAccountSwitchingTargetSelectionScreenContract$InputData.getClass();
                        return new s(hVar, bankAccountSwitchingTargetSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingTargetSelectionScreen.R;
                        return (h) ((s) bankAccountSwitchingTargetSelectionScreen.O.getValue()).f290719c.get();
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: eq2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankAccountSwitchingTargetSelectionScreen f128224b;

            {
                this.f128224b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen = this.f128224b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BankAccountSwitchingTargetSelectionScreen.R;
                        BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen2 = this.f128224b;
                        return dli.f.a(bankAccountSwitchingTargetSelectionScreen2, (h) bankAccountSwitchingTargetSelectionScreen2.Q.getValue(), u.c(bankAccountSwitchingTargetSelectionScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BankAccountSwitchingTargetSelectionScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(bankAccountSwitchingTargetSelectionScreen.m2()).a().get(vn2.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vn2.h.class, " is not found"));
                        }
                        vn2.h hVar = ((vn2.h) aVar2.b()).f290682l;
                        BankAccountSwitchingTargetSelectionScreenContract$InputData bankAccountSwitchingTargetSelectionScreenContract$InputData = bankAccountSwitchingTargetSelectionScreen.K;
                        bankAccountSwitchingTargetSelectionScreenContract$InputData.getClass();
                        return new s(hVar, bankAccountSwitchingTargetSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BankAccountSwitchingTargetSelectionScreen.R;
                        return (h) ((s) bankAccountSwitchingTargetSelectionScreen.O.getValue()).f290719c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f128230b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = uiState.f128231c;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (eq2.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.r()), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
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
