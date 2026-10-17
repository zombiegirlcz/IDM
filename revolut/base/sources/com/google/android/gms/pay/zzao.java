package com.google.android.gms.pay;

import android.graphics.Bitmap;
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
@SafeParcelable.Class(creator = "GetTransitCardsResponseCreator")
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitCard", id = 1)
    private zzcz[] f48298zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPayLogoImage", id = 2)
    private Bitmap f48299zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDarkPayLogoImage", id = 3)
    private Bitmap f48300zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTransitPaymentOptions", id = 4)
    private zzdd[] f48301zzd;

    private zzao() {
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof zzao) {
            zzao zzaoVar = (zzao) obj2;
            if (Arrays.equals(this.f48298zza, zzaoVar.f48298zza) && Objects.equal(this.f48299zzb, zzaoVar.f48299zzb) && Objects.equal(this.f48300zzc, zzaoVar.f48300zzc) && Arrays.equals(this.f48301zzd, zzaoVar.f48301zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f48298zza)), this.f48299zzb, this.f48300zzc, Integer.valueOf(Arrays.hashCode(this.f48301zzd)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 1, this.f48298zza, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48299zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f48300zzc, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f48301zzd, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(id = 1) zzcz[] zzczVarArr, @SafeParcelable.Param(id = 2) Bitmap bitmap, @SafeParcelable.Param(id = 3) Bitmap bitmap2, @SafeParcelable.Param(id = 4) zzdd[] zzddVarArr) {
        this.f48298zza = zzczVarArr;
        this.f48299zzb = bitmap;
        this.f48300zzc = bitmap2;
        this.f48301zzd = zzddVarArr;
    }
}
