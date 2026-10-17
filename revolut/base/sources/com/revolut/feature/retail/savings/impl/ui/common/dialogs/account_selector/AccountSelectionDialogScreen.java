package com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rob.b;
import rob.c;
import rob.g;
import rob.h;
import rob.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/common/dialogs/account_selector/AccountSelectionDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrob/h;", "Ldli/a;", "Lrob/j;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountSelectionDialogScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AccountSelectionDialogScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/SavingsScreenDialogRecyclerBinding;", 0))};
    public final AccountSelectionDialogScreenContract$InputData K;
    public final RowDelegate L;
    public final ao.h M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AccountSelectionDialogScreen(AccountSelectionDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = s.t(this, b.f);
        this.N = true;
        this.O = R$layout.savings_screen_dialog_recycler;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSelectionDialogScreen f255949b;

            {
                this.f255949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AccountSelectionDialogScreen accountSelectionDialogScreen = this.f255949b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSelectionDialogScreen.S;
                        return (g) ((anb.b) accountSelectionDialogScreen.Q.getValue()).f6623c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountSelectionDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(accountSelectionDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        AccountSelectionDialogScreenContract$InputData accountSelectionDialogScreenContract$InputData = accountSelectionDialogScreen.K;
                        accountSelectionDialogScreenContract$InputData.getClass();
                        return new anb.b(nVar, accountSelectionDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountSelectionDialogScreen.S;
                        AccountSelectionDialogScreen accountSelectionDialogScreen2 = this.f255949b;
                        return dli.f.a(accountSelectionDialogScreen2, (g) accountSelectionDialogScreen2.P.getValue(), v.k(accountSelectionDialogScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSelectionDialogScreen f255949b;

            {
                this.f255949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AccountSelectionDialogScreen accountSelectionDialogScreen = this.f255949b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSelectionDialogScreen.S;
                        return (g) ((anb.b) accountSelectionDialogScreen.Q.getValue()).f6623c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountSelectionDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(accountSelectionDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        AccountSelectionDialogScreenContract$InputData accountSelectionDialogScreenContract$InputData = accountSelectionDialogScreen.K;
                        accountSelectionDialogScreenContract$InputData.getClass();
                        return new anb.b(nVar, accountSelectionDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountSelectionDialogScreen.S;
                        AccountSelectionDialogScreen accountSelectionDialogScreen2 = this.f255949b;
                        return dli.f.a(accountSelectionDialogScreen2, (g) accountSelectionDialogScreen2.P.getValue(), v.k(accountSelectionDialogScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AccountSelectionDialogScreen f255949b;

            {
                this.f255949b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AccountSelectionDialogScreen accountSelectionDialogScreen = this.f255949b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AccountSelectionDialogScreen.S;
                        return (g) ((anb.b) accountSelectionDialogScreen.Q.getValue()).f6623c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AccountSelectionDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(accountSelectionDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        anb.n nVar = ((anb.n) aVar2.b()).F;
                        AccountSelectionDialogScreenContract$InputData accountSelectionDialogScreenContract$InputData = accountSelectionDialogScreen.K;
                        accountSelectionDialogScreenContract$InputData.getClass();
                        return new anb.b(nVar, accountSelectionDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AccountSelectionDialogScreen.S;
                        AccountSelectionDialogScreen accountSelectionDialogScreen2 = this.f255949b;
                        return dli.f.a(accountSelectionDialogScreen2, (g) accountSelectionDialogScreen2.P.getValue(), v.k(accountSelectionDialogScreen2.L, new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (anb.b) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        DialogHeaderView dialogHeaderView = ((xmb.b) value).f307099b;
        dialogHeaderView.setTitle(new TextLocalisedClause(R$string.savings_sheets_choose_account_title, null, null, 14));
        dialogHeaderView.setMenuItem(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new c(2, 4, g.class, (g) this.P.getValue(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
