package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "RangingControleeParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqr> CREATOR = new zzqs();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private zzrx f45609zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubSessionId", id = 2)
    private int f45610zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSubSessionKey", id = 3)
    private byte[] f45611zzc;

    private zzqr() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqr) {
            zzqr zzqrVar = (zzqr) obj2;
            if (Objects.equal(this.f45609zza, zzqrVar.f45609zza) && Objects.equal(Integer.valueOf(this.f45610zzb), Integer.valueOf(zzqrVar.f45610zzb)) && Arrays.equals(this.f45611zzc, zzqrVar.f45611zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45609zza, Integer.valueOf(this.f45610zzb), Integer.valueOf(Arrays.hashCode(this.f45611zzc)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f45609zza, i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f45610zzb);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45611zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ zzqr(zzqq zzqqVar) {
    }

    @SafeParcelable.Constructor
    public zzqr(@SafeParcelable.Param(id = 1) zzrx zzrxVar, @SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) byte[] bArr) {
        this.f45609zza = zzrxVar;
        this.f45610zzb = i;
        this.f45611zzc = bArr;
    }
}
