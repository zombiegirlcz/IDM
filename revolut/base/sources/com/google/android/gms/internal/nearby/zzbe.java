package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GetDailySummariesParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new zzbf();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDailySummaryListCallbackAsBinder", id = 1, type = "android.os.IBinder")
    private zzcs f45101zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDailySummariesConfig", id = 2)
    private DailySummariesConfig f45102zzb;

    private zzbe() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzbe) {
            zzbe zzbeVar = (zzbe) obj2;
            if (Objects.equal(this.f45101zza, zzbeVar.f45101zza) && Objects.equal(this.f45102zzb, zzbeVar.f45102zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45101zza, this.f45102zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.f45101zza.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45102zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbe(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) DailySummariesConfig dailySummariesConfig) {
        zzcs zzcqVar;
        if (iBinder == null) {
            zzcqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IDailySummaryListCallback");
            zzcqVar = iInterfaceQueryLocalInterface instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface : new zzcq(iBinder);
        }
        this.f45101zza = zzcqVar;
        this.f45102zzb = dailySummariesConfig;
    }

    public /* synthetic */ zzbe(zzbd zzbdVar) {
    }
}
