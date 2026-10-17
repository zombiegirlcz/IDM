package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public final class zzjh implements zzjd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final AtomicBoolean f40308zza = new AtomicBoolean();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private HashMap f40309zzb = null;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final HashMap f40310zzc = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final HashMap f40311zzd = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final HashMap f40312zze = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final HashMap f40313zzf = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private Object f40314zzg = null;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private boolean f40315zzh = false;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final String[] f40316zzi = new String[0];

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final String zza(ContentResolver contentResolver, String str, String str2) {
        String string;
        if (contentResolver == null) {
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (this) {
            try {
                String str3 = null;
                if (this.f40309zzb == null) {
                    this.f40308zza.set(false);
                    this.f40309zzb = new HashMap(16, 1.0f);
                    this.f40314zzg = new Object();
                    contentResolver.registerContentObserver(zzjc.f40302zza, true, new zzjf(this, null));
                } else if (this.f40308zza.getAndSet(false)) {
                    this.f40309zzb.clear();
                    this.f40310zzc.clear();
                    this.f40311zzd.clear();
                    this.f40312zze.clear();
                    this.f40313zzf.clear();
                    this.f40314zzg = new Object();
                    this.f40315zzh = false;
                }
                Object obj2 = this.f40314zzg;
                if (this.f40309zzb.containsKey(str)) {
                    String str4 = (String) this.f40309zzb.get(str);
                    if (str4 != null) {
                        str3 = str4;
                    }
                    return str3;
                }
                try {
                    Uri uri2 = zzjc.f40302zza;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri2);
                    try {
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            throw new zzjg("Unable to acquire ContentProviderClient");
                        }
                        try {
                            Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri2, null, null, new String[]{str}, null);
                            try {
                                if (cursorQuery == null) {
                                    throw new zzjg("ContentProvider query returned null cursor");
                                }
                                if (cursorQuery.moveToFirst()) {
                                    string = cursorQuery.getString(1);
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                } else {
                                    cursorQuery.close();
                                    contentProviderClientAcquireUnstableContentProviderClient.release();
                                    string = null;
                                }
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                synchronized (this) {
                                    try {
                                        if (obj2 == this.f40314zzg) {
                                            this.f40309zzb.put(str, string);
                                        }
                                    } finally {
                                    }
                                }
                                if (string != null) {
                                    return string;
                                }
                                return null;
                            } finally {
                            }
                        } catch (RemoteException e) {
                            throw new zzjg("ContentProvider query failed", e);
                        }
                    } catch (Throwable th10) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th10;
                    }
                } catch (zzjg unused) {
                    return null;
                }
            } finally {
            }
        }
    }
}
