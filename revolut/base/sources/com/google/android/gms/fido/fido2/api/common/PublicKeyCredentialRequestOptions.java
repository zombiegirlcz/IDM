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
import com.google.android.gms.internal.fido.zzia;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "PublicKeyCredentialRequestOptionsCreator")
@SafeParcelable.Reserved({1})
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getChallenge", id = 2)
    private final byte[] f38566zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTimeoutSeconds", id = 3)
    private final Double f38567zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @NonNull
    @SafeParcelable.Field(getter = "getRpId", id = 4)
    private final String f38568zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAllowList", id = 5)
    private final List f38569zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getRequestId", id = 6)
    private final Integer f38570zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTokenBinding", id = 7)
    private final TokenBinding f38571zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserVerificationAsString", id = 8, type = "java.lang.String")
    private final UserVerificationRequirement f38572zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getAuthenticationExtensions", id = 9)
    private final AuthenticationExtensions f38573zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getLongRequestId", id = 10)
    private final Long f38574zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getResultReceiver", id = 12)
    private ResultReceiver f38575zzj;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private byte[] f38576zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private Double f38577zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private String f38578zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private List f38579zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private Integer f38580zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private TokenBinding f38581zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private UserVerificationRequirement f38582zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private AuthenticationExtensions f38583zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private Long f38584zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private ResultReceiver f38585zzj;

        public Builder() {
        }

        @NonNull
        public PublicKeyCredentialRequestOptions build() {
            byte[] bArr = this.f38576zza;
            Double d = this.f38577zzb;
            String str = this.f38578zzc;
            List list = this.f38579zzd;
            Integer num = this.f38580zze;
            TokenBinding tokenBinding = this.f38581zzf;
            UserVerificationRequirement userVerificationRequirement = this.f38582zzg;
            return new PublicKeyCredentialRequestOptions(bArr, d, str, list, num, tokenBinding, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), this.f38583zzh, this.f38584zzi, null, this.f38585zzj);
        }

        @NonNull
        public Builder setAllowList(List<PublicKeyCredentialDescriptor> list) {
            this.f38579zzd = list;
            return this;
        }

        @NonNull
        public Builder setAuthenticationExtensions(AuthenticationExtensions authenticationExtensions) {
            this.f38583zzh = authenticationExtensions;
            return this;
        }

        @NonNull
        public Builder setChallenge(@NonNull byte[] bArr) {
            this.f38576zza = (byte[]) Preconditions.checkNotNull(bArr);
            return this;
        }

        @NonNull
        public Builder setRequestId(Integer num) {
            this.f38580zze = num;
            return this;
        }

        @NonNull
        public Builder setRpId(@NonNull String str) {
            this.f38578zzc = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @NonNull
        public Builder setTimeoutSeconds(Double d) {
            this.f38577zzb = d;
            return this;
        }

        @NonNull
        public Builder setTokenBinding(TokenBinding tokenBinding) {
            this.f38581zzf = tokenBinding;
            return this;
        }

        @NonNull
        public final Builder zza(Long l2) {
            this.f38584zzi = l2;
            return this;
        }

        @NonNull
        public final Builder zzb(ResultReceiver resultReceiver) {
            this.f38585zzj = null;
            return this;
        }

        @NonNull
        public final Builder zzc(UserVerificationRequirement userVerificationRequirement) {
            this.f38582zzg = userVerificationRequirement;
            return this;
        }

        public Builder(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions) {
            if (publicKeyCredentialRequestOptions != null) {
                this.f38576zza = publicKeyCredentialRequestOptions.getChallenge();
                this.f38577zzb = publicKeyCredentialRequestOptions.getTimeoutSeconds();
                this.f38578zzc = publicKeyCredentialRequestOptions.getRpId();
                this.f38579zzd = publicKeyCredentialRequestOptions.getAllowList();
                this.f38580zze = publicKeyCredentialRequestOptions.getRequestId();
                this.f38581zzf = publicKeyCredentialRequestOptions.getTokenBinding();
                this.f38582zzg = publicKeyCredentialRequestOptions.zzb();
                this.f38583zzh = publicKeyCredentialRequestOptions.getAuthenticationExtensions();
                this.f38584zzi = publicKeyCredentialRequestOptions.zzc();
                this.f38585zzj = publicKeyCredentialRequestOptions.zza();
            }
        }
    }

    @SafeParcelable.Constructor
    public PublicKeyCredentialRequestOptions(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) Double d, @NonNull @SafeParcelable.Param(id = 4) String str, @SafeParcelable.Param(id = 5) List list, @SafeParcelable.Param(id = 6) Integer num, @SafeParcelable.Param(id = 7) TokenBinding tokenBinding, @SafeParcelable.Param(id = 8) String str2, @SafeParcelable.Param(id = 9) AuthenticationExtensions authenticationExtensions, @SafeParcelable.Param(id = 10) Long l2, @SafeParcelable.Param(id = 11) String str3, @SafeParcelable.Param(id = 12) ResultReceiver resultReceiver) {
        this.f38575zzj = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            this.f38566zza = (byte[]) Preconditions.checkNotNull(bArr);
            this.f38567zzb = d;
            this.f38568zzc = (String) Preconditions.checkNotNull(str);
            this.f38569zzd = list;
            this.f38570zze = num;
            this.f38571zzf = tokenBinding;
            this.f38574zzi = l2;
            if (str2 != null) {
                try {
                    this.f38572zzg = UserVerificationRequirement.fromString(str2);
                } catch (zzbc e) {
                    throw new IllegalArgumentException(e);
                }
            } else {
                this.f38572zzg = null;
            }
            this.f38573zzh = authenticationExtensions;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            Builder builder = new Builder();
            builder.setChallenge(Base64Utils.decodeUrlSafeNoPadding(jSONObject.getString("challenge")));
            if (jSONObject.has("timeout")) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
            } else if (jSONObject.has("timeoutSeconds")) {
                builder.setTimeoutSeconds(Double.valueOf(jSONObject.getDouble("timeoutSeconds")));
            }
            builder.setRpId(jSONObject.getString("rpId"));
            JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(PublicKeyCredentialDescriptor.zza(jSONArray.getJSONObject(i)));
                }
                builder.setAllowList(arrayList);
            }
            if (jSONObject.has("requestId")) {
                builder.setRequestId(Integer.valueOf(jSONObject.getInt("requestId")));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                builder.setTokenBinding(new TokenBinding(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null));
            }
            if (jSONObject.has("userVerification")) {
                builder.zzc(UserVerificationRequirement.fromString(jSONObject.getString("userVerification")));
            }
            if (jSONObject.has("authenticationExtensions")) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject("authenticationExtensions")));
            } else if (jSONObject.has("extensions")) {
                builder.setAuthenticationExtensions(AuthenticationExtensions.zza(jSONObject.getJSONObject("extensions")));
            }
            if (jSONObject.has("longRequestId")) {
                builder.zza(Long.valueOf(jSONObject.getLong("longRequestId")));
            }
            PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
            this.f38566zza = publicKeyCredentialRequestOptionsBuild.f38566zza;
            this.f38567zzb = publicKeyCredentialRequestOptionsBuild.f38567zzb;
            this.f38568zzc = publicKeyCredentialRequestOptionsBuild.f38568zzc;
            this.f38569zzd = publicKeyCredentialRequestOptionsBuild.f38569zzd;
            this.f38570zze = publicKeyCredentialRequestOptionsBuild.f38570zze;
            this.f38571zzf = publicKeyCredentialRequestOptionsBuild.f38571zzf;
            this.f38572zzg = publicKeyCredentialRequestOptionsBuild.f38572zzg;
            this.f38573zzh = publicKeyCredentialRequestOptionsBuild.f38573zzh;
            this.f38574zzi = publicKeyCredentialRequestOptionsBuild.f38574zzi;
        } catch (zzbc e2) {
            e = e2;
            throw new IllegalArgumentException(e);
        } catch (JSONException e4) {
            e = e4;
            throw new IllegalArgumentException(e);
        }
    }

    @NonNull
    public static PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] bArr) {
        return (PublicKeyCredentialRequestOptions) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(@NonNull Object obj2) {
        List list;
        List list2;
        if (!(obj2 instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj2;
        return Arrays.equals(this.f38566zza, publicKeyCredentialRequestOptions.f38566zza) && Objects.equal(this.f38567zzb, publicKeyCredentialRequestOptions.f38567zzb) && Objects.equal(this.f38568zzc, publicKeyCredentialRequestOptions.f38568zzc) && (((list = this.f38569zzd) == null && publicKeyCredentialRequestOptions.f38569zzd == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.f38569zzd) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.f38569zzd.containsAll(this.f38569zzd))) && Objects.equal(this.f38570zze, publicKeyCredentialRequestOptions.f38570zze) && Objects.equal(this.f38571zzf, publicKeyCredentialRequestOptions.f38571zzf) && Objects.equal(this.f38572zzg, publicKeyCredentialRequestOptions.f38572zzg) && Objects.equal(this.f38573zzh, publicKeyCredentialRequestOptions.f38573zzh) && Objects.equal(this.f38574zzi, publicKeyCredentialRequestOptions.f38574zzi);
    }

    public List<PublicKeyCredentialDescriptor> getAllowList() {
        return this.f38569zzd;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public AuthenticationExtensions getAuthenticationExtensions() {
        return this.f38573zzh;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] getChallenge() {
        return this.f38566zza;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Integer getRequestId() {
        return this.f38570zze;
    }

    @NonNull
    public String getRpId() {
        return this.f38568zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public Double getTimeoutSeconds() {
        return this.f38567zzb;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    public TokenBinding getTokenBinding() {
        return this.f38571zzf;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f38566zza)), this.f38567zzb, this.f38568zzc, this.f38569zzd, this.f38570zze, this.f38571zzf, this.f38572zzg, this.f38573zzh, this.f38574zzi);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.RequestOptions
    @NonNull
    public byte[] serializeToBytes() {
        if (!zzia.zzd()) {
            return SafeParcelableSerializer.serializeToBytes(this);
        }
        Builder builder = new Builder(this);
        builder.zzb(null);
        return SafeParcelableSerializer.serializeToBytes(builder.build());
    }

    @NonNull
    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.f38573zzh;
        UserVerificationRequirement userVerificationRequirement = this.f38572zzg;
        TokenBinding tokenBinding = this.f38571zzf;
        List list = this.f38569zzd;
        String strEncodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(this.f38566zza);
        String strValueOf = String.valueOf(list);
        String strValueOf2 = String.valueOf(tokenBinding);
        String strValueOf3 = String.valueOf(userVerificationRequirement);
        String strValueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder sbX = a.x("PublicKeyCredentialRequestOptions{\n challenge=", strEncodeUrlSafeNoPadding, ", \n timeoutSeconds=");
        sbX.append(this.f38567zzb);
        sbX.append(", \n rpId='");
        j6.a.D(sbX, this.f38568zzc, "', \n allowList=", strValueOf, ", \n requestId=");
        sbX.append(this.f38570zze);
        sbX.append(", \n tokenBinding=");
        sbX.append(strValueOf2);
        sbX.append(", \n userVerification=");
        j6.a.D(sbX, strValueOf3, ", \n authenticationExtensions=", strValueOf4, ", \n longRequestId=");
        sbX.append(this.f38574zzi);
        sbX.append("}");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
        SafeParcelWriter.writeDoubleObject(parcel, 3, getTimeoutSeconds(), false);
        SafeParcelWriter.writeString(parcel, 4, getRpId(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getAllowList(), false);
        SafeParcelWriter.writeIntegerObject(parcel, 6, getRequestId(), false);
        SafeParcelWriter.writeParcelable(parcel, 7, getTokenBinding(), i, false);
        UserVerificationRequirement userVerificationRequirement = this.f38572zzg;
        SafeParcelWriter.writeString(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        SafeParcelWriter.writeParcelable(parcel, 9, getAuthenticationExtensions(), i, false);
        SafeParcelWriter.writeLongObject(parcel, 10, this.f38574zzi, false);
        SafeParcelWriter.writeString(parcel, 11, null, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f38575zzj, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final ResultReceiver zza() {
        return this.f38575zzj;
    }

    public final UserVerificationRequirement zzb() {
        return this.f38572zzg;
    }

    public final Long zzc() {
        return this.f38574zzi;
    }
}
