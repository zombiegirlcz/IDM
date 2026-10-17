package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SeCardLoadingStateDataCreator")
public final class zzcf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcf> CREATOR = new zzcg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLoadingState", id = 1)
    private int f48355zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGooglePaymentMethodId", id = 2)
    private zzas f48356zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSePrepaidCardId", id = 3)
    private zzch f48357zzc;

    private zzcf() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcf) {
            zzcf zzcfVar = (zzcf) obj2;
            if (Objects.equal(Integer.valueOf(this.f48355zza), Integer.valueOf(zzcfVar.f48355zza)) && Objects.equal(this.f48356zzb, zzcfVar.f48356zzb) && Objects.equal(this.f48357zzc, zzcfVar.f48357zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48355zza), this.f48356zzb, this.f48357zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48355zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48356zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48357zzc, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcf(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzas zzasVar, @SafeParcelable.Param(id = 3) zzch zzchVar) {
        this.f48355zza = i;
        this.f48356zzb = zzasVar;
        this.f48357zzc = zzchVar;
    }
}
