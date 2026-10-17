package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TransactionCreator")
public final class zzcx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcx> CREATOR = new zzcy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCoreTransaction", id = 1)
    private byte[] f48376zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHash", id = 2)
    private long f48377zzb;

    private zzcx() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcx) {
            zzcx zzcxVar = (zzcx) obj2;
            if (Arrays.equals(this.f48376zza, zzcxVar.f48376zza) && Objects.equal(Long.valueOf(this.f48377zzb), Long.valueOf(zzcxVar.f48377zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f48376zza)), Long.valueOf(this.f48377zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f48376zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f48377zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcx(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) long j2) {
        this.f48376zza = bArr;
        this.f48377zzb = j2;
    }
}
