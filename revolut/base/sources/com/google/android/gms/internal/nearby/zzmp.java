package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SendPayloadParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzmp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmp> CREATOR = new zzmq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45471zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointIds", id = 2)
    private String[] f45472zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayload", id = 3)
    private zzmc f45473zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSendReliably", id = 4)
    private boolean f45474zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 5)
    private final int f45475zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 6)
    private zzoc f45476zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 7)
    private com.google.android.gms.nearby.connection.zzo f45477zzg;

    private zzmp() {
        this.f45475zze = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzmp) {
            zzmp zzmpVar = (zzmp) obj2;
            if (Objects.equal(this.f45471zza, zzmpVar.f45471zza) && Arrays.equals(this.f45472zzb, zzmpVar.f45472zzb) && Objects.equal(this.f45473zzc, zzmpVar.f45473zzc) && Objects.equal(Boolean.valueOf(this.f45474zzd), Boolean.valueOf(zzmpVar.f45474zzd)) && Objects.equal(Integer.valueOf(this.f45475zze), Integer.valueOf(zzmpVar.f45475zze)) && Objects.equal(this.f45476zzf, zzmpVar.f45476zzf) && Objects.equal(this.f45477zzg, zzmpVar.f45477zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45471zza, Integer.valueOf(Arrays.hashCode(this.f45472zzb)), this.f45473zzc, Boolean.valueOf(this.f45474zzd), Integer.valueOf(this.f45475zze), this.f45476zzf, this.f45477zzg);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45471zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f45472zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f45473zzc, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45474zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f45475zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f45476zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f45477zzg, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzmp(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) String[] strArr, @SafeParcelable.Param(id = 3) zzmc zzmcVar, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) zzoc zzocVar, @SafeParcelable.Param(id = 7) com.google.android.gms.nearby.connection.zzo zzoVar) {
        zzkk zzkiVar;
        if (iBinder == null) {
            zzkiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkiVar = iInterfaceQueryLocalInterface instanceof zzkk ? (zzkk) iInterfaceQueryLocalInterface : new zzki(iBinder);
        }
        this.f45471zza = zzkiVar;
        this.f45472zzb = strArr;
        this.f45473zzc = zzmcVar;
        this.f45474zzd = z;
        this.f45475zze = i;
        this.f45476zzf = zzocVar;
        this.f45477zzg = zzoVar;
    }
}
