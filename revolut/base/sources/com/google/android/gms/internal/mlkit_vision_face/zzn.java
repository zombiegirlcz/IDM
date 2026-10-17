package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LandmarkParcelCreator")
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new zzo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    public final int f44335zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public final float f44336zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final float f44337zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final int f44338zzd;

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) float f, @SafeParcelable.Param(id = 3) float f4, @SafeParcelable.Param(id = 4) int i2) {
        this.f44335zza = i;
        this.f44336zzb = f;
        this.f44337zzc = f4;
        this.f44338zzd = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44335zza);
        SafeParcelWriter.writeFloat(parcel, 2, this.f44336zzb);
        SafeParcelWriter.writeFloat(parcel, 3, this.f44337zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f44338zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
