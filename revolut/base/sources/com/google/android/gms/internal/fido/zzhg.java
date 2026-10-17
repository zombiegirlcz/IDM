package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhg extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final zzcc f39527zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f39528zzb;

    public zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.f39527zza = zzccVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzcc zzccVar2 = this.f39527zza;
            if (i >= zzccVar2.size()) {
                break;
            }
            int iZzb = ((zzhp) zzccVar2.get(i)).zzb();
            if (i2 < iZzb) {
                i2 = iZzb;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.f39528zzb = i3;
        if (i3 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        zzhp zzhpVar = (zzhp) obj2;
        if (zzhp.zzd((byte) -128) != zzhpVar.zza()) {
            return zzhp.zzd((byte) -128) - zzhpVar.zza();
        }
        zzhg zzhgVar = (zzhg) zzhpVar;
        zzcc zzccVar = this.f39527zza;
        int size = zzccVar.size();
        zzcc zzccVar2 = zzhgVar.f39527zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i = 0;
        while (true) {
            zzcc zzccVar3 = this.f39527zza;
            if (i >= zzccVar3.size()) {
                return 0;
            }
            int iCompareTo = ((zzhp) zzccVar3.get(i)).compareTo((zzhp) zzhgVar.f39527zza.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i++;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && zzhg.class == obj2.getClass()) {
            return this.f39527zza.equals(((zzhg) obj2).f39527zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -128)), this.f39527zza});
    }

    public final String toString() {
        if (this.f39527zza.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        zzcc zzccVar = this.f39527zza;
        int size = zzccVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((zzhp) zzccVar.get(i)).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb6 = new StringBuilder("[\n  ");
        zzbdVarZza.zzc(sb6, arrayList.iterator());
        sb6.append("\n]");
        return sb6.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) -128);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zzb() {
        return this.f39528zzb;
    }
}
