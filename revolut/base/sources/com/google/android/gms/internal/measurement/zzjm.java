package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.collection.ArrayMap;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjm implements zzjr {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final ContentResolver f40325zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Uri f40326zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Runnable f40327zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final ContentObserver f40328zzf;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private volatile Map f40330zzh;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Map f40324zzb = new ArrayMap();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final String[] f40323zza = {"key", "value"};

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Object f40329zzg = new Object();

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final List f40331zzi = new ArrayList();

    private zzjm(ContentResolver contentResolver, Uri uri2, Runnable runnable) {
        Preconditions.checkNotNull(contentResolver);
        Preconditions.checkNotNull(uri2);
        this.f40325zzc = contentResolver;
        this.f40326zzd = uri2;
        this.f40327zze = runnable;
        this.f40328zzf = new zzjl(this, null);
    }

    public static zzjm zza(ContentResolver contentResolver, Uri uri2, Runnable runnable) {
        zzjm zzjmVar;
        synchronized (zzjm.class) {
            Map map = f40324zzb;
            zzjmVar = (zzjm) map.get(uri2);
            if (zzjmVar == null) {
                try {
                    zzjm zzjmVar2 = new zzjm(contentResolver, uri2, runnable);
                    try {
                        contentResolver.registerContentObserver(uri2, false, zzjmVar2.f40328zzf);
                        map.put(uri2, zzjmVar2);
                    } catch (SecurityException unused) {
                    }
                    zzjmVar = zzjmVar2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return zzjmVar;
    }

    public static /* synthetic */ Map zzc(zzjm zzjmVar) {
        ContentResolver contentResolver = zzjmVar.f40325zzc;
        Uri uri2 = zzjmVar.f40326zzd;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri2);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri2, f40323zza, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map arrayMap = count <= 256 ? new ArrayMap(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        arrayMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return arrayMap;
                    }
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } finally {
                }
            } catch (RemoteException e) {
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th10) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th10;
        }
    }

    public static synchronized void zze() {
        try {
            Map map = f40324zzb;
            for (zzjm zzjmVar : map.values()) {
                zzjmVar.f40325zzc.unregisterContentObserver(zzjmVar.f40328zzf);
            }
            map.clear();
        } catch (Throwable th10) {
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) zzd().get(str);
    }

    public final Map zzd() {
        Map map;
        Map map2 = this.f40330zzh;
        if (map2 == null) {
            synchronized (this.f40329zzg) {
                map2 = this.f40330zzh;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map = (Map) zzjp.zza(new zzjq() { // from class: com.google.android.gms.internal.measurement.zzjk
                                @Override // com.google.android.gms.internal.measurement.zzjq
                                public final Object zza() {
                                    return zzjm.zzc(this.f40321zza);
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                        map = Collections.EMPTY_MAP;
                    }
                    this.f40330zzh = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.EMPTY_MAP;
    }

    public final void zzf() {
        synchronized (this.f40329zzg) {
            this.f40330zzh = null;
            this.f40327zze.run();
        }
        synchronized (this) {
            try {
                Iterator it8 = this.f40331zzi.iterator();
                while (it8.hasNext()) {
                    ((zzjn) it8.next()).zza();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
