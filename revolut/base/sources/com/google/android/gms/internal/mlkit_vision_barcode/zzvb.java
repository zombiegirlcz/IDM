package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "DriverLicenseParcelCreator")
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new zzvq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDocumentType", id = 1)
    private final String f42558zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFirstName", id = 2)
    private final String f42559zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getMiddleName", id = 3)
    private final String f42560zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLastName", id = 4)
    private final String f42561zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGender", id = 5)
    private final String f42562zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddressStreet", id = 6)
    private final String f42563zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddressCity", id = 7)
    private final String f42564zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddressState", id = 8)
    private final String f42565zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddressZip", id = 9)
    private final String f42566zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLicenseNumber", id = 10)
    private final String f42567zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIssueDate", id = 11)
    private final String f42568zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExpiryDate", id = 12)
    private final String f42569zzl;

    @SafeParcelable.Field(getter = "getBirthDate", id = 13)
    private final String zzm;

    @SafeParcelable.Field(getter = "getIssuingCountry", id = 14)
    private final String zzn;

    @SafeParcelable.Constructor
    public zzvb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) String str5, @SafeParcelable.Param(id = 6) String str6, @SafeParcelable.Param(id = 7) String str7, @SafeParcelable.Param(id = 8) String str8, @SafeParcelable.Param(id = 9) String str9, @SafeParcelable.Param(id = 10) String str10, @SafeParcelable.Param(id = 11) String str11, @SafeParcelable.Param(id = 12) String str12, @SafeParcelable.Param(id = 13) String str13, @SafeParcelable.Param(id = 14) String str14) {
        this.f42558zza = str;
        this.f42559zzb = str2;
        this.f42560zzc = str3;
        this.f42561zzd = str4;
        this.f42562zze = str5;
        this.f42563zzf = str6;
        this.f42564zzg = str7;
        this.f42565zzh = str8;
        this.f42566zzi = str9;
        this.f42567zzj = str10;
        this.f42568zzk = str11;
        this.f42569zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42558zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42559zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f42560zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42561zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f42562zze, false);
        SafeParcelWriter.writeString(parcel, 6, this.f42563zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f42564zzg, false);
        SafeParcelWriter.writeString(parcel, 8, this.f42565zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.f42566zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.f42567zzj, false);
        SafeParcelWriter.writeString(parcel, 11, this.f42568zzk, false);
        SafeParcelWriter.writeString(parcel, 12, this.f42569zzl, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 14, this.zzn, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f42564zzg;
    }

    public final String zzb() {
        return this.f42565zzh;
    }

    public final String zzc() {
        return this.f42563zzf;
    }

    public final String zzd() {
        return this.f42566zzi;
    }

    public final String zze() {
        return this.zzm;
    }

    public final String zzf() {
        return this.f42558zza;
    }

    public final String zzg() {
        return this.f42569zzl;
    }

    public final String zzh() {
        return this.f42559zzb;
    }

    public final String zzi() {
        return this.f42562zze;
    }

    public final String zzj() {
        return this.f42568zzk;
    }

    public final String zzk() {
        return this.zzn;
    }

    public final String zzl() {
        return this.f42561zzd;
    }

    public final String zzm() {
        return this.f42567zzj;
    }

    public final String zzn() {
        return this.f42560zzc;
    }
}
