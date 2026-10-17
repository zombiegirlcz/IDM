package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
public final class zzw extends zzai {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final Map f40704zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzj f40705zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.f40704zza = new HashMap();
        this.f40705zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzap zzapVar;
        zzh.zzh("require", 1, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        Map map = this.f40704zza;
        if (map.containsKey(strZzi)) {
            return (zzap) map.get(strZzi);
        }
        Map map2 = this.f40705zzb.f40300zza;
        if (map2.containsKey(strZzi)) {
            try {
                zzapVar = (zzap) ((Callable) map2.get(strZzi)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzi)));
            }
        } else {
            zzapVar = zzap.f39833zzf;
        }
        if (zzapVar instanceof zzai) {
            this.f40704zza.put(strZzi, (zzai) zzapVar);
        }
        return zzapVar;
    }
}
