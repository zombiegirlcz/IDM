package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
final class zzce implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    boolean f39890zza = false;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final Set f39891zzb = new HashSet();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final Map f39892zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzcg f39893zzd;

    public /* synthetic */ zzce(zzcg zzcgVar, zzcf zzcfVar) {
        this.f39893zzd = zzcgVar;
    }

    private final void zza(String str, Object obj2) {
        if (obj2 != null) {
            this.f39892zzc.put(str, obj2);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f39890zza = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f39890zza) {
            this.f39893zzd.f39894zza.clear();
        }
        zzcg zzcgVar = this.f39893zzd;
        Set setKeySet = zzcgVar.f39894zza.keySet();
        Set set = this.f39891zzb;
        setKeySet.removeAll(set);
        Map map = this.f39892zzc;
        for (Map.Entry entry : map.entrySet()) {
            zzcgVar.f39894zza.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcgVar.f39895zzb) {
            UnmodifiableIterator it8 = Sets.union(set, map.keySet()).iterator();
            while (it8.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcgVar, (String) it8.next());
            }
        }
        return (!this.f39890zza && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        zza(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        zza(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        zza(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j2) {
        zza(str, Long.valueOf(j2));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        zza(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        zza(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f39891zzb.add(str);
        return this;
    }
}
