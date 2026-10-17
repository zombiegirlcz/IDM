package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CheckContactlessEligibilityResponseCreator")
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsContactlessEligible", id = 1)
    private boolean f48562zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHasContactlessCompleted", id = 2)
    private boolean f48563zzb;

    private zzg() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzg) {
            zzg zzgVar = (zzg) obj2;
            if (Objects.equal(Boolean.valueOf(this.f48562zza), Boolean.valueOf(zzgVar.f48562zza)) && Objects.equal(Boolean.valueOf(this.f48563zzb), Boolean.valueOf(zzgVar.f48563zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f48562zza), Boolean.valueOf(this.f48563zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f48562zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f48563zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) boolean z3) {
        this.f48562zza = z;
        this.f48563zzb = z3;
    }
}
