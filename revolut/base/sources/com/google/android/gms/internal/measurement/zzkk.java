package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzkk implements zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Map f40363zza = new ArrayMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final SharedPreferences f40364zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Runnable f40365zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private SharedPreferences.OnSharedPreferenceChangeListener f40366zzd;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private volatile Map f40368zzf;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Object f40367zze = new Object();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final List f40369zzg = new ArrayList();

    private zzkk(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f40364zzb = sharedPreferences;
        this.f40365zzc = runnable;
    }

    public static zzkk zza(Context context, String str, Runnable runnable) {
        final zzkk zzkkVar;
        SharedPreferences sharedPreferencesZza;
        if (zzji.zzc() && !str.startsWith("direct_boot:") && !zzji.zzb(context)) {
            return null;
        }
        synchronized (zzkk.class) {
            Map map = f40363zza;
            zzkkVar = (zzkk) map.get(str);
            if (zzkkVar == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (zzji.zzc()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesZza = zzci.zza(context, str.substring(12), 0, zzcd.f39889zza);
                    } else {
                        sharedPreferencesZza = zzci.zza(context, str, 0, zzcd.f39889zza);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    zzkkVar = new zzkk(sharedPreferencesZza, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.zzkj
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            zzkk.zzc(this.f40362zza, sharedPreferences, str2);
                        }
                    };
                    zzkkVar.f40366zzd = onSharedPreferenceChangeListener;
                    zzkkVar.f40364zzb.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, zzkkVar);
                } catch (Throwable th10) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th10;
                }
            }
        }
        return zzkkVar;
    }

    public static /* synthetic */ void zzc(zzkk zzkkVar, SharedPreferences sharedPreferences, String str) {
        synchronized (zzkkVar.f40367zze) {
            zzkkVar.f40368zzf = null;
            zzki.zzc();
        }
        synchronized (zzkkVar) {
            try {
                Iterator it8 = zzkkVar.f40369zzg.iterator();
                while (it8.hasNext()) {
                    ((zzjn) it8.next()).zza();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static synchronized void zzd() {
        try {
            Map map = f40363zza;
            for (zzkk zzkkVar : map.values()) {
                zzkkVar.f40364zzb.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) Preconditions.checkNotNull(zzkkVar.f40366zzd));
            }
            map.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final Object zzb(String str) {
        Map<String, ?> map = this.f40368zzf;
        if (map == null) {
            synchronized (this.f40367zze) {
                try {
                    map = this.f40368zzf;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all2 = this.f40364zzb.getAll();
                            this.f40368zzf = all2;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all2;
                        } catch (Throwable th10) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th10;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
