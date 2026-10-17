package com.appsflyer.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes16.dex */
public final class AFi1dSDK extends AFi1bSDK {
    private final AFd1fSDK d;
    final ProviderInfo values;

    public AFi1dSDK(ProviderInfo providerInfo, Runnable runnable, AFd1fSDK aFd1fSDK) {
        super("af_referrer", providerInfo.authority, runnable);
        this.d = aFd1fSDK;
        this.values = providerInfo;
    }

    public static ContentProviderClient valueOf(Context context, Uri uri2) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri2);
        } catch (SecurityException e) {
            AFLogger.INSTANCE.e(AFg1bSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to SecurityException", e, false);
            return null;
        } catch (Throwable th10) {
            AFLogger.INSTANCE.e(AFg1bSDK.PREINSTALL, "Failed to acquire unstable content providerClient due to unexpected throwable", th10, false);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(final Context context) {
        this.d.AFKeystoreWrapper().execute(new Runnable() { // from class: com.appsflyer.internal.AFi1dSDK.5
            /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instruction units count: 276
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1dSDK.AnonymousClass5.run():void");
            }
        });
    }
}
