package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GoogleThirdPartyPaymentExtensionCreator")
public class GoogleThirdPartyPaymentExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleThirdPartyPaymentExtension> CREATOR = new zzaf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getThirdPartyPayment", id = 1)
    private final boolean f38522zza;

    @SafeParcelable.Constructor
    public GoogleThirdPartyPaymentExtension(@SafeParcelable.Param(id = 1) boolean z) {
        this.f38522zza = z;
    }

    public boolean equals(Object obj2) {
        return (obj2 instanceof GoogleThirdPartyPaymentExtension) && this.f38522zza == ((GoogleThirdPartyPaymentExtension) obj2).getThirdPartyPayment();
    }

    public boolean getThirdPartyPayment() {
        return this.f38522zza;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f38522zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getThirdPartyPayment());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
