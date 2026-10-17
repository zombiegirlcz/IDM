package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PaymentCardRecognitionCreator")
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    String f48904zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    CreditCardExpirationDate f48905zzb;

    public PaymentCardRecognitionResult() {
    }

    public static PaymentCardRecognitionResult getFromIntent(@NonNull Intent intent) {
        return (PaymentCardRecognitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentCardRecognitionResult", CREATOR);
    }

    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.f48905zzb;
    }

    @NonNull
    public String getPan() {
        return this.f48904zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48904zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48905zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionResult(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) CreditCardExpirationDate creditCardExpirationDate) {
        this.f48904zza = str;
        this.f48905zzb = creditCardExpirationDate;
    }
}
