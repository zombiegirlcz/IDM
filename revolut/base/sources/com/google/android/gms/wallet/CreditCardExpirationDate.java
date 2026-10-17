package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CreditCardExpirationDateCreator")
public final class CreditCardExpirationDate extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    int f48838zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    int f48839zzb;

    public CreditCardExpirationDate() {
    }

    public int getMonth() {
        return this.f48838zza;
    }

    public int getYear() {
        return this.f48839zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48838zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f48839zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CreditCardExpirationDate(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f48838zza = i;
        this.f48839zzb = i2;
    }
}
