package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzai implements zzap, zzal {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    protected final String f39826zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    protected final Map f39827zze = new HashMap();

    public zzai(String str) {
        this.f39826zzd = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj2;
        String str = this.f39826zzd;
        if (str != null) {
            return str.equals(zzaiVar.f39826zzd);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f39826zzd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract zzap zza(zzg zzgVar, List list);

    public final String zzc() {
        return this.f39826zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzcz(String str, zzg zzgVar, List list) {
        return "toString".equals(str) ? new zzat(this.f39826zzd) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public zzap zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        Map map = this.f39827zze;
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
        return this.f39826zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return zzaj.zzb(this.f39827zze);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f39827zze.remove(str);
        } else {
            this.f39827zze.put(str, zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return this.f39827zze.containsKey(str);
    }
}
