package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    int f48929zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final Bundle f48930zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzae zzaeVar) {
        }

        @NonNull
        public Builder addParameter(@NonNull String str, @NonNull String str2) {
            Preconditions.checkNotEmpty(str, "Tokenization parameter name must not be empty");
            Preconditions.checkNotEmpty(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.f48930zzb.putString(str, str2);
            return this;
        }

        @NonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.f48929zza = i;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.f48930zzb = new Bundle();
    }

    @NonNull
    public static Builder newBuilder() {
        return new PaymentMethodTokenizationParameters().new Builder(null);
    }

    @NonNull
    public Bundle getParameters() {
        return new Bundle(this.f48930zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.f48929zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48929zza);
        SafeParcelWriter.writeBundle(parcel, 3, this.f48930zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) Bundle bundle) {
        new Bundle();
        this.f48929zza = i;
        this.f48930zzb = bundle;
    }
}
