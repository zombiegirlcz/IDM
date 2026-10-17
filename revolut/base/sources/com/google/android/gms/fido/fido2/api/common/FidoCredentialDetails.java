package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fido.zzgx;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "FidoCredentialDetailsCreator")
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserName", id = 1)
    private final String f38513zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserDisplayName", id = 2)
    private final String f38514zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserId", id = 3, type = "byte[]")
    private final zzgx f38515zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getCredentialId", id = 4, type = "byte[]")
    private final zzgx f38516zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsDiscoverable", id = 5)
    private final boolean f38517zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsPaymentCredential", id = 6)
    private final boolean f38518zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "0", getter = "getLastUsedTime", id = 7)
    private final long f38519zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getOwningAccount", id = 8)
    private final Account f38520zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getIsCryptauthSigninCredentialForAccount", id = 9)
    private final boolean f38521zzi;

    @SafeParcelable.Constructor
    public FidoCredentialDetails(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) byte[] bArr, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z3, @SafeParcelable.Param(id = 7) long j2, @SafeParcelable.Param(id = 8) Account account, @SafeParcelable.Param(id = 9) boolean z4) {
        zzgx zzgxVarZzl = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
        zzgx zzgxVar = zzgx.f39500zzb;
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        this.f38513zza = str;
        this.f38514zzb = str2;
        this.f38515zzc = zzgxVarZzl;
        this.f38516zzd = zzgxVarZzl2;
        this.f38517zze = z;
        this.f38518zzf = z3;
        this.f38519zzg = j2;
        this.f38520zzh = account;
        this.f38521zzi = z4;
    }

    @NonNull
    public static FidoCredentialDetails deserializeFromBytes(@NonNull byte[] bArr) {
        return (FidoCredentialDetails) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj2;
        return Objects.equal(this.f38513zza, fidoCredentialDetails.f38513zza) && Objects.equal(this.f38514zzb, fidoCredentialDetails.f38514zzb) && Objects.equal(this.f38515zzc, fidoCredentialDetails.f38515zzc) && Objects.equal(this.f38516zzd, fidoCredentialDetails.f38516zzd) && this.f38517zze == fidoCredentialDetails.f38517zze && this.f38518zzf == fidoCredentialDetails.f38518zzf && this.f38521zzi == fidoCredentialDetails.f38521zzi && this.f38519zzg == fidoCredentialDetails.f38519zzg && Objects.equal(this.f38520zzh, fidoCredentialDetails.f38520zzh);
    }

    @NonNull
    public byte[] getCredentialId() {
        return this.f38516zzd.zzm();
    }

    public zzgx getCredentialIdAsByteString() {
        return this.f38516zzd;
    }

    public boolean getIsDiscoverable() {
        return this.f38517zze;
    }

    public boolean getIsPaymentCredential() {
        return this.f38518zzf;
    }

    public long getLastUsedTime() {
        return this.f38519zzg;
    }

    public String getUserDisplayName() {
        return this.f38514zzb;
    }

    public byte[] getUserId() {
        zzgx zzgxVar = this.f38515zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public zzgx getUserIdAsByteString() {
        return this.f38515zzc;
    }

    public String getUserName() {
        return this.f38513zza;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38513zza, this.f38514zzb, this.f38515zzc, this.f38516zzd, Boolean.valueOf(this.f38517zze), Boolean.valueOf(this.f38518zzf), Boolean.valueOf(this.f38521zzi), Long.valueOf(this.f38519zzg), this.f38520zzh);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getUserName(), false);
        SafeParcelWriter.writeString(parcel, 2, getUserDisplayName(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getUserId(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getCredentialId(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, getIsDiscoverable());
        SafeParcelWriter.writeBoolean(parcel, 6, getIsPaymentCredential());
        SafeParcelWriter.writeLong(parcel, 7, getLastUsedTime());
        SafeParcelWriter.writeParcelable(parcel, 8, this.f38520zzh, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.f38521zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
