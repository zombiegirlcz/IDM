package com.revolut.feature.retail.savings.impl.ui.edit_account_name;

import anb.l;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.ui.edit_account_name.SavingsAccountEditNameScreen;
import com.revolut.feature.retail.savings.impl.ui.edit_account_name.SavingsAccountEditNameScreenContract$InputData;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cpb.b;
import cpb.c;
import cpb.d;
import cpb.h;
import cpb.i;
import cpb.k;
import dli.a;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/edit_account_name/SavingsAccountEditNameScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcpb/h;", "Ldli/a;", "Lcpb/i;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsAccountEditNameScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(SavingsAccountEditNameScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SavingsAccountEditNameScreenContract$InputData K;
    public final ao.h L;
    public final InputTextDelegate M;
    public final Object N;
    public final Object O;
    public final int P;
    public final boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public SavingsAccountEditNameScreen(SavingsAccountEditNameScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: cpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountEditNameScreen f107913b;

            {
                this.f107913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.f107913b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAccountEditNameScreen.U;
                        ViewBinding value = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((u) value).f174565c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAccountEditNameScreen.U;
                        ViewBinding value2 = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((u) value2).f174564b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsAccountEditNameScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountEditNameScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData = savingsAccountEditNameScreen.K;
                        savingsAccountEditNameScreenContract$InputData.getClass();
                        return new anb.l(nVar, savingsAccountEditNameScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsAccountEditNameScreen.U;
                        return (k) ((anb.l) savingsAccountEditNameScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsAccountEditNameScreen.U;
                        SavingsAccountEditNameScreen savingsAccountEditNameScreen2 = this.f107913b;
                        return dli.f.a(savingsAccountEditNameScreen2, (k) savingsAccountEditNameScreen2.S.getValue(), v.k(new FullScreenStateDelegate(), savingsAccountEditNameScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: cpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountEditNameScreen f107913b;

            {
                this.f107913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.f107913b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAccountEditNameScreen.U;
                        ViewBinding value = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((u) value).f174565c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAccountEditNameScreen.U;
                        ViewBinding value2 = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((u) value2).f174564b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsAccountEditNameScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountEditNameScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData = savingsAccountEditNameScreen.K;
                        savingsAccountEditNameScreenContract$InputData.getClass();
                        return new anb.l(nVar, savingsAccountEditNameScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsAccountEditNameScreen.U;
                        return (k) ((anb.l) savingsAccountEditNameScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsAccountEditNameScreen.U;
                        SavingsAccountEditNameScreen savingsAccountEditNameScreen2 = this.f107913b;
                        return dli.f.a(savingsAccountEditNameScreen2, (k) savingsAccountEditNameScreen2.S.getValue(), v.k(new FullScreenStateDelegate(), savingsAccountEditNameScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        this.Q = true;
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountEditNameScreen f107913b;

            {
                this.f107913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.f107913b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAccountEditNameScreen.U;
                        ViewBinding value = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((u) value).f174565c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAccountEditNameScreen.U;
                        ViewBinding value2 = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((u) value2).f174564b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsAccountEditNameScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountEditNameScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData = savingsAccountEditNameScreen.K;
                        savingsAccountEditNameScreenContract$InputData.getClass();
                        return new anb.l(nVar, savingsAccountEditNameScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsAccountEditNameScreen.U;
                        return (k) ((anb.l) savingsAccountEditNameScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsAccountEditNameScreen.U;
                        SavingsAccountEditNameScreen savingsAccountEditNameScreen2 = this.f107913b;
                        return dli.f.a(savingsAccountEditNameScreen2, (k) savingsAccountEditNameScreen2.S.getValue(), v.k(new FullScreenStateDelegate(), savingsAccountEditNameScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: cpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountEditNameScreen f107913b;

            {
                this.f107913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.f107913b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAccountEditNameScreen.U;
                        ViewBinding value = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((u) value).f174565c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAccountEditNameScreen.U;
                        ViewBinding value2 = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((u) value2).f174564b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsAccountEditNameScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountEditNameScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData = savingsAccountEditNameScreen.K;
                        savingsAccountEditNameScreenContract$InputData.getClass();
                        return new anb.l(nVar, savingsAccountEditNameScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsAccountEditNameScreen.U;
                        return (k) ((anb.l) savingsAccountEditNameScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsAccountEditNameScreen.U;
                        SavingsAccountEditNameScreen savingsAccountEditNameScreen2 = this.f107913b;
                        return dli.f.a(savingsAccountEditNameScreen2, (k) savingsAccountEditNameScreen2.S.getValue(), v.k(new FullScreenStateDelegate(), savingsAccountEditNameScreen2.M), 0, null, null, null, 60);
                }
            }
        });
        final int i6 = 4;
        this.T = w.y0(new Function0(this) { // from class: cpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsAccountEditNameScreen f107913b;

            {
                this.f107913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SavingsAccountEditNameScreen savingsAccountEditNameScreen = this.f107913b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsAccountEditNameScreen.U;
                        ViewBinding value = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((u) value).f174565c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsAccountEditNameScreen.U;
                        ViewBinding value2 = savingsAccountEditNameScreen.L.getValue(savingsAccountEditNameScreen, SavingsAccountEditNameScreen.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return ((u) value2).f174564b;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsAccountEditNameScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(savingsAccountEditNameScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsAccountEditNameScreenContract$InputData savingsAccountEditNameScreenContract$InputData = savingsAccountEditNameScreen.K;
                        savingsAccountEditNameScreenContract$InputData.getClass();
                        return new anb.l(nVar, savingsAccountEditNameScreenContract$InputData);
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsAccountEditNameScreen.U;
                        return (k) ((anb.l) savingsAccountEditNameScreen.R.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsAccountEditNameScreen.U;
                        SavingsAccountEditNameScreen savingsAccountEditNameScreen2 = this.f107913b;
                        return dli.f.a(savingsAccountEditNameScreen2, (k) savingsAccountEditNameScreen2.S.getValue(), v.k(new FullScreenStateDelegate(), savingsAccountEditNameScreen2.M), 0, null, null, null, 60);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ((LargeActionButton) this.O.getValue()).setEnabled(uiState.f107919b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.N.getValue();
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.vaults_details_edit_rename, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.vaults_details_edit_rename, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setExpanded(true);
        ?? r62 = this.O;
        ((LargeActionButton) r62.getValue()).setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14));
        ((LargeActionButton) r62.getValue()).setLoadingButtonTag("SUBMIT_BUTTON_LOADING_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) this.N.getValue()).f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButton) this.O.getValue()).o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.e.f121375b), null, new d(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
