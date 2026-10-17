package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnDisconnectedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlb> CREATOR = new zzlc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45390zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 2)
    private final int f45391zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 3)
    private zzoc f45392zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 4)
    private com.google.android.gms.nearby.connection.zzo f45393zzd;

    private zzlb() {
        this.f45391zzb = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzlb) {
            zzlb zzlbVar = (zzlb) obj2;
            if (Objects.equal(this.f45390zza, zzlbVar.f45390zza) && Objects.equal(Integer.valueOf(this.f45391zzb), Integer.valueOf(zzlbVar.f45391zzb)) && Objects.equal(this.f45392zzc, zzlbVar.f45392zzc) && Objects.equal(this.f45393zzd, zzlbVar.f45393zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45390zza, Integer.valueOf(this.f45391zzb), this.f45392zzc, this.f45393zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45390zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45391zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45392zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45393zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        return this.f45390zza;
    }

    @SafeParcelable.Constructor
    public zzlb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) zzoc zzocVar, @SafeParcelable.Param(id = 4) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45390zza = str;
        this.f45391zzb = i;
        this.f45392zzc = zzocVar;
        this.f45393zzd = zzoVar;
    }
}
