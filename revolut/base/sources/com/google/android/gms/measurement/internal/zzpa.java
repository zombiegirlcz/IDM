package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UploadBatchParcelCreator")
public final class zzpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzpb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    public final long f47642zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public byte[] f47643zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public final String f47644zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final Bundle f47645zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final int f47646zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final long f47647zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public String f47648zzg;

    @SafeParcelable.Constructor
    public zzpa(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) Bundle bundle, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) long j3, @SafeParcelable.Param(id = 7) String str2) {
        this.f47642zza = j2;
        this.f47643zzb = bArr;
        this.f47644zzc = str;
        this.f47645zzd = bundle;
        this.f47646zze = i;
        this.f47647zzf = j3;
        this.f47648zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j2 = this.f47642zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f47643zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f47644zzc, false);
        SafeParcelWriter.writeBundle(parcel, 4, this.f47645zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f47646zze);
        SafeParcelWriter.writeLong(parcel, 6, this.f47647zzf);
        SafeParcelWriter.writeString(parcel, 7, this.f47648zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
