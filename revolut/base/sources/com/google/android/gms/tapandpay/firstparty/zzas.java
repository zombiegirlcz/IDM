package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SeTransactionInfoCreator")
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new zzat();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(id = 1)
    final long f48530zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final BigDecimal f48531zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f48532zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final long f48533zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final int f48534zze;

    @SafeParcelable.Constructor
    public zzas(@SafeParcelable.Param(id = 1) long j2, @SafeParcelable.Param(id = 2) BigDecimal bigDecimal, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) long j3, @SafeParcelable.Param(id = 5) int i) {
        this.f48530zza = j2;
        this.f48531zzb = bigDecimal;
        this.f48532zzc = str;
        this.f48533zzd = j3;
        this.f48534zze = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzas) {
            zzas zzasVar = (zzas) obj2;
            if (this.f48530zza == zzasVar.f48530zza && Objects.equal(this.f48531zzb, zzasVar.f48531zzb) && Objects.equal(this.f48532zzc, zzasVar.f48532zzc) && this.f48533zzd == zzasVar.f48533zzd && this.f48534zze == zzasVar.f48534zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f48530zza), this.f48531zzb, this.f48532zzc, Long.valueOf(this.f48533zzd), Integer.valueOf(this.f48534zze));
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("transactionId", Long.valueOf(this.f48530zza)).add("amount", this.f48531zzb).add("currency", this.f48532zzc).add("transactionTimeMillis", Long.valueOf(this.f48533zzd)).add("type", Integer.valueOf(this.f48534zze)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.f48530zza);
        SafeParcelWriter.writeBigDecimal(parcel, 2, this.f48531zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.f48532zzc, false);
        SafeParcelWriter.writeLong(parcel, 4, this.f48533zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f48534zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
