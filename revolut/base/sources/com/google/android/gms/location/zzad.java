package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "LocationAvailabilityRequestCreator")
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new zzae();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", id = 1)
    private final boolean f46543zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getImpersonation", id = 2)
    private final ClientIdentity f46544zzb;

    @SafeParcelable.Constructor
    public zzad(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) ClientIdentity clientIdentity) {
        this.f46543zza = z;
        this.f46544zzb = clientIdentity;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzad)) {
            return false;
        }
        zzad zzadVar = (zzad) obj2;
        return this.f46543zza == zzadVar.f46543zza && Objects.equal(this.f46544zzb, zzadVar.f46544zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f46543zza));
    }

    public final String toString() {
        StringBuilder sbS = a.s("LocationAvailabilityRequest[");
        if (this.f46543zza) {
            sbS.append("bypass, ");
        }
        if (this.f46544zzb != null) {
            sbS.append("impersonation=");
            sbS.append(this.f46544zzb);
            sbS.append(", ");
        }
        sbS.setLength(sbS.length() - 2);
        sbS.append(']');
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.f46543zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, z);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f46544zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
