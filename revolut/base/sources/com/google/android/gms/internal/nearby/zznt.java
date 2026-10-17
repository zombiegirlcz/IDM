package com.google.android.gms.internal.nearby;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zznt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f45526zza = new WeakHashMap();

    public final Object zza(Object obj2) {
        WeakReference weakReference = (WeakReference) this.f45526zza.get(obj2);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void zzb() {
        this.f45526zza.clear();
    }

    public final void zzc(Object obj2, Object obj3) {
        this.f45526zza.put(obj2, new WeakReference(obj3));
    }

    public final void zzd(Object obj2) {
        this.f45526zza.remove(obj2);
    }

    public final boolean zze(Object obj2) {
        return zza(obj2) != null;
    }
}
