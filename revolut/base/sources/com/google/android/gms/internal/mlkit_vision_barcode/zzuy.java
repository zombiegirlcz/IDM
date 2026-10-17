package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CalendarDateTimeParcelCreator")
public final class zzuy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuy> CREATOR = new zzvn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getYear", id = 1)
    private final int f42536zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMonth", id = 2)
    private final int f42537zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDay", id = 3)
    private final int f42538zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHours", id = 4)
    private final int f42539zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMinutes", id = 5)
    private final int f42540zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSeconds", id = 6)
    private final int f42541zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isUtc", id = 7)
    private final boolean f42542zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawValue", id = 8)
    private final String f42543zzh;

    @SafeParcelable.Constructor
    public zzuy(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) int i6, @SafeParcelable.Param(id = 6) int i21, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) String str) {
        this.f42536zza = i;
        this.f42537zzb = i2;
        this.f42538zzc = i3;
        this.f42539zzd = i5;
        this.f42540zze = i6;
        this.f42541zzf = i21;
        this.f42542zzg = z;
        this.f42543zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f42536zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f42537zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f42538zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f42539zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f42540zze);
        SafeParcelWriter.writeInt(parcel, 6, this.f42541zzf);
        SafeParcelWriter.writeBoolean(parcel, 7, this.f42542zzg);
        SafeParcelWriter.writeString(parcel, 8, this.f42543zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f42538zzc;
    }

    public final int zzb() {
        return this.f42539zzd;
    }

    public final int zzc() {
        return this.f42540zze;
    }

    public final int zzd() {
        return this.f42537zzb;
    }

    public final int zze() {
        return this.f42541zzf;
    }

    public final int zzf() {
        return this.f42536zza;
    }

    public final String zzg() {
        return this.f42543zzh;
    }

    public final boolean zzh() {
        return this.f42542zzg;
    }
}
