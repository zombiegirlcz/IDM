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
@SafeParcelable.Class(creator = "AcceptConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzfj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfj> CREATOR = new zzfk();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45162zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", id = 2, type = "android.os.IBinder")
    private zzjt f45163zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 3)
    private String f45164zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 4)
    private byte[] f45165zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayloadListenerAsBinder", id = 5, type = "android.os.IBinder")
    private zzkh f45166zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 6)
    private final int f45167zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 7)
    private zzoc f45168zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 8)
    private com.google.android.gms.nearby.connection.zzo f45169zzh;

    private zzfj() {
        this.f45167zzf = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzfj) {
            zzfj zzfjVar = (zzfj) obj2;
            if (Objects.equal(this.f45162zza, zzfjVar.f45162zza) && Objects.equal(this.f45163zzb, zzfjVar.f45163zzb) && Objects.equal(this.f45164zzc, zzfjVar.f45164zzc) && Arrays.equals(this.f45165zzd, zzfjVar.f45165zzd) && Objects.equal(this.f45166zze, zzfjVar.f45166zze) && Objects.equal(Integer.valueOf(this.f45167zzf), Integer.valueOf(zzfjVar.f45167zzf)) && Objects.equal(this.f45168zzg, zzfjVar.f45168zzg) && Objects.equal(this.f45169zzh, zzfjVar.f45169zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45162zza, this.f45163zzb, this.f45164zzc, Integer.valueOf(Arrays.hashCode(this.f45165zzd)), this.f45166zze, Integer.valueOf(this.f45167zzf), this.f45168zzg, this.f45169zzh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45162zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        zzjt zzjtVar = this.f45163zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzjtVar == null ? null : zzjtVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 3, this.f45164zzc, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f45165zzd, false);
        zzkh zzkhVar = this.f45166zze;
        SafeParcelWriter.writeIBinder(parcel, 5, zzkhVar != null ? zzkhVar.asBinder() : null, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f45167zzf);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f45168zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f45169zzh, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfj(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) byte[] bArr, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) int i, @SafeParcelable.Param(id = 7) zzoc zzocVar, @SafeParcelable.Param(id = 8) com.google.android.gms.nearby.connection.zzo zzoVar) {
        zzkk zzkiVar;
        zzjt zzjrVar;
        zzkh zzkfVar = null;
        if (iBinder == null) {
            zzkiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            zzkiVar = iInterfaceQueryLocalInterface instanceof zzkk ? (zzkk) iInterfaceQueryLocalInterface : new zzki(iBinder);
        }
        if (iBinder2 == null) {
            zzjrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionEventListener");
            zzjrVar = iInterfaceQueryLocalInterface2 instanceof zzjt ? (zzjt) iInterfaceQueryLocalInterface2 : new zzjr(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IPayloadListener");
            zzkfVar = iInterfaceQueryLocalInterface3 instanceof zzkh ? (zzkh) iInterfaceQueryLocalInterface3 : new zzkf(iBinder3);
        }
        this.f45162zza = zzkiVar;
        this.f45163zzb = zzjrVar;
        this.f45164zzc = str;
        this.f45165zzd = bArr;
        this.f45166zze = zzkfVar;
        this.f45167zzf = i;
        this.f45168zzg = zzocVar;
        this.f45169zzh = zzoVar;
    }
}
