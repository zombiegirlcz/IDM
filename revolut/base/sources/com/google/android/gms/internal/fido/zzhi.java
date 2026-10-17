package com.google.android.gms.internal.fido;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhi extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzgx f39530zza;

    public zzhi(zzgx zzgxVar) {
        this.f39530zza = zzgxVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        zzhp zzhpVar = (zzhp) obj2;
        if (zzhp.zzd(SignedBytes.MAX_POWER_OF_TWO) != zzhpVar.zza()) {
            return zzhp.zzd(SignedBytes.MAX_POWER_OF_TWO) - zzhpVar.zza();
        }
        zzhi zzhiVar = (zzhi) zzhpVar;
        zzgx zzgxVar = this.f39530zza;
        int iZzd = zzgxVar.zzd();
        zzgx zzgxVar2 = zzhiVar.f39530zza;
        if (iZzd != zzgxVar2.zzd()) {
            return zzgxVar.zzd() - zzgxVar2.zzd();
        }
        return zzgm.zza().compare(zzgxVar.zzm(), zzhiVar.f39530zza.zzm());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && zzhi.class == obj2.getClass()) {
            return this.f39530zza.equals(((zzhi) obj2).f39530zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(SignedBytes.MAX_POWER_OF_TWO)), this.f39530zza});
    }

    public final String toString() {
        zzgf zzgfVarZzd = zzgf.zzf().zzd();
        byte[] bArrZzm = this.f39530zza.zzm();
        return a.p("h'", zzgfVarZzd.zzg(bArrZzm, 0, bArrZzm.length), "'");
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd(SignedBytes.MAX_POWER_OF_TWO);
    }

    public final zzgx zzc() {
        return this.f39530zza;
    }
}
