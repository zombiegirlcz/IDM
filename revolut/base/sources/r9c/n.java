package r9c;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.ramp.RampOrderDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q87.z;
import r7i.r;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uj5.a f252566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ydc.c f252567b;

    public n(uj5.a blockchainUiMapper, ydc.c paymentSummaryMapper) {
        Intrinsics.checkNotNullParameter(blockchainUiMapper, "blockchainUiMapper");
        Intrinsics.checkNotNullParameter(paymentSummaryMapper, "paymentSummaryMapper");
        this.f252566a = blockchainUiMapper;
        this.f252567b = paymentSummaryMapper;
    }

    public final List a(RampOrderDetails rampOrderDetails, Data orderDetails, Data paymentMethod, Data amountData, Data userCompanyEntityData) {
        Intrinsics.checkNotNullParameter(rampOrderDetails, "rampOrderDetails");
        Intrinsics.checkNotNullParameter(orderDetails, "orderDetails");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(userCompanyEntityData, "userCompanyEntityData");
        return (List) iii.c.f(t1.v(orderDetails, paymentMethod, amountData, userCompanyEntityData), new r(this, 12), new r6d.h(22), new z(this, rampOrderDetails, 28));
    }
}
