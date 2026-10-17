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
@SafeParcelable.Class(creator = "InAppCvmConfigCreator")
@SafeParcelable.Reserved({1})
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48505zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48506zzb;

    @SafeParcelable.Constructor
    public zzaf(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2) {
        this.f48505zza = i;
        this.f48506zzb = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzaf) {
            zzaf zzafVar = (zzaf) obj2;
            if (this.f48505zza == zzafVar.f48505zza && this.f48506zzb == zzafVar.f48506zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48505zza), Integer.valueOf(this.f48506zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("cdcvmExpirationInSecs", Integer.valueOf(this.f48505zza)).add("cdcvmTransactionLimit", Integer.valueOf(this.f48506zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f48505zza);
        SafeParcelWriter.writeInt(parcel, 3, this.f48506zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
