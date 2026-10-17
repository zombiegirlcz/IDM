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
@SafeParcelable.Class(creator = "IsAvailableParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzqb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzqb> CREATOR = new zzqc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBooleanResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzpi f45586zza;

    private zzqb() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzqb) {
            return Objects.equal(this.f45586zza, ((zzqb) obj2).f45586zza);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45586zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45586zza.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzqb(@SafeParcelable.Param(id = 1) IBinder iBinder) {
        zzpi zzpgVar;
        if (iBinder == null) {
            zzpgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
            zzpgVar = iInterfaceQueryLocalInterface instanceof zzpi ? (zzpi) iInterfaceQueryLocalInterface : new zzpg(iBinder);
        }
        this.f45586zza = zzpgVar;
    }

    public /* synthetic */ zzqb(zzqa zzqaVar) {
    }
}
