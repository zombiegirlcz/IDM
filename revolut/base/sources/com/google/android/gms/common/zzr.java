package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupResponseCreator")
@SafeParcelable.Reserved({6})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResult", id = 1)
    private final boolean f38376zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorMessage", id = 2)
    private final String f38377zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusValue", id = 3)
    private final int f38378zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFirstPartyStatusValue", id = 4)
    private final int f38379zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "-1", getter = "getSourceStampTimestampSeconds", id = 5)
    private final long f38380zze;

    @SafeParcelable.Constructor
    public zzr(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) long j2) {
        this.f38376zza = z;
        this.f38377zzb = str;
        this.f38378zzc = zzz.zza(i) - 1;
        this.f38379zzd = zzc.zza(i2) - 1;
        this.f38380zze = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f38376zza);
        SafeParcelWriter.writeString(parcel, 2, this.f38377zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f38378zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f38379zzd);
        SafeParcelWriter.writeLong(parcel, 5, this.f38380zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza() {
        return this.f38376zza;
    }

    public final String zzb() {
        return this.f38377zzb;
    }

    public final long zzc() {
        return this.f38380zze;
    }

    public final int zzd() {
        return zzz.zza(this.f38378zzc);
    }

    public final int zze() {
        return zzc.zza(this.f38379zzd);
    }
}
