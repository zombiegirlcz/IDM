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
@SafeParcelable.Class(creator = "GetPayGlobalActionCardsResponseCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCards", id = 1)
    private zzbt[] f48288zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSelectedIndex", id = 2)
    private int f48289zzb;

    private zzac() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzac) {
            zzac zzacVar = (zzac) obj2;
            if (Arrays.equals(this.f48288zza, zzacVar.f48288zza) && Objects.equal(Integer.valueOf(this.f48289zzb), Integer.valueOf(zzacVar.f48289zzb))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f48288zza)), Integer.valueOf(this.f48289zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.f48288zza, i, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f48289zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(id = 1) zzbt[] zzbtVarArr, @SafeParcelable.Param(id = 2) int i) {
        this.f48288zza = zzbtVarArr;
        this.f48289zzb = i;
    }
}
