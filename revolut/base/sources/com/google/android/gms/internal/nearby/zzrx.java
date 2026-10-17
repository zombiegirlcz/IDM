package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UwbAddressParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzrx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzrx> CREATOR = new zzry();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private byte[] f45650zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 2)
    private int f45651zzb;

    private zzrx() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzrx) {
            zzrx zzrxVar = (zzrx) obj2;
            if (Arrays.equals(this.f45650zza, zzrxVar.f45650zza) && Objects.equal(Integer.valueOf(this.f45651zzb), Integer.valueOf(zzrxVar.f45651zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f45650zza)), Integer.valueOf(this.f45651zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f45650zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45651zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final byte[] zzb() {
        return this.f45650zza;
    }

    public /* synthetic */ zzrx(zzrw zzrwVar) {
    }

    @SafeParcelable.Constructor
    public zzrx(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) int i) {
        this.f45650zza = bArr;
        this.f45651zzb = i;
    }
}
