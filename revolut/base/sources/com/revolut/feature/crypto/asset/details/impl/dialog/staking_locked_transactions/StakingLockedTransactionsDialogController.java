package com.revolut.feature.crypto.asset.details.impl.dialog.staking_locked_transactions;

import aii.q;
import android.view.View;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.crypto.asset.details.impl.dialog.staking_locked_transactions.StakingLockedTransactionsDialogController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rc5.c;
import te0.w;
import uc5.a;
import uc5.b;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/asset/details/impl/dialog/staking_locked_transactions/StakingLockedTransactionsDialogController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Luc5/a;", "feature_crypto_asset_details_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StakingLockedTransactionsDialogController extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int V = 0;
    public final b Q;
    public final RowDelegate R;
    public final List S;
    public final Object T;
    public final Object U;

    public StakingLockedTransactionsDialogController(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        final int i2 = 1;
        this.S = v.k(rowDelegate, new RowLoadingDelegate(), new FullScreenStateDelegate(), new ListSubheaderDelegate());
        this.T = w.y0(new Function0(this) { // from class: uc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingLockedTransactionsDialogController f278991b;

            {
                this.f278991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                StakingLockedTransactionsDialogController stakingLockedTransactionsDialogController = this.f278991b;
                switch (i3) {
                    case 0:
                        int i5 = StakingLockedTransactionsDialogController.V;
                        phm.a aVar = (phm.a) ue0.e.j(stakingLockedTransactionsDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = stakingLockedTransactionsDialogController.Q;
                        bVar2.getClass();
                        return new rc5.c(bVar, bVar2);
                    default:
                        int i6 = StakingLockedTransactionsDialogController.V;
                        return (c) ((rc5.c) stakingLockedTransactionsDialogController.T.getValue()).f253204c.get();
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: uc5.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StakingLockedTransactionsDialogController f278991b;

            {
                this.f278991b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                StakingLockedTransactionsDialogController stakingLockedTransactionsDialogController = this.f278991b;
                switch (i3) {
                    case 0:
                        int i5 = StakingLockedTransactionsDialogController.V;
                        phm.a aVar = (phm.a) ue0.e.j(stakingLockedTransactionsDialogController.m2()).a().get(rc5.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", rc5.b.class, " is not found"));
                        }
                        rc5.b bVar = ((rc5.b) aVar2.b()).f253200g;
                        b bVar2 = stakingLockedTransactionsDialogController.Q;
                        bVar2.getClass();
                        return new rc5.c(bVar, bVar2);
                    default:
                        int i6 = StakingLockedTransactionsDialogController.V;
                        return (c) ((rc5.c) stakingLockedTransactionsDialogController.T.getValue()).f253204c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (uc5.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new uc5.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e3(), null, new u07.b(this, null, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (uc5.c) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
