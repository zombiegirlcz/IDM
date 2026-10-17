package com.google.android.gms.nearby.uwb;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.nearby.zztl;
import com.google.android.gms.internal.nearby.zzua;
import j6.a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class RangingCapabilities {
    public static final boolean DEFAULT_SUPPORTS_RANGING_INTERVAL_RECONFIGURE = false;
    public static final float FIRA_DEFAULT_MIN_SLOT_DURATION_MS = 2.0f;
    public static final int FIRA_DEFAULT_RANGING_INTERVAL_MS = 200;
    public static final int FIRA_DEFAULT_SUPPORTED_CHANNEL = 9;
    public static final int RANGE_DATA_NTF_ENABLE = 1;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final boolean f48205zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f48206zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final boolean f48207zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final boolean f48208zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final int f48209zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final zzua f48210zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final zzua f48211zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final zzua f48212zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final zzua f48213zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final zzua f48214zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private final boolean f48215zzk;
    public static final zzua<Integer> FIRA_DEFAULT_SUPPORTED_CONFIG_IDS = zzua.zzp(1, 2, 3, 1000, 1001);
    public static final zzua<Integer> DEFAULT_SUPPORTED_SLOT_DURATIONS = zzua.zzl(2);
    public static final zzua<Integer> DEFAULT_SUPPORTED_RANGING_UPDATE_RATES = zzua.zzm(1, 2);

    public RangingCapabilities(boolean z, boolean z3, boolean z4, boolean z6, int i, zzua zzuaVar, zzua zzuaVar2, zzua zzuaVar3, zzua zzuaVar4, zzua zzuaVar5, boolean z11) {
        this.f48205zza = z;
        this.f48206zzb = z3;
        this.f48207zzc = z4;
        this.f48208zzd = z6;
        this.f48209zze = i;
        this.f48210zzf = zzuaVar;
        this.f48211zzg = zzuaVar2;
        this.f48212zzh = zzuaVar3;
        this.f48213zzi = zzuaVar4;
        this.f48214zzj = zzuaVar5;
        this.f48215zzk = z11;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RangingCapabilities)) {
            return false;
        }
        RangingCapabilities rangingCapabilities = (RangingCapabilities) obj2;
        return this.f48205zza == rangingCapabilities.f48205zza && this.f48206zzb == rangingCapabilities.f48206zzb && this.f48207zzc == rangingCapabilities.f48207zzc && this.f48208zzd == rangingCapabilities.f48208zzd && getMinRangingInterval() == rangingCapabilities.getMinRangingInterval() && zztl.zza(getSupportedChannels(), rangingCapabilities.getSupportedChannels()) && zztl.zza(getSupportedNtfConfigs(), rangingCapabilities.getSupportedNtfConfigs()) && zztl.zza(getSupportedConfigIds(), rangingCapabilities.getSupportedConfigIds()) && zztl.zza(getSupportedSlotDurations(), rangingCapabilities.getSupportedSlotDurations()) && zztl.zza(getSupportedRangingUpdateRates(), rangingCapabilities.getSupportedRangingUpdateRates()) && this.f48215zzk == rangingCapabilities.f48215zzk;
    }

    public int getMinRangingInterval() {
        return this.f48209zze;
    }

    @NonNull
    public List<Integer> getSupportedChannels() {
        return this.f48210zzf;
    }

    @NonNull
    public List<Integer> getSupportedConfigIds() {
        return this.f48212zzh;
    }

    @NonNull
    public List<Integer> getSupportedNtfConfigs() {
        return this.f48211zzg;
    }

    public zzua<Integer> getSupportedRangingUpdateRates() {
        return this.f48214zzj;
    }

    public zzua<Integer> getSupportedSlotDurations() {
        return this.f48213zzi;
    }

    public boolean hasBackgroundRangingSupport() {
        return this.f48215zzk;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f48205zza), Boolean.valueOf(this.f48206zzb), Boolean.valueOf(this.f48207zzc), Boolean.valueOf(this.f48208zzd), Integer.valueOf(getMinRangingInterval()), getSupportedChannels(), getSupportedNtfConfigs(), getSupportedConfigIds(), getSupportedSlotDurations(), getSupportedRangingUpdateRates(), Boolean.valueOf(this.f48215zzk)});
    }

    public boolean supportsAzimuthalAngle() {
        return this.f48206zzb;
    }

    public boolean supportsDistance() {
        return this.f48205zza;
    }

    public boolean supportsElevationAngle() {
        return this.f48207zzc;
    }

    public boolean supportsRangingIntervalReconfigure() {
        return this.f48208zzd;
    }

    @NonNull
    public String toString() {
        zzua zzuaVar = this.f48214zzj;
        zzua zzuaVar2 = this.f48213zzi;
        zzua zzuaVar3 = this.f48212zzh;
        zzua zzuaVar4 = this.f48211zzg;
        String strValueOf = String.valueOf(this.f48210zzf);
        String strValueOf2 = String.valueOf(zzuaVar4);
        String strValueOf3 = String.valueOf(zzuaVar3);
        String strValueOf4 = String.valueOf(zzuaVar2);
        String strValueOf5 = String.valueOf(zzuaVar);
        StringBuilder sb6 = new StringBuilder("RangingCapabilities{supportsDistance=");
        sb6.append(this.f48205zza);
        sb6.append(", supportsAzimuthalAngle=");
        sb6.append(this.f48206zzb);
        sb6.append(", supportsElevationAngle=");
        sb6.append(this.f48207zzc);
        sb6.append(", supportsRangingIntervalReconfigure=");
        sb6.append(this.f48208zzd);
        sb6.append(", minRangingInterval=");
        sb6.append(this.f48209zze);
        sb6.append(", supportedChannels=");
        sb6.append(strValueOf);
        sb6.append(", supportedNtfConfigs=");
        a.D(sb6, strValueOf2, ", supportedConfigIds=", strValueOf3, ", supportedSlotDurations=");
        return a.w(sb6, strValueOf4, ", supportedRangingUpdateRates=", strValueOf5, "}");
    }
}
