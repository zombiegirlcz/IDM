package com.google.android.gms.internal.auth;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;

/* JADX INFO: loaded from: classes16.dex */
final class zzdx implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj2, Object obj3) {
        zzef zzefVar = (zzef) obj2;
        zzef zzefVar2 = (zzef) obj3;
        zzdw zzdwVar = new zzdw(zzefVar);
        zzdw zzdwVar2 = new zzdw(zzefVar2);
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzdwVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzdwVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzefVar.zzd()).compareTo(Integer.valueOf(zzefVar2.zzd()));
    }
}
