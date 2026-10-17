package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "OnStartAdvertisingResultParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzln extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzln> CREATOR = new zzlo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCode", id = 1)
    private int f45420zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLocalEndpointName", id = 2)
    private String f45421zzb;

    private zzln() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzln) {
            zzln zzlnVar = (zzln) obj2;
            if (Objects.equal(Integer.valueOf(this.f45420zza), Integer.valueOf(zzlnVar.f45420zza)) && Objects.equal(this.f45421zzb, zzlnVar.f45421zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f45420zza), this.f45421zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f45420zza);
        SafeParcelWriter.writeString(parcel, 2, this.f45421zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.f45420zza;
    }

    public final String zzb() {
        return this.f45421zzb;
    }

    @SafeParcelable.Constructor
    public zzln(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str) {
        this.f45420zza = i;
        this.f45421zzb = str;
    }
}
