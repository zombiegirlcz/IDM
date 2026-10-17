package com.revolut.feature.rewards.impl.ui.subscription.check;

import android.view.View;
import cli.k;
import com.revolut.feature.rewards.impl.ui.subscription.check.ExistingSubscriptionCheckScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import te0.w;
import whc.n;
import whc.s;
import xki.e;
import zhm.f0;
import zjc.a;
import zjc.f;
import zjc.h;
import zjc.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/subscription/check/ExistingSubscriptionCheckScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lzjc/f;", "Lcli/k;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExistingSubscriptionCheckScreen extends BaseBottomSheetRecyclerController<f, k> {
    public static final /* synthetic */ int U = 0;
    public final a Q;
    public final f0 R;
    public final Object S;
    public final Object T;

    public ExistingSubscriptionCheckScreen(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = f0.f322471a;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: zjc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExistingSubscriptionCheckScreen f322788b;

            {
                this.f322788b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExistingSubscriptionCheckScreen existingSubscriptionCheckScreen = this.f322788b;
                switch (i2) {
                    case 0:
                        int i3 = ExistingSubscriptionCheckScreen.U;
                        qji.b bVarU2 = existingSubscriptionCheckScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.check.di.ExistingSubscriptionCheckScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        a aVar = existingSubscriptionCheckScreen.Q;
                        aVar.getClass();
                        return new whc.k(sVar, nVar2, aVar);
                    default:
                        int i5 = ExistingSubscriptionCheckScreen.U;
                        return (h) ((whc.k) existingSubscriptionCheckScreen.S.getValue()).f297542b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: zjc.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExistingSubscriptionCheckScreen f322788b;

            {
                this.f322788b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExistingSubscriptionCheckScreen existingSubscriptionCheckScreen = this.f322788b;
                switch (i22) {
                    case 0:
                        int i3 = ExistingSubscriptionCheckScreen.U;
                        qji.b bVarU2 = existingSubscriptionCheckScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rewards.impl.ui.subscription.check.di.ExistingSubscriptionCheckScreenInjector");
                        n nVar = (n) bVarU2;
                        s sVar = nVar.f297548c;
                        n nVar2 = nVar.d;
                        a aVar = existingSubscriptionCheckScreen.Q;
                        aVar.getClass();
                        return new whc.k(sVar, nVar2, aVar);
                    default:
                        int i5 = ExistingSubscriptionCheckScreen.U;
                        return (h) ((whc.k) existingSubscriptionCheckScreen.S.getValue()).f297542b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (whc.k) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new j(this, null, 0), 3);
        ViewController.P2(this, f3(), new j(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getZ() {
        return this.R;
    }
}
