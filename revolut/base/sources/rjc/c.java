package rjc;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ojc.d;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData f254653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f254654b;

    public c(RentAndBillsUnlinkPaymentsBottomSheetScreenContract$InputData inputData, d paymentRowMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(paymentRowMapper, "paymentRowMapper");
        this.f254653a = inputData;
        this.f254654b = paymentRowMapper;
    }
}
