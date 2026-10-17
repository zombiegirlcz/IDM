package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ContactInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public zzp f41942zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public String f41943zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f41944zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public zzq[] f41945zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public zzn[] f41946zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public String[] f41947zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public zzi[] f41948zzg;

    public zzl() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f41942zza, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f41943zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f41944zzc, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f41945zzd, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.f41946zze, i, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.f41947zzf, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f41948zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzl(@SafeParcelable.Param(id = 2) zzp zzpVar, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) String str2, @SafeParcelable.Param(id = 5) zzq[] zzqVarArr, @SafeParcelable.Param(id = 6) zzn[] zznVarArr, @SafeParcelable.Param(id = 7) String[] strArr, @SafeParcelable.Param(id = 8) zzi[] zziVarArr) {
        this.f41942zza = zzpVar;
        this.f41943zzb = str;
        this.f41944zzc = str2;
        this.f41945zzd = zzqVarArr;
        this.f41946zze = zznVarArr;
        this.f41947zzf = strArr;
        this.f41948zzg = zziVarArr;
    }
}
