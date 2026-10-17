package com.google.android.gms.tapandpay.issuer;

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
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    String f48671zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    String f48672zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    String f48673zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48674zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    String f48675zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f48676zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    String f48677zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    String f48678zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    String f48679zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    String f48680zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(id = 12)
    String f48681zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 13)
    String f48682zzl;

    @SafeParcelable.Field(id = 14)
    boolean zzm;

    @SafeParcelable.Field(id = 15)
    String zzn;

    @SafeParcelable.Field(id = 16)
    String zzo;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f48683zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f48684zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private String f48685zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private String f48686zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private String f48687zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private String f48688zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private String f48689zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private String f48690zzh;

        @NonNull
        public UserAddress build() {
            return new UserAddress(this.f48683zza, this.f48684zzb, this.f48685zzc, null, null, null, this.f48686zzd, this.f48687zze, this.f48688zzf, this.f48689zzg, null, this.f48690zzh, false, null, null);
        }

        @NonNull
        public Builder setAddress1(@NonNull String str) {
            this.f48684zzb = str;
            return this;
        }

        @NonNull
        public Builder setAddress2(@NonNull String str) {
            this.f48685zzc = str;
            return this;
        }

        @NonNull
        public Builder setAdministrativeArea(@NonNull String str) {
            this.f48686zzd = str;
            return this;
        }

        @NonNull
        public Builder setCountryCode(@NonNull String str) {
            this.f48688zzf = str;
            return this;
        }

        @NonNull
        public Builder setLocality(@NonNull String str) {
            this.f48687zze = str;
            return this;
        }

        @NonNull
        public Builder setName(@NonNull String str) {
            this.f48683zza = str;
            return this;
        }

        @NonNull
        public Builder setPhoneNumber(@NonNull String str) {
            this.f48690zzh = str;
            return this;
        }

        @NonNull
        public Builder setPostalCode(@NonNull String str) {
            this.f48689zzg = str;
            return this;
        }
    }

    public UserAddress() {
    }

    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    @NonNull
    public String getAddress1() {
        return this.f48672zzb;
    }

    @NonNull
    public String getAddress2() {
        return this.f48673zzc;
    }

    @NonNull
    public String getAddress3() {
        return this.f48674zzd;
    }

    @NonNull
    public String getAddress4() {
        return this.f48675zze;
    }

    @NonNull
    public String getAddress5() {
        return this.f48676zzf;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.f48677zzg;
    }

    @NonNull
    public String getCompanyName() {
        return this.zzn;
    }

    @NonNull
    public String getCountryCode() {
        return this.f48679zzi;
    }

    @NonNull
    public String getEmailAddress() {
        return this.zzo;
    }

    @NonNull
    public String getLocality() {
        return this.f48678zzh;
    }

    @NonNull
    public String getName() {
        return this.f48671zza;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.f48682zzl;
    }

    @NonNull
    public String getPostalCode() {
        return this.f48680zzj;
    }

    @NonNull
    public String getSortingCode() {
        return this.f48681zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48671zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48672zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48673zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48674zzd, false);
        SafeParcelWriter.writeString(parcel, 6, this.f48675zze, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48676zzf, false);
        SafeParcelWriter.writeString(parcel, 8, this.f48677zzg, false);
        SafeParcelWriter.writeString(parcel, 9, this.f48678zzh, false);
        SafeParcelWriter.writeString(parcel, 10, this.f48679zzi, false);
        SafeParcelWriter.writeString(parcel, 11, this.f48680zzj, false);
        SafeParcelWriter.writeString(parcel, 12, this.f48681zzk, false);
        SafeParcelWriter.writeString(parcel, 13, this.f48682zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UserAddress(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) String str4, @SafeParcelable.Param(id = 6) String str5, @SafeParcelable.Param(id = 7) String str6, @SafeParcelable.Param(id = 8) String str7, @SafeParcelable.Param(id = 9) String str8, @SafeParcelable.Param(id = 10) String str9, @SafeParcelable.Param(id = 11) String str10, @SafeParcelable.Param(id = 12) String str11, @SafeParcelable.Param(id = 13) String str12, @SafeParcelable.Param(id = 14) boolean z, @SafeParcelable.Param(id = 15) String str13, @SafeParcelable.Param(id = 16) String str14) {
        this.f48671zza = str;
        this.f48672zzb = str2;
        this.f48673zzc = str3;
        this.f48674zzd = str4;
        this.f48675zze = str5;
        this.f48676zzf = str6;
        this.f48677zzg = str7;
        this.f48678zzh = str8;
        this.f48679zzi = str9;
        this.f48680zzj = str10;
        this.f48681zzk = str11;
        this.f48682zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }
}
