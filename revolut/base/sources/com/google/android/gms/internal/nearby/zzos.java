package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DlTdoaMeasurementParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzos extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzos> CREATOR = new zzot();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageType", id = 1)
    private int f45565zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMessageControl", id = 2)
    private int f45566zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBlockIndex", id = 3)
    private int f45567zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRoundIndex", id = 4)
    private int f45568zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNlos", id = 5)
    private int f45569zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTxTimestamp", id = 6)
    private long f45570zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRxTimestamp", id = 7)
    private long f45571zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAnchroCfo", id = 8)
    private float f45572zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCfo", id = 9)
    private float f45573zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getInitiatorReplyTime", id = 10)
    private long f45574zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResponderReplyTime", id = 11)
    private long f45575zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getInitiatorResponderTof", id = 12)
    private int f45576zzl;

    @SafeParcelable.Field(getter = "getAnchorLocation", id = 13)
    private byte[] zzm;

    @SafeParcelable.Field(getter = "getActiveRangingRounds", id = 14)
    private byte[] zzn;

    private zzos() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzos) {
            zzos zzosVar = (zzos) obj2;
            if (Objects.equal(Integer.valueOf(this.f45565zza), Integer.valueOf(zzosVar.f45565zza)) && Objects.equal(Integer.valueOf(this.f45566zzb), Integer.valueOf(zzosVar.f45566zzb)) && Objects.equal(Integer.valueOf(this.f45567zzc), Integer.valueOf(zzosVar.f45567zzc)) && Objects.equal(Integer.valueOf(this.f45568zzd), Integer.valueOf(zzosVar.f45568zzd)) && Objects.equal(Integer.valueOf(this.f45569zze), Integer.valueOf(zzosVar.f45569zze)) && Objects.equal(Long.valueOf(this.f45570zzf), Long.valueOf(zzosVar.f45570zzf)) && Objects.equal(Long.valueOf(this.f45571zzg), Long.valueOf(zzosVar.f45571zzg)) && Objects.equal(Float.valueOf(this.f45572zzh), Float.valueOf(zzosVar.f45572zzh)) && Objects.equal(Float.valueOf(this.f45573zzi), Float.valueOf(zzosVar.f45573zzi)) && Objects.equal(Long.valueOf(this.f45574zzj), Long.valueOf(zzosVar.f45574zzj)) && Objects.equal(Long.valueOf(this.f45575zzk), Long.valueOf(zzosVar.f45575zzk)) && Objects.equal(Integer.valueOf(this.f45576zzl), Integer.valueOf(zzosVar.f45576zzl)) && Arrays.equals(this.zzm, zzosVar.zzm) && Arrays.equals(this.zzn, zzosVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45565zza), Integer.valueOf(this.f45566zzb), Integer.valueOf(this.f45567zzc), Integer.valueOf(this.f45568zzd), Integer.valueOf(this.f45569zze), Long.valueOf(this.f45570zzf), Long.valueOf(this.f45571zzg), Float.valueOf(this.f45572zzh), Float.valueOf(this.f45573zzi), Long.valueOf(this.f45574zzj), Long.valueOf(this.f45575zzk), Integer.valueOf(this.f45576zzl), Integer.valueOf(Arrays.hashCode(this.zzm)), Integer.valueOf(Arrays.hashCode(this.zzn)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45565zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f45566zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f45567zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f45568zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f45569zze);
        SafeParcelWriter.writeLong(parcel, 6, this.f45570zzf);
        SafeParcelWriter.writeLong(parcel, 7, this.f45571zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.f45572zzh);
        SafeParcelWriter.writeFloat(parcel, 9, this.f45573zzi);
        SafeParcelWriter.writeLong(parcel, 10, this.f45574zzj);
        SafeParcelWriter.writeLong(parcel, 11, this.f45575zzk);
        SafeParcelWriter.writeInt(parcel, 12, this.f45576zzl);
        SafeParcelWriter.writeByteArray(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeByteArray(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzos(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) int i6, @SafeParcelable.Param(id = 6) long j2, @SafeParcelable.Param(id = 7) long j3, @SafeParcelable.Param(id = 8) float f, @SafeParcelable.Param(id = 9) float f4, @SafeParcelable.Param(id = 10) long j5, @SafeParcelable.Param(id = 11) long j16, @SafeParcelable.Param(id = 12) int i21, @SafeParcelable.Param(id = 13) byte[] bArr, @SafeParcelable.Param(id = 14) byte[] bArr2) {
        this.f45565zza = i;
        this.f45566zzb = i2;
        this.f45567zzc = i3;
        this.f45568zzd = i5;
        this.f45569zze = i6;
        this.f45570zzf = j2;
        this.f45571zzg = j3;
        this.f45572zzh = f;
        this.f45573zzi = f4;
        this.f45574zzj = j5;
        this.f45575zzk = j16;
        this.f45576zzl = i21;
        this.zzm = bArr;
        this.zzn = bArr2;
    }
}
