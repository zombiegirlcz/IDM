package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
public final class PaymentDataRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzac();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    boolean f48914zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    boolean f48915zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    CardRequirements f48916zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    boolean f48917zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    ShippingAddressRequirements f48918zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    ArrayList f48919zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    PaymentMethodTokenizationParameters f48920zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    TransactionInfo f48921zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "true", id = 9)
    boolean f48922zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(id = 10)
    String f48923zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @ShowFirstParty
    @SafeParcelable.Field(id = 12)
    byte[] f48924zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(id = 11)
    Bundle f48925zzl;

    @Deprecated
    public final class Builder {
        public /* synthetic */ Builder(zzab zzabVar) {
        }

        @NonNull
        public Builder addAllowedPaymentMethod(int i) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48919zzf == null) {
                paymentDataRequest.f48919zzf = new ArrayList();
            }
            PaymentDataRequest.this.f48919zzf.add(Integer.valueOf(i));
            return this;
        }

        @NonNull
        public Builder addAllowedPaymentMethods(@NonNull Collection<Integer> collection) {
            boolean z = false;
            if (collection != null && !collection.isEmpty()) {
                z = true;
            }
            Preconditions.checkArgument(z, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48919zzf == null) {
                paymentDataRequest.f48919zzf = new ArrayList();
            }
            PaymentDataRequest.this.f48919zzf.addAll(collection);
            return this;
        }

        @NonNull
        public PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.f48923zzj == null && paymentDataRequest.f48924zzk == null) {
                Preconditions.checkNotNull(paymentDataRequest.f48919zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.f48916zzc, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.f48920zzg != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.f48921zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        @NonNull
        public Builder setCardRequirements(@NonNull CardRequirements cardRequirements) {
            PaymentDataRequest.this.f48916zzc = cardRequirements;
            return this;
        }

        @NonNull
        public Builder setEmailRequired(boolean z) {
            PaymentDataRequest.this.f48914zza = z;
            return this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationParameters(@NonNull PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.f48920zzg = paymentMethodTokenizationParameters;
            return this;
        }

        @NonNull
        public Builder setPhoneNumberRequired(boolean z) {
            PaymentDataRequest.this.f48915zzb = z;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequired(boolean z) {
            PaymentDataRequest.this.f48917zzd = z;
            return this;
        }

        @NonNull
        public Builder setShippingAddressRequirements(@NonNull ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.f48918zze = shippingAddressRequirements;
            return this;
        }

        @NonNull
        public Builder setTransactionInfo(@NonNull TransactionInfo transactionInfo) {
            PaymentDataRequest.this.f48921zzh = transactionInfo;
            return this;
        }

        @NonNull
        public Builder setUiRequired(boolean z) {
            PaymentDataRequest.this.f48922zzi = z;
            return this;
        }
    }

    private PaymentDataRequest() {
        this.f48922zzi = true;
    }

    @NonNull
    public static PaymentDataRequest fromJson(@NonNull String str) {
        Builder builderNewBuilder = newBuilder();
        PaymentDataRequest.this.f48923zzj = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return builderNewBuilder.build();
    }

    @NonNull
    @Deprecated
    public static Builder newBuilder() {
        return new PaymentDataRequest().new Builder(null);
    }

    @NonNull
    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.f48919zzf;
    }

    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.f48916zzc;
    }

    @NonNull
    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.f48920zzg;
    }

    public Bundle getSavedState() {
        return this.f48925zzl;
    }

    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.f48918zze;
    }

    @NonNull
    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.f48921zzh;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.f48914zza;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.f48915zzb;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.f48917zzd;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.f48922zzi;
    }

    @NonNull
    public String toJson() {
        return this.f48923zzj;
    }

    @NonNull
    public PaymentDataRequest withSavedState(Bundle bundle) {
        this.f48925zzl = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f48914zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48915zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48916zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48917zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48918zze, i, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.f48919zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f48920zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f48921zzh, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f48922zzi);
        SafeParcelWriter.writeString(parcel, 10, this.f48923zzj, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.f48925zzl, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.f48924zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3, @SafeParcelable.Param(id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(id = 4) boolean z4, @SafeParcelable.Param(id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(id = 6) ArrayList arrayList, @SafeParcelable.Param(id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(id = 9) boolean z6, @SafeParcelable.Param(id = 10) String str, @SafeParcelable.Param(id = 12) byte[] bArr, @SafeParcelable.Param(id = 11) Bundle bundle) {
        this.f48914zza = z;
        this.f48915zzb = z3;
        this.f48916zzc = cardRequirements;
        this.f48917zzd = z4;
        this.f48918zze = shippingAddressRequirements;
        this.f48919zzf = arrayList;
        this.f48920zzg = paymentMethodTokenizationParameters;
        this.f48921zzh = transactionInfo;
        this.f48922zzi = z6;
        this.f48923zzj = str;
        this.f48924zzk = bArr;
        this.f48925zzl = bundle;
    }
}
