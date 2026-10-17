package com.revolut.feature.apm.iris.impl.qr;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/iris/impl/qr/IrisQrHandlerImpl$NullBarcode", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "<init>", "()V", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisQrHandlerImpl$NullBarcode extends IllegalStateException {
    public IrisQrHandlerImpl$NullBarcode() {
        super("IRIS QR doesn't support null barcode");
    }
}
