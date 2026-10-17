package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zznh;
import com.google.android.gms.internal.nearby.zzni;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "UpdateCreator")
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Update> CREATOR = new zzci();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f48077zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final int f48078zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(id = 3)
    public final Message f48079zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    public final zze f48080zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    public final zza f48081zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    public final zzni f48082zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(id = 7)
    public final byte[] f48083zzg;

    @SafeParcelable.Constructor
    public Update(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) Message message, @SafeParcelable.Param(id = 4) zze zzeVar, @SafeParcelable.Param(id = 5) zza zzaVar, @SafeParcelable.Param(id = 6) zzni zzniVar, @SafeParcelable.Param(id = 7) byte[] bArr) {
        this.f48077zza = i;
        boolean zZzb = zzb(i2, 2);
        this.f48078zzb = true == zZzb ? 2 : i2;
        this.f48079zzc = message;
        this.f48080zzd = true == zZzb ? null : zzeVar;
        this.f48081zze = true == zZzb ? null : zzaVar;
        this.f48082zzf = true == zZzb ? null : zzniVar;
        this.f48083zzg = true == zZzb ? null : bArr;
    }

    public static boolean zzb(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Update)) {
            return false;
        }
        Update update = (Update) obj2;
        return this.f48078zzb == update.f48078zzb && Objects.equal(this.f48079zzc, update.f48079zzc) && Objects.equal(this.f48080zzd, update.f48080zzd) && Objects.equal(this.f48081zze, update.f48081zze) && Objects.equal(this.f48082zzf, update.f48082zzf) && Arrays.equals(this.f48083zzg, update.f48083zzg);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48078zzb), this.f48079zzc, this.f48080zzd, this.f48081zze, this.f48082zzf, this.f48083zzg);
    }

    @NonNull
    public final String toString() {
        ArraySet arraySet = new ArraySet();
        if (zzb(this.f48078zzb, 1)) {
            arraySet.add("FOUND");
        }
        if (zzb(this.f48078zzb, 2)) {
            arraySet.add("LOST");
        }
        if (zzb(this.f48078zzb, 4)) {
            arraySet.add("DISTANCE");
        }
        if (zzb(this.f48078zzb, 8)) {
            arraySet.add("BLE_SIGNAL");
        }
        if (zzb(this.f48078zzb, 16)) {
            arraySet.add("DEVICE");
        }
        if (zzb(this.f48078zzb, 32)) {
            arraySet.add("BLE_RECORD");
        }
        String string = arraySet.toString();
        Message message = this.f48079zzc;
        zze zzeVar = this.f48080zzd;
        zza zzaVar = this.f48081zze;
        zzni zzniVar = this.f48082zzf;
        byte[] bArr = this.f48083zzg;
        String strValueOf = String.valueOf(message);
        String strValueOf2 = String.valueOf(zzeVar);
        String strValueOf3 = String.valueOf(zzaVar);
        String strValueOf4 = String.valueOf(zzniVar);
        String strValueOf5 = String.valueOf(zznh.zza(bArr));
        StringBuilder sbM = a.m("Update{types=", string, ", message=", strValueOf, ", distance=");
        j6.a.D(sbM, strValueOf2, ", bleSignal=", strValueOf3, ", device=");
        return j6.a.w(sbM, strValueOf4, ", bleRecord=", strValueOf5, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.f48077zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.f48078zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48079zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48080zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f48081zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48082zzf, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f48083zzg, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(int i) {
        return zzb(this.f48078zzb, i);
    }
}
