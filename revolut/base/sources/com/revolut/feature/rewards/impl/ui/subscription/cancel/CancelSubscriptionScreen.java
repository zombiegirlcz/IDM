package com.revolut.feature.rewards.impl.ui.subscription.cancel;

import android.view.View;
import cli.k;
import com.revolut.feature.rewards.impl.ui.subscription.cancel.CancelSubscriptionScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import vjc.a;
import vjc.d;
import whc.g;
import whc.n;
import whc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/subscription/cancel/CancelSubscriptionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lvjc/d;", "Lcli/k;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancelSubscriptionScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int U = 0;
    public final a Q;
    public final List R;
    public final Object S;
    public final Object T;

    public CancelSubscriptionScreen(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: vjc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelSubscriptionScreen f289704b;

            {
                this.f289704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancelSubscriptionScreen cancelSubscriptionScreen = this.f289704b;
                switch (i2) {
                    case 0:
                        int i3 = CancelSubscriptionScreen.U;
                        qji.b bVarU2 = cancelSubscriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.cancel.di.CancelSubscriptionScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        a aVar = cancelSubscriptionScreen.Q;
                        aVar.getClass();
                        return new whc.g(sVar, nVar2, aVar);
                    default:
                        int i5 = CancelSubscriptionScreen.U;
                        return (e) ((whc.g) cancelSubscriptionScreen.S.getValue()).f297532b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vjc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancelSubscriptionScreen f289704b;

            {
                this.f289704b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancelSubscriptionScreen cancelSubscriptionScreen = this.f289704b;
                switch (i22) {
                    case 0:
                        int i3 = CancelSubscriptionScreen.U;
                        qji.b bVarU2 = cancelSubscriptionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.cancel.di.CancelSubscriptionScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        a aVar = cancelSubscriptionScreen.Q;
                        aVar.getClass();
                        return new whc.g(sVar, nVar2, aVar);
                    default:
                        int i5 = CancelSubscriptionScreen.U;
                        return (e) ((whc.g) cancelSubscriptionScreen.S.getValue()).f297532b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (vjc.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new vjc.g(this, null, 0), 3);
        ViewController.P2(this, f3(), new vjc.g(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (vjc.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
