package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DriverLicenseCreator")
@SafeParcelable.Reserved({1})
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzz();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    public String f42046zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    public String f42047zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public String f42048zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public String f42049zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public String f42050zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public String f42051zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    public String f42052zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    public String f42053zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    public String f42054zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    public String f42055zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    public String f42056zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 13)
    public String f42057zzl;

    @SafeParcelable.Field(id = 14)
    public String zzm;

    @SafeParcelable.Field(id = 15)
    public String zzn;

    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f42046zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42047zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42048zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f42049zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f42050zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f42051zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f42052zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f42053zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.f42054zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.f42055zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.f42056zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.f42057zzl, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) String str11, @SafeParcelable.Param(id = 13) String str12, @SafeParcelable.Param(id = 14) String str13, @SafeParcelable.Param(id = 15) String str14) {
        this.f42046zza = str;
        this.f42047zzb = str2;
        this.f42048zzc = str3;
        this.f42049zzd = str4;
        this.f42050zze = str5;
        this.f42051zzf = str6;
        this.f42052zzg = str7;
        this.f42053zzh = str8;
        this.f42054zzi = str9;
        this.f42055zzj = str10;
        this.f42056zzk = str11;
        this.f42057zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }
}
