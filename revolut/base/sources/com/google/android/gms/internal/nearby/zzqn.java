package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangingCapabilitiesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqn> CREATOR = new zzqo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportsDistance", id = 1)
    private boolean f45596zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportsAzimuthalAngle", id = 2)
    private boolean f45597zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportsElevationAngle", id = 3)
    private boolean f45598zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 4)
    private int f45599zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinRangingInterval", id = 5)
    private int f45600zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportedChannels", id = 6)
    private int[] f45601zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportedConfigIds", id = 7)
    private int[] f45602zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinSlotDuration", id = 8)
    private float f45603zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportedNtfConfigs", id = 9)
    private int[] f45604zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportedSlotDurations", id = 10)
    private int[] f45605zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSupportedRangingIntervals", id = 11)
    private int[] f45606zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsRangingIntervalReconfigureSupported", id = 12)
    private boolean f45607zzl;

    @SafeParcelable.Field(getter = "getSupportsBackgroundRanging", id = 13)
    private boolean zzm;

    private zzqn() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqn) {
            zzqn zzqnVar = (zzqn) obj2;
            if (Objects.equal(Boolean.valueOf(this.f45596zza), Boolean.valueOf(zzqnVar.f45596zza)) && Objects.equal(Boolean.valueOf(this.f45597zzb), Boolean.valueOf(zzqnVar.f45597zzb)) && Objects.equal(Boolean.valueOf(this.f45598zzc), Boolean.valueOf(zzqnVar.f45598zzc)) && Objects.equal(Integer.valueOf(this.f45599zzd), Integer.valueOf(zzqnVar.f45599zzd)) && Objects.equal(Integer.valueOf(this.f45600zze), Integer.valueOf(zzqnVar.f45600zze)) && Arrays.equals(this.f45601zzf, zzqnVar.f45601zzf) && Arrays.equals(this.f45602zzg, zzqnVar.f45602zzg) && Objects.equal(Float.valueOf(this.f45603zzh), Float.valueOf(zzqnVar.f45603zzh)) && Arrays.equals(this.f45604zzi, zzqnVar.f45604zzi) && Arrays.equals(this.f45605zzj, zzqnVar.f45605zzj) && Arrays.equals(this.f45606zzk, zzqnVar.f45606zzk) && Objects.equal(Boolean.valueOf(this.f45607zzl), Boolean.valueOf(zzqnVar.f45607zzl)) && Objects.equal(Boolean.valueOf(this.zzm), Boolean.valueOf(zzqnVar.zzm))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f45596zza), Boolean.valueOf(this.f45597zzb), Boolean.valueOf(this.f45598zzc), Integer.valueOf(this.f45599zzd), Integer.valueOf(this.f45600zze), Integer.valueOf(Arrays.hashCode(this.f45601zzf)), Integer.valueOf(Arrays.hashCode(this.f45602zzg)), Float.valueOf(this.f45603zzh), Integer.valueOf(Arrays.hashCode(this.f45604zzi)), Integer.valueOf(Arrays.hashCode(this.f45605zzj)), Integer.valueOf(Arrays.hashCode(this.f45606zzk)), Boolean.valueOf(this.f45607zzl), Boolean.valueOf(this.zzm));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f45596zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f45597zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f45598zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f45599zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f45600zze);
        SafeParcelWriter.writeIntArray(parcel, 6, this.f45601zzf, false);
        SafeParcelWriter.writeIntArray(parcel, 7, this.f45602zzg, false);
        SafeParcelWriter.writeFloat(parcel, 8, this.f45603zzh);
        SafeParcelWriter.writeIntArray(parcel, 9, this.f45604zzi, false);
        SafeParcelWriter.writeIntArray(parcel, 10, this.f45605zzj, false);
        SafeParcelWriter.writeIntArray(parcel, 11, this.f45606zzk, false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.f45607zzl);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzm);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45600zze;
    }

    public final boolean zzb() {
        return this.f45607zzl;
    }

    public final boolean zzc() {
        return this.f45597zzb;
    }

    public final boolean zzd() {
        return this.zzm;
    }

    public final boolean zze() {
        return this.f45596zza;
    }

    public final boolean zzf() {
        return this.f45598zzc;
    }

    public final int[] zzg() {
        return this.f45601zzf;
    }

    public final int[] zzh() {
        return this.f45602zzg;
    }

    public final int[] zzi() {
        return this.f45604zzi;
    }

    public final int[] zzj() {
        return this.f45606zzk;
    }

    public final int[] zzk() {
        return this.f45605zzj;
    }

    @SafeParcelable.Constructor
    public zzqn(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) int i2, @SafeParcelable.Param(id = 6) int[] iArr, @SafeParcelable.Param(id = 7) int[] iArr2, @SafeParcelable.Param(id = 8) float f, @SafeParcelable.Param(id = 9) int[] iArr3, @SafeParcelable.Param(id = 10) int[] iArr4, @SafeParcelable.Param(id = 11) int[] iArr5, @SafeParcelable.Param(id = 12) boolean z6, @SafeParcelable.Param(id = 13) boolean z11) {
        this.f45596zza = z;
        this.f45597zzb = z3;
        this.f45598zzc = z4;
        this.f45599zzd = i;
        this.f45600zze = i2;
        this.f45601zzf = iArr;
        this.f45602zzg = iArr2;
        this.f45603zzh = f;
        this.f45604zzi = iArr3;
        this.f45605zzj = iArr4;
        this.f45606zzk = iArr5;
        this.f45607zzl = z6;
        this.zzm = z11;
    }
}
