package xwb;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f309343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f309344c;
    public final VoucherProduct d;

    public e(String idempotencyKey, Data revPointsAccountStatus, Data voucherGroup, VoucherProduct voucherProduct) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(voucherGroup, "voucherGroup");
        this.f309342a = idempotencyKey;
        this.f309343b = revPointsAccountStatus;
        this.f309344c = voucherGroup;
        this.d = voucherProduct;
    }

    public static e a(e eVar, Data revPointsAccountStatus, Data voucherGroup, VoucherProduct voucherProduct, int i) {
        String idempotencyKey = eVar.f309342a;
        if ((i & 2) != 0) {
            revPointsAccountStatus = eVar.f309343b;
        }
        if ((i & 4) != 0) {
            voucherGroup = eVar.f309344c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(voucherGroup, "voucherGroup");
        return new e(idempotencyKey, revPointsAccountStatus, voucherGroup, voucherProduct);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f309342a, eVar.f309342a) && Intrinsics.f(this.f309343b, eVar.f309343b) && Intrinsics.f(this.f309344c, eVar.f309344c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f309344c, kii.e.c(this.f309343b, this.f309342a.hashCode() * 31, 31), 31);
        VoucherProduct voucherProduct = this.d;
        return iC + (voucherProduct == null ? 0 : voucherProduct.hashCode());
    }
}
