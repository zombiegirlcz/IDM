package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.ArrayMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f40342zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final ArrayMap f40343zzb = new ArrayMap();

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = f40343zzb;
        Uri uri2 = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri2 != null) {
            return uri2;
        }
        Uri uri3 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri3);
        return uri3;
    }
}
