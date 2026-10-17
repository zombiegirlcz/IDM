package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzax {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final Map f39848zza = new HashMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzbj f39849zzb = new zzbj();

    public zzax() {
        zzb(new zzav());
        zzb(new zzay());
        zzb(new zzaz());
        zzb(new zzbc());
        zzb(new zzbh());
        zzb(new zzbi());
        zzb(new zzbk());
    }

    public final zzap zza(zzg zzgVar, zzap zzapVar) {
        zzh.zzc(zzgVar);
        if (!(zzapVar instanceof zzaq)) {
            return zzapVar;
        }
        zzaq zzaqVar = (zzaq) zzapVar;
        ArrayList arrayListZzc = zzaqVar.zzc();
        String strZzb = zzaqVar.zzb();
        Map map = this.f39848zza;
        return (map.containsKey(strZzb) ? (zzaw) map.get(strZzb) : this.f39849zzb).zza(strZzb, zzgVar, arrayListZzc);
    }

    public final void zzb(zzaw zzawVar) {
        Iterator it8 = zzawVar.f39847zza.iterator();
        while (it8.hasNext()) {
            this.f39848zza.put(((zzbl) it8.next()).zzb().toString(), zzawVar);
        }
    }
}
