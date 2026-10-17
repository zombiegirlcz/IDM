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
@SafeParcelable.Class(creator = "NotificationSettingsCreator")
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new zzam();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final boolean f48524zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final boolean f48525zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final boolean f48526zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final int f48527zzd;

    @SafeParcelable.Constructor
    public zzal(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) int i) {
        this.f48524zza = z;
        this.f48525zzb = z3;
        this.f48526zzc = z4;
        this.f48527zzd = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzal) {
            zzal zzalVar = (zzal) obj2;
            if (this.f48524zza == zzalVar.f48524zza && this.f48525zzb == zzalVar.f48525zzb && this.f48526zzc == zzalVar.f48526zzc && this.f48527zzd == zzalVar.f48527zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f48524zza), Boolean.valueOf(this.f48525zzb), Boolean.valueOf(this.f48526zzc), Integer.valueOf(this.f48527zzd));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactions", Boolean.valueOf(this.f48524zza)).add("plasticTransactions", Boolean.valueOf(this.f48525zzb)).add("promotions", Boolean.valueOf(this.f48526zzc)).add("bitMask", Integer.valueOf(this.f48527zzd)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f48524zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48525zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f48526zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.f48527zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
