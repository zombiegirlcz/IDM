package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final SimpleArrayMap f40332zza;

    public zzjo(SimpleArrayMap simpleArrayMap) {
        this.f40332zza = simpleArrayMap;
    }

    public final String zza(Uri uri2, String str, String str2, String str3) {
        SimpleArrayMap simpleArrayMap = uri2 != null ? (SimpleArrayMap) this.f40332zza.get(uri2.toString()) : null;
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(str3));
    }
}
