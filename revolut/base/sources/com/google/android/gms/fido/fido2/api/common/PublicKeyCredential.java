package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreator")
public class PublicKeyCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new zzao();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getId", id = 1)
    private final String f38523zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getType", id = 2)
    private final String f38524zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRawId", id = 3, type = "byte[]")
    private final zzgx f38525zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRegisterResponse", id = 4)
    private final AuthenticatorAttestationResponse f38526zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSignResponse", id = 5)
    private final AuthenticatorAssertionResponse f38527zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getErrorResponse", id = 6)
    private final AuthenticatorErrorResponse f38528zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getClientExtensionResults", id = 7)
    private final AuthenticationExtensionsClientOutputs f38529zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticatorAttachment", id = 8)
    private final String f38530zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getJsonString", id = 9)
    private String f38531zzi;

    public static class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private String f38532zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private zzgx f38533zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private AuthenticatorResponse f38534zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private AuthenticationExtensionsClientOutputs f38535zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private String f38536zze;

        @NonNull
        public PublicKeyCredential build() {
            AuthenticatorResponse authenticatorResponse = this.f38534zzc;
            return new PublicKeyCredential(this.f38532zza, PublicKeyCredentialType.PUBLIC_KEY.toString(), this.f38533zzb, authenticatorResponse instanceof AuthenticatorAttestationResponse ? (AuthenticatorAttestationResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorAssertionResponse ? (AuthenticatorAssertionResponse) authenticatorResponse : null, authenticatorResponse instanceof AuthenticatorErrorResponse ? (AuthenticatorErrorResponse) authenticatorResponse : null, this.f38535zzd, this.f38536zze);
        }

        @NonNull
        public Builder setAuthenticationExtensionsClientOutputs(AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs) {
            this.f38535zzd = authenticationExtensionsClientOutputs;
            return this;
        }

        @NonNull
        public Builder setAuthenticatorAttachment(String str) {
            this.f38536zze = str;
            return this;
        }

        @NonNull
        public Builder setId(String str) {
            this.f38532zza = str;
            return this;
        }

        public Builder setRawId(zzgx zzgxVar) {
            this.f38533zzb = zzgxVar;
            return this;
        }

        @NonNull
        public Builder setResponse(@NonNull AuthenticatorResponse authenticatorResponse) {
            this.f38534zzc = authenticatorResponse;
            return this;
        }

        @NonNull
        public Builder setRawId(byte[] bArr) {
            this.f38533zzb = bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length);
            return this;
        }
    }

    @NonNull
    public static PublicKeyCredential deserializeFromBytes(@NonNull byte[] bArr) {
        return (PublicKeyCredential) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj2;
        return Objects.equal(this.f38523zza, publicKeyCredential.f38523zza) && Objects.equal(this.f38524zzb, publicKeyCredential.f38524zzb) && Objects.equal(this.f38525zzc, publicKeyCredential.f38525zzc) && Objects.equal(this.f38526zzd, publicKeyCredential.f38526zzd) && Objects.equal(this.f38527zze, publicKeyCredential.f38527zze) && Objects.equal(this.f38528zzf, publicKeyCredential.f38528zzf) && Objects.equal(this.f38529zzg, publicKeyCredential.f38529zzg) && Objects.equal(this.f38530zzh, publicKeyCredential.f38530zzh);
    }

    public String getAuthenticatorAttachment() {
        return this.f38530zzh;
    }

    public AuthenticationExtensionsClientOutputs getClientExtensionResults() {
        return this.f38529zzg;
    }

    public String getId() {
        return this.f38523zza;
    }

    public byte[] getRawId() {
        zzgx zzgxVar = this.f38525zzc;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public zzgx getRawIdAsByteString() {
        return this.f38525zzc;
    }

    @NonNull
    public AuthenticatorResponse getResponse() {
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f38526zzd;
        if (authenticatorAttestationResponse != null) {
            return authenticatorAttestationResponse;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f38527zze;
        if (authenticatorAssertionResponse != null) {
            return authenticatorAssertionResponse;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f38528zzf;
        if (authenticatorErrorResponse != null) {
            return authenticatorErrorResponse;
        }
        throw new IllegalStateException("No response set.");
    }

    @NonNull
    public String getType() {
        return this.f38524zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38523zza, this.f38524zzb, this.f38525zzc, this.f38527zze, this.f38526zzd, this.f38528zzf, this.f38529zzg, this.f38530zzh);
    }

    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toJson() {
        return zza().toString();
    }

    @NonNull
    public final String toString() {
        zzgx zzgxVar = this.f38525zzc;
        byte[] bArrZzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.f38524zzb;
        String str2 = this.f38523zza;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f38526zzd;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f38527zze;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.f38528zzf;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f38529zzg;
        String str3 = this.f38530zzh;
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(bArrZzm);
        String strValueOf = String.valueOf(authenticatorAttestationResponse);
        String strValueOf2 = String.valueOf(authenticatorAssertionResponse);
        String strValueOf3 = String.valueOf(authenticatorErrorResponse);
        String strValueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder sbM = a.m("PublicKeyCredential{\n id='", str2, "', \n type='", str, "', \n rawId=");
        j6.a.D(sbM, strEncodeUrlSafeNoPadding, ", \n registerResponse=", strValueOf, ", \n signResponse=");
        j6.a.D(sbM, strValueOf2, ", \n errorResponse=", strValueOf3, ", \n extensionsClientOutputs=");
        return j6.a.w(sbM, strValueOf4, ", \n authenticatorAttachment='", str3, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        if (zzia.zzc()) {
            this.f38531zzi = zza().toString();
        }
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeString(parcel, 2, getType(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getRawId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f38526zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f38527zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f38528zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getClientExtensionResults(), i, false);
        SafeParcelWriter.writeString(parcel, 8, getAuthenticatorAttachment(), false);
        SafeParcelWriter.writeString(parcel, 9, this.f38531zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        this.f38531zzi = null;
    }

    @NonNull
    public final JSONObject zza() {
        JSONObject jSONObjectZza;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.f38525zzc;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject.put("rawId", Base64Utils.encodeUrlSafeNoPadding(this.f38525zzc.zzm()));
            }
            String str = this.f38530zzh;
            if (str != null) {
                jSONObject.put("authenticatorAttachment", str);
            }
            String str2 = this.f38524zzb;
            if (str2 != null && this.f38528zzf == null) {
                jSONObject.put("type", str2);
            }
            String str3 = this.f38523zza;
            if (str3 != null) {
                jSONObject.put("id", str3);
            }
            String str4 = "response";
            AuthenticatorAssertionResponse authenticatorAssertionResponse = this.f38527zze;
            boolean z = true;
            if (authenticatorAssertionResponse != null) {
                jSONObjectZza = authenticatorAssertionResponse.zza();
            } else {
                AuthenticatorAttestationResponse authenticatorAttestationResponse = this.f38526zzd;
                if (authenticatorAttestationResponse != null) {
                    jSONObjectZza = authenticatorAttestationResponse.zza();
                } else {
                    AuthenticatorErrorResponse authenticatorErrorResponse = this.f38528zzf;
                    z = false;
                    if (authenticatorErrorResponse != null) {
                        jSONObjectZza = authenticatorErrorResponse.zza();
                        str4 = "error";
                    } else {
                        jSONObjectZza = null;
                    }
                }
            }
            if (jSONObjectZza != null) {
                jSONObject.put(str4, jSONObjectZza);
            }
            AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f38529zzg;
            if (authenticationExtensionsClientOutputs != null) {
                jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.zza());
                return jSONObject;
            }
            if (z) {
                jSONObject.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e);
        }
    }

    private PublicKeyCredential(String str, @NonNull String str2, zzgx zzgxVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3, String str4) {
        boolean z = false;
        Preconditions.checkArgument((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null), "Must provide a response object.");
        if (authenticatorErrorResponse != null || (str != null && zzgxVar != null)) {
            z = true;
        }
        Preconditions.checkArgument(z, "Must provide id and rawId if not an error response.");
        this.f38523zza = str;
        this.f38524zzb = str2;
        this.f38525zzc = zzgxVar;
        this.f38526zzd = authenticatorAttestationResponse;
        this.f38527zze = authenticatorAssertionResponse;
        this.f38528zzf = authenticatorErrorResponse;
        this.f38529zzg = authenticationExtensionsClientOutputs;
        this.f38530zzh = str3;
        this.f38531zzi = null;
    }

    @SafeParcelable.Constructor
    public PublicKeyCredential(@SafeParcelable.Param(id = 1) String str, @NonNull @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) byte[] bArr, @SafeParcelable.Param(id = 4) AuthenticatorAttestationResponse authenticatorAttestationResponse, @SafeParcelable.Param(id = 5) AuthenticatorAssertionResponse authenticatorAssertionResponse, @SafeParcelable.Param(id = 6) AuthenticatorErrorResponse authenticatorErrorResponse, @SafeParcelable.Param(id = 7) AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, @SafeParcelable.Param(id = 8) String str3, @SafeParcelable.Param(id = 9) String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str3, str4);
    }
}
