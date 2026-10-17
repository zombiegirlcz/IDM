package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: loaded from: classes16.dex */
final class zzht extends zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Pair f47090zza = new Pair("", 0L);
    private long zzA;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public zzhq f47091zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public final zzhp f47092zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public final zzhp f47093zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public final zzhr f47094zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public final zzhp f47095zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    public final zzhn f47096zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public final zzhr f47097zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    public final zzho f47098zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    public final zzhn f47099zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    public final zzhp f47100zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    public final zzhp f47101zzl;
    public boolean zzm;
    public final zzhn zzn;
    public final zzhn zzo;
    public final zzhp zzp;
    public final zzhr zzq;
    public final zzhr zzr;
    public final zzhp zzs;
    public final zzho zzt;
    private SharedPreferences zzv;
    private final Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    public zzht(zzio zzioVar) {
        super(zzioVar);
        this.zzw = new Object();
        this.f47095zzf = new zzhp(this, "session_timeout", ComponentTracker.DEFAULT_TIMEOUT);
        this.f47096zzg = new zzhn(this, "start_new_session", true);
        this.f47100zzk = new zzhp(this, "last_pause_time", 0L);
        this.f47101zzl = new zzhp(this, "session_id", 0L);
        this.f47097zzh = new zzhr(this, "non_personalized_ads", null);
        this.f47098zzi = new zzho(this, "last_received_uri_timestamps_by_source", null);
        this.f47099zzj = new zzhn(this, "allow_remote_dynamite", false);
        this.f47092zzc = new zzhp(this, "first_open_time", 0L);
        this.f47093zzd = new zzhp(this, "app_install_time", 0L);
        this.f47094zze = new zzhr(this, "app_instance_id", null);
        this.zzn = new zzhn(this, "app_backgrounded", false);
        this.zzo = new zzhn(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzhp(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzhr(this, "firebase_feature_rollouts", null);
        this.zzr = new zzhr(this, "deferred_attribution_cache", null);
        this.zzs = new zzhp(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzho(this, "default_event_parameters", null);
    }

    public final SharedPreferences zza() {
        zzg();
        zzv();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                try {
                    if (this.zzx == null) {
                        zzio zzioVar = this.zzu;
                        String str = zzioVar.zzaT().getPackageName() + "_preferences";
                        zzioVar.zzaW().zzj().zzb("Default prefs file", str);
                        this.zzx = zzioVar.zzaT().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.zzx;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final void zzaZ() {
        zzio zzioVar = this.zzu;
        SharedPreferences sharedPreferences = zzioVar.zzaT().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.zzv.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        zzioVar.zzf();
        this.f47091zzb = new zzhq(this, "health_monitor", Math.max(0L, ((Long) zzgi.f46972zzc.zza(null)).longValue()), null);
    }

    @VisibleForTesting
    public final SharedPreferences zzb() {
        zzg();
        zzv();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final boolean zzc() {
        return true;
    }

    public final Pair zzd(String str) {
        zzg();
        if (!zzh().zzr(zzjw.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        zzio zzioVar = this.zzu;
        long jElapsedRealtime = zzioVar.zzaU().elapsedRealtime();
        String str2 = this.zzy;
        if (str2 != null && jElapsedRealtime < this.zzA) {
            return new Pair(str2, Boolean.valueOf(this.zzz));
        }
        this.zzA = zzioVar.zzf().zzk(str, zzgi.f46970zza) + jElapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzioVar.zzaT());
            this.zzy = "";
            String id10 = advertisingIdInfo.getId();
            if (id10 != null) {
                this.zzy = id10;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.zzu.zzaW().zzd().zzb("Unable to get advertising id", e);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzy, Boolean.valueOf(this.zzz));
    }

    public final SparseArray zze() {
        Bundle bundleZza = this.f47098zzi.zza();
        int[] intArray = bundleZza.getIntArray("uriSources");
        long[] longArray = bundleZza.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.zzu.zzaW().zze().zza("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final zzba zzf() {
        zzg();
        return zzba.zze(zzb().getString("dma_consent_settings", null));
    }

    public final zzjx zzh() {
        zzg();
        return zzjx.zzk(zzb().getString("consent_settings", "G1"), zzb().getInt("consent_source", 100));
    }

    public final Boolean zzi() {
        zzg();
        if (zzb().contains("measurement_enabled")) {
            return Boolean.valueOf(zzb().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String zzj() {
        zzg();
        return zzb().getString("gmp_app_id", null);
    }

    public final void zzl(String str) {
        zzg();
        SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    public final void zzm(Boolean bool) {
        zzg();
        SharedPreferences.Editor editorEdit = zzb().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void zzn(boolean z) {
        zzg();
        this.zzu.zzaW().zzj().zzb("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean zzo() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    public final boolean zzp(long j2) {
        return j2 - this.f47095zzf.zza() > this.f47100zzk.zza();
    }

    public final boolean zzq(int i) {
        return zzjx.zzs(i, zzb().getInt("consent_source", 100));
    }

    public final boolean zzr(zzoq zzoqVar) {
        zzg();
        String string = zzb().getString("stored_tcf_param", "");
        String strZze = zzoqVar.zze();
        if (strZze.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = zzb().edit();
        editorEdit.putString("stored_tcf_param", strZze);
        editorEdit.apply();
        return true;
    }
}
