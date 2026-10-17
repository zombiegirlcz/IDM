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
@SafeParcelable.Class(creator = "GetWalletStatusResponseCreator")
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsWalletUiAvailable", id = 1)
    private boolean f48302zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFoundIssues", id = 2)
    private int[] f48303zzb;

    private zzaq() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzaq) {
            zzaq zzaqVar = (zzaq) obj2;
            if (Objects.equal(Boolean.valueOf(this.f48302zza), Boolean.valueOf(zzaqVar.f48302zza)) && Arrays.equals(this.f48303zzb, zzaqVar.f48303zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f48302zza), Integer.valueOf(Arrays.hashCode(this.f48303zzb)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f48302zza);
        SafeParcelWriter.writeIntArray(parcel, 2, this.f48303zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzaq(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) int[] iArr) {
        this.f48302zza = z;
        this.f48303zzb = iArr;
    }
}
