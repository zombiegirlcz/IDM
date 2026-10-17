package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AdvertisingOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class AdvertisingOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdvertisingOptions> CREATOR = new zzb();

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getPowerLevel", id = 27)
    private int zzA;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getDeviceInfo", id = 28)
    private byte[] zzB;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowGattConnections", id = 29)
    private boolean zzC;

    @SafeParcelable.Field(defaultValue = "0", getter = "getConnectionType", id = 30)
    private int zzD;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 31)
    private boolean zzE;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 32)
    private boolean zzF;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 33)
    private boolean zzG;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrategy", id = 1)
    private Strategy f47771zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAutoUpgradeBandwidth", id = 2)
    private boolean f47772zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", id = 3)
    private boolean f47773zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 4)
    private boolean f47774zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 5)
    private boolean f47775zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNearbyNotificationsBeaconData", id = 6)
    private byte[] f47776zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 7)
    private boolean f47777zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", id = 8)
    private ParcelUuid f47778zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 9)
    private boolean f47779zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 10)
    private boolean f47780zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 11)
    private boolean f47781zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableBluetoothListening", id = 12)
    private boolean f47782zzl;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcListening", id = 13)
    private boolean zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", id = 14)
    private boolean zzn;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbChannel", id = 15)
    private int zzo;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbPreambleIndex", id = 16)
    private int zzp;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteUwbAddress", id = 17)
    private byte[] zzq;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", id = 18)
    private long zzr;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbSenderInfo", id = 19)
    private zzab[] zzs;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableOutOfBandConnection", id = 20)
    private boolean zzt;

    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", id = 21)
    @Deprecated
    private boolean zzu;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtcUpgrade", id = 22)
    private boolean zzv;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getUseStableIdentifiers", id = 23)
    private boolean zzw;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getAdvertisingMediums", id = 24)
    private int[] zzx;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUpgradeMediums", id = 25)
    private int[] zzy;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableUpgradeMediumsRankingOptimization", id = 26)
    private boolean zzz;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final AdvertisingOptions f47783zza;

        public Builder() {
            this.f47783zza = new AdvertisingOptions((zza) null);
        }

        @NonNull
        public AdvertisingOptions build() {
            int[] iArr = this.f47783zza.zzx;
            if (iArr != null && iArr.length > 0) {
                this.f47783zza.f47775zze = false;
                this.f47783zza.f47774zzd = false;
                this.f47783zza.f47780zzj = false;
                this.f47783zza.f47781zzk = false;
                this.f47783zza.f47779zzi = false;
                this.f47783zza.zzm = false;
                for (int i : iArr) {
                    if (i == 2) {
                        this.f47783zza.f47774zzd = true;
                    } else if (i == 9) {
                        this.f47783zza.zzm = true;
                    } else if (i != 11) {
                        if (i == 4) {
                            this.f47783zza.f47775zze = true;
                        } else if (i == 5) {
                            this.f47783zza.f47779zzi = true;
                        } else if (i == 6) {
                            this.f47783zza.f47781zzk = true;
                        } else if (i != 7) {
                            a.z(i, "Illegal advertising medium ", "NearbyConnections");
                        } else {
                            this.f47783zza.f47780zzj = true;
                        }
                    }
                }
            }
            if (this.f47783zza.zzy != null && this.f47783zza.zzy.length > 0) {
                this.f47783zza.zzv = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f47783zza.zzy.length) {
                        break;
                    }
                    if (this.f47783zza.zzy[i2] == 9) {
                        this.f47783zza.zzv = true;
                        break;
                    }
                    i2++;
                }
            }
            if (this.f47783zza.zzA == 0) {
                AdvertisingOptions advertisingOptions = this.f47783zza;
                advertisingOptions.zzA = true == advertisingOptions.f47777zzg ? 1 : 3;
            } else {
                AdvertisingOptions advertisingOptions2 = this.f47783zza;
                advertisingOptions2.f47777zzg = advertisingOptions2.zzA != 3;
            }
            if (this.f47783zza.zzD != 0) {
                AdvertisingOptions advertisingOptions3 = this.f47783zza;
                advertisingOptions3.zzu = advertisingOptions3.zzD == 1;
            } else if (!this.f47783zza.zzu) {
                this.f47783zza.zzD = 2;
            }
            return this.f47783zza;
        }

        @NonNull
        public Builder setConnectionType(int i) {
            this.f47783zza.zzD = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDisruptiveUpgrade(boolean z) {
            this.f47783zza.zzu = z;
            return this;
        }

        @NonNull
        public Builder setLowPower(boolean z) {
            this.f47783zza.f47777zzg = z;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.f47783zza.f47771zza = strategy;
            return this;
        }

        public Builder(@NonNull AdvertisingOptions advertisingOptions) {
            AdvertisingOptions advertisingOptions2 = new AdvertisingOptions((zza) null);
            this.f47783zza = advertisingOptions2;
            advertisingOptions2.f47771zza = advertisingOptions.f47771zza;
            advertisingOptions2.f47772zzb = advertisingOptions.f47772zzb;
            advertisingOptions2.f47773zzc = advertisingOptions.f47773zzc;
            advertisingOptions2.f47774zzd = advertisingOptions.f47774zzd;
            advertisingOptions2.f47775zze = advertisingOptions.f47775zze;
            advertisingOptions2.f47776zzf = advertisingOptions.f47776zzf;
            advertisingOptions2.f47777zzg = advertisingOptions.f47777zzg;
            advertisingOptions2.f47778zzh = advertisingOptions.f47778zzh;
            advertisingOptions2.f47779zzi = advertisingOptions.f47779zzi;
            advertisingOptions2.f47780zzj = advertisingOptions.f47780zzj;
            advertisingOptions2.f47781zzk = advertisingOptions.f47781zzk;
            advertisingOptions2.f47782zzl = advertisingOptions.f47782zzl;
            advertisingOptions2.zzm = advertisingOptions.zzm;
            advertisingOptions2.zzn = advertisingOptions.zzn;
            advertisingOptions2.zzo = advertisingOptions.zzo;
            advertisingOptions2.zzp = advertisingOptions.zzp;
            advertisingOptions2.zzq = advertisingOptions.zzq;
            advertisingOptions2.zzr = advertisingOptions.zzr;
            advertisingOptions2.zzs = advertisingOptions.zzs;
            advertisingOptions2.zzt = advertisingOptions.zzt;
            advertisingOptions2.zzu = advertisingOptions.zzu;
            advertisingOptions2.zzv = advertisingOptions.zzv;
            advertisingOptions2.zzw = advertisingOptions.zzw;
            advertisingOptions2.zzx = advertisingOptions.zzx;
            advertisingOptions2.zzy = advertisingOptions.zzy;
            advertisingOptions2.zzz = advertisingOptions.zzz;
            advertisingOptions2.zzA = advertisingOptions.zzA;
            advertisingOptions2.zzB = advertisingOptions.zzB;
            advertisingOptions2.zzC = advertisingOptions.zzC;
            advertisingOptions2.zzD = advertisingOptions.zzD;
            AdvertisingOptions.zzaa(advertisingOptions);
            advertisingOptions2.zzE = false;
            advertisingOptions2.zzF = advertisingOptions.zzF;
            advertisingOptions2.zzG = advertisingOptions.zzG;
        }
    }

    private AdvertisingOptions() {
        this.f47772zzb = true;
        this.f47773zzc = true;
        this.f47774zzd = true;
        this.f47775zze = true;
        this.f47777zzg = false;
        this.f47779zzi = true;
        this.f47780zzj = true;
        this.f47781zzk = true;
        this.f47782zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
    }

    @NonNull
    public static String convertConnectionTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? j6.a.l(i, "UNKNOWN_CONNECTION_TYPE(", ")") : "NON_DISRUPTIVE" : "DISRUPTIVE" : "BALANCED";
    }

    public static /* bridge */ /* synthetic */ boolean zzaa(AdvertisingOptions advertisingOptions) {
        boolean z = advertisingOptions.zzE;
        return false;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof AdvertisingOptions) {
            AdvertisingOptions advertisingOptions = (AdvertisingOptions) obj2;
            if (Objects.equal(this.f47771zza, advertisingOptions.f47771zza) && Objects.equal(Boolean.valueOf(this.f47772zzb), Boolean.valueOf(advertisingOptions.f47772zzb)) && Objects.equal(Boolean.valueOf(this.f47773zzc), Boolean.valueOf(advertisingOptions.f47773zzc)) && Objects.equal(Boolean.valueOf(this.f47774zzd), Boolean.valueOf(advertisingOptions.f47774zzd)) && Objects.equal(Boolean.valueOf(this.f47775zze), Boolean.valueOf(advertisingOptions.f47775zze)) && Arrays.equals(this.f47776zzf, advertisingOptions.f47776zzf) && Objects.equal(Boolean.valueOf(this.f47777zzg), Boolean.valueOf(advertisingOptions.f47777zzg)) && Objects.equal(this.f47778zzh, advertisingOptions.f47778zzh) && Objects.equal(Boolean.valueOf(this.f47779zzi), Boolean.valueOf(advertisingOptions.f47779zzi)) && Objects.equal(Boolean.valueOf(this.f47780zzj), Boolean.valueOf(advertisingOptions.f47780zzj)) && Objects.equal(Boolean.valueOf(this.f47781zzk), Boolean.valueOf(advertisingOptions.f47781zzk)) && Objects.equal(Boolean.valueOf(this.f47782zzl), Boolean.valueOf(advertisingOptions.f47782zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(advertisingOptions.zzm)) && Objects.equal(Boolean.valueOf(this.zzn), Boolean.valueOf(advertisingOptions.zzn)) && Objects.equal(Integer.valueOf(this.zzo), Integer.valueOf(advertisingOptions.zzo)) && Objects.equal(Integer.valueOf(this.zzp), Integer.valueOf(advertisingOptions.zzp)) && Arrays.equals(this.zzq, advertisingOptions.zzq) && Objects.equal(Long.valueOf(this.zzr), Long.valueOf(advertisingOptions.zzr)) && Arrays.equals(this.zzs, advertisingOptions.zzs) && Objects.equal(Boolean.valueOf(this.zzt), Boolean.valueOf(advertisingOptions.zzt)) && Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(advertisingOptions.zzu)) && Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(advertisingOptions.zzv)) && Objects.equal(Boolean.valueOf(this.zzw), Boolean.valueOf(advertisingOptions.zzw)) && Arrays.equals(this.zzx, advertisingOptions.zzx) && Arrays.equals(this.zzy, advertisingOptions.zzy) && Objects.equal(Boolean.valueOf(this.zzz), Boolean.valueOf(advertisingOptions.zzz)) && Objects.equal(Integer.valueOf(this.zzA), Integer.valueOf(advertisingOptions.zzA)) && Objects.equal(this.zzB, advertisingOptions.zzB) && Objects.equal(Boolean.valueOf(this.zzC), Boolean.valueOf(advertisingOptions.zzC)) && Objects.equal(Integer.valueOf(this.zzD), Integer.valueOf(advertisingOptions.zzD))) {
                Boolean bool = Boolean.FALSE;
                if (Objects.equal(bool, bool) && Objects.equal(Boolean.valueOf(this.zzF), Boolean.valueOf(advertisingOptions.zzF)) && Objects.equal(Boolean.valueOf(this.zzG), Boolean.valueOf(advertisingOptions.zzG))) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getConnectionType() {
        return this.zzD;
    }

    @Deprecated
    public boolean getDisruptiveUpgrade() {
        return this.zzu;
    }

    public boolean getLowPower() {
        return this.f47777zzg;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.f47771zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47771zza, Boolean.valueOf(this.f47772zzb), Boolean.valueOf(this.f47773zzc), Boolean.valueOf(this.f47774zzd), Boolean.valueOf(this.f47775zze), Integer.valueOf(Arrays.hashCode(this.f47776zzf)), Boolean.valueOf(this.f47777zzg), this.f47778zzh, Boolean.valueOf(this.f47779zzi), Boolean.valueOf(this.f47780zzj), Boolean.valueOf(this.f47781zzk), Boolean.valueOf(this.f47782zzl), Boolean.valueOf(this.zzm), Boolean.valueOf(this.zzn), Integer.valueOf(this.zzo), Integer.valueOf(this.zzp), Integer.valueOf(Arrays.hashCode(this.zzq)), Long.valueOf(this.zzr), Integer.valueOf(Arrays.hashCode(this.zzs)), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw), Integer.valueOf(Arrays.hashCode(this.zzx)), Integer.valueOf(Arrays.hashCode(this.zzy)), Boolean.valueOf(this.zzz), Integer.valueOf(this.zzA), this.zzB, Boolean.valueOf(this.zzC), Integer.valueOf(this.zzD), Boolean.FALSE, Boolean.valueOf(this.zzF), Boolean.valueOf(this.zzG));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.f47771zza;
        boolean z = this.f47772zzb;
        boolean z3 = this.f47773zzc;
        boolean z4 = this.f47774zzd;
        boolean z6 = this.f47775zze;
        byte[] bArr = this.f47776zzf;
        String strZzb = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr);
        boolean z11 = this.f47777zzg;
        ParcelUuid parcelUuid = this.f47778zzh;
        boolean z12 = this.f47779zzi;
        boolean z29 = this.f47780zzj;
        boolean z31 = this.f47781zzk;
        boolean z41 = this.f47782zzl;
        boolean z49 = this.zzm;
        boolean z54 = this.zzn;
        int i = this.zzo;
        int i2 = this.zzp;
        byte[] bArr2 = this.zzq;
        String strZzb2 = bArr2 == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr2);
        long j2 = this.zzr;
        String string = Arrays.toString(this.zzs);
        boolean z74 = this.zzt;
        boolean z83 = this.zzu;
        boolean z89 = this.zzw;
        byte[] bArr3 = this.zzB;
        String strZzb3 = bArr3 == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr3);
        boolean z96 = this.zzC;
        int i3 = this.zzD;
        StringBuilder sb6 = new StringBuilder("AdvertisingOptions{strategy: ");
        sb6.append(strategy);
        sb6.append(", autoUpgradeBandwidth: ");
        sb6.append(z);
        sb6.append(", enforceTopologyConstraints: ");
        t61.a.y(sb6, z3, ", enableBluetooth: ", z4, ", enableBle: ");
        sb6.append(z6);
        sb6.append(", nearbyNotificationsBeaconData: ");
        sb6.append(strZzb);
        sb6.append(", lowPower: ");
        sb6.append(z11);
        sb6.append(", fastAdvertisementServiceUuid: ");
        sb6.append(parcelUuid);
        sb6.append(", enableWifiLan: ");
        t61.a.y(sb6, z12, ", enableNfc: ", z29, ", enableWifiAware: ");
        t61.a.y(sb6, z31, ", enableBluetoothListening: ", z41, ", enableWebRtcListening: ");
        t61.a.y(sb6, z49, ", enableUwbRanging: ", z54, ", uwbChannel: ");
        t61.a.x(sb6, i, ", uwbPreambleIndex: ", i2, ", remoteUwbAddress: ");
        sb6.append(strZzb2);
        sb6.append(", flowId: ");
        sb6.append(j2);
        sb6.append(", uwbSenderInfo: ");
        sb6.append(string);
        sb6.append(", enableOutOfBandConnection: ");
        sb6.append(z74);
        sb6.append(", disruptiveUpgrade: ");
        sb6.append(z83);
        sb6.append(",useStableIdentifiers: ");
        sb6.append(z89);
        sb6.append(",deviceInfo: ");
        sb6.append(strZzb3);
        sb6.append(",allowGattConnections: ");
        sb6.append(z96);
        sb6.append(",connectionType: ");
        sb6.append(i3);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f47772zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f47773zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47774zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f47775zze);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f47776zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 8, this.f47778zzh, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f47779zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f47780zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f47781zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f47782zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        SafeParcelWriter.writeInt(parcel, 15, this.zzo);
        SafeParcelWriter.writeInt(parcel, 16, this.zzp);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeLong(parcel, 18, this.zzr);
        SafeParcelWriter.writeTypedArray(parcel, 19, this.zzs, i, false);
        SafeParcelWriter.writeBoolean(parcel, 20, this.zzt);
        SafeParcelWriter.writeBoolean(parcel, 21, getDisruptiveUpgrade());
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzw);
        SafeParcelWriter.writeIntArray(parcel, 24, this.zzx, false);
        SafeParcelWriter.writeIntArray(parcel, 25, this.zzy, false);
        SafeParcelWriter.writeBoolean(parcel, 26, this.zzz);
        SafeParcelWriter.writeInt(parcel, 27, this.zzA);
        SafeParcelWriter.writeByteArray(parcel, 28, this.zzB, false);
        SafeParcelWriter.writeBoolean(parcel, 29, this.zzC);
        SafeParcelWriter.writeInt(parcel, 30, getConnectionType());
        SafeParcelWriter.writeBoolean(parcel, 31, false);
        SafeParcelWriter.writeBoolean(parcel, 32, this.zzF);
        SafeParcelWriter.writeBoolean(parcel, 33, this.zzG);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ AdvertisingOptions(zza zzaVar) {
        this.f47772zzb = true;
        this.f47773zzc = true;
        this.f47774zzd = true;
        this.f47775zze = true;
        this.f47777zzg = false;
        this.f47779zzi = true;
        this.f47780zzj = true;
        this.f47781zzk = true;
        this.f47782zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
    }

    @Deprecated
    public AdvertisingOptions(@NonNull Strategy strategy) {
        this.f47772zzb = true;
        this.f47773zzc = true;
        this.f47774zzd = true;
        this.f47775zze = true;
        this.f47777zzg = false;
        this.f47779zzi = true;
        this.f47780zzj = true;
        this.f47781zzk = true;
        this.f47782zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = 0L;
        this.zzt = false;
        this.zzu = true;
        this.zzv = false;
        this.zzw = true;
        this.zzz = true;
        this.zzA = 0;
        this.zzC = true;
        this.zzD = 0;
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
        this.f47771zza = strategy;
    }

    @SafeParcelable.Constructor
    public AdvertisingOptions(@SafeParcelable.Param(id = 1) Strategy strategy, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z6, @SafeParcelable.Param(id = 6) byte[] bArr, @SafeParcelable.Param(id = 7) boolean z11, @SafeParcelable.Param(id = 8) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) boolean z29, @SafeParcelable.Param(id = 11) boolean z31, @SafeParcelable.Param(id = 12) boolean z41, @SafeParcelable.Param(id = 13) boolean z49, @SafeParcelable.Param(id = 14) boolean z54, @SafeParcelable.Param(id = 15) int i, @SafeParcelable.Param(id = 16) int i2, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) long j2, @SafeParcelable.Param(id = 19) zzab[] zzabVarArr, @SafeParcelable.Param(id = 20) boolean z74, @SafeParcelable.Param(id = 21) boolean z83, @SafeParcelable.Param(id = 22) boolean z89, @SafeParcelable.Param(id = 23) boolean z96, @SafeParcelable.Param(id = 24) int[] iArr, @SafeParcelable.Param(id = 25) int[] iArr2, @SafeParcelable.Param(id = 26) boolean z100, @SafeParcelable.Param(id = 27) int i3, @SafeParcelable.Param(id = 28) byte[] bArr3, @SafeParcelable.Param(id = 29) boolean z101, @SafeParcelable.Param(id = 30) int i5, @SafeParcelable.Param(id = 31) boolean z102, @SafeParcelable.Param(id = 32) boolean z103, @SafeParcelable.Param(id = 33) boolean z104) {
        this.zzE = false;
        this.zzF = true;
        this.zzG = true;
        this.f47771zza = strategy;
        this.f47772zzb = z;
        this.f47773zzc = z3;
        this.f47774zzd = z4;
        this.f47775zze = z6;
        this.f47776zzf = bArr;
        this.f47777zzg = z11;
        this.f47778zzh = parcelUuid;
        this.f47779zzi = z12;
        this.f47780zzj = z29;
        this.f47781zzk = z31;
        this.f47782zzl = z41;
        this.zzm = z49;
        this.zzn = z54;
        this.zzo = i;
        this.zzp = i2;
        this.zzq = bArr2;
        this.zzr = j2;
        this.zzs = zzabVarArr;
        this.zzt = z74;
        this.zzu = z83;
        this.zzv = z89;
        this.zzw = z96;
        this.zzx = iArr;
        this.zzy = iArr2;
        this.zzz = z100;
        this.zzA = i3;
        this.zzB = bArr3;
        this.zzC = z101;
        this.zzD = i5;
    }
}
