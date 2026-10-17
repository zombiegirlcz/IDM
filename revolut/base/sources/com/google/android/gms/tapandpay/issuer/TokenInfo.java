package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "TokenInfoCreator")
public final class TokenInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zzk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48659zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48660zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48661zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48662zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final int f48663zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final int f48664zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    final int f48665zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    final boolean f48666zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(id = 9)
    final String f48667zzi;

    @SafeParcelable.Constructor
    public TokenInfo(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2, @SafeParcelable.Param(id = 7) int i3, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str5) {
        this.f48659zza = str;
        this.f48660zzb = str2;
        this.f48661zzc = str3;
        this.f48662zzd = str4;
        this.f48663zze = i;
        this.f48664zzf = i2;
        this.f48665zzg = i3;
        this.f48666zzh = z;
        this.f48667zzi = str5;
    }

    @NonNull
    public String getDpanLastFour() {
        return this.f48662zzd;
    }

    @NonNull
    public String getFpanLastFour() {
        return this.f48661zzc;
    }

    public boolean getIsDefaultToken() {
        return this.f48666zzh;
    }

    @NonNull
    public String getIssuerName() {
        return this.f48660zzb;
    }

    @NonNull
    public String getIssuerTokenId() {
        return this.f48659zza;
    }

    public int getNetwork() {
        return this.f48664zzf;
    }

    @NonNull
    public String getPortfolioName() {
        return this.f48667zzi;
    }

    public int getTokenServiceProvider() {
        return this.f48663zze;
    }

    public int getTokenState() {
        return this.f48665zzg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48659zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48660zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48661zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48662zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f48663zze);
        SafeParcelWriter.writeInt(parcel, 6, this.f48664zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.f48665zzg);
        SafeParcelWriter.writeBoolean(parcel, 8, this.f48666zzh);
        SafeParcelWriter.writeString(parcel, 9, this.f48667zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
