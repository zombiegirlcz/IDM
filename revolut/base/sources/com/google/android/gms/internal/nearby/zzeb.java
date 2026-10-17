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
@SafeParcelable.Class(creator = "IsEnabledParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeb> CREATOR = new zzec();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBooleanCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private zzco f45128zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBooleanResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzcp f45129zzb;

    private zzeb() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj2;
            if (Objects.equal(this.f45129zzb, zzebVar.f45129zzb) && Objects.equal(this.f45128zza, zzebVar.f45128zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45129zzb, this.f45128zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzcp zzcpVar = this.f45129zzb;
        SafeParcelWriter.writeIBinder(parcel, 1, zzcpVar == null ? null : zzcpVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45128zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzeb(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2) {
        zzcp zzcpVar;
        zzco zzcmVar = null;
        if (iBinder == null) {
            zzcpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanResultListener");
            zzcpVar = iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcp(iBinder);
        }
        if (iBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IBooleanCallback");
            zzcmVar = iInterfaceQueryLocalInterface2 instanceof zzco ? (zzco) iInterfaceQueryLocalInterface2 : new zzcm(iBinder2);
        }
        this.f45129zzb = zzcpVar;
        this.f45128zza = zzcmVar;
    }

    public /* synthetic */ zzeb(zzea zzeaVar) {
    }
}
