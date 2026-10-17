package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GetPaymentCredentialsRequestCreator")
public class GetPaymentCredentialsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPaymentCredentialsRequest> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48601zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48602zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48603zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48604zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final boolean f48605zze;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f48606zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private String f48607zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private String f48608zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private String f48609zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private boolean f48610zze;

        @NonNull
        public GetPaymentCredentialsRequest build() {
            return new GetPaymentCredentialsRequest(this.f48606zza, this.f48607zzb, this.f48608zzc, this.f48609zzd, this.f48610zze);
        }

        @NonNull
        public Builder setGoogleOpaquePaymentCardRequested(boolean z) {
            this.f48610zze = z;
            return this;
        }

        @NonNull
        public Builder setServerSessionId(@NonNull String str) {
            this.f48609zzd = str;
            return this;
        }

        @NonNull
        public Builder setStableHardwareId(@NonNull String str) {
            this.f48606zza = str;
            return this;
        }

        @NonNull
        public Builder setTokenRequestorId(@NonNull String str) {
            this.f48608zzc = str;
            return this;
        }

        @NonNull
        public Builder setWalletId(@NonNull String str) {
            this.f48607zzb = str;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public GetPaymentCredentialsRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) boolean z) {
        this.f48601zza = str;
        this.f48602zzb = str2;
        this.f48603zzc = str3;
        this.f48604zzd = str4;
        this.f48605zze = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48601zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48602zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48603zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.f48604zzd, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f48605zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
