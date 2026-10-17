package com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards;

import aii.q;
import cli.k;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards.AdditionalRewardsBottomSheetContract$InputData;
import com.revolut.retail.feature.plan_rewards.impl.presentation.list.screen.additional_rewards.AdditionalRewardsBottomSheetScreen;
import fdk.a;
import fdk.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/screen/additional_rewards/AdditionalRewardsBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalRewardsBottomSheetScreen extends BaseBottomSheetRecyclerController<q, k> {
    public static final /* synthetic */ int U = 0;
    public final AdditionalRewardsBottomSheetContract$InputData Q;
    public final List R;
    public final Object S;
    public final Object T;

    public AdditionalRewardsBottomSheetScreen(AdditionalRewardsBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: mdk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalRewardsBottomSheetScreen f204569b;

            {
                this.f204569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalRewardsBottomSheetScreen additionalRewardsBottomSheetScreen = this.f204569b;
                switch (i2) {
                    case 0:
                        int i3 = AdditionalRewardsBottomSheetScreen.U;
                        phm.a aVar = (phm.a) e.j(additionalRewardsBottomSheetScreen.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f133990n;
                        AdditionalRewardsBottomSheetContract$InputData additionalRewardsBottomSheetContract$InputData = additionalRewardsBottomSheetScreen.Q;
                        additionalRewardsBottomSheetContract$InputData.getClass();
                        return new fdk.a(gVar, additionalRewardsBottomSheetContract$InputData);
                    default:
                        int i5 = AdditionalRewardsBottomSheetScreen.U;
                        return (b) ((fdk.a) additionalRewardsBottomSheetScreen.S.getValue()).f133969b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: mdk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalRewardsBottomSheetScreen f204569b;

            {
                this.f204569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalRewardsBottomSheetScreen additionalRewardsBottomSheetScreen = this.f204569b;
                switch (i22) {
                    case 0:
                        int i3 = AdditionalRewardsBottomSheetScreen.U;
                        phm.a aVar = (phm.a) e.j(additionalRewardsBottomSheetScreen.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).f133990n;
                        AdditionalRewardsBottomSheetContract$InputData additionalRewardsBottomSheetContract$InputData = additionalRewardsBottomSheetScreen.Q;
                        additionalRewardsBottomSheetContract$InputData.getClass();
                        return new fdk.a(gVar, additionalRewardsBottomSheetContract$InputData);
                    default:
                        int i5 = AdditionalRewardsBottomSheetScreen.U;
                        return (b) ((fdk.a) additionalRewardsBottomSheetScreen.S.getValue()).f133969b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (mdk.b) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (mdk.b) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getR() {
        return this.R;
    }
}
