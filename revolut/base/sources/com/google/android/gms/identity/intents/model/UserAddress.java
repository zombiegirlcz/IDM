package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UserAddressCreator")
@SafeParcelable.Reserved({1})
public final class UserAddress extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f38771zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f38772zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f38773zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f38774zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    String f38775zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f38776zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String f38777zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    String f38778zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    String f38779zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    String f38780zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    String f38781zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 13)
    String f38782zzl;

    @SafeParcelable.Field(id = 14)
    boolean zzm;

    @SafeParcelable.Field(id = 15)
    String zzn;

    @SafeParcelable.Field(id = 16)
    String zzo;

    public UserAddress() {
    }

    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    @NonNull
    public String getAddress1() {
        return this.f38772zzb;
    }

    @NonNull
    public String getAddress2() {
        return this.f38773zzc;
    }

    @NonNull
    public String getAddress3() {
        return this.f38774zzd;
    }

    @NonNull
    public String getAddress4() {
        return this.f38775zze;
    }

    @NonNull
    public String getAddress5() {
        return this.f38776zzf;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.f38777zzg;
    }

    @NonNull
    public String getCompanyName() {
        return this.zzn;
    }

    @NonNull
    public String getCountryCode() {
        return this.f38779zzi;
    }

    @NonNull
    public String getEmailAddress() {
        return this.zzo;
    }

    @NonNull
    public String getLocality() {
        return this.f38778zzh;
    }

    @NonNull
    public String getName() {
        return this.f38771zza;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.f38782zzl;
    }

    @NonNull
    public String getPostalCode() {
        return this.f38780zzj;
    }

    @NonNull
    public String getSortingCode() {
        return this.f38781zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f38771zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f38772zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f38773zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f38774zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f38775zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f38776zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f38777zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f38778zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.f38779zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.f38780zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.f38781zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.f38782zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UserAddress(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) String str11, @SafeParcelable.Param(id = 13) String str12, @SafeParcelable.Param(id = 14) boolean z, @SafeParcelable.Param(id = 15) String str13, @SafeParcelable.Param(id = 16) String str14) {
        this.f38771zza = str;
        this.f38772zzb = str2;
        this.f38773zzc = str3;
        this.f38774zzd = str4;
        this.f38775zze = str5;
        this.f38776zzf = str6;
        this.f38777zzg = str7;
        this.f38778zzh = str8;
        this.f38779zzi = str9;
        this.f38780zzj = str10;
        this.f38781zzk = str11;
        this.f38782zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }
}
