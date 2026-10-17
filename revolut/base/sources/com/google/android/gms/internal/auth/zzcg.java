package com.google.android.gms.internal.auth;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcg implements zzcl {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ContentResolver f38943zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Uri f38944zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Runnable f38945zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final ContentObserver f38946zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Object f38947zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private volatile Map f38948zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final List f38949zzi;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Map f38942zzb = new ArrayMap();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final String[] f38941zza = {"key", "value"};

    private zzcg(ContentResolver contentResolver, Uri uri2, Runnable runnable) {
        zzcf zzcfVar = new zzcf(this, null);
        this.f38946zzf = zzcfVar;
        this.f38947zzg = new Object();
        this.f38949zzi = new ArrayList();
        contentResolver.getClass();
        uri2.getClass();
        this.f38943zzc = contentResolver;
        this.f38944zzd = uri2;
        this.f38945zze = runnable;
        contentResolver.registerContentObserver(uri2, false, zzcfVar);
    }

    public static zzcg zza(ContentResolver contentResolver, Uri uri2, Runnable runnable) {
        zzcg zzcgVar;
        synchronized (zzcg.class) {
            Map map = f38942zzb;
            zzcgVar = (zzcg) map.get(uri2);
            if (zzcgVar == null) {
                try {
                    zzcg zzcgVar2 = new zzcg(contentResolver, uri2, runnable);
                    try {
                        map.put(uri2, zzcgVar2);
                    } catch (SecurityException unused) {
                    }
                    zzcgVar = zzcgVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzcgVar;
    }

    public static synchronized void zzd() {
        try {
            for (zzcg zzcgVar : f38942zzb.values()) {
                zzcgVar.f38943zzc.unregisterContentObserver(zzcgVar.f38946zzf);
            }
            f38942zzb.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.auth.zzcl
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        Map map;
        Map map2 = this.f38948zzh;
        if (map2 == null) {
            synchronized (this.f38947zzg) {
                map2 = this.f38948zzh;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) zzcj.zza(new zzck() { // from class: com.google.android.gms.internal.auth.zzce
                            @Override // com.google.android.gms.internal.auth.zzck
                            public final Object zza() {
                                return this.f38939zza.zzc();
                            }
                        });
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = null;
                    } catch (Throwable th10) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th10;
                    }
                    this.f38948zzh = map;
                    map2 = map;
                }
            }
        }
        if (map2 == null) {
            map2 = Collections.EMPTY_MAP;
        }
        return (String) map2.get(str);
    }

    public final /* synthetic */ Map zzc() {
        Cursor cursorQuery = this.f38943zzc.query(this.f38944zzd, f38941zza, null, null, null);
        if (cursorQuery == null) {
            return Collections.EMPTY_MAP;
        }
        try {
            int count = cursorQuery.getCount();
            if (count == 0) {
                return Collections.EMPTY_MAP;
            }
            Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
            while (cursorQuery.moveToNext()) {
                arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            }
            return arrayMap;
        } finally {
            cursorQuery.close();
        }
    }

    public final void zze() {
        synchronized (this.f38947zzg) {
            this.f38948zzh = null;
            zzdc.zzc();
        }
        synchronized (this) {
            try {
                Iterator it8 = this.f38949zzi.iterator();
                while (it8.hasNext()) {
                    ((zzch) it8.next()).zza();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
