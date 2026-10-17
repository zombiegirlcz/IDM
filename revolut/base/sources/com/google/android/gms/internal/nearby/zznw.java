package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DataElementCollectionCreator")
public final class zznw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zznw> CREATOR = new zznx();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSequenceNumber", id = 1)
    private final zzoe f45528zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCastIdentity", id = 2)
    private final zznu f45529zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeduplicationHintBytes", id = 3)
    private final byte[] f45530zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeduplicationHintEnabled", id = 4)
    private final boolean f45531zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBleGattConnectivityInfoList", id = 5)
    private final List f45532zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getWifiLanConnectivityInfoList", id = 6)
    private final List f45533zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getBluetoothConnectivityInfoList", id = 7)
    private final List f45534zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUwbConnectivityCapability", id = 8)
    private final zzog f45535zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDeviceType", id = 9)
    private final zzny f45536zzi;

    @SafeParcelable.Constructor
    public zznw(@SafeParcelable.Param(id = 1) zzoe zzoeVar, @SafeParcelable.Param(id = 2) zznu zznuVar, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) List list2, @SafeParcelable.Param(id = 7) List list3, @SafeParcelable.Param(id = 8) zzog zzogVar, @SafeParcelable.Param(id = 9) zzny zznyVar) {
        this.f45528zza = zzoeVar;
        this.f45529zzb = zznuVar;
        this.f45530zzc = bArr;
        this.f45531zzd = z;
        this.f45532zze = list;
        this.f45533zzf = list2;
        this.f45534zzg = list3;
        this.f45535zzh = zzogVar;
        this.f45536zzi = zznyVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zznw) {
            zznw zznwVar = (zznw) obj2;
            if (Objects.equal(this.f45528zza, zznwVar.f45528zza) && Objects.equal(this.f45529zzb, zznwVar.f45529zzb) && Arrays.equals(this.f45530zzc, zznwVar.f45530zzc) && this.f45531zzd == zznwVar.f45531zzd && Objects.equal(this.f45532zze, zznwVar.f45532zze) && Objects.equal(this.f45533zzf, zznwVar.f45533zzf) && Objects.equal(this.f45534zzg, zznwVar.f45534zzg) && Objects.equal(this.f45535zzh, zznwVar.f45535zzh) && Objects.equal(this.f45536zzi, zznwVar.f45536zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f45528zza, this.f45529zzb, Boolean.valueOf(this.f45531zzd), this.f45532zze, this.f45533zzf, this.f45534zzg, this.f45535zzh, this.f45536zzi);
    }

    public final String toString() {
        return String.format(Locale.US, "<DataElementCollection: sequenceNumber=%s, castId=%s, deduplicationHint=%s, deduplicationHintEnabled=%s, bleGattConnectivityInfo = %s, wifiLanConnectivityInfoList = %s, bluetoothConnectivityInfoList = %s, connectivityCapability = %s, deviceType = %s>", this.f45528zza, this.f45529zzb, Arrays.toString(this.f45530zzc), Boolean.valueOf(this.f45531zzd), this.f45532zze, this.f45533zzf, this.f45534zzg, this.f45535zzh, this.f45536zzi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzoe zzoeVar = this.f45528zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, zzoeVar, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f45529zzb, i, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f45530zzc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f45531zzd);
        SafeParcelWriter.writeTypedList(parcel, 5, this.f45532zze, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f45533zzf, false);
        SafeParcelWriter.writeTypedList(parcel, 7, this.f45534zzg, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f45535zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f45536zzi, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
