package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "FaceParcelCreator")
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f43692zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final int f43693zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final float f43694zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final float f43695zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final float f43696zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final float f43697zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 7)
    public final float f43698zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 8)
    public final float f43699zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "3.4028235E38f", id = 14)
    public final float f43700zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    public final zzn[] f43701zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public final float f43702zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public final float f43703zzl;

    @SafeParcelable.Field(id = 12)
    public final float zzm;

    @SafeParcelable.Field(id = 13)
    public final zzd[] zzn;

    @SafeParcelable.Field(defaultValue = "-1.0f", id = 15)
    public final float zzo;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) float f, @SafeParcelable.Param(id = 4) float f4, @SafeParcelable.Param(id = 5) float f5, @SafeParcelable.Param(id = 6) float f6, @SafeParcelable.Param(id = 7) float f32, @SafeParcelable.Param(id = 8) float f35, @SafeParcelable.Param(id = 14) float f36, @SafeParcelable.Param(id = 9) zzn[] zznVarArr, @SafeParcelable.Param(id = 10) float f37, @SafeParcelable.Param(id = 11) float f41, @SafeParcelable.Param(id = 12) float f42, @SafeParcelable.Param(id = 13) zzd[] zzdVarArr, @SafeParcelable.Param(id = 15) float f57) {
        this.f43692zza = i;
        this.f43693zzb = i2;
        this.f43694zzc = f;
        this.f43695zzd = f4;
        this.f43696zze = f5;
        this.f43697zzf = f6;
        this.f43698zzg = f32;
        this.f43699zzh = f35;
        this.f43700zzi = f36;
        this.f43701zzj = zznVarArr;
        this.f43702zzk = f37;
        this.f43703zzl = f41;
        this.zzm = f42;
        this.zzn = zzdVarArr;
        this.zzo = f57;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f43692zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f43693zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.f43694zzc);
        SafeParcelWriter.writeFloat(parcel, 4, this.f43695zzd);
        SafeParcelWriter.writeFloat(parcel, 5, this.f43696zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.f43697zzf);
        SafeParcelWriter.writeFloat(parcel, 7, this.f43698zzg);
        SafeParcelWriter.writeFloat(parcel, 8, this.f43699zzh);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f43701zzj, i, false);
        SafeParcelWriter.writeFloat(parcel, 10, this.f43702zzk);
        SafeParcelWriter.writeFloat(parcel, 11, this.f43703zzl);
        SafeParcelWriter.writeFloat(parcel, 12, this.zzm);
        SafeParcelWriter.writeTypedArray(parcel, 13, this.zzn, i, false);
        SafeParcelWriter.writeFloat(parcel, 14, this.f43700zzi);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
