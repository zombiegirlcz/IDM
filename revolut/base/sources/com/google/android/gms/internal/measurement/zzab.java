package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzab {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private zzaa f39813zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzaa f39814zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final List f39815zzc;

    public zzab() {
        this.f39813zza = new zzaa("", 0L, null);
        this.f39814zzb = new zzaa("", 0L, null);
        this.f39815zzc = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.f39813zza.clone());
        Iterator it8 = this.f39815zzc.iterator();
        while (it8.hasNext()) {
            zzabVar.f39815zzc.add(((zzaa) it8.next()).clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.f39813zza;
    }

    public final zzaa zzb() {
        return this.f39814zzb;
    }

    public final List zzc() {
        return this.f39815zzc;
    }

    public final void zzd(zzaa zzaaVar) {
        this.f39813zza = zzaaVar;
        this.f39814zzb = zzaaVar.clone();
        this.f39815zzc.clear();
    }

    public final void zze(String str, long j2, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, zzaa.zzd(str2, this.f39813zza.zzc(str2), map.get(str2)));
        }
        this.f39815zzc.add(new zzaa(str, j2, map2));
    }

    public final void zzf(zzaa zzaaVar) {
        this.f39814zzb = zzaaVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f39813zza = zzaaVar;
        this.f39814zzb = zzaaVar.clone();
        this.f39815zzc = new ArrayList();
    }
}
