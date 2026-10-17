package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class zzam implements zzap, zzal {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    final Map f39829zza = new HashMap();

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzam) {
            return this.f39829zza.equals(((zzam) obj2).f39829zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39829zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("{");
        Map map = this.f39829zza;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb6.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb6.deleteCharAt(sb6.lastIndexOf(","));
        }
        sb6.append("}");
        return sb6.toString();
    }

    public final List zzb() {
        return new ArrayList(this.f39829zza.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzcz(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(toString()) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzam zzamVar = new zzam();
        for (Map.Entry entry : this.f39829zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzamVar.f39829zza.put((String) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzamVar.f39829zza.put((String) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzamVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        Map map = this.f39829zza;
        return map.containsKey(str) ? (zzap) map.get(str) : zzap.f39833zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.f39829zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f39829zza.remove(str);
        } else {
            this.f39829zza.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f39829zza.containsKey(str);
    }
}
