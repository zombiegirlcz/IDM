package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CancelPayloadParamsCreator")
public final class zzfn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfn> CREATOR = new zzfo();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45171zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayloadId", id = 2)
    private long f45172zzb;

    private zzfn() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzfn) {
            zzfn zzfnVar = (zzfn) obj2;
            if (Objects.equal(this.f45171zza, zzfnVar.f45171zza) && Objects.equal(Long.valueOf(this.f45172zzb), Long.valueOf(zzfnVar.f45172zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45171zza, Long.valueOf(this.f45172zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45171zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        SafeParcelWriter.writeLong(parcel, 2, this.f45172zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfn(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) long j2) {
        zzkk zzkiVar;
        if (iBinder == null) {
            zzkiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkiVar = iInterfaceQueryLocalInterface instanceof zzkk ? (zzkk) iInterfaceQueryLocalInterface : new zzki(iBinder);
        }
        this.f45171zza = zzkiVar;
        this.f45172zzb = j2;
    }

    public /* synthetic */ zzfn(zzfm zzfmVar) {
    }
}
