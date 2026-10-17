package com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary;

import aii.q;
import anb.c;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.BalanceSummaryDialogScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.BalanceSummaryDialogScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sob.b;
import sob.f;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/common/dialogs/balance_summary/BalanceSummaryDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lsob/f;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BalanceSummaryDialogScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(BalanceSummaryDialogScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/SavingsScreenDialogRecyclerBinding;", 0))};
    public final BalanceSummaryDialogScreenContract$InputData K;
    public final LargeActionButtonDelegate L;
    public final h M;
    public final boolean N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public BalanceSummaryDialogScreen(BalanceSummaryDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new LargeActionButtonDelegate();
        this.M = s.t(this, b.f);
        this.N = true;
        this.O = R$layout.savings_screen_dialog_recycler;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: sob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalanceSummaryDialogScreen f264805b;

            {
                this.f264805b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BalanceSummaryDialogScreen balanceSummaryDialogScreen = this.f264805b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BalanceSummaryDialogScreen.S;
                        BalanceSummaryDialogScreen balanceSummaryDialogScreen2 = this.f264805b;
                        return dli.f.a(balanceSummaryDialogScreen2, (e) balanceSummaryDialogScreen2.R.getValue(), v.k(balanceSummaryDialogScreen2.L, new PlainTextDelegate(), new CellDetailsDelegate(), new PlainTextLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BalanceSummaryDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(balanceSummaryDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.di.BalanceSummaryDialogScreenInjector");
                        n nVar = ((n) objB).F;
                        BalanceSummaryDialogScreenContract$InputData balanceSummaryDialogScreenContract$InputData = balanceSummaryDialogScreen.K;
                        balanceSummaryDialogScreenContract$InputData.getClass();
                        return new anb.c(nVar, balanceSummaryDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BalanceSummaryDialogScreen.S;
                        return (e) ((anb.c) balanceSummaryDialogScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: sob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalanceSummaryDialogScreen f264805b;

            {
                this.f264805b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BalanceSummaryDialogScreen balanceSummaryDialogScreen = this.f264805b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BalanceSummaryDialogScreen.S;
                        BalanceSummaryDialogScreen balanceSummaryDialogScreen2 = this.f264805b;
                        return dli.f.a(balanceSummaryDialogScreen2, (e) balanceSummaryDialogScreen2.R.getValue(), v.k(balanceSummaryDialogScreen2.L, new PlainTextDelegate(), new CellDetailsDelegate(), new PlainTextLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BalanceSummaryDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(balanceSummaryDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.di.BalanceSummaryDialogScreenInjector");
                        n nVar = ((n) objB).F;
                        BalanceSummaryDialogScreenContract$InputData balanceSummaryDialogScreenContract$InputData = balanceSummaryDialogScreen.K;
                        balanceSummaryDialogScreenContract$InputData.getClass();
                        return new anb.c(nVar, balanceSummaryDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BalanceSummaryDialogScreen.S;
                        return (e) ((anb.c) balanceSummaryDialogScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BalanceSummaryDialogScreen f264805b;

            {
                this.f264805b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BalanceSummaryDialogScreen balanceSummaryDialogScreen = this.f264805b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BalanceSummaryDialogScreen.S;
                        BalanceSummaryDialogScreen balanceSummaryDialogScreen2 = this.f264805b;
                        return dli.f.a(balanceSummaryDialogScreen2, (e) balanceSummaryDialogScreen2.R.getValue(), v.k(balanceSummaryDialogScreen2.L, new PlainTextDelegate(), new CellDetailsDelegate(), new PlainTextLoadingDelegate(), new LargeActionButtonLoadingDelegate(), new FullScreenStateDelegate()), R$id.savingsScreenDialog_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = BalanceSummaryDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(balanceSummaryDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.di.BalanceSummaryDialogScreenInjector");
                        n nVar = ((n) objB).F;
                        BalanceSummaryDialogScreenContract$InputData balanceSummaryDialogScreenContract$InputData = balanceSummaryDialogScreen.K;
                        balanceSummaryDialogScreenContract$InputData.getClass();
                        return new anb.c(nVar, balanceSummaryDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = BalanceSummaryDialogScreen.S;
                        return (e) ((anb.c) balanceSummaryDialogScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (sob.e) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        DialogHeaderView dialogHeaderView = ((xmb.b) value).f307099b;
        dialogHeaderView.setTitle(new TextLocalisedClause(R$string.savings_balance_summary_title, null, null, 14));
        dialogHeaderView.setMenuItem(null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new sob.c(2, 4, sob.e.class, (sob.e) this.R.getValue(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
