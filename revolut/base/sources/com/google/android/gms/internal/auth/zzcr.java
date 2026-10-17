package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final ArrayMap f38959zza = new ArrayMap();

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = f38959zza;
        Uri uri2 = (Uri) arrayMap.get("com.google.android.gms.auth_account");
        if (uri2 != null) {
            return uri2;
        }
        Uri uri3 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        arrayMap.put("com.google.android.gms.auth_account", uri3);
        return uri3;
    }
}
