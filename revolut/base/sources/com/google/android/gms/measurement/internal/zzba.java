package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzba {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzba f46923zza = new zzba((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f46924zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f46925zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Boolean f46926zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final String f46927zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final EnumMap f46928zzf;

    public zzba(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        this.f46928zzf = enumMap;
        enumMap.put(zzjw.AD_USER_DATA, zzjx.zzh(bool));
        this.f46924zzb = i;
        this.f46925zzc = zzl();
        this.f46926zzd = bool2;
        this.f46927zze = str;
    }

    public static zzba zzc(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzba((Boolean) null, i, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(zzjw.class);
        for (zzjw zzjwVar : zzjv.DMA.zzb()) {
            enumMap.put(zzjwVar, zzjx.zzd(bundle.getString(zzjwVar.f47267zze)));
        }
        return new zzba(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static zzba zzd(zzju zzjuVar, int i) {
        EnumMap enumMap = new EnumMap(zzjw.class);
        enumMap.put(zzjw.AD_USER_DATA, zzjuVar);
        return new zzba(enumMap, -10, (Boolean) null, (String) null);
    }

    public static zzba zze(String str) {
        if (str == null || str.length() <= 0) {
            return f46923zza;
        }
        String[] strArrSplit = str.split(":");
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(zzjw.class);
        zzjw[] zzjwVarArrZzb = zzjv.DMA.zzb();
        int length = zzjwVarArrZzb.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(zzjwVarArrZzb[i3], zzjx.zzg(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new zzba(enumMap, i, (Boolean) null, (String) null);
    }

    public static Boolean zzg(Bundle bundle) {
        zzju zzjuVarZzd;
        if (bundle == null || (zzjuVarZzd = zzjx.zzd(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = zzjuVarZzd.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    private final String zzl() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f46924zzb);
        for (zzjw zzjwVar : zzjv.DMA.zzb()) {
            sb6.append(":");
            sb6.append(zzjx.zza((zzju) this.f46928zzf.get(zzjwVar)));
        }
        return sb6.toString();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzba)) {
            return false;
        }
        zzba zzbaVar = (zzba) obj2;
        if (this.f46925zzc.equalsIgnoreCase(zzbaVar.f46925zzc) && Objects.equals(this.f46926zzd, zzbaVar.f46926zzd)) {
            return Objects.equals(this.f46927zze, zzbaVar.f46927zze);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = this.f46926zzd;
        int i = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f46927zze;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.f46925zzc.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("source=");
        sb6.append(zzjx.zzn(this.f46924zzb));
        for (zzjw zzjwVar : zzjv.DMA.zzb()) {
            sb6.append(",");
            sb6.append(zzjwVar.f47267zze);
            sb6.append("=");
            zzju zzjuVar = (zzju) this.f46928zzf.get(zzjwVar);
            if (zzjuVar == null) {
                sb6.append("uninitialized");
            } else {
                int iOrdinal = zzjuVar.ordinal();
                if (iOrdinal == 0) {
                    sb6.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb6.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb6.append("denied");
                } else if (iOrdinal == 3) {
                    sb6.append("granted");
                }
            }
        }
        Boolean bool = this.f46926zzd;
        if (bool != null) {
            sb6.append(",isDmaRegion=");
            sb6.append(bool);
        }
        String str = this.f46927zze;
        if (str != null) {
            sb6.append(",cpsDisplayStr=");
            sb6.append(str);
        }
        return sb6.toString();
    }

    public final int zza() {
        return this.f46924zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f46928zzf.entrySet()) {
            String strZzo = zzjx.zzo((zzju) entry.getValue());
            if (strZzo != null) {
                bundle.putString(((zzjw) entry.getKey()).f47267zze, strZzo);
            }
        }
        Boolean bool = this.f46926zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f46927zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final zzju zzf() {
        zzju zzjuVar = (zzju) this.f46928zzf.get(zzjw.AD_USER_DATA);
        return zzjuVar == null ? zzju.UNINITIALIZED : zzjuVar;
    }

    public final Boolean zzh() {
        return this.f46926zzd;
    }

    public final String zzi() {
        return this.f46927zze;
    }

    public final String zzj() {
        return this.f46925zzc;
    }

    public final boolean zzk() {
        Iterator it8 = this.f46928zzf.values().iterator();
        while (it8.hasNext()) {
            if (((zzju) it8.next()) != zzju.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    private zzba(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(zzjw.class);
        this.f46928zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.f46924zzb = i;
        this.f46925zzc = zzl();
        this.f46926zzd = bool;
        this.f46927zze = str;
    }
}
