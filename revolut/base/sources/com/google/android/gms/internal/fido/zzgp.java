package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zzgp implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj2, Object obj3) {
        zzgx zzgxVar = (zzgx) obj2;
        zzgx zzgxVar2 = (zzgx) obj3;
        zzgo zzgoVar = new zzgo(zzgxVar);
        zzgo zzgoVar2 = new zzgo(zzgxVar2);
        while (zzgoVar.hasNext() && zzgoVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzgoVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzgoVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzgxVar.zzd()).compareTo(Integer.valueOf(zzgxVar2.zzd()));
    }
}
