package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzci {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final SimpleArrayMap f38950zza;

    public zzci(SimpleArrayMap simpleArrayMap) {
        this.f38950zza = simpleArrayMap;
    }

    public final String zza(Uri uri2, String str, String str2, String str3) {
        SimpleArrayMap simpleArrayMap;
        if (uri2 != null) {
            simpleArrayMap = (SimpleArrayMap) this.f38950zza.get(uri2.toString());
        } else {
            simpleArrayMap = null;
        }
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("".concat(str3));
    }
}
