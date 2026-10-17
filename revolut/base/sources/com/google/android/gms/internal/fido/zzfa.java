package com.google.android.gms.internal.fido;

import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zzfa implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        zzfh zzfhVarZza = zzfh.zza(obj2);
        zzfh zzfhVarZza2 = zzfh.zza(obj3);
        if (zzfhVarZza != zzfhVarZza2) {
            return zzfhVarZza.compareTo(zzfhVarZza2);
        }
        int iOrdinal = zzfhVarZza.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj2).compareTo((Boolean) obj3);
        }
        if (iOrdinal == 1) {
            return ((String) obj2).compareTo((String) obj3);
        }
        if (iOrdinal == 2) {
            return ((Long) obj2).compareTo((Long) obj3);
        }
        if (iOrdinal == 3) {
            return ((Double) obj2).compareTo((Double) obj3);
        }
        throw null;
    }
}
