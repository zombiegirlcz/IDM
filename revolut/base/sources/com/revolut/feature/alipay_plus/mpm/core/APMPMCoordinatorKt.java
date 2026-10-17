package com.revolut.feature.alipay_plus.mpm.core;

import com.revolut.feature.alipay_plus.mpm.model.APMPMLaunchRequest;
import com.revolut.feature.alipay_plus.mpm.support.APMPMJson;
import kotlin.Metadata;
import kotlin.text.d0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"resolvedForceHttps", "", "Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchRequest;", "getResolvedForceHttps", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchRequest;)Z", "acDecodeConfigUserAgent", "", "getAcDecodeConfigUserAgent", "(Lcom/revolut/feature/alipay_plus/mpm/model/APMPMLaunchRequest;)Ljava/lang/String;", "feature_alipay_plus_nonsdk_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class APMPMCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAcDecodeConfigUserAgent(APMPMLaunchRequest aPMPMLaunchRequest) {
        String strOptString;
        JSONObject object = APMPMJson.INSTANCE.parseObject(aPMPMLaunchRequest.getAcDecodeConfig());
        if (object == null || (strOptString = object.optString("userAgent")) == null || d0.W(strOptString)) {
            return null;
        }
        return strOptString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getResolvedForceHttps(APMPMLaunchRequest aPMPMLaunchRequest) {
        JSONObject object = APMPMJson.INSTANCE.parseObject(aPMPMLaunchRequest.getAcDecodeConfig());
        if (object != null) {
            return object.optBoolean("forceHttps", false);
        }
        return false;
    }
}
