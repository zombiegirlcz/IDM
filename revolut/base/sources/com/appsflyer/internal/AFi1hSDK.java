package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1bSDK;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1hSDK extends AFi1oSDK {
    private final AFi1nSDK registerClient;
    private final AFd1fSDK values;

    public AFi1hSDK(Runnable runnable, AFd1fSDK aFd1fSDK, AFi1nSDK aFi1nSDK) {
        super("store", "huawei", aFd1fSDK.valueOf(), runnable);
        this.values = aFd1fSDK;
        this.registerClient = aFi1nSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFInAppEventType(Context context) {
        this.AFLogger = System.currentTimeMillis();
        this.AFInAppEventType = AFi1bSDK.AFa1uSDK.STARTED;
        addObserver(new AFi1bSDK.AnonymousClass4());
        String str = ((PackageItemInfo) context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 128)).packageName;
        this.valueOf.put("api_ver", Long.valueOf(AFb1vSDK.AFKeystoreWrapper(context, str)));
        this.valueOf.put("api_ver_name", AFb1vSDK.values(context, str));
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.huawei.appmarket.commondata/item/5"), null, null, new String[]{context.getPackageName()}, null);
            if (cursorQuery == null) {
                this.valueOf.put("response", "SERVICE_UNAVAILABLE");
            } else if (cursorQuery.moveToFirst()) {
                this.valueOf.put("response", "OK");
                this.valueOf.put("referrer", cursorQuery.getString(0));
                this.valueOf.put("click_ts", Long.valueOf(cursorQuery.getLong(1)));
                this.valueOf.put("install_end_ts", Long.valueOf(cursorQuery.getLong(2)));
                if (cursorQuery.getColumnCount() > 3) {
                    this.valueOf.put("install_begin_ts", Long.valueOf(cursorQuery.getLong(3)));
                    HashMap map = new HashMap();
                    String string = cursorQuery.getString(4);
                    if (string != null) {
                        map.put("track_id", string);
                    }
                    map.put("referrer_ex", cursorQuery.getString(5));
                    this.valueOf.put("huawei_custom", map);
                }
            } else {
                this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
            }
        } catch (Throwable th10) {
            try {
                this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                AFLogger.INSTANCE.e(AFg1bSDK.REFERRER, th10.getMessage() != null ? th10.getMessage() : "", th10, false, true);
                if (0 != 0) {
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        AFInAppEventType();
    }

    private boolean valueOf(Context context) {
        if (!AFKeystoreWrapper()) {
            AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Huawei referrer collection disallowed by counter.");
            return false;
        }
        if (!this.registerClient.AFKeystoreWrapper(context)) {
            AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Huawei referrer collection disallowed by missing content provider.");
            return false;
        }
        if (this.registerClient.valueOf(context)) {
            return true;
        }
        AFLogger.INSTANCE.d(AFg1bSDK.REFERRER, "Huawei referrer collection disallowed by invalid content provider.");
        return false;
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(Context context) {
        if (valueOf(context)) {
            this.values.AFKeystoreWrapper().execute(new g(this, context, 1));
        }
    }
}
