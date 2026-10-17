package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.database.Cursor;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFi1bSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1aSDK extends AFi1kSDK {
    private final AFd1fSDK values;

    public AFi1aSDK(Runnable runnable, AFd1fSDK aFd1fSDK) {
        super("store", "samsung", runnable);
        this.values = aFd1fSDK;
    }

    @Override // com.appsflyer.internal.AFi1bSDK
    public final void values(Context context) {
        AFd1zSDK<Map<String, Object>> aFd1zSDK = new AFd1zSDK<Map<String, Object>>(context, this.values, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFi1aSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.appsflyer.internal.AFd1zSDK
            /* JADX INFO: renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            public Map<String, Object> values() {
                String string;
                Cursor cursorQuery = null;
                try {
                    try {
                        ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
                        StringBuilder sb6 = new StringBuilder("content://");
                        sb6.append(this.AFInAppEventParameterName);
                        cursorQuery = contentResolver.query(Uri.parse(sb6.toString()), null, null, null, null);
                        if (cursorQuery == null) {
                            AFi1aSDK.this.valueOf.put("response", "SERVICE_UNAVAILABLE");
                        } else if (cursorQuery.moveToFirst()) {
                            AFi1aSDK.this.valueOf.put("response", "OK");
                            AFInAppEventType("referrer", AFi1aSDK.this.valueOf, cursorQuery);
                            AFKeystoreWrapper("click_ts", AFi1aSDK.this.valueOf, cursorQuery);
                            AFKeystoreWrapper("install_begin_ts", AFi1aSDK.this.valueOf, cursorQuery);
                            AFKeystoreWrapper("install_end_ts", AFi1aSDK.this.valueOf, cursorQuery);
                            AFInAppEventType("organic_keywords", AFi1aSDK.this.valueOf, cursorQuery);
                            AFInAppEventType("attr_type", AFi1aSDK.this.valueOf, cursorQuery);
                            HashMap map = new HashMap();
                            int columnIndex = cursorQuery.getColumnIndex("instant");
                            if (columnIndex != -1 && (string = cursorQuery.getString(columnIndex)) != null) {
                                map.put("instant", Boolean.valueOf(Boolean.parseBoolean(string)));
                            }
                            AFKeystoreWrapper("click_server_ts", map, cursorQuery);
                            AFKeystoreWrapper("install_begin_server_ts", map, cursorQuery);
                            AFInAppEventType("install_version", map, cursorQuery);
                            if (!map.isEmpty()) {
                                AFi1aSDK.this.valueOf.put("custom", map);
                            }
                        } else {
                            AFi1aSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        }
                    } catch (Exception e) {
                        AFi1aSDK.this.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
                        AFLogger.afErrorLog(e.getMessage(), e, false, true);
                        if (0 != 0) {
                        }
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    String str = ((PackageItemInfo) this.AFKeystoreWrapper.getPackageManager().resolveContentProvider(this.AFInAppEventParameterName, 128)).packageName;
                    AFi1aSDK.this.valueOf.put("api_ver", Long.valueOf(AFb1vSDK.AFKeystoreWrapper(this.AFKeystoreWrapper, str)));
                    AFi1aSDK.this.valueOf.put("api_ver_name", AFb1vSDK.values(this.AFKeystoreWrapper, str));
                    AFi1aSDK.this.AFInAppEventType();
                    return AFi1aSDK.this.valueOf;
                } catch (Throwable th10) {
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    throw th10;
                }
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j2 = cursor.getLong(columnIndex);
                if (j2 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j2));
            }

            private static void AFInAppEventType(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        };
        AFd1pSDK aFd1pSDKAFInAppEventType = this.values.AFInAppEventType();
        AFb1rSDK.AFInAppEventParameterName();
        if (AFb1rSDK.AFInAppEventType(aFd1pSDKAFInAppEventType, false) > 0 || !aFd1zSDK.AFKeystoreWrapper()) {
            return;
        }
        aFd1zSDK.values.AFKeystoreWrapper().execute(aFd1zSDK.AFInAppEventType);
        this.AFLogger = System.currentTimeMillis();
        this.AFInAppEventType = AFi1bSDK.AFa1uSDK.STARTED;
        addObserver(new AFi1bSDK.AnonymousClass4());
    }
}
