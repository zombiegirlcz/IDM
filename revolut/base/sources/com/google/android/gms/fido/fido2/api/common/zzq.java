package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "CableAuthenticationDataCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getVersion", id = 1)
    private final long f38635zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getClientEid", id = 2, type = "byte[]")
    private final zzgx f38636zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorEid", id = 3, type = "byte[]")
    private final zzgx f38637zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getSessionPreKey", id = 4, type = "byte[]")
    private final zzgx f38638zzd;

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 1) long j2, @NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.f39500zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.f38635zza = j2;
        this.f38636zzb = (zzgx) Preconditions.checkNotNull(zzgxVarZzl);
        this.f38637zzc = (zzgx) Preconditions.checkNotNull(zzgxVarZzl2);
        this.f38638zzd = (zzgx) Preconditions.checkNotNull(zzgxVarZzl3);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj2;
        return this.f38635zza == zzqVar.f38635zza && Objects.equal(this.f38636zzb, zzqVar.f38636zzb) && Objects.equal(this.f38637zzc, zzqVar.f38637zzc) && Objects.equal(this.f38638zzd, zzqVar.f38638zzd);
    }

    public final int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f38635zza), this.f38636zzb, this.f38637zzc, this.f38638zzd);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j2 = this.f38635zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, j2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.f38636zzb.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f38637zzc.zzm(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f38638zzd.zzm(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
