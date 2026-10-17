package com.revolut.feature.rewards.impl.ui.subscription.activation;

import android.view.View;
import cli.k;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeContract$InputData;
import com.revolut.feature.rewards.impl.ui.subscription.activation.ActivationNoticeScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import t05.m;
import te0.w;
import tjc.d;
import tjc.f;
import whc.n;
import whc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/subscription/activation/ActivationNoticeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ltjc/d;", "Lcli/k;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivationNoticeScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int U = 0;
    public final ActivationNoticeContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public ActivationNoticeScreen(ActivationNoticeContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: tjc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationNoticeScreen f271629b;

            {
                this.f271629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ActivationNoticeScreen activationNoticeScreen = this.f271629b;
                switch (i2) {
                    case 0:
                        int i3 = ActivationNoticeScreen.U;
                        qji.b bVarU2 = activationNoticeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.activation.di.ActivationNoticeScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        ActivationNoticeContract$InputData activationNoticeContract$InputData = activationNoticeScreen.Q;
                        activationNoticeContract$InputData.getClass();
                        return new whc.e(sVar, nVar2, activationNoticeContract$InputData);
                    default:
                        int i5 = ActivationNoticeScreen.U;
                        return (f) ((whc.e) activationNoticeScreen.S.getValue()).f297514c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: tjc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ActivationNoticeScreen f271629b;

            {
                this.f271629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ActivationNoticeScreen activationNoticeScreen = this.f271629b;
                switch (i22) {
                    case 0:
                        int i3 = ActivationNoticeScreen.U;
                        qji.b bVarU2 = activationNoticeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.activation.di.ActivationNoticeScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        ActivationNoticeContract$InputData activationNoticeContract$InputData = activationNoticeScreen.Q;
                        activationNoticeContract$InputData.getClass();
                        return new whc.e(sVar, nVar2, activationNoticeContract$InputData);
                    default:
                        int i5 = ActivationNoticeScreen.U;
                        return (f) ((whc.e) activationNoticeScreen.S.getValue()).f297514c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (whc.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new m(this, null, 29), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
