package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@SafeParcelable.Class(creator = "FaceDetectorOptionsParcelCreator")
public final class zzou extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzou> CREATOR = new zzov();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPerformanceMode", id = 1)
    private final int f44396zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLandmarkMode", id = 2)
    private final int f44397zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClassificationMode", id = 3)
    private final int f44398zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getContourMode", id = 4)
    private final int f44399zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isTrackingEnabled", id = 5)
    private final boolean f44400zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getProportionalMinFaceSize", id = 6)
    private final float f44401zzf;

    @SafeParcelable.Constructor
    public zzou(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) float f) {
        this.f44396zza = i;
        this.f44397zzb = i2;
        this.f44398zzc = i3;
        this.f44399zzd = i5;
        this.f44400zze = z;
        this.f44401zzf = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44396zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f44397zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f44398zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f44399zzd);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f44400zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.f44401zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
