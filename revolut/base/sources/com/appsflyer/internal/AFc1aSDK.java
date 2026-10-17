package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.appsflyer.internal.AFj1xSDK.AnonymousClass4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1aSDK {
    public static Uri AFKeystoreWrapper(Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1xSDK aFj1xSDK = new AFj1xSDK(intent);
        Intrinsics.checkNotNullParameter("android.intent.extra.REFERRER", "");
        Uri uri2 = (Uri) ((Parcelable) aFj1xSDK.AFInAppEventType(aFj1xSDK.new AnonymousClass4("android.intent.extra.REFERRER"), "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri2 != null) {
            return uri2;
        }
        String strValueOf = aFj1xSDK.valueOf("android.intent.extra.REFERRER_NAME");
        if (strValueOf != null) {
            return Uri.parse(strValueOf);
        }
        return null;
    }
}
