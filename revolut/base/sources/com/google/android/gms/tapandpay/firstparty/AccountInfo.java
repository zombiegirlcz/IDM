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
@SafeParcelable.Class(creator = "AccountInfoCreator")
@SafeParcelable.Reserved({1})
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountInfo> CREATOR = new zza();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final String f48475zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48476zzb;

    @SafeParcelable.Constructor
    public AccountInfo(@NonNull @SafeParcelable.Param(id = 2) String str, @NonNull @SafeParcelable.Param(id = 3) String str2) {
        this.f48475zza = str;
        this.f48476zzb = str2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj2;
            if (Objects.equal(this.f48475zza, accountInfo.f48475zza) && Objects.equal(this.f48476zzb, accountInfo.f48476zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48475zza, this.f48476zzb);
    }

    @NonNull
    public final String toString() {
        return Objects.toStringHelper(this).add("accountId", this.f48475zza).add("accountName", this.f48476zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f48475zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48476zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
