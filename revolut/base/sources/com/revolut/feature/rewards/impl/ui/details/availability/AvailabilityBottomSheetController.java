package com.revolut.feature.rewards.impl.ui.details.availability;

import aii.q;
import cli.k;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import pki.b;
import xki.e;
import zhc.a;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/impl/ui/details/availability/AvailabilityBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Lcli/k;", "Lno/m;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AvailabilityBottomSheetController extends BaseBottomSheetRecyclerController<q, k> implements m {
    public final /* synthetic */ a Q;
    public final xki.a R;
    public final ay4.a S;
    public final List T;

    public AvailabilityBottomSheetController(iic.a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = a.f322393a;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.R = xki.a.f306815a;
        this.S = new ay4.a(inputData);
        this.T = v.k(rowDelegate, listSubheaderDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        this.Q.getClass();
        return new AnalyticsProduct.Retail(a.f322394b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return this.R;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return this.S;
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
