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
@SafeParcelable.Class(creator = "DiscoveryOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class DiscoveryOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DiscoveryOptions> CREATOR = new zzv();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStrategy", id = 1)
    private Strategy f47813zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getForwardUnrecognizedBluetoothDevices", id = 2)
    private boolean f47814zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 3)
    private boolean f47815zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 4)
    private boolean f47816zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 5)
    private boolean f47817zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getFastAdvertisementServiceUuid", id = 6)
    private ParcelUuid f47818zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 8)
    private boolean f47819zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 9)
    private boolean f47820zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 10)
    private boolean f47821zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableUwbRanging", id = 11)
    private boolean f47822zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbChannel", id = 12)
    private int f47823zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getUwbPreambleIndex", id = 13)
    private int f47824zzl;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUwbAddress", id = 14)
    private byte[] zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", id = 15)
    private long zzn;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getDiscoveryMediums", id = 16)
    private int[] zzo;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowGattConnections", id = 17)
    private boolean zzp;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 18)
    private boolean zzq;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 19)
    private boolean zzr;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 20)
    private boolean zzs;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final DiscoveryOptions f47825zza;

        public Builder() {
            this.f47825zza = new DiscoveryOptions((zzu) null);
        }

        @NonNull
        public DiscoveryOptions build() {
            int[] iArr = this.f47825zza.zzo;
            if (iArr != null && iArr.length > 0) {
                this.f47825zza.f47816zzd = false;
                this.f47825zza.f47815zzc = false;
                this.f47825zza.f47820zzh = false;
                this.f47825zza.f47821zzi = false;
                this.f47825zza.f47819zzg = false;
                for (int i : iArr) {
                    if (i == 2) {
                        this.f47825zza.f47815zzc = true;
                    } else if (i != 11) {
                        if (i == 4) {
                            this.f47825zza.f47816zzd = true;
                        } else if (i == 5) {
                            this.f47825zza.f47819zzg = true;
                        } else if (i == 6) {
                            this.f47825zza.f47821zzi = true;
                        } else if (i != 7) {
                            a.z(i, "Illegal discovery medium ", "NearbyConnections");
                        } else {
                            this.f47825zza.f47820zzh = true;
                        }
                    }
                }
            }
            return this.f47825zza;
        }

        @NonNull
        public Builder setLowPower(boolean z) {
            this.f47825zza.f47817zze = z;
            return this;
        }

        @NonNull
        public Builder setStrategy(@NonNull Strategy strategy) {
            this.f47825zza.f47813zza = strategy;
            return this;
        }

        public Builder(@NonNull DiscoveryOptions discoveryOptions) {
            DiscoveryOptions discoveryOptions2 = new DiscoveryOptions((zzu) null);
            this.f47825zza = discoveryOptions2;
            discoveryOptions2.f47813zza = discoveryOptions.f47813zza;
            discoveryOptions2.f47814zzb = discoveryOptions.f47814zzb;
            discoveryOptions2.f47815zzc = discoveryOptions.f47815zzc;
            discoveryOptions2.f47816zzd = discoveryOptions.f47816zzd;
            discoveryOptions2.f47817zze = discoveryOptions.f47817zze;
            discoveryOptions2.f47818zzf = discoveryOptions.f47818zzf;
            discoveryOptions2.f47819zzg = discoveryOptions.f47819zzg;
            discoveryOptions2.f47820zzh = discoveryOptions.f47820zzh;
            discoveryOptions2.f47821zzi = discoveryOptions.f47821zzi;
            discoveryOptions2.f47822zzj = discoveryOptions.f47822zzj;
            discoveryOptions2.f47823zzk = discoveryOptions.f47823zzk;
            discoveryOptions2.f47824zzl = discoveryOptions.f47824zzl;
            discoveryOptions2.zzm = discoveryOptions.zzm;
            discoveryOptions2.zzn = discoveryOptions.zzn;
            discoveryOptions2.zzo = discoveryOptions.zzo;
            discoveryOptions2.zzp = discoveryOptions.zzp;
            discoveryOptions2.zzq = discoveryOptions.zzq;
            discoveryOptions2.zzr = discoveryOptions.zzr;
            discoveryOptions2.zzs = discoveryOptions.zzs;
        }
    }

    private DiscoveryOptions() {
        this.f47814zzb = false;
        this.f47815zzc = true;
        this.f47816zzd = true;
        this.f47817zze = false;
        this.f47819zzg = true;
        this.f47820zzh = true;
        this.f47821zzi = true;
        this.f47822zzj = false;
        this.f47823zzk = 0;
        this.f47824zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof DiscoveryOptions) {
            DiscoveryOptions discoveryOptions = (DiscoveryOptions) obj2;
            if (Objects.equal(this.f47813zza, discoveryOptions.f47813zza) && Objects.equal(Boolean.valueOf(this.f47814zzb), Boolean.valueOf(discoveryOptions.f47814zzb)) && Objects.equal(Boolean.valueOf(this.f47815zzc), Boolean.valueOf(discoveryOptions.f47815zzc)) && Objects.equal(Boolean.valueOf(this.f47816zzd), Boolean.valueOf(discoveryOptions.f47816zzd)) && Objects.equal(Boolean.valueOf(this.f47817zze), Boolean.valueOf(discoveryOptions.f47817zze)) && Objects.equal(this.f47818zzf, discoveryOptions.f47818zzf) && Objects.equal(Boolean.valueOf(this.f47819zzg), Boolean.valueOf(discoveryOptions.f47819zzg)) && Objects.equal(Boolean.valueOf(this.f47820zzh), Boolean.valueOf(discoveryOptions.f47820zzh)) && Objects.equal(Boolean.valueOf(this.f47821zzi), Boolean.valueOf(discoveryOptions.f47821zzi)) && Objects.equal(Boolean.valueOf(this.f47822zzj), Boolean.valueOf(discoveryOptions.f47822zzj)) && Objects.equal(Integer.valueOf(this.f47823zzk), Integer.valueOf(discoveryOptions.f47823zzk)) && Objects.equal(Integer.valueOf(this.f47824zzl), Integer.valueOf(discoveryOptions.f47824zzl)) && Arrays.equals(this.zzm, discoveryOptions.zzm) && Objects.equal(Long.valueOf(this.zzn), Long.valueOf(discoveryOptions.zzn)) && Arrays.equals(this.zzo, discoveryOptions.zzo) && Objects.equal(Boolean.valueOf(this.zzp), Boolean.valueOf(discoveryOptions.zzp)) && Objects.equal(Boolean.valueOf(this.zzq), Boolean.valueOf(discoveryOptions.zzq)) && Objects.equal(Boolean.valueOf(this.zzr), Boolean.valueOf(discoveryOptions.zzr)) && Objects.equal(Boolean.valueOf(this.zzs), Boolean.valueOf(discoveryOptions.zzs))) {
                return true;
            }
        }
        return false;
    }

    public boolean getLowPower() {
        return this.f47817zze;
    }

    @NonNull
    public Strategy getStrategy() {
        return this.f47813zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f47813zza, Boolean.valueOf(this.f47814zzb), Boolean.valueOf(this.f47815zzc), Boolean.valueOf(this.f47816zzd), Boolean.valueOf(this.f47817zze), this.f47818zzf, Boolean.valueOf(this.f47819zzg), Boolean.valueOf(this.f47820zzh), Boolean.valueOf(this.f47821zzi), Boolean.valueOf(this.f47822zzj), Integer.valueOf(this.f47823zzk), Integer.valueOf(this.f47824zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Long.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Boolean.valueOf(this.zzp), Boolean.valueOf(this.zzq), Boolean.valueOf(this.zzr), Boolean.valueOf(this.zzs));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        Strategy strategy = this.f47813zza;
        boolean z = this.f47814zzb;
        boolean z3 = this.f47815zzc;
        boolean z4 = this.f47816zzd;
        boolean z6 = this.f47817zze;
        ParcelUuid parcelUuid = this.f47818zzf;
        boolean z11 = this.f47819zzg;
        boolean z12 = this.f47820zzh;
        boolean z29 = this.f47821zzi;
        boolean z31 = this.f47822zzj;
        int i = this.f47823zzk;
        int i2 = this.f47824zzl;
        byte[] bArr = this.zzm;
        String strZzb = bArr == null ? "null" : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr);
        long j2 = this.zzn;
        boolean z41 = this.zzp;
        StringBuilder sb6 = new StringBuilder("DiscoveryOptions{strategy: ");
        sb6.append(strategy);
        sb6.append(", forwardUnrecognizedBluetoothDevices: ");
        sb6.append(z);
        sb6.append(", enableBluetooth: ");
        t61.a.y(sb6, z3, ", enableBle: ", z4, ", lowPower: ");
        sb6.append(z6);
        sb6.append(", fastAdvertisementServiceUuid: ");
        sb6.append(parcelUuid);
        sb6.append(", enableWifiLan: ");
        t61.a.y(sb6, z11, ", enableNfc: ", z12, ", enableWifiAware: ");
        t61.a.y(sb6, z29, ", enableUwbRanging: ", z31, ", uwbChannel: ");
        t61.a.x(sb6, i, ", uwbPreambleIndex: ", i2, ", uwbAddress: ");
        sb6.append(strZzb);
        sb6.append(", flowId: ");
        sb6.append(j2);
        sb6.append(", allowGattConnections: ");
        sb6.append(z41);
        sb6.append("}");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStrategy(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f47814zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f47815zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47816zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, getLowPower());
        SafeParcelWriter.writeParcelable(parcel, 6, this.f47818zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f47819zzg);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f47820zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f47821zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f47822zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.f47823zzk);
        SafeParcelWriter.writeInt(parcel, 13, this.f47824zzl);
        SafeParcelWriter.writeByteArray(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeLong(parcel, 15, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.zzp);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzq);
        SafeParcelWriter.writeBoolean(parcel, 19, this.zzr);
        SafeParcelWriter.writeBoolean(parcel, 20, this.zzs);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    public final boolean zzK() {
        return this.f47820zzh;
    }

    public /* synthetic */ DiscoveryOptions(zzu zzuVar) {
        this.f47814zzb = false;
        this.f47815zzc = true;
        this.f47816zzd = true;
        this.f47817zze = false;
        this.f47819zzg = true;
        this.f47820zzh = true;
        this.f47821zzi = true;
        this.f47822zzj = false;
        this.f47823zzk = 0;
        this.f47824zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
    }

    @Deprecated
    public DiscoveryOptions(@NonNull Strategy strategy) {
        this.f47814zzb = false;
        this.f47815zzc = true;
        this.f47816zzd = true;
        this.f47817zze = false;
        this.f47819zzg = true;
        this.f47820zzh = true;
        this.f47821zzi = true;
        this.f47822zzj = false;
        this.f47823zzk = 0;
        this.f47824zzl = 0;
        this.zzn = 0L;
        this.zzp = true;
        this.zzq = false;
        this.zzr = true;
        this.zzs = true;
        this.f47813zza = strategy;
    }

    @SafeParcelable.Constructor
    public DiscoveryOptions(@SafeParcelable.Param(id = 1) Strategy strategy, @SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) boolean z3, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) boolean z6, @SafeParcelable.Param(id = 6) ParcelUuid parcelUuid, @SafeParcelable.Param(id = 8) boolean z11, @SafeParcelable.Param(id = 9) boolean z12, @SafeParcelable.Param(id = 10) boolean z29, @SafeParcelable.Param(id = 11) boolean z31, @SafeParcelable.Param(id = 12) int i, @SafeParcelable.Param(id = 13) int i2, @SafeParcelable.Param(id = 14) byte[] bArr, @SafeParcelable.Param(id = 15) long j2, @SafeParcelable.Param(id = 16) int[] iArr, @SafeParcelable.Param(id = 17) boolean z41, @SafeParcelable.Param(id = 18) boolean z49, @SafeParcelable.Param(id = 19) boolean z54, @SafeParcelable.Param(id = 20) boolean z74) {
        this.f47813zza = strategy;
        this.f47814zzb = z;
        this.f47815zzc = z3;
        this.f47816zzd = z4;
        this.f47817zze = z6;
        this.f47818zzf = parcelUuid;
        this.f47819zzg = z11;
        this.f47820zzh = z12;
        this.f47821zzi = z29;
        this.f47822zzj = z31;
        this.f47823zzk = i;
        this.f47824zzl = i2;
        this.zzm = bArr;
        this.zzn = j2;
        this.zzo = iArr;
        this.zzp = z41;
        this.zzq = z49;
        this.zzr = z54;
        this.zzs = z74;
    }
}
