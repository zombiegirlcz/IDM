package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GetPaymentCredentialsResponseCreator")
public class GetPaymentCredentialsResponse extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetPaymentCredentialsResponse> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final byte[] f48611zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final byte[] f48612zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        byte[] f48613zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        byte[] f48614zzb;

        @NonNull
        public GetPaymentCredentialsResponse build() {
            return new GetPaymentCredentialsResponse(this.f48613zza, this.f48614zzb);
        }

        @NonNull
        public Builder setGoogleOpaquePaymentCard(byte[] bArr) {
            this.f48614zzb = bArr;
            return this;
        }

        @NonNull
        public Builder setOpaquePaymentCard(@NonNull byte[] bArr) {
            this.f48613zza = bArr;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public GetPaymentCredentialsResponse(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2) {
        this.f48611zza = bArr;
        this.f48612zzb = bArr2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f48611zza, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f48612zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
