package com.google.android.gms.internal.measurement;

import j6.a;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(a.q("Command not found: ", str));
        }
        zzap zzapVarZzd = zzgVar.zzd(str);
        if (zzapVarZzd instanceof zzai) {
            return ((zzai) zzapVarZzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(p.a.p("Function ", str, " is not defined"));
    }
}
