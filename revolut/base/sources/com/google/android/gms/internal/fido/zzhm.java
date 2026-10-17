package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhm extends zzhp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final int f39534zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzcj f39535zzb;

    public zzhm(zzcj zzcjVar) throws zzhf {
        zzcjVar.getClass();
        this.f39535zzb = zzcjVar;
        zzdc it8 = zzcjVar.entrySet().iterator();
        int i = 0;
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            int iZzb = ((zzhp) entry.getKey()).zzb();
            i = i < iZzb ? iZzb : i;
            int iZzb2 = ((zzhp) entry.getValue()).zzb();
            if (i < iZzb2) {
                i = iZzb2;
            }
        }
        int i2 = i + 1;
        this.f39534zza = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj2) {
        int iCompareTo;
        int size;
        int size2;
        zzhp zzhpVar = (zzhp) obj2;
        if (zzhp.zzd(ISOFileInfo.A0) != zzhpVar.zza()) {
            size2 = zzhpVar.zza();
            size = zzhp.zzd(ISOFileInfo.A0);
        } else {
            zzhm zzhmVar = (zzhm) zzhpVar;
            if (this.f39535zzb.size() == zzhmVar.f39535zzb.size()) {
                zzdc it8 = this.f39535zzb.entrySet().iterator();
                zzdc it9 = zzhmVar.f39535zzb.entrySet().iterator();
                do {
                    if (!it8.hasNext() && !it9.hasNext()) {
                        return 0;
                    }
                    Map.Entry entry = (Map.Entry) it8.next();
                    Map.Entry entry2 = (Map.Entry) it9.next();
                    int iCompareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
                    if (iCompareTo2 != 0) {
                        return iCompareTo2;
                    }
                    iCompareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
                } while (iCompareTo == 0);
                return iCompareTo;
            }
            size = this.f39535zzb.size();
            size2 = zzhmVar.f39535zzb.size();
        }
        return size - size2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && zzhm.class == obj2.getClass()) {
            return this.f39535zzb.equals(((zzhm) obj2).f39535zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd(ISOFileInfo.A0)), this.f39535zzb});
    }

    public final String toString() {
        if (this.f39535zzb.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc it8 = this.f39535zzb.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb6 = new StringBuilder("{\n  ");
        try {
            zzbc.zza(sb6, linkedHashMap.entrySet().iterator(), zzbdVarZza, " : ");
            sb6.append("\n}");
            return sb6.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd(ISOFileInfo.A0);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zzb() {
        return this.f39534zza;
    }

    public final zzcj zzc() {
        return this.f39535zzb;
    }
}
