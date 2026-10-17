package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
@Deprecated
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f49006zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f49007zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f49008zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f49009zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    String f49010zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f49011zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String f49012zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    String f49013zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    String f49014zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    boolean f49015zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    String f49016zzk;

    public zza() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f49006zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f49007zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f49008zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f49009zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f49010zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f49011zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f49012zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f49013zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.f49014zzi, false);
        SafeParcelWriter.writeBoolean(parcel, 11, this.f49015zzj);
        SafeParcelWriter.writeString(parcel, 12, this.f49016zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) boolean z, @SafeParcelable.Param(id = 12) String str10) {
        this.f49006zza = str;
        this.f49007zzb = str2;
        this.f49008zzc = str3;
        this.f49009zzd = str4;
        this.f49010zze = str5;
        this.f49011zzf = str6;
        this.f49012zzg = str7;
        this.f49013zzh = str8;
        this.f49014zzi = str9;
        this.f49015zzj = z;
        this.f49016zzk = str10;
    }
}
