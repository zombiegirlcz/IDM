package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
final class zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzae f47753zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private String f47754zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private boolean f47755zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.zzic f47756zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private BitSet f47757zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private BitSet f47758zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private Map f47759zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private Map f47760zzh;

    public /* synthetic */ zzy(zzae zzaeVar, String str, zzad zzadVar) {
        this.f47753zza = zzaeVar;
        this.f47754zzb = str;
        this.f47755zzc = true;
        this.f47757zze = new BitSet();
        this.f47758zzf = new BitSet();
        this.f47759zzg = new ArrayMap();
        this.f47760zzh = new ArrayMap();
    }

    @NonNull
    public final com.google.android.gms.internal.measurement.zzhi zza(int i) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzhh zzhhVarZzb = com.google.android.gms.internal.measurement.zzhi.zzb();
        zzhhVarZzb.zza(i);
        zzhhVarZzb.zzc(this.f47755zzc);
        com.google.android.gms.internal.measurement.zzic zzicVar = this.f47756zzd;
        if (zzicVar != null) {
            zzhhVarZzb.zzd(zzicVar);
        }
        com.google.android.gms.internal.measurement.zzib zzibVarZze = com.google.android.gms.internal.measurement.zzic.zze();
        zzibVarZze.zzb(zzqa.zzu(this.f47757zze));
        zzibVarZze.zzd(zzqa.zzu(this.f47758zzf));
        Map map = this.f47759zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f47759zzg.keySet()) {
                int iIntValue = num.intValue();
                Long l2 = (Long) this.f47759zzg.get(num);
                if (l2 != null) {
                    com.google.android.gms.internal.measurement.zzhj zzhjVarZzc = com.google.android.gms.internal.measurement.zzhk.zzc();
                    zzhjVarZzc.zzb(iIntValue);
                    zzhjVarZzc.zza(l2.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzhk) zzhjVarZzc.zzba());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzibVarZze.zza(arrayList);
        }
        Map map2 = this.f47760zzh;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f47760zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzid zzidVarZzd = com.google.android.gms.internal.measurement.zzie.zzd();
                zzidVarZzd.zzb(num2.intValue());
                List list2 = (List) this.f47760zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzidVarZzd.zza(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzie) zzidVarZzd.zzba());
            }
            list = arrayList3;
        }
        zzibVarZze.zzc(list);
        zzhhVarZzb.zzb(zzibVarZze);
        return (com.google.android.gms.internal.measurement.zzhi) zzhhVarZzb.zzba();
    }

    public final void zzc(@NonNull zzab zzabVar) {
        int iZza = zzabVar.zza();
        if (zzabVar.f46842zzd != null) {
            this.f47758zzf.set(iZza, true);
        }
        Boolean bool = zzabVar.f46843zze;
        if (bool != null) {
            this.f47757zze.set(iZza, bool.booleanValue());
        }
        if (zzabVar.f46844zzf != null) {
            Map map = this.f47759zzg;
            Integer numValueOf = Integer.valueOf(iZza);
            Long l2 = (Long) map.get(numValueOf);
            long jLongValue = zzabVar.f46844zzf.longValue() / 1000;
            if (l2 == null || jLongValue > l2.longValue()) {
                this.f47759zzg.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (zzabVar.f46845zzg != null) {
            Map map2 = this.f47760zzh;
            Integer numValueOf2 = Integer.valueOf(iZza);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f47760zzh.put(numValueOf2, arrayList);
            }
            if (zzabVar.zzc()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zzb();
            zzio zzioVar = this.f47753zza.zzu;
            zzam zzamVarZzf = zzioVar.zzf();
            String str = this.f47754zzb;
            zzgg zzggVar = zzgi.zzaE;
            if (zzamVarZzf.zzx(str, zzggVar) && zzabVar.zzb()) {
                arrayList.clear();
            }
            com.google.android.gms.internal.measurement.zzpq.zzb();
            if (!zzioVar.zzf().zzx(this.f47754zzb, zzggVar)) {
                arrayList.add(Long.valueOf(zzabVar.f46845zzg.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(zzabVar.f46845zzg.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public /* synthetic */ zzy(zzae zzaeVar, String str, com.google.android.gms.internal.measurement.zzic zzicVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzad zzadVar) {
        this.f47753zza = zzaeVar;
        this.f47754zzb = str;
        this.f47757zze = bitSet;
        this.f47758zzf = bitSet2;
        this.f47759zzg = map;
        this.f47760zzh = new ArrayMap();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f47760zzh.put(num, arrayList);
        }
        this.f47755zzc = false;
        this.f47756zzd = zzicVar;
    }
}
