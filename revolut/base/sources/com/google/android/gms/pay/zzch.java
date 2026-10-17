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
@SafeParcelable.Class(creator = "SePrepaidCardIdCreator")
public final class zzch extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzch> CREATOR = new zzci();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceProvider", id = 1)
    private zzcj f48358zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServiceProviderCardId", id = 2)
    private String f48359zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCid", id = 3)
    private String f48360zzc;

    private zzch() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzch) {
            zzch zzchVar = (zzch) obj2;
            if (Objects.equal(this.f48358zza, zzchVar.f48358zza) && Objects.equal(this.f48359zzb, zzchVar.f48359zzb) && Objects.equal(this.f48360zzc, zzchVar.f48360zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48358zza, this.f48359zzb, this.f48360zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f48358zza, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f48359zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48360zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzch(@SafeParcelable.Param(id = 1) zzcj zzcjVar, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.f48358zza = zzcjVar;
        this.f48359zzb = str;
        this.f48360zzc = str2;
    }
}
