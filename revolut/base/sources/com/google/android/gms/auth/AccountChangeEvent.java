package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AccountChangeEventCreator")
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.VersionField(id = 1)
    final int f37267zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(id = 2)
    final long f37268zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(id = 3)
    final String f37269zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(id = 4)
    final int f37270zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(id = 5)
    final int f37271zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(id = 6)
    final String f37272zzf;

    @SafeParcelable.Constructor
    public AccountChangeEvent(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) String str2) {
        this.f37267zza = i;
        this.f37268zzb = j2;
        this.f37269zzc = (String) Preconditions.checkNotNull(str);
        this.f37270zzd = i2;
        this.f37271zze = i3;
        this.f37272zzf = str2;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj2;
        return this.f37267zza == accountChangeEvent.f37267zza && this.f37268zzb == accountChangeEvent.f37268zzb && Objects.equal(this.f37269zzc, accountChangeEvent.f37269zzc) && this.f37270zzd == accountChangeEvent.f37270zzd && this.f37271zze == accountChangeEvent.f37271zze && Objects.equal(this.f37272zzf, accountChangeEvent.f37272zzf);
    }

    @NonNull
    public String getAccountName() {
        return this.f37269zzc;
    }

    @NonNull
    public String getChangeData() {
        return this.f37272zzf;
    }

    public int getChangeType() {
        return this.f37270zzd;
    }

    public int getEventIndex() {
        return this.f37271zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f37267zza), Long.valueOf(this.f37268zzb), this.f37269zzc, Integer.valueOf(this.f37270zzd), Integer.valueOf(this.f37271zze), this.f37272zzf);
    }

    @NonNull
    public String toString() {
        int i = this.f37270zzd;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f37269zzc;
        String str3 = this.f37272zzf;
        int i2 = this.f37271zze;
        StringBuilder sbM = a.m("AccountChangeEvent {accountName = ", str2, ", changeType = ", str, ", changeData = ");
        sbM.append(str3);
        sbM.append(", eventIndex = ");
        sbM.append(i2);
        sbM.append("}");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f37267zza);
        SafeParcelWriter.writeLong(parcel, 2, this.f37268zzb);
        SafeParcelWriter.writeString(parcel, 3, this.f37269zzc, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f37270zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.f37271zze);
        SafeParcelWriter.writeString(parcel, 6, this.f37272zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AccountChangeEvent(long j2, @NonNull String str, int i, int i2, @NonNull String str2) {
        this.f37267zza = 1;
        this.f37268zzb = j2;
        this.f37269zzc = (String) Preconditions.checkNotNull(str);
        this.f37270zzd = i;
        this.f37271zze = i2;
        this.f37272zzf = str2;
    }
}
