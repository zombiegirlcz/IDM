package com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment;

import aii.q;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment.NextInterestPaymentDialogScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import uob.b;
import uob.c;
import uob.i;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/common/dialogs/next_interest_payment/NextInterestPaymentDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Luob/i;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NextInterestPaymentDialogScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(NextInterestPaymentDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public NextInterestPaymentDialogScreen(SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new LargeActionButtonDelegate();
        this.O = true;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: uob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NextInterestPaymentDialogScreen f281590b;

            {
                this.f281590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen = this.f281590b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NextInterestPaymentDialogScreen.S;
                        return (h) ((anb.h) nextInterestPaymentDialogScreen.Q.getValue()).f6645c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NextInterestPaymentDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(nextInterestPaymentDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData = nextInterestPaymentDialogScreen.K;
                        savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.getClass();
                        return new anb.h(nVar, savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NextInterestPaymentDialogScreen.S;
                        NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen2 = this.f281590b;
                        return dli.f.a(nextInterestPaymentDialogScreen2, (h) nextInterestPaymentDialogScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), nextInterestPaymentDialogScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: uob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NextInterestPaymentDialogScreen f281590b;

            {
                this.f281590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen = this.f281590b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NextInterestPaymentDialogScreen.S;
                        return (h) ((anb.h) nextInterestPaymentDialogScreen.Q.getValue()).f6645c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NextInterestPaymentDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(nextInterestPaymentDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData = nextInterestPaymentDialogScreen.K;
                        savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.getClass();
                        return new anb.h(nVar, savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NextInterestPaymentDialogScreen.S;
                        NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen2 = this.f281590b;
                        return dli.f.a(nextInterestPaymentDialogScreen2, (h) nextInterestPaymentDialogScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), nextInterestPaymentDialogScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: uob.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NextInterestPaymentDialogScreen f281590b;

            {
                this.f281590b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen = this.f281590b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NextInterestPaymentDialogScreen.S;
                        return (h) ((anb.h) nextInterestPaymentDialogScreen.Q.getValue()).f6645c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = NextInterestPaymentDialogScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(nextInterestPaymentDialogScreen.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData = nextInterestPaymentDialogScreen.K;
                        savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData.getClass();
                        return new anb.h(nVar, savingsKompotFeatureConfig$NextInterestPaymentDialogScreen$InputData);
                    default:
                        KProperty[] kPropertyArr3 = NextInterestPaymentDialogScreen.S;
                        NextInterestPaymentDialogScreen nextInterestPaymentDialogScreen2 = this.f281590b;
                        return dli.f.a(nextInterestPaymentDialogScreen2, (h) nextInterestPaymentDialogScreen2.P.getValue(), v.k(new FullScreenStateDelegate(), nextInterestPaymentDialogScreen2.N, new LargeActionButtonLoadingDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.n) value).f174542b.setHeaderModel(uiState.f281596a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (anb.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (uob.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.d.f121375b), null, new c(2, 4, uob.h.class, (uob.h) this.P.getValue(), "onLargeActionButtonClick", "onLargeActionButtonClick(Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;)V"), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
