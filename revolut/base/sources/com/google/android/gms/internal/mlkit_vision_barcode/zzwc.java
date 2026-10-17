package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ImageMetadataParcelCreator")
public final class zzwc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzwc> CREATOR = new zzwd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getImageFormat", id = 1)
    private final int f42606zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWidth", id = 2)
    private final int f42607zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHeight", id = 3)
    private final int f42608zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRotation", id = 4)
    private final int f42609zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimestampMs", id = 5)
    private final long f42610zze;

    @SafeParcelable.Constructor
    public zzwc(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) long j2) {
        this.f42606zza = i;
        this.f42607zzb = i2;
        this.f42608zzc = i3;
        this.f42609zzd = i5;
        this.f42610zze = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f42606zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f42607zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f42608zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f42609zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.f42610zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
