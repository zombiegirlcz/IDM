package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnEndpointLostParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new zzli();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointId", id = 1)
    private String f45406zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 2)
    private final int f45407zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 3)
    private com.google.android.gms.nearby.connection.zzo f45408zzc;

    private zzlh() {
        this.f45407zzb = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzlh) {
            zzlh zzlhVar = (zzlh) obj2;
            if (Objects.equal(this.f45406zza, zzlhVar.f45406zza) && Objects.equal(Integer.valueOf(this.f45407zzb), Integer.valueOf(zzlhVar.f45407zzb)) && Objects.equal(this.f45408zzc, zzlhVar.f45408zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45406zza, Integer.valueOf(this.f45407zzb), this.f45408zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45406zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45407zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45408zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f45406zza;
    }

    @SafeParcelable.Constructor
    public zzlh(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45406zza = str;
        this.f45407zzb = i;
        this.f45408zzc = zzoVar;
    }
}
