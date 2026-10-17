package sbb;

import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.apm.core.api.product.ApmIris;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.api.product.ApmSpin;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.core.api.product.ApmWero;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l {
    public static final ApmProduct a(ApmDeeplinkPayload.Apm.Product product) {
        Intrinsics.checkNotNullParameter(product, "<this>");
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.BIZUM.f82730b)) {
            return ApmBizum.f61808c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.BLIK.f82731b)) {
            return ApmBlik.f61809c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.BREB.f82732b)) {
            return ApmBreb.f61810c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.IRIS.f82733b)) {
            return ApmIris.f61811c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.MBWAY.f82734b)) {
            return ApmMultibanco.f61815c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.PAYID.f82735b)) {
            return ApmPayId.f61819c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.QVIK.f82737b)) {
            return ApmQvik.f61823c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.SPIN.f82738b)) {
            return ApmSpin.f61827c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.WERO.f82741b)) {
            return ApmWero.f61829c;
        }
        if (Intrinsics.f(product, ApmDeeplinkPayload.Apm.UPI.f82740b)) {
            return ApmUpi.f61828c;
        }
        throw new NoWhenBranchMatchedException();
    }
}
