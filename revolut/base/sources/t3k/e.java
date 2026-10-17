package t3k;

import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import kotlin.jvm.internal.Intrinsics;
import yqi.f;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements f {
    @Override // yqi.f
    public final yqi.d validate(Object obj2) {
        d validationData = (d) obj2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        if (validationData.f267820a instanceof RemittanceRouteId.UNKNOWN) {
            return new yqi.d(validationData, s3k.c.f259707a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }
}
