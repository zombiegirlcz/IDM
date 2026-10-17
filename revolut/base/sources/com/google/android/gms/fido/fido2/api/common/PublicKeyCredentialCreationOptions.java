package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzbl;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialCreationOptionsCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzan();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getRp", id = 2)
    private final PublicKeyCredentialRpEntity f38537zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getUser", id = 3)
    private final PublicKeyCredentialUserEntity f38538zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getChallenge", id = 4)
    private final byte[] f38539zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getParameters", id = 5)
    private final List f38540zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 6)
    private final Double f38541zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getExcludeList", id = 7)
    private final List f38542zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticatorSelection", id = 8)
    private final AuthenticatorSelectionCriteria f38543zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestId", id = 9)
    private final Integer f38544zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTokenBinding", id = 10)
    private final TokenBinding f38545zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAttestationConveyancePreferenceAsString", id = 11, type = "java.lang.String")
    private final AttestationConveyancePreference f38546zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 12)
    private final AuthenticationExtensions f38547zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getJsonString", id = 13)
    private final String f38548zzl;

    @SafeParcelable.Field(getter = "getResultReceiver", id = 14)
    private ResultReceiver zzm;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private PublicKeyCredentialRpEntity f38549zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private PublicKeyCredentialUserEntity f38550zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private byte[] f38551zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private List f38552zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private Double f38553zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private List f38554zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private AuthenticatorSelectionCriteria f38555zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private Integer f38556zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private TokenBinding f38557zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private AttestationConveyancePreference f38558zzj;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private AuthenticationExtensions f38559zzk;

        @NonNull
        public PublicKeyCredentialCreationOptions build() {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.f38549zza;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f38550zzb;
            byte[] bArr = this.f38551zzc;
            List list = this.f38552zzd;
            Double d = this.f38553zze;
            List list2 = this.f38554zzf;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f38555zzg;
            Integer num = this.f38556zzh;
            TokenBinding tokenBinding = this.f38557zzi;
            AttestationConveyancePreference attestationConveyancePreference = this.f38558zzj;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, list, d, list2, authenticatorSelectionCriteria, num, tokenBinding, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), this.f38559zzk, null, null);
        }

        @NonNull
        public Builder setAttestationConveyancePreference(AttestationConveyancePreference attestationConveyancePreference) {
            this.f38558zzj = attestationConveyancePreference;
            return this;
        }

        @NonNull
        public Builder setAuthenticationExtensions(AuthenticationExtensions authenticationExtensions) {
            this.f38559zzk = authenticationExtensions;
            return this;
        }

        @NonNull
        public Builder setAuthenticatorSelection(AuthenticatorSelectionCriteria authenticatorSelectionCriteria) {
            this.f38555zzg = authenticatorSelectionCriteria;
            return this;
        }

        @NonNull
        public Builder setChallenge(@NonNull byte[] bArr) {
            this.f38551zzc = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @NonNull
        public Builder setExcludeList(List<PublicKeyCredentialDescriptor> list) {
            this.f38554zzf = list;
            return this;
        }

        @NonNull
        public Builder setParameters(@NonNull List<PublicKeyCredentialParameters> list) {
            this.f38552zzd = (List) Preconditions.checkNotNull(list);
            return this;
        }

        @NonNull
        public Builder setRequestId(Integer num) {
            this.f38556zzh = num;
            return this;
        }

        @NonNull
        public Builder setRp(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity) {
            this.f38549zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(Double d) {
            this.f38553zze = d;
            return this;
        }

        @NonNull
        public Builder setTokenBinding(TokenBinding tokenBinding) {
            this.f38557zzi = tokenBinding;
            return this;
        }

        @NonNull
        public Builder setUser(@NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity) {
            this.f38550zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialCreationOptions(@NonNull @SafeParcelable.Param(id = 2) PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull @SafeParcelable.Param(id = 3) PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr, @NonNull @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) Double d, @SafeParcelable.Param(id = 7) List list2, @SafeParcelable.Param(id = 8) AuthenticatorSelectionCriteria authenticatorSelectionCriteria, @SafeParcelable.Param(id = 9) Integer num, @SafeParcelable.Param(id = 10) TokenBinding tokenBinding, @SafeParcelable.Param(id = 11) String str, @SafeParcelable.Param(id = 12) AuthenticationExtensions authenticationExtensions, @SafeParcelable.Param(id = 13) String str2, @SafeParcelable.Param(id = 14) ResultReceiver resultReceiver) {
        this.zzm = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsZza = zza(new JSONObject(str2));
                this.f38537zza = publicKeyCredentialCreationOptionsZza.f38537zza;
                this.f38538zzb = publicKeyCredentialCreationOptionsZza.f38538zzb;
                this.f38539zzc = publicKeyCredentialCreationOptionsZza.f38539zzc;
                this.f38540zzd = publicKeyCredentialCreationOptionsZza.f38540zzd;
                this.f38541zze = publicKeyCredentialCreationOptionsZza.f38541zze;
                this.f38542zzf = publicKeyCredentialCreationOptionsZza.f38542zzf;
                this.f38543zzg = publicKeyCredentialCreationOptionsZza.f38543zzg;
                this.f38544zzh = publicKeyCredentialCreationOptionsZza.f38544zzh;
                this.f38545zzi = publicKeyCredentialCreationOptionsZza.f38545zzi;
                this.f38546zzj = publicKeyCredentialCreationOptionsZza.f38546zzj;
                this.f38547zzk = publicKeyCredentialCreationOptionsZza.f38547zzk;
                this.f38548zzl = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.f38537zza = (PublicKeyCredentialRpEntity) Preconditions.checkNotNull(publicKeyCredentialRpEntity);
        this.f38538zzb = (PublicKeyCredentialUserEntity) Preconditions.checkNotNull(publicKeyCredentialUserEntity);
        this.f38539zzc = (byte[]) Preconditions.checkNotNull(bArr);
        this.f38540zzd = (List) Preconditions.checkNotNull(list);
        this.f38541zze = d;
        this.f38542zzf = list2;
        this.f38543zzg = authenticatorSelectionCriteria;
        this.f38544zzh = num;
        this.f38545zzi = tokenBinding;
        if (str != null) {
            try {
                this.f38546zzj = AttestationConveyancePreference.fromString(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.f38546zzj = null;
        }
        this.f38547zzk = authenticationExtensions;
        this.f38548zzl = null;
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions deserializeFromBytes(@NonNull byte[] bArr) {
        return (PublicKeyCredentialCreationOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions zza(@NonNull JSONObject jSONObject) throws JSONException {
        zzbl zzblVarZzc;
        Builder builder = new Builder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        builder.setRp(new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        builder.setUser(new PublicKeyCredentialUserEntity(Base64Utils.decodeUrlSafeNoPadding(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        builder.setChallenge(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                zzblVarZzc = zzbl.zzd(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVarZzc = zzbl.zzc();
            }
            if (zzblVarZzc.zzb()) {
                arrayList.add(zzblVarZzc.zza());
            }
        }
        builder.setParameters(arrayList);
        if (jSONObject.has("timeout")) {
            builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(PublicKeyCredentialDescriptor.zza(jSONArray2.getJSONObject(i2)));
            }
            builder.setExcludeList(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            builder.setAuthenticatorSelection(new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                builder.setAttestationConveyancePreference(AttestationConveyancePreference.fromString(jSONObject.getString("attestation")));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e) {
                builder.setAttestationConveyancePreference(AttestationConveyancePreference.NONE);
            }
        }
        return builder.build();
    }

    public boolean equals(@NonNull Object obj2) {
        List list;
        List list2;
        if (!(obj2 instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj2;
        return Objects.equal(this.f38537zza, publicKeyCredentialCreationOptions.f38537zza) && Objects.equal(this.f38538zzb, publicKeyCredentialCreationOptions.f38538zzb) && Arrays.equals(this.f38539zzc, publicKeyCredentialCreationOptions.f38539zzc) && Objects.equal(this.f38541zze, publicKeyCredentialCreationOptions.f38541zze) && this.f38540zzd.containsAll(publicKeyCredentialCreationOptions.f38540zzd) && publicKeyCredentialCreationOptions.f38540zzd.containsAll(this.f38540zzd) && (((list = this.f38542zzf) == null && publicKeyCredentialCreationOptions.f38542zzf == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f38542zzf) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f38542zzf.containsAll(this.f38542zzf))) && Objects.equal(this.f38543zzg, publicKeyCredentialCreationOptions.f38543zzg) && Objects.equal(this.f38544zzh, publicKeyCredentialCreationOptions.f38544zzh) && Objects.equal(this.f38545zzi, publicKeyCredentialCreationOptions.f38545zzi) && Objects.equal(this.f38546zzj, publicKeyCredentialCreationOptions.f38546zzj) && Objects.equal(this.f38547zzk, publicKeyCredentialCreationOptions.f38547zzk) && Objects.equal(this.f38548zzl, publicKeyCredentialCreationOptions.f38548zzl);
    }

    public AttestationConveyancePreference getAttestationConveyancePreference() {
        return this.f38546zzj;
    }

    public String getAttestationConveyancePreferenceAsString() {
        AttestationConveyancePreference attestationConveyancePreference = this.f38546zzj;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.f38547zzk;
    }

    public AuthenticatorSelectionCriteria getAuthenticatorSelection() {
        return this.f38543zzg;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] getChallenge() {
        return this.f38539zzc;
    }

    public List<PublicKeyCredentialDescriptor> getExcludeList() {
        return this.f38542zzf;
    }

    public String getJsonString() {
        return this.f38548zzl;
    }

    @NonNull
    public List<PublicKeyCredentialParameters> getParameters() {
        return this.f38540zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.f38544zzh;
    }

    @NonNull
    public PublicKeyCredentialRpEntity getRp() {
        return this.f38537zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.f38541zze;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.f38545zzi;
    }

    @NonNull
    public PublicKeyCredentialUserEntity getUser() {
        return this.f38538zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38537zza, this.f38538zzb, Integer.valueOf(Arrays.hashCode(this.f38539zzc)), this.f38540zzd, this.f38541zze, this.f38542zzf, this.f38543zzg, this.f38544zzh, this.f38545zzi, this.f38546zzj, this.f38547zzk, this.f38548zzl);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] serializeToBytes() {
        if (!zzia.zzd()) {
            return SafeParcelableSerializer.serializeToBytes(this);
        }
        Builder builder = new Builder();
        builder.setRp(this.f38537zza);
        builder.setUser(this.f38538zzb);
        builder.setChallenge(this.f38539zzc);
        builder.setParameters(this.f38540zzd);
        builder.setTimeoutSeconds(this.f38541zze);
        builder.setExcludeList(this.f38542zzf);
        builder.setAuthenticatorSelection(this.f38543zzg);
        builder.setRequestId(this.f38544zzh);
        builder.setTokenBinding(this.f38545zzi);
        builder.setAttestationConveyancePreference(this.f38546zzj);
        builder.setAuthenticationExtensions(this.f38547zzk);
        return SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f38547zzk;
        AttestationConveyancePreference attestationConveyancePreference = this.f38546zzj;
        TokenBinding tokenBinding = this.f38545zzi;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.f38543zzg;
        List list = this.f38542zzf;
        List list2 = this.f38540zzd;
        byte[] bArr = this.f38539zzc;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.f38538zzb;
        String strValueOf = String.valueOf(this.f38537zza);
        String strValueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(bArr);
        String strValueOf3 = String.valueOf(list2);
        String strValueOf4 = String.valueOf(list);
        String strValueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String strValueOf6 = String.valueOf(tokenBinding);
        String strValueOf7 = String.valueOf(attestationConveyancePreference);
        String strValueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder sbM = a.m("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        j6.a.D(sbM, strEncodeUrlSafeNoPadding, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbM.append(this.f38541zze);
        sbM.append(", \n excludeList=");
        sbM.append(strValueOf4);
        sbM.append(", \n authenticatorSelection=");
        sbM.append(strValueOf5);
        sbM.append(", \n requestId=");
        sbM.append(this.f38544zzh);
        sbM.append(", \n tokenBinding=");
        sbM.append(strValueOf6);
        sbM.append(", \n attestationConveyancePreference=");
        return j6.a.w(sbM, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getRp(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getUser(), i, false);
        SafeParcelWriter.writeByteArray(parcel, 4, getChallenge(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getParameters(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 6, getTimeoutSeconds(), false);
        SafeParcelWriter.writeTypedList(parcel, 7, getExcludeList(), false);
        SafeParcelWriter.writeParcelable(parcel, 8, getAuthenticatorSelection(), i, false);
        SafeParcelWriter.writeIntegerObject(parcel, 9, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 10, getTokenBinding(), i, false);
        SafeParcelWriter.writeString(parcel, 11, getAttestationConveyancePreferenceAsString(), false);
        SafeParcelWriter.writeParcelable(parcel, 12, getAuthenticationExtensions(), i, false);
        SafeParcelWriter.writeString(parcel, 13, getJsonString(), false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsZza = zza(new JSONObject(str));
            this.f38537zza = publicKeyCredentialCreationOptionsZza.f38537zza;
            this.f38538zzb = publicKeyCredentialCreationOptionsZza.f38538zzb;
            this.f38539zzc = publicKeyCredentialCreationOptionsZza.f38539zzc;
            this.f38540zzd = publicKeyCredentialCreationOptionsZza.f38540zzd;
            this.f38541zze = publicKeyCredentialCreationOptionsZza.f38541zze;
            this.f38542zzf = publicKeyCredentialCreationOptionsZza.f38542zzf;
            this.f38543zzg = publicKeyCredentialCreationOptionsZza.f38543zzg;
            this.f38544zzh = publicKeyCredentialCreationOptionsZza.f38544zzh;
            this.f38545zzi = publicKeyCredentialCreationOptionsZza.f38545zzi;
            this.f38546zzj = publicKeyCredentialCreationOptionsZza.f38546zzj;
            this.f38547zzk = publicKeyCredentialCreationOptionsZza.f38547zzk;
            this.f38548zzl = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
