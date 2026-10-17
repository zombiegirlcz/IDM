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
@SafeParcelable.Class(creator = "OnlineAccountCardLinkInfoCreator")
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new zzao();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final int f48528zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48529zzb;

    @SafeParcelable.Constructor
    public zzan(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
        this.f48528zza = i;
        this.f48529zzb = i2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzan) {
            zzan zzanVar = (zzan) obj2;
            if (Objects.equal(Integer.valueOf(this.f48528zza), Integer.valueOf(zzanVar.f48528zza)) && Objects.equal(Integer.valueOf(this.f48529zzb), Integer.valueOf(zzanVar.f48529zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48528zza), Integer.valueOf(this.f48529zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("accountType", Integer.valueOf(this.f48528zza)).add("status", Integer.valueOf(this.f48529zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48528zza);
        SafeParcelWriter.writeInt(parcel, 2, this.f48529zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
