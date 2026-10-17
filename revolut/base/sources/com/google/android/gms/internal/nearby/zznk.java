package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.UUID;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "NearbyDeviceFilterCreator")
public final class zznk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznk> CREATOR = new zznl();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f45515zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final int f45516zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final byte[] f45517zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final boolean f45518zzd;

    @SafeParcelable.Constructor
    public zznk(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) boolean z) {
        this.f45515zza = i;
        this.f45516zzb = i2;
        this.f45517zzc = bArr;
        this.f45518zzd = z;
    }

    public static zznk zza(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return new zznk(2, new com.google.android.gms.nearby.messages.internal.zzg(com.google.android.gms.nearby.messages.internal.zzc.zzd(String.valueOf(str).concat(str2))).zzc());
    }

    public static zznk zzb(UUID uuid, Short sh10, Short sh11) {
        return new zznk(3, new com.google.android.gms.nearby.messages.internal.zzl(uuid, sh10, sh11).zzc());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f45516zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f45517zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f45518zzd);
        SafeParcelWriter.writeInt(parcel, 1000, this.f45515zza);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zznk(int i, byte[] bArr) {
        this(1, i, bArr, false);
    }
}
