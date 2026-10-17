package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticatorAssertionResponseCreator")
@SafeParcelable.Reserved({1})
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new zzj();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx f38476zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx f38477zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getAuthenticatorData", id = 4, type = "byte[]")
    private final zzgx f38478zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getSignature", id = 5, type = "byte[]")
    private final zzgx f38479zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserHandle", id = 6, type = "byte[]")
    private final zzgx f38480zze;

    @SafeParcelable.Constructor
    public AuthenticatorAssertionResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) byte[] bArr4, @SafeParcelable.Param(id = 6) byte[] bArr5) {
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.f39500zzb;
        zzgx zzgxVarZzl = zzgx.zzl(bArr6, 0, bArr6.length);
        byte[] bArr7 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzgxVarZzl2 = zzgx.zzl(bArr7, 0, bArr7.length);
        byte[] bArr8 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzgxVarZzl3 = zzgx.zzl(bArr8, 0, bArr8.length);
        byte[] bArr9 = (byte[]) Preconditions.checkNotNull(bArr4);
        zzgx zzgxVarZzl4 = zzgx.zzl(bArr9, 0, bArr9.length);
        zzgx zzgxVarZzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        this.f38476zza = (zzgx) Preconditions.checkNotNull(zzgxVarZzl);
        this.f38477zzb = (zzgx) Preconditions.checkNotNull(zzgxVarZzl2);
        this.f38478zzc = (zzgx) Preconditions.checkNotNull(zzgxVarZzl3);
        this.f38479zzd = (zzgx) Preconditions.checkNotNull(zzgxVarZzl4);
        this.f38480zze = zzgxVarZzl5;
    }

    @NonNull
    public static AuthenticatorAssertionResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAssertionResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj2;
        return Objects.equal(this.f38476zza, authenticatorAssertionResponse.f38476zza) && Objects.equal(this.f38477zzb, authenticatorAssertionResponse.f38477zzb) && Objects.equal(this.f38478zzc, authenticatorAssertionResponse.f38478zzc) && Objects.equal(this.f38479zzd, authenticatorAssertionResponse.f38479zzd) && Objects.equal(this.f38480zze, authenticatorAssertionResponse.f38480zze);
    }

    @NonNull
    public byte[] getAuthenticatorData() {
        return this.f38478zzc.zzm();
    }

    public zzgx getAuthenticatorDataAsByteString() {
        return this.f38478zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] getClientDataJSON() {
        return this.f38477zzb.zzm();
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.f38477zzb;
    }

    @NonNull
    @Deprecated
    public byte[] getKeyHandle() {
        return this.f38476zza.zzm();
    }

    @Deprecated
    public zzgx getKeyHandleAsByteString() {
        return this.f38476zza;
    }

    @NonNull
    public byte[] getSignature() {
        return this.f38479zzd.zzm();
    }

    public zzgx getSignatureAsByteString() {
        return this.f38479zzd;
    }

    public byte[] getUserHandle() {
        zzgx zzgxVar = this.f38480zze;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public zzgx getUserHandleAsByteString() {
        return this.f38480zze;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.f38476zza)), Integer.valueOf(Objects.hashCode(this.f38477zzb)), Integer.valueOf(Objects.hashCode(this.f38478zzc)), Integer.valueOf(Objects.hashCode(this.f38479zzd)), Integer.valueOf(Objects.hashCode(this.f38480zze)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toString() {
        zzbi zzbiVarZza = zzbj.zza(this);
        zzgf zzgfVarZzf = zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zzbiVarZza.zzb("keyHandle", zzgfVarZzf.zzg(keyHandle, 0, keyHandle.length));
        zzgf zzgfVarZzf2 = zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zzbiVarZza.zzb("clientDataJSON", zzgfVarZzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        zzgf zzgfVarZzf3 = zzgf.zzf();
        byte[] authenticatorData = getAuthenticatorData();
        zzbiVarZza.zzb("authenticatorData", zzgfVarZzf3.zzg(authenticatorData, 0, authenticatorData.length));
        zzgf zzgfVarZzf4 = zzgf.zzf();
        byte[] signature = getSignature();
        zzbiVarZza.zzb("signature", zzgfVarZzf4.zzg(signature, 0, signature.length));
        byte[] userHandle = getUserHandle();
        if (userHandle != null) {
            zzbiVarZza.zzb("userHandle", zzgf.zzf().zzg(userHandle, 0, userHandle.length));
        }
        return zzbiVarZza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAuthenticatorData(), false);
        SafeParcelWriter.writeByteArray(parcel, 5, getSignature(), false);
        SafeParcelWriter.writeByteArray(parcel, 6, getUserHandle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @NonNull
    public final JSONObject zza() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(getAuthenticatorData()));
            jSONObject.put("signature", Base64Utils.encodeUrlSafeNoPadding(getSignature()));
            if (this.f38480zze == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", Base64Utils.encodeUrlSafeNoPadding(getUserHandle()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }
}
