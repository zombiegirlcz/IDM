package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ViewTokenRequestCreator")
public class ViewTokenRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ViewTokenRequest> CREATOR = new zzn();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48691zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48692zzb;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f48693zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private int f48694zzb;

        @NonNull
        public ViewTokenRequest build() {
            return new ViewTokenRequest(this.f48693zza, this.f48694zzb);
        }

        @NonNull
        public Builder setIssuerTokenId(@NonNull String str) {
            this.f48693zza = str;
            return this;
        }

        @NonNull
        public Builder setTokenServiceProvider(int i) {
            this.f48694zzb = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ViewTokenRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i) {
        this.f48691zza = str;
        this.f48692zzb = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48691zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f48692zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
