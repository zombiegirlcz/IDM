package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes16.dex */
final class AFb1lSDK extends AFd1zSDK<String> {
    public AFb1lSDK(Context context, AFd1fSDK aFd1fSDK) {
        super(context, aFd1fSDK, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFd1zSDK
    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
    public String values() throws Throwable {
        Cursor cursor = null;
        try {
            ContentResolver contentResolver = this.AFKeystoreWrapper.getContentResolver();
            StringBuilder sb6 = new StringBuilder("content://");
            sb6.append(this.AFInAppEventParameterName);
            Cursor cursorQuery = contentResolver.query(Uri.parse(sb6.toString()), new String[]{"aid"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("aid"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th11) {
            th = th11;
        }
    }

    public final String AFInAppEventType() {
        this.values.AFKeystoreWrapper().execute(this.AFInAppEventType);
        return (String) super.valueOf();
    }

    @Override // com.appsflyer.internal.AFd1zSDK
    public final /* synthetic */ String valueOf() {
        this.values.AFKeystoreWrapper().execute(this.AFInAppEventType);
        return (String) super.valueOf();
    }
}
