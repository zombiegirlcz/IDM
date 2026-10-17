package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnPayloadReceivedParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzlj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzlj> CREATOR = new zzlk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 1)
    private String f45409zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayload", id = 2)
    private zzmc f45410zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsReliable", id = 3)
    private boolean f45411zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 4)
    private final int f45412zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 5)
    private zzoc f45413zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 6)
    private com.google.android.gms.nearby.connection.zzo f45414zzf;

    private zzlj() {
        this.f45412zzd = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzlj) {
            zzlj zzljVar = (zzlj) obj2;
            if (Objects.equal(this.f45409zza, zzljVar.f45409zza) && Objects.equal(this.f45410zzb, zzljVar.f45410zzb) && Objects.equal(Boolean.valueOf(this.f45411zzc), Boolean.valueOf(zzljVar.f45411zzc)) && Objects.equal(Integer.valueOf(this.f45412zzd), Integer.valueOf(zzljVar.f45412zzd)) && Objects.equal(this.f45413zze, zzljVar.f45413zze) && Objects.equal(this.f45414zzf, zzljVar.f45414zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45409zza, this.f45410zzb, Boolean.valueOf(this.f45411zzc), Integer.valueOf(this.f45412zzd), this.f45413zze, this.f45414zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f45409zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45410zzb, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f45411zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f45412zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f45413zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45414zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzmc zza() {
        return this.f45410zzb;
    }

    public final String zzb() {
        return this.f45409zza;
    }

    public final boolean zzc() {
        return this.f45411zzc;
    }

    @SafeParcelable.Constructor
    public zzlj(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) zzmc zzmcVar, @SafeParcelable.Param(id = 3) boolean z, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) zzoc zzocVar, @SafeParcelable.Param(id = 6) com.google.android.gms.nearby.connection.zzo zzoVar) {
        this.f45409zza = str;
        this.f45410zzb = zzmcVar;
        this.f45411zzc = z;
        this.f45412zzd = i;
        this.f45413zze = zzocVar;
        this.f45414zzf = zzoVar;
    }
}
