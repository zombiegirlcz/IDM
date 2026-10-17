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
@SafeParcelable.Class(creator = "GetComplexChannelParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzow> CREATOR = new zzox();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzpy f45578zza;

    private zzow() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzow) {
            return Objects.equal(this.f45578zza, ((zzow) obj2).f45578zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45578zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45578zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzow(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzpy zzpwVar;
        if (iBinder == null) {
            zzpwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbComplexChannelResultListener");
            zzpwVar = iInterfaceQueryLocalInterface instanceof zzpy ? (zzpy) iInterfaceQueryLocalInterface : new zzpw(iBinder);
        }
        this.f45578zza = zzpwVar;
    }

    public /* synthetic */ zzow(zzov zzovVar) {
    }
}
