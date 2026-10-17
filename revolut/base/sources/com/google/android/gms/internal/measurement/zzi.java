package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class zzi {
    public static zzap zza(zziz zzizVar) {
        if (zzizVar == null) {
            return zzap.f39833zzf;
        }
        int iZzj = zzizVar.zzj() - 1;
        if (iZzj == 1) {
            return zzizVar.zzi() ? new zzat(zzizVar.zzd()) : zzap.zzm;
        }
        if (iZzj == 2) {
            return zzizVar.zzh() ? new zzah(Double.valueOf(zzizVar.zza())) : new zzah(null);
        }
        if (iZzj == 3) {
            return zzizVar.zzg() ? new zzaf(Boolean.valueOf(zzizVar.zzf())) : new zzaf(null);
        }
        if (iZzj != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listZze = zzizVar.zze();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listZze.iterator();
        while (it8.hasNext()) {
            arrayList.add(zza((zziz) it8.next()));
        }
        return new zzaq(zzizVar.zzc(), arrayList);
    }

    public static zzap zzb(Object obj2) {
        if (obj2 == null) {
            return zzap.f39834zzg;
        }
        if (obj2 instanceof String) {
            return new zzat((String) obj2);
        }
        if (obj2 instanceof Double) {
            return new zzah((Double) obj2);
        }
        if (obj2 instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj2).doubleValue()));
        }
        if (obj2 instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj2).doubleValue()));
        }
        if (obj2 instanceof Boolean) {
            return new zzaf((Boolean) obj2);
        }
        if (!(obj2 instanceof Map)) {
            if (!(obj2 instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            zzae zzaeVar = new zzae();
            Iterator it8 = ((List) obj2).iterator();
            while (it8.hasNext()) {
                zzaeVar.zzq(zzaeVar.zzc(), zzb(it8.next()));
            }
            return zzaeVar;
        }
        zzam zzamVar = new zzam();
        Map map = (Map) obj2;
        for (Object string : map.keySet()) {
            zzap zzapVarZzb = zzb(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                zzamVar.zzr((String) string, zzapVarZzb);
            }
        }
        return zzamVar;
    }
}
