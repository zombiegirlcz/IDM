package qk1;

import com.revolut.feature.alipay_plus.mpm.model.APMPMCallback;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeRequest;
import com.revolut.feature.alipay_plus.mpm.model.APMPMDecodeResult;
import com.revolut.feature.alipay_plus.mpm.model.APMPMService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements APMPMService {
    @Override // com.revolut.feature.alipay_plus.mpm.model.APMPMService
    public final void decode(APMPMDecodeRequest request, APMPMCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.onSuccess(new APMPMDecodeResult(null, 1, null));
    }
}
