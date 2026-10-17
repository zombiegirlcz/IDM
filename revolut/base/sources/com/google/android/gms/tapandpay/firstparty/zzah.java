package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "InStoreCvmConfigCreator")
@SafeParcelable.Reserved({1})
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final boolean f48507zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48508zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final int f48509zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final int f48510zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", id = 6)
    final boolean f48511zze;

    @SafeParcelable.Constructor
    public zzah(@SafeParcelable.Param(id = 2) boolean z, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) boolean z3) {
        this.f48507zza = z;
        this.f48508zzb = i;
        this.f48509zzc = i2;
        this.f48510zzd = i3;
        this.f48511zze = z3;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzah) {
            zzah zzahVar = (zzah) obj2;
            if (this.f48507zza == zzahVar.f48507zza && this.f48508zzb == zzahVar.f48508zzb && this.f48510zzd == zzahVar.f48510zzd && this.f48509zzc == zzahVar.f48509zzc && this.f48511zze == zzahVar.f48511zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f48507zza), Integer.valueOf(this.f48508zzb), Integer.valueOf(this.f48510zzd), Integer.valueOf(this.f48509zzc), Boolean.valueOf(this.f48511zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("requireCdcvmPassing", Boolean.valueOf(this.f48507zza)).add("cdcvmExpirationInSecs", Integer.valueOf(this.f48508zzb)).add("unlockedTapLimit", Integer.valueOf(this.f48509zzc)).add("cdcvmTapLimit", Integer.valueOf(this.f48510zzd)).add("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.f48511zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48507zza);
        SafeParcelWriter.writeInt(parcel, 3, this.f48508zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.f48509zzc);
        SafeParcelWriter.writeInt(parcel, 5, this.f48510zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.f48511zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
