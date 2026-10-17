package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class zzed {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdz f39391zza = new zzeb();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzdy f39392zzb = new zzec();

    public static zzdv zza(Set set) {
        zzdv zzdvVar = new zzdv(f39391zza, null);
        zzdvVar.zza(f39392zzb);
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            zzdvVar.zzg((zzdk) it8.next());
        }
        return zzdvVar;
    }
}
