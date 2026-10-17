package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PaymentDataCreator")
public final class PaymentData extends AbstractSafeParcelable implements AutoResolvableResult {

    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    String f48906zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    CardInfo f48907zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    UserAddress f48908zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    PaymentMethodToken f48909zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    String f48910zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    Bundle f48911zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    String f48912zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(id = 8)
    Bundle f48913zzh;

    private PaymentData() {
    }

    @NonNull
    public static PaymentData fromJson(@NonNull String str) {
        PaymentData paymentData = new PaymentData();
        paymentData.f48912zzg = (String) Preconditions.checkNotNull(str, "paymentDataJson cannot be null!");
        return paymentData;
    }

    public static PaymentData getFromIntent(@NonNull Intent intent) {
        return (PaymentData) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    @NonNull
    @Deprecated
    public CardInfo getCardInfo() {
        return this.f48907zzb;
    }

    @Deprecated
    public String getEmail() {
        return this.f48906zza;
    }

    @Deprecated
    public Bundle getExtraData() {
        return this.f48911zzf;
    }

    @NonNull
    @Deprecated
    public String getGoogleTransactionId() {
        return this.f48910zze;
    }

    public Bundle getLastSavedState() {
        return this.f48913zzh;
    }

    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.f48909zzd;
    }

    @Deprecated
    public UserAddress getShippingAddress() {
        return this.f48908zzc;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public void putIntoIntent(@NonNull Intent intent) {
        SafeParcelableSerializer.serializeToIntentExtra(this, intent, "com.google.android.gms.wallet.PaymentData");
    }

    @NonNull
    public String toJson() {
        return this.f48912zzg;
    }

    @NonNull
    public PaymentData withLastSavedState(Bundle bundle) {
        this.f48913zzh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48906zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48907zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48908zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48909zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48910zze, false);
        SafeParcelWriter.writeBundle(parcel, 6, this.f48911zzf, false);
        SafeParcelWriter.writeString(parcel, 7, this.f48912zzg, false);
        SafeParcelWriter.writeBundle(parcel, 8, this.f48913zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentData(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) CardInfo cardInfo, @SafeParcelable.Param(id = 3) UserAddress userAddress, @SafeParcelable.Param(id = 4) PaymentMethodToken paymentMethodToken, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) Bundle bundle, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) Bundle bundle2) {
        this.f48906zza = str;
        this.f48907zzb = cardInfo;
        this.f48908zzc = userAddress;
        this.f48909zzd = paymentMethodToken;
        this.f48910zze = str2;
        this.f48911zzf = bundle;
        this.f48912zzg = str3;
        this.f48913zzh = bundle2;
    }
}
