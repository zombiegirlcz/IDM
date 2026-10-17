package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK {
    public final AFd1pSDK AFInAppEventType;
    public long valueOf;
    public long values;
    public AFh1aSDK AFInAppEventParameterName = null;
    public AFh1aSDK AFKeystoreWrapper = AFInAppEventType();

    public AFg1sSDK(AFd1pSDK aFd1pSDK) {
        this.AFInAppEventType = aFd1pSDK;
        this.valueOf = aFd1pSDK.AFInAppEventParameterName("af_rc_timestamp", 0L);
        this.values = aFd1pSDK.AFInAppEventParameterName("af_rc_max_age", 0L);
    }

    private AFh1aSDK AFInAppEventType() {
        String strAFKeystoreWrapper = this.AFInAppEventType.AFKeystoreWrapper("af_remote_config", (String) null);
        if (strAFKeystoreWrapper == null) {
            AFLogger.INSTANCE.d(AFg1bSDK.REMOTE_CONTROL, "No configuration found in cache");
            return null;
        }
        try {
            return new AFh1aSDK(new String(Base64.decode(strAFKeystoreWrapper, 2), Charset.defaultCharset()));
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1bSDK.REMOTE_CONTROL, "Error reading malformed configuration from cache, requires fetching from remote again", e, true);
            return null;
        }
    }
}
