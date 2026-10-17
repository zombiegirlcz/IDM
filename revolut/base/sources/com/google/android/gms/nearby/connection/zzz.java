package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbRangingDataCreator")
@SafeParcelable.Reserved({1000})
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new zzaa();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawDistance", id = 1)
    private int f47884zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalAzimuth", id = 2)
    private int f47885zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalPolar", id = 3)
    private int f47886zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsValidAngleOfArrivalData", id = 4)
    private boolean f47887zzd;

    private zzz() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzz) {
            zzz zzzVar = (zzz) obj2;
            if (Objects.equal(Integer.valueOf(this.f47884zza), Integer.valueOf(zzzVar.f47884zza)) && Objects.equal(Integer.valueOf(this.f47885zzb), Integer.valueOf(zzzVar.f47885zzb)) && Objects.equal(Integer.valueOf(this.f47886zzc), Integer.valueOf(zzzVar.f47886zzc)) && Objects.equal(Boolean.valueOf(this.f47887zzd), Boolean.valueOf(zzzVar.f47887zzd))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f47884zza), Integer.valueOf(this.f47885zzb), Integer.valueOf(this.f47886zzc), Boolean.valueOf(this.f47887zzd));
    }

    public final String toString() {
        int i = this.f47884zza;
        int i2 = this.f47885zzb;
        int i3 = this.f47886zzc;
        boolean z = this.f47887zzd;
        StringBuilder sbW = a.w("UwbRangingData{rawDistance=", i, i2, ", rawAngleOfArrivalAzimuth=", ", rawAngleOfArrivalPolar=");
        sbW.append(i3);
        sbW.append(", isValidAngleOfArrivalData=");
        sbW.append(z);
        sbW.append("}");
        return sbW.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f47884zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f47885zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f47886zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f47887zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzz(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) boolean z) {
        this.f47884zza = i;
        this.f47885zzb = i2;
        this.f47886zzc = i3;
        this.f47887zzd = z;
    }
}
