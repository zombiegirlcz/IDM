package twb;

import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VoucherProduct f275002b;

    public /* synthetic */ u(VoucherProduct voucherProduct, int i) {
        this.f275001a = i;
        this.f275002b = voucherProduct;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275001a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, null, null, this.f275002b, false, false, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 1:
                v2e.l update2 = (v2e.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return v2e.l.a(update2, null, this.f275002b, null, false, false, false, false, null, null, null, null, 2045);
            default:
                xwb.e update3 = (xwb.e) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xwb.e.a(update3, null, null, this.f275002b, 7);
        }
    }
}
