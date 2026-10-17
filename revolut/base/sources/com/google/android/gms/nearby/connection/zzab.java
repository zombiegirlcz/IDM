package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import j6.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbSenderInfoCreator")
@SafeParcelable.Reserved({1000})
public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzab> CREATOR = new zzac();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private byte[] f47851zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getChannel", id = 2)
    private int f47852zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPreambleIndex", id = 3)
    private int f47853zzc;

    private zzab() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzab) {
            zzab zzabVar = (zzab) obj2;
            if (Arrays.equals(this.f47851zza, zzabVar.f47851zza) && Objects.equal(Integer.valueOf(this.f47852zzb), Integer.valueOf(zzabVar.f47852zzb)) && Objects.equal(Integer.valueOf(this.f47853zzc), Integer.valueOf(zzabVar.f47853zzc))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f47851zza)), Integer.valueOf(this.f47852zzb), Integer.valueOf(this.f47853zzc));
    }

    public final String toString() {
        String string = Arrays.toString(this.f47851zza);
        int i = this.f47852zzb;
        return a.v(v0.a.k(i, "UwbSenderInfo{address=", string, ", channel=", ", preambleIndex="), "}", this.f47853zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f47851zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f47852zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.f47853zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzab(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) int i2) {
        this.f47851zza = bArr;
        this.f47852zzb = i;
        this.f47853zzc = i2;
    }
}
