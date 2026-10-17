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
@SafeParcelable.Class(creator = "GetLastAttestationResultResponseCreator")
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new zzy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final int f48576zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final long f48577zzb;

    @SafeParcelable.Constructor
    public zzx(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j2) {
        this.f48576zza = i;
        this.f48577zzb = j2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzx) {
            zzx zzxVar = (zzx) obj2;
            if (this.f48576zza == zzxVar.f48576zza && this.f48577zzb == zzxVar.f48577zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48576zza), Long.valueOf(this.f48577zzb));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("result", Integer.valueOf(this.f48576zza)).add("timeMillis", Long.valueOf(this.f48577zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48576zza);
        SafeParcelWriter.writeLong(parcel, 2, this.f48577zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
