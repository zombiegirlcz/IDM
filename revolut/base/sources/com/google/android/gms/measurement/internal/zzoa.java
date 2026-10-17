package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class zzoa extends zzpg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final zzhp f47582zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public final zzhp f47583zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final zzhp f47584zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final zzhp f47585zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public final zzhp f47586zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public final zzhp f47587zzf;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Map f47588zzh;

    public zzoa(zzpv zzpvVar) {
        super(zzpvVar);
        this.f47588zzh = new HashMap();
        zzht zzhtVarZzm = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm);
        this.f47582zza = new zzhp(zzhtVarZzm, "last_delete_stale", 0L);
        zzht zzhtVarZzm2 = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm2);
        this.f47583zzb = new zzhp(zzhtVarZzm2, "last_delete_stale_batch", 0L);
        zzht zzhtVarZzm3 = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm3);
        this.f47584zzc = new zzhp(zzhtVarZzm3, "backoff", 0L);
        zzht zzhtVarZzm4 = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm4);
        this.f47585zzd = new zzhp(zzhtVarZzm4, "last_upload", 0L);
        zzht zzhtVarZzm5 = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm5);
        this.f47586zze = new zzhp(zzhtVarZzm5, "last_upload_attempt", 0L);
        zzht zzhtVarZzm6 = this.zzu.zzm();
        Objects.requireNonNull(zzhtVarZzm6);
        this.f47587zzf = new zzhp(zzhtVarZzm6, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair zza(String str) {
        zznz zznzVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        zzg();
        zzio zzioVar = this.zzu;
        long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
        zznz zznzVar2 = (zznz) this.f47588zzh.get(str);
        if (zznzVar2 != null && jElapsedRealtime < zznzVar2.f47579zzc) {
            return new Pair(zznzVar2.f47577zza, Boolean.valueOf(zznzVar2.f47578zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzk = zzioVar.zzf().zzk(str, zzgi.f46970zza) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzioVar.zzaT());
            } catch (PackageManager.NameNotFoundException unused) {
                advertisingIdInfo = null;
                if (zznzVar2 != null && jElapsedRealtime < zznzVar2.f47579zzc + this.zzu.zzf().zzk(str, zzgi.f46971zzb)) {
                    return new Pair(zznzVar2.f47577zza, Boolean.valueOf(zznzVar2.f47578zzb));
                }
            }
        } catch (Exception e) {
            this.zzu.zzaW().zzd().zzb("Unable to get advertising id", e);
            zznzVar = new zznz("", false, jZzk);
        }
        if (advertisingIdInfo == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id10 = advertisingIdInfo.getId();
        zznzVar = id10 != null ? new zznz(id10, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzk) : new zznz("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzk);
        this.f47588zzh.put(str, zznzVar);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(zznzVar.f47577zza, Boolean.valueOf(zznzVar.f47578zzb));
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzjx zzjxVar) {
        return zzjxVar.zzr(zzjw.AD_STORAGE) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str, boolean z) {
        zzg();
        String str2 = z ? (String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestZzI = zzqf.zzI();
        if (messageDigestZzI == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZzI.digest(str2.getBytes())));
    }
}
