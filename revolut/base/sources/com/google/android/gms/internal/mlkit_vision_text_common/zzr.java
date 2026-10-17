package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "WordBoxParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final zzn[] f44922zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final zzf f44923zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final zzf f44924zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final String f44925zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final float f44926zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public final String f44927zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public final boolean f44928zzg;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 2) zzn[] zznVarArr, @SafeParcelable.Param(id = 3) zzf zzfVar, @SafeParcelable.Param(id = 4) zzf zzfVar2, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) float f, @SafeParcelable.Param(id = 7) String str2, @SafeParcelable.Param(id = 8) boolean z) {
        this.f44922zza = zznVarArr;
        this.f44923zzb = zzfVar;
        this.f44924zzc = zzfVar2;
        this.f44925zzd = str;
        this.f44926zze = f;
        this.f44927zzf = str2;
        this.f44928zzg = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzn[] zznVarArr = this.f44922zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zznVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f44923zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f44924zzc, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f44925zzd, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.f44926zze);
        SafeParcelWriter.writeString(parcel, 7, this.f44927zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f44928zzg);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
