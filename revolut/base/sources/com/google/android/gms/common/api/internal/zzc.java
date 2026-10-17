package com.google.android.gms.common.api.internal;

import a0.d;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Map f37957zza = Collections.synchronizedMap(new ArrayMap());

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f37958zzb = 0;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Bundle f37959zzc;

    public final LifecycleCallback zza(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f37957zza.get(str));
    }

    public final void zzb(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f37957zza;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(d.u(new StringBuilder(String.valueOf(str).length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f37958zzb > 0) {
            new zzg(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    public final boolean zzc() {
        return this.f37958zzb > 0;
    }

    public final boolean zzd() {
        return this.f37958zzb >= 2;
    }

    public final void zze(Bundle bundle) {
        this.f37958zzb = 1;
        this.f37959zzc = bundle;
        for (Map.Entry entry : this.f37957zza.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void zzf() {
        this.f37958zzb = 2;
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).onStart();
        }
    }

    public final void zzg() {
        this.f37958zzb = 3;
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).onResume();
        }
    }

    public final void zzh(int i, int i2, Intent intent) {
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void zzi(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f37957zza.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void zzj() {
        this.f37958zzb = 4;
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).onStop();
        }
    }

    public final void zzk() {
        this.f37958zzb = 5;
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).onDestroy();
        }
    }

    public final void zzl(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it8 = this.f37957zza.values().iterator();
        while (it8.hasNext()) {
            ((LifecycleCallback) it8.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int zzm() {
        return this.f37958zzb;
    }

    public final /* synthetic */ Bundle zzn() {
        return this.f37959zzc;
    }
}
