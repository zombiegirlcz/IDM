package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TransactionInfoCreator")
@SafeParcelable.Reserved({1})
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48547zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48548zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final int f48549zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final int f48550zzd;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) int i3, @SafeParcelable.Param(id = 5) int i5) {
        this.f48547zza = i;
        this.f48548zzb = i2;
        this.f48549zzc = i3;
        this.f48550zzd = i5;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzaz) {
            zzaz zzazVar = (zzaz) obj2;
            if (this.f48547zza == zzazVar.f48547zza && this.f48548zzb == zzazVar.f48548zzb && this.f48549zzc == zzazVar.f48549zzc && this.f48550zzd == zzazVar.f48550zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48547zza), Integer.valueOf(this.f48548zzb), Integer.valueOf(this.f48549zzc), Integer.valueOf(this.f48550zzd));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionDelivery", Integer.valueOf(this.f48547zza)).add("transactionLimit", Integer.valueOf(this.f48548zzb)).add("supportedTransactions", Integer.valueOf(this.f48549zzc)).add("deliveryPreference", Integer.valueOf(this.f48550zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48547zza);
        SafeParcelWriter.writeInt(parcel, 3, this.f48548zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.f48549zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.f48550zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
