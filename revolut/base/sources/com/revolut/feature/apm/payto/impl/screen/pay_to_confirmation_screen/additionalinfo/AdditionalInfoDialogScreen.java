package com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen.additionalinfo;

import aii.q;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import pt4.d;
import q97.p1;
import qb2.a;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/additionalinfo/AdditionalInfoDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lqb2/a;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInfoDialogScreen extends BaseBottomSheetRecyclerController<q, a> {
    public static final /* synthetic */ int T = 0;
    public final Object Q;
    public final Object R;
    public final List S;

    public AdditionalInfoDialogScreen(AdditionalInfoDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = w.y0(new d(this, inputData, 27));
        this.R = w.y0(new p1(this, 3));
        this.S = u.c(new CellDetailsNoteDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (nb2.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (qb2.b) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (qb2.b) this.R.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.S;
    }
}
