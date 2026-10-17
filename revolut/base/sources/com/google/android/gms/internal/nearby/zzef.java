package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "ProvideDiagnosisKeysParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzef> CREATOR = new zzeg();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeys", id = 1)
    private List f45131zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getStatusCallbackAsBinder", id = 2, type = "android.os.IBinder")
    private IStatusCallback f45132zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getKeyFiles", id = 3)
    private List f45133zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExposureConfiguration", id = 4)
    private ExposureConfiguration f45134zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getToken", id = 5)
    private String f45135zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDiagnosisKeyFileSupplierAsBinder", id = 6, type = "android.os.IBinder")
    private zzcv f45136zzf;

    private zzef() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzef) {
            zzef zzefVar = (zzef) obj2;
            if (Objects.equal(this.f45131zza, zzefVar.f45131zza) && Objects.equal(this.f45132zzb, zzefVar.f45132zzb) && Objects.equal(this.f45133zzc, zzefVar.f45133zzc) && Objects.equal(this.f45134zzd, zzefVar.f45134zzd) && Objects.equal(this.f45135zze, zzefVar.f45135zze) && Objects.equal(this.f45136zzf, zzefVar.f45136zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45131zza, this.f45132zzb, this.f45133zzc, this.f45134zzd, this.f45135zze, this.f45136zzf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.f45131zza, false);
        SafeParcelWriter.writeIBinder(parcel, 2, this.f45132zzb.asBinder(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.f45133zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f45134zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f45135zze, false);
        zzcv zzcvVar = this.f45136zzf;
        SafeParcelWriter.writeIBinder(parcel, 6, zzcvVar == null ? null : zzcvVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public /* synthetic */ zzef(zzee zzeeVar) {
    }

    @SafeParcelable.Constructor
    public zzef(@SafeParcelable.Param(id = 1) List list, @SafeParcelable.Param(id = 2) IBinder iBinder, @SafeParcelable.Param(id = 3) List list2, @SafeParcelable.Param(id = 4) ExposureConfiguration exposureConfiguration, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) IBinder iBinder2) {
        zzcv zzctVar;
        IStatusCallback iStatusCallbackAsInterface = IStatusCallback.Stub.asInterface(iBinder);
        if (iBinder2 == null) {
            zzctVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.nearby.exposurenotification.internal.IDiagnosisKeyFileSupplier");
            zzctVar = iInterfaceQueryLocalInterface instanceof zzcv ? (zzcv) iInterfaceQueryLocalInterface : new zzct(iBinder2);
        }
        this.f45131zza = list;
        this.f45132zzb = iStatusCallbackAsInterface;
        this.f45133zzc = list2;
        this.f45134zzd = exposureConfiguration;
        this.f45135zze = str;
        this.f45136zzf = zzctVar;
    }
}
