package com.google.android.gms.tapandpay.firstparty;

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
@SafeParcelable.Class(creator = "BadgeInfoCreator")
public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new zzc();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final String f48551zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final byte[] f48552zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final int f48553zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final TokenStatus f48554zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final String f48555zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final zzaz f48556zzf;

    @SafeParcelable.Constructor
    public zzb(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) TokenStatus tokenStatus, @SafeParcelable.Param(id = 5) String str2, @SafeParcelable.Param(id = 6) zzaz zzazVar) {
        this.f48551zza = str;
        this.f48552zzb = bArr;
        this.f48553zzc = i;
        this.f48554zzd = tokenStatus;
        this.f48555zze = str2;
        this.f48556zzf = zzazVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzb) {
            zzb zzbVar = (zzb) obj2;
            if (this.f48553zzc == zzbVar.f48553zzc && Objects.equal(this.f48551zza, zzbVar.f48551zza) && Arrays.equals(this.f48552zzb, zzbVar.f48552zzb) && Objects.equal(this.f48554zzd, zzbVar.f48554zzd) && Objects.equal(this.f48555zze, zzbVar.f48555zze) && Objects.equal(this.f48556zzf, zzbVar.f48556zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f48551zza, this.f48552zzb, Integer.valueOf(this.f48553zzc), this.f48554zzd, this.f48555zze, this.f48556zzf);
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("clientTokenId", this.f48551zza);
        byte[] bArr = this.f48552zzb;
        return toStringHelperAdd.add("serverToken", bArr == null ? null : Arrays.toString(bArr)).add("cardNetwork", Integer.valueOf(this.f48553zzc)).add("tokenStatus", this.f48554zzd).add("tokenLastDigits", this.f48555zze).add("transactionInfo", this.f48556zzf).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f48551zza, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f48552zzb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f48553zzc);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f48554zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.f48555zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f48556zzf, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
