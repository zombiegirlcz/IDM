package com.google.android.gms.internal.measurement;

import a0.d;
import com.google.common.annotations.VisibleForTesting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @VisibleForTesting
    public final zzg f40095zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @VisibleForTesting
    final zzax f40096zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @VisibleForTesting
    final Map f40097zzc = new HashMap();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @VisibleForTesting
    final Map f40098zzd = new HashMap();

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.f40095zza = zzgVar;
        this.f40096zzb = zzaxVar;
    }

    public final zzg zza() {
        return new zzg(this, this.f40096zzb);
    }

    public final zzap zzb(zzap zzapVar) {
        return this.f40096zzb.zza(this, zzapVar);
    }

    public final zzap zzc(zzae zzaeVar) {
        zzap zzapVarZza = zzap.f39833zzf;
        Iterator itZzk = zzaeVar.zzk();
        while (itZzk.hasNext()) {
            zzapVarZza = this.f40096zzb.zza(this, zzaeVar.zze(((Integer) itZzk.next()).intValue()));
            if (zzapVarZza instanceof zzag) {
                break;
            }
        }
        return zzapVarZza;
    }

    public final zzap zzd(String str) {
        Map map = this.f40097zzc;
        if (map.containsKey(str)) {
            return (zzap) map.get(str);
        }
        zzg zzgVar = this.f40095zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new IllegalArgumentException(d.r(str, " is not defined"));
    }

    public final void zze(String str, zzap zzapVar) {
        if (this.f40098zzd.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.f40097zzc.remove(str);
        } else {
            this.f40097zzc.put(str, zzapVar);
        }
    }

    public final void zzf(String str, zzap zzapVar) {
        zze(str, zzapVar);
        this.f40098zzd.put(str, Boolean.TRUE);
    }

    public final void zzg(String str, zzap zzapVar) {
        zzg zzgVar;
        Map map = this.f40097zzc;
        if (!map.containsKey(str) && (zzgVar = this.f40095zza) != null && zzgVar.zzh(str)) {
            zzgVar.zzg(str, zzapVar);
        } else {
            if (this.f40098zzd.containsKey(str)) {
                return;
            }
            if (zzapVar == null) {
                map.remove(str);
            } else {
                map.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(String str) {
        if (this.f40097zzc.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.f40095zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
