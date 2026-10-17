package com.google.android.gms.internal.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzdd implements zzcl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Map f38981zza = new ArrayMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final SharedPreferences f38982zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f38983zzc;

    public static zzdd zza(Context context, String str, Runnable runnable) {
        zzdd zzddVar;
        if (zzcc.zzb()) {
            throw null;
        }
        synchronized (zzdd.class) {
            try {
                zzddVar = (zzdd) f38981zza.get(null);
                if (zzddVar == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th10) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th10;
                    }
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
        return zzddVar;
    }

    public static synchronized void zzc() {
        Map map = f38981zza;
        Iterator it8 = map.values().iterator();
        if (it8.hasNext()) {
            SharedPreferences sharedPreferences = ((zzdd) it8.next()).f38982zzb;
            throw null;
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final Object zzb(String str) {
        throw null;
    }
}
