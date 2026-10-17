package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.PlatformVersion;
import j6.a;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ConnectionOptionsCreator")
@SafeParcelable.Reserved({1000})
public final class ConnectionOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ConnectionOptions> CREATOR = new zzn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getLowPower", id = 1)
    private boolean f47794zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBluetooth", id = 2)
    private boolean f47795zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableBle", id = 3)
    private boolean f47796zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiLan", id = 4)
    private boolean f47797zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableNfc", id = 5)
    private boolean f47798zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiAware", id = 6)
    private boolean f47799zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiHotspot", id = 7)
    private boolean f47800zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnableWifiDirect", id = 8)
    private boolean f47801zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(getter = "getRemoteBluetoothMacAddress", id = 9)
    private byte[] f47802zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableWebRtc", id = 10)
    private boolean f47803zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "true", getter = "getEnforceTopologyConstraints", id = 11)
    private boolean f47804zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", getter = "getDisruptiveUpgrade", id = 12)
    @Deprecated
    private boolean f47805zzl;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getKeepAliveIntervalMillis", id = 13)
    private int zzm;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getKeepAliveTimeoutMillis", id = 14)
    private int zzn;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getUpgradeMediums", id = 15)
    private int[] zzo;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getConnectionMediums", id = 16)
    private int[] zzp;

    @SafeParcelable.Field(getter = "getDeviceInfo", id = 17)
    private byte[] zzq;

    @ShowFirstParty
    @SafeParcelable.Field(getter = "getStrategy", id = 18)
    private Strategy zzr;

    @SafeParcelable.Field(defaultValue = "0", getter = "getConnectionType", id = 19)
    private int zzs;

    @ShowFirstParty
    @SafeParcelable.Field(defaultValue = "0", getter = "getFlowId", id = 20)
    private long zzt;

    @SafeParcelable.Field(defaultValue = "false", getter = "getEnableV3Options", id = 21)
    private boolean zzu;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowBluetoothRadioToggling", id = 22)
    private boolean zzv;

    @SafeParcelable.Field(defaultValue = "true", getter = "getAllowWifiRadioToggling", id = 23)
    private boolean zzw;

    @SafeParcelable.Reserved({1000})
    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private final ConnectionOptions f47806zza;

        public Builder() {
            this.f47806zza = new ConnectionOptions(null);
        }

        @NonNull
        public ConnectionOptions build() {
            ConnectionOptions.zzC(this.f47806zza);
            if (this.f47806zza.zzs != 0) {
                ConnectionOptions connectionOptions = this.f47806zza;
                connectionOptions.f47805zzl = connectionOptions.zzs == 1;
            } else if (!this.f47806zza.f47805zzl) {
                this.f47806zza.zzs = 2;
            }
            return this.f47806zza;
        }

        @NonNull
        public Builder setConnectionType(int i) {
            this.f47806zza.zzs = i;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setDisruptiveUpgrade(boolean z) {
            this.f47806zza.f47805zzl = z;
            return this;
        }

        @NonNull
        public Builder setLowPower(boolean z) {
            this.f47806zza.f47794zza = z;
            return this;
        }

        public Builder(@NonNull ConnectionOptions connectionOptions) {
            ConnectionOptions connectionOptions2 = new ConnectionOptions(null);
            this.f47806zza = connectionOptions2;
            connectionOptions2.f47794zza = connectionOptions.f47794zza;
            connectionOptions2.f47795zzb = connectionOptions.f47795zzb;
            connectionOptions2.f47796zzc = connectionOptions.f47796zzc;
            connectionOptions2.f47797zzd = connectionOptions.f47797zzd;
            connectionOptions2.f47798zze = connectionOptions.f47798zze;
            connectionOptions2.f47799zzf = connectionOptions.f47799zzf;
            connectionOptions2.f47800zzg = connectionOptions.f47800zzg;
            connectionOptions2.f47801zzh = connectionOptions.f47801zzh;
            connectionOptions2.f47802zzi = connectionOptions.f47802zzi;
            connectionOptions2.f47803zzj = connectionOptions.f47803zzj;
            connectionOptions2.f47804zzk = connectionOptions.f47804zzk;
            connectionOptions2.f47805zzl = connectionOptions.f47805zzl;
            connectionOptions2.zzm = connectionOptions.zzm;
            connectionOptions2.zzn = connectionOptions.zzn;
            connectionOptions2.zzo = connectionOptions.zzo;
            connectionOptions2.zzp = connectionOptions.zzp;
            connectionOptions2.zzq = connectionOptions.zzq;
            connectionOptions2.zzr = connectionOptions.zzr;
            connectionOptions2.zzs = connectionOptions.zzs;
            connectionOptions2.zzt = connectionOptions.zzt;
            connectionOptions2.zzu = connectionOptions.zzu;
            connectionOptions2.zzv = connectionOptions.zzv;
            connectionOptions2.zzw = connectionOptions.zzw;
        }
    }

    private ConnectionOptions() {
        this.f47794zza = false;
        this.f47795zzb = true;
        this.f47796zzc = true;
        this.f47797zzd = true;
        this.f47798zze = true;
        this.f47799zzf = true;
        this.f47800zzg = true;
        this.f47801zzh = true;
        this.f47803zzj = false;
        this.f47804zzk = true;
        this.f47805zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
        this.zzt = 0L;
        this.zzu = false;
        this.zzv = true;
        this.zzw = true;
    }

    @NonNull
    public static String convertConnectionTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? a.l(i, "UNKNOWN_CONNECTION_TYPE(", ")") : "NON_DISRUPTIVE" : "DISRUPTIVE" : "BALANCED";
    }

    public static /* bridge */ /* synthetic */ void zzC(ConnectionOptions connectionOptions) {
        int[] iArr = connectionOptions.zzp;
        int[] iArr2 = connectionOptions.zzo;
        if (iArr != null && iArr.length > 0) {
            connectionOptions.f47796zzc = false;
            connectionOptions.f47795zzb = false;
            connectionOptions.f47798zze = false;
            if (PlatformVersion.isAtLeastP()) {
                connectionOptions.f47797zzd = false;
            }
        }
        if (iArr2 != null) {
            connectionOptions.f47800zzg = false;
            connectionOptions.f47799zzf = false;
            connectionOptions.f47801zzh = false;
            if (!PlatformVersion.isAtLeastP()) {
                connectionOptions.f47797zzd = false;
            }
        }
        if (iArr != null) {
            for (int i : iArr) {
                zzV(i, connectionOptions);
            }
        }
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                zzV(i2, connectionOptions);
            }
        }
    }

    private static void zzV(int i, ConnectionOptions connectionOptions) {
        switch (i) {
            case 2:
                connectionOptions.f47795zzb = true;
                break;
            case 3:
                connectionOptions.f47800zzg = true;
                break;
            case 4:
                connectionOptions.f47796zzc = true;
                break;
            case 5:
                connectionOptions.f47797zzd = true;
                break;
            case 6:
                connectionOptions.f47799zzf = true;
                break;
            case 7:
                connectionOptions.f47798zze = true;
                break;
            case 8:
                connectionOptions.f47801zzh = true;
                break;
            case 9:
                connectionOptions.f47803zzj = true;
                break;
            case 10:
            case 11:
                break;
            default:
                p.a.z(i, "Illegal connection medium ", "NearbyConnections");
                break;
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof ConnectionOptions) {
            ConnectionOptions connectionOptions = (ConnectionOptions) obj2;
            if (Objects.equal(Boolean.valueOf(this.f47794zza), Boolean.valueOf(connectionOptions.f47794zza)) && Objects.equal(Boolean.valueOf(this.f47795zzb), Boolean.valueOf(connectionOptions.f47795zzb)) && Objects.equal(Boolean.valueOf(this.f47796zzc), Boolean.valueOf(connectionOptions.f47796zzc)) && Objects.equal(Boolean.valueOf(this.f47797zzd), Boolean.valueOf(connectionOptions.f47797zzd)) && Objects.equal(Boolean.valueOf(this.f47798zze), Boolean.valueOf(connectionOptions.f47798zze)) && Objects.equal(Boolean.valueOf(this.f47799zzf), Boolean.valueOf(connectionOptions.f47799zzf)) && Objects.equal(Boolean.valueOf(this.f47800zzg), Boolean.valueOf(connectionOptions.f47800zzg)) && Objects.equal(Boolean.valueOf(this.f47801zzh), Boolean.valueOf(connectionOptions.f47801zzh)) && Arrays.equals(this.f47802zzi, connectionOptions.f47802zzi) && Objects.equal(Boolean.valueOf(this.f47803zzj), Boolean.valueOf(connectionOptions.f47803zzj)) && Objects.equal(Boolean.valueOf(this.f47804zzk), Boolean.valueOf(connectionOptions.f47804zzk)) && Objects.equal(Boolean.valueOf(this.f47805zzl), Boolean.valueOf(connectionOptions.f47805zzl)) && Objects.equal(Integer.valueOf(this.zzm), Integer.valueOf(connectionOptions.zzm)) && Objects.equal(Integer.valueOf(this.zzn), Integer.valueOf(connectionOptions.zzn)) && Arrays.equals(this.zzo, connectionOptions.zzo) && Arrays.equals(this.zzp, connectionOptions.zzp) && Arrays.equals(this.zzq, connectionOptions.zzq) && Objects.equal(this.zzr, connectionOptions.zzr) && Objects.equal(Integer.valueOf(this.zzs), Integer.valueOf(connectionOptions.zzs)) && Objects.equal(Long.valueOf(this.zzt), Long.valueOf(connectionOptions.zzt)) && Objects.equal(Boolean.valueOf(this.zzu), Boolean.valueOf(connectionOptions.zzu)) && Objects.equal(Boolean.valueOf(this.zzv), Boolean.valueOf(connectionOptions.zzv)) && Objects.equal(Boolean.valueOf(this.zzw), Boolean.valueOf(connectionOptions.zzw))) {
                return true;
            }
        }
        return false;
    }

    public int getConnectionType() {
        return this.zzs;
    }

    @Deprecated
    public boolean getDisruptiveUpgrade() {
        return this.f47805zzl;
    }

    public boolean getLowPower() {
        return this.f47794zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f47794zza), Boolean.valueOf(this.f47795zzb), Boolean.valueOf(this.f47796zzc), Boolean.valueOf(this.f47797zzd), Boolean.valueOf(this.f47798zze), Boolean.valueOf(this.f47799zzf), Boolean.valueOf(this.f47800zzg), Boolean.valueOf(this.f47801zzh), Integer.valueOf(Arrays.hashCode(this.f47802zzi)), Boolean.valueOf(this.f47803zzj), Boolean.valueOf(this.f47804zzk), Boolean.valueOf(this.f47805zzl), Integer.valueOf(this.zzm), Integer.valueOf(this.zzn), Integer.valueOf(Arrays.hashCode(this.zzo)), Integer.valueOf(Arrays.hashCode(this.zzp)), Integer.valueOf(Arrays.hashCode(this.zzq)), this.zzr, Integer.valueOf(this.zzs), Long.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
    }

    @NonNull
    public String toString() {
        Locale locale = Locale.US;
        boolean z = this.f47794zza;
        boolean z3 = this.f47795zzb;
        boolean z4 = this.f47796zzc;
        boolean z6 = this.f47797zzd;
        boolean z11 = this.f47798zze;
        boolean z12 = this.f47799zzf;
        boolean z29 = this.f47800zzg;
        boolean z31 = this.f47801zzh;
        byte[] bArr = this.f47802zzi;
        String strZzb = bArr == null ? null : com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr);
        boolean z41 = this.f47803zzj;
        boolean z49 = this.f47804zzk;
        boolean z54 = this.f47805zzl;
        byte[] bArr2 = this.zzq;
        String strZzb2 = bArr2 != null ? com.google.android.gms.nearby.messages.internal.zzc.zzb(bArr2) : null;
        Strategy strategy = this.zzr;
        int i = this.zzs;
        long j2 = this.zzt;
        StringBuilder sb6 = new StringBuilder("ConnectionOptions{lowPower: ");
        sb6.append(z);
        sb6.append(", enableBluetooth: ");
        sb6.append(z3);
        sb6.append(", enableBle: ");
        t61.a.y(sb6, z4, ", enableWifiLan: ", z6, ", enableNfc: ");
        t61.a.y(sb6, z11, ", enableWifiAware: ", z12, ", enableWifiHotspot: ");
        t61.a.y(sb6, z29, ", enableWifiDirect: ", z31, ", remoteBluetoothMacAddress: ");
        sb6.append(strZzb);
        sb6.append(", enableWebRtc: ");
        sb6.append(z41);
        sb6.append(", enforceTopologyConstraints: ");
        t61.a.y(sb6, z49, ", disruptiveUpgrade: ", z54, ",deviceInfo: ");
        sb6.append(strZzb2);
        sb6.append(",strategy: ");
        sb6.append(strategy);
        sb6.append(",connectionType: ");
        sb6.append(i);
        sb6.append("flowId: ");
        sb6.append(j2);
        sb6.append(", }");
        return sb6.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getLowPower());
        SafeParcelWriter.writeBoolean(parcel, 2, this.f47795zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f47796zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47797zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f47798zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f47799zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f47800zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f47801zzh);
        SafeParcelWriter.writeByteArray(parcel, 9, this.f47802zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.f47803zzj);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f47804zzk);
        SafeParcelWriter.writeBoolean(parcel, 12, getDisruptiveUpgrade());
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeInt(parcel, 14, this.zzn);
        SafeParcelWriter.writeIntArray(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeIntArray(parcel, 16, this.zzp, false);
        SafeParcelWriter.writeByteArray(parcel, 17, this.zzq, false);
        SafeParcelWriter.writeParcelable(parcel, 18, this.zzr, i, false);
        SafeParcelWriter.writeInt(parcel, 19, getConnectionType());
        SafeParcelWriter.writeLong(parcel, 20, this.zzt);
        SafeParcelWriter.writeBoolean(parcel, 21, this.zzu);
        SafeParcelWriter.writeBoolean(parcel, 22, this.zzv);
        SafeParcelWriter.writeBoolean(parcel, 23, this.zzw);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ ConnectionOptions(zzm zzmVar) {
        this.f47794zza = false;
        this.f47795zzb = true;
        this.f47796zzc = true;
        this.f47797zzd = true;
        this.f47798zze = true;
        this.f47799zzf = true;
        this.f47800zzg = true;
        this.f47801zzh = true;
        this.f47803zzj = false;
        this.f47804zzk = true;
        this.f47805zzl = true;
        this.zzm = 0;
        this.zzn = 0;
        this.zzs = 0;
        this.zzt = 0L;
        this.zzu = false;
        this.zzv = true;
        this.zzw = true;
    }

    @SafeParcelable.Constructor
    public ConnectionOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) boolean z6, @SafeParcelable.Param(id = 5) boolean z11, @SafeParcelable.Param(id = 6) boolean z12, @SafeParcelable.Param(id = 7) boolean z29, @SafeParcelable.Param(id = 8) boolean z31, @SafeParcelable.Param(id = 9) byte[] bArr, @SafeParcelable.Param(id = 10) boolean z41, @SafeParcelable.Param(id = 11) boolean z49, @SafeParcelable.Param(id = 12) boolean z54, @SafeParcelable.Param(id = 13) int i, @SafeParcelable.Param(id = 14) int i2, @SafeParcelable.Param(id = 15) int[] iArr, @SafeParcelable.Param(id = 16) int[] iArr2, @SafeParcelable.Param(id = 17) byte[] bArr2, @SafeParcelable.Param(id = 18) Strategy strategy, @SafeParcelable.Param(id = 19) int i3, @SafeParcelable.Param(id = 20) long j2, @SafeParcelable.Param(id = 21) boolean z74, @SafeParcelable.Param(id = 22) boolean z83, @SafeParcelable.Param(id = 23) boolean z89) {
        this.f47794zza = z;
        this.f47795zzb = z3;
        this.f47796zzc = z4;
        this.f47797zzd = z6;
        this.f47798zze = z11;
        this.f47799zzf = z12;
        this.f47800zzg = z29;
        this.f47801zzh = z31;
        this.f47802zzi = bArr;
        this.f47803zzj = z41;
        this.f47804zzk = z49;
        this.f47805zzl = z54;
        this.zzm = i;
        this.zzn = i2;
        this.zzo = iArr;
        this.zzp = iArr2;
        this.zzq = bArr2;
        this.zzr = strategy;
        this.zzs = i3;
        this.zzt = j2;
        this.zzu = z74;
        this.zzv = z83;
        this.zzw = z89;
    }
}
