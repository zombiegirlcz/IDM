package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "TokenStatusCreator")
@SafeParcelable.Reserved({1})
public final class TokenStatus extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenStatus> CREATOR = new zzay();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final zzaw f48497zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48498zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final boolean f48499zzc;

    @SafeParcelable.Constructor
    public TokenStatus(@SafeParcelable.Param(id = 2) zzaw zzawVar, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) boolean z) {
        this.f48497zza = zzawVar;
        this.f48498zzb = i;
        this.f48499zzc = z;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof TokenStatus) {
            TokenStatus tokenStatus = (TokenStatus) obj2;
            if (Objects.equal(this.f48497zza, tokenStatus.f48497zza) && this.f48498zzb == tokenStatus.f48498zzb && this.f48499zzc == tokenStatus.f48499zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48497zza, Integer.valueOf(this.f48498zzb), Boolean.valueOf(this.f48499zzc));
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("tokenReference", this.f48497zza).add("tokenState", Integer.valueOf(this.f48498zzb)).add("isSelected", Boolean.valueOf(this.f48499zzc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f48497zza, i, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f48498zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f48499zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
