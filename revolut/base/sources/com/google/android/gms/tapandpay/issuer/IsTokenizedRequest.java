package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "IsTokenizedRequestCreator")
public class IsTokenizedRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<IsTokenizedRequest> CREATOR = new zze();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48615zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48616zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48617zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final String f48618zzd;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f48619zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48620zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private int f48621zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private String f48622zzd;

        @NonNull
        public IsTokenizedRequest build() {
            return new IsTokenizedRequest(this.f48619zza, this.f48620zzb, this.f48621zzc, this.f48622zzd);
        }

        @NonNull
        public Builder setIdentifier(@NonNull String str) {
            this.f48619zza = str;
            return this;
        }

        @NonNull
        public Builder setIssuerName(@NonNull String str) {
            this.f48622zzd = str;
            return this;
        }

        @NonNull
        public Builder setNetwork(int i) {
            this.f48620zzb = i;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i) {
            this.f48621zzc = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public IsTokenizedRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) String str2) {
        this.f48615zza = str;
        this.f48616zzb = i;
        this.f48617zzc = i2;
        this.f48618zzd = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48615zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f48616zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f48617zzc);
        SafeParcelWriter.writeString(parcel, 4, this.f48618zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
