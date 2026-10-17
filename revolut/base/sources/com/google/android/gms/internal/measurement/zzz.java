package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes16.dex */
public final class zzz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final TreeMap f40706zza = new TreeMap();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @VisibleForTesting
    final TreeMap f40707zzb = new TreeMap();

    private static final int zzc(zzg zzgVar, zzao zzaoVar, zzap zzapVar) {
        zzap zzapVarZza = zzaoVar.zza(zzgVar, Collections.singletonList(zzapVar));
        if (zzapVarZza instanceof zzah) {
            return zzh.zzb(zzapVarZza.zzh().doubleValue());
        }
        return -1;
    }

    public final void zza(String str, int i, zzao zzaoVar, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f40707zzb;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f40706zza;
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzaoVar);
    }

    public final void zzb(zzg zzgVar, zzab zzabVar) {
        zzl zzlVar = new zzl(zzabVar);
        TreeMap treeMap = this.f40706zza;
        for (Integer num : treeMap.keySet()) {
            zzaa zzaaVarClone = zzabVar.zzb().clone();
            int iZzc = zzc(zzgVar, (zzao) treeMap.get(num), zzlVar);
            if (iZzc == 2 || iZzc == -1) {
                zzabVar.zzf(zzaaVarClone);
            }
        }
        TreeMap treeMap2 = this.f40707zzb;
        Iterator it8 = treeMap2.keySet().iterator();
        while (it8.hasNext()) {
            zzc(zzgVar, (zzao) treeMap2.get((Integer) it8.next()), zzlVar);
        }
    }
}
