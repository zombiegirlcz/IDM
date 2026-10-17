package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SortOrderInfoCreator")
public final class zzcp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcp> CREATOR = new zzcq();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCollectionId", id = 1)
    private int f48366zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSortItems", id = 2)
    private zzcn[] f48367zzb;

    private zzcp() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzcp) {
            zzcp zzcpVar = (zzcp) obj2;
            if (Objects.equal(Integer.valueOf(this.f48366zza), Integer.valueOf(zzcpVar.f48366zza)) && Arrays.equals(this.f48367zzb, zzcpVar.f48367zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f48366zza), Integer.valueOf(Arrays.hashCode(this.f48367zzb)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f48366zza);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f48367zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzcp(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) zzcn[] zzcnVarArr) {
        this.f48366zza = i;
        this.f48367zzb = zzcnVarArr;
    }
}
