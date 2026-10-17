package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "NearbyDeviceCreator")
public final class zzni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzni> CREATOR = new zznj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final zzni f45511zza = new zzni(1, "", null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1000)
    final int f45512zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandle", id = 3)
    private final String f45513zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothAddress", id = 6)
    private final String f45514zzd;

    @SafeParcelable.Constructor
    public zzni(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 6) String str2) {
        this.f45512zzb = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.f45513zzc = str == null ? "" : str;
        this.f45514zzd = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzni)) {
            return false;
        }
        zzni zzniVar = (zzni) obj2;
        return Objects.equal(this.f45513zzc, zzniVar.f45513zzc) && Objects.equal(this.f45514zzd, zzniVar.f45514zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45513zzc, this.f45514zzd);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("NearbyDevice{handle=");
        sb6.append(this.f45513zzc);
        sb6.append(", bluetoothAddress=");
        return a.i(sb6, this.f45514zzd, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.f45513zzc;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, str, false);
        SafeParcelWriter.writeString(parcel, 6, this.f45514zzd, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f45512zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
