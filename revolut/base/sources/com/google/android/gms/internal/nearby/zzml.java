package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SendConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
public final class zzml extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzml> CREATOR = new zzmm();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultListenerAsBinder", id = 1, type = "android.os.IBinder")
    private zzkk f45458zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionEventListenerAsBinder", id = 2, type = "android.os.IBinder")
    private zzjt f45459zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionResponseListenerAsBinder", id = 3, type = "android.os.IBinder")
    private zzjz f45460zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getName", id = 4)
    private String f45461zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRemoteEndpointId", id = 5)
    private String f45462zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHandshakeData", id = 6)
    private byte[] f45463zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionLifecycleListenerAsBinder", id = 7, type = "android.os.IBinder")
    private zzjw f45464zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getEndpointInfo", id = 8)
    private byte[] f45465zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOptions", id = 9)
    private ConnectionOptions f45466zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getDeviceType", id = 10)
    private final int f45467zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPresenceDevice", id = 11)
    private zzoc f45468zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConnectionsDevice", id = 14)
    private com.google.android.gms.nearby.connection.zzo f45469zzl;

    @SafeParcelable.Field(getter = "getLocalDeviceInfo", id = 12)
    private byte[] zzm;

    @SafeParcelable.Field(getter = "getServiceId", id = 13)
    private String zzn;

    private zzml() {
        this.f45467zzj = 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzml) {
            zzml zzmlVar = (zzml) obj2;
            if (Objects.equal(this.f45458zza, zzmlVar.f45458zza) && Objects.equal(this.f45459zzb, zzmlVar.f45459zzb) && Objects.equal(this.f45460zzc, zzmlVar.f45460zzc) && Objects.equal(this.f45461zzd, zzmlVar.f45461zzd) && Objects.equal(this.f45462zze, zzmlVar.f45462zze) && Arrays.equals(this.f45463zzf, zzmlVar.f45463zzf) && Objects.equal(this.f45464zzg, zzmlVar.f45464zzg) && Arrays.equals(this.f45465zzh, zzmlVar.f45465zzh) && Objects.equal(this.f45466zzi, zzmlVar.f45466zzi) && Objects.equal(Integer.valueOf(this.f45467zzj), Integer.valueOf(zzmlVar.f45467zzj)) && Objects.equal(this.f45468zzk, zzmlVar.f45468zzk) && Objects.equal(this.f45469zzl, zzmlVar.f45469zzl) && Arrays.equals(this.zzm, zzmlVar.zzm) && Objects.equal(this.zzn, zzmlVar.zzn)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45458zza, this.f45459zzb, this.f45460zzc, this.f45461zzd, this.f45462zze, Integer.valueOf(Arrays.hashCode(this.f45463zzf)), this.f45464zzg, Integer.valueOf(Arrays.hashCode(this.f45465zzh)), this.f45466zzi, Integer.valueOf(this.f45467zzj), this.f45468zzk, this.f45469zzl, Integer.valueOf(Arrays.hashCode(this.zzm)), this.zzn);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzkk zzkkVar = this.f45458zza;
        SafeParcelWriter.writeIBinder(parcel, 1, zzkkVar == null ? null : zzkkVar.asBinder(), false);
        zzjt zzjtVar = this.f45459zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, zzjtVar == null ? null : zzjtVar.asBinder(), false);
        zzjz zzjzVar = this.f45460zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzjzVar == null ? null : zzjzVar.asBinder(), false);
        SafeParcelWriter.writeString(parcel, 4, this.f45461zzd, false);
        SafeParcelWriter.writeString(parcel, 5, this.f45462zze, false);
        SafeParcelWriter.writeByteArray(parcel, 6, this.f45463zzf, false);
        zzjw zzjwVar = this.f45464zzg;
        SafeParcelWriter.writeIBinder(parcel, 7, zzjwVar != null ? zzjwVar.asBinder() : null, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.f45465zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f45466zzi, i, false);
        SafeParcelWriter.writeInt(parcel, 10, this.f45467zzj);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f45468zzk, i, false);
        SafeParcelWriter.writeByteArray(parcel, 12, this.zzm, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f45469zzl, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzml(@SafeParcelable.Param(id = 1) IBinder iBinder, @SafeParcelable.Param(id = 2) IBinder iBinder2, @SafeParcelable.Param(id = 3) IBinder iBinder3, @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) byte[] bArr, @SafeParcelable.Param(id = 7) IBinder iBinder4, @SafeParcelable.Param(id = 8) byte[] bArr2, @SafeParcelable.Param(id = 9) ConnectionOptions connectionOptions, @SafeParcelable.Param(id = 10) int i, @SafeParcelable.Param(id = 11) zzoc zzocVar, @SafeParcelable.Param(id = 14) com.google.android.gms.nearby.connection.zzo zzoVar, @SafeParcelable.Param(id = 12) byte[] bArr3, @SafeParcelable.Param(id = 13) String str3) {
        zzkk zzkiVar;
        zzjt zzjrVar;
        zzjz zzjxVar;
        zzjw zzjuVar = null;
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
        if (iBinder3 == null) {
            zzjxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionResponseListener");
            zzjxVar = iInterfaceQueryLocalInterface3 instanceof zzjz ? (zzjz) iInterfaceQueryLocalInterface3 : new zzjx(iBinder3);
        }
        if (iBinder4 != null) {
            IInterface iInterfaceQueryLocalInterface4 = iBinder4.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            zzjuVar = iInterfaceQueryLocalInterface4 instanceof zzjw ? (zzjw) iInterfaceQueryLocalInterface4 : new zzju(iBinder4);
        }
        this.f45458zza = zzkiVar;
        this.f45459zzb = zzjrVar;
        this.f45460zzc = zzjxVar;
        this.f45461zzd = str;
        this.f45462zze = str2;
        this.f45463zzf = bArr;
        this.f45464zzg = zzjuVar;
        this.f45465zzh = bArr2;
        this.f45466zzi = connectionOptions;
        this.f45467zzj = i;
        this.f45468zzk = zzocVar;
        this.f45469zzl = zzoVar;
        this.zzm = bArr3;
        this.zzn = str3;
    }
}
