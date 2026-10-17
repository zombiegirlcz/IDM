package com.revolut.feature.crypto.asset.details.impl.dialog.staking_risk_disclaimer;

import aii.q;
import android.view.View;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_risk_disclaimer.StakingRiskDisclaimerDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import y5g.d;
import yc5.a;
import yc5.b;
import yc5.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/impl/dialog/staking_risk_disclaimer/StakingRiskDisclaimerDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lyc5/a;", "feature_crypto_asset_details_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakingRiskDisclaimerDialogController extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int U = 0;
    public final b Q;
    public final List R;
    public final Object S;
    public final Object T;

    public StakingRiskDisclaimerDialogController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = m72.b.v(null, null, 7);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: yc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingRiskDisclaimerDialogController f312537b;

            {
                this.f312537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StakingRiskDisclaimerDialogController stakingRiskDisclaimerDialogController = this.f312537b;
                switch (i2) {
                    case 0:
                        int i3 = StakingRiskDisclaimerDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(stakingRiskDisclaimerDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = stakingRiskDisclaimerDialogController.Q;
                        bVar2.getClass();
                        return new rc5.e(bVar, bVar2);
                    default:
                        int i5 = StakingRiskDisclaimerDialogController.U;
                        return (c) ((rc5.e) stakingRiskDisclaimerDialogController.S.getValue()).f253209c.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: yc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingRiskDisclaimerDialogController f312537b;

            {
                this.f312537b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StakingRiskDisclaimerDialogController stakingRiskDisclaimerDialogController = this.f312537b;
                switch (i22) {
                    case 0:
                        int i3 = StakingRiskDisclaimerDialogController.U;
                        phm.a aVar = (phm.a) ue0.e.j(stakingRiskDisclaimerDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = stakingRiskDisclaimerDialogController.Q;
                        bVar2.getClass();
                        return new rc5.e(bVar, bVar2);
                    default:
                        int i5 = StakingRiskDisclaimerDialogController.U;
                        return (c) ((rc5.e) stakingRiskDisclaimerDialogController.S.getValue()).f253209c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (rc5.e) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new d(this, null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.R;
    }
}
