package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "AuthenticationExtensionsCreator")
@SafeParcelable.Reserved({1})
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getFidoAppIdExtension", id = 2)
    private final FidoAppIdExtension f38444zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getCableAuthenticationExtension", id = 3)
    private final zzs f38445zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getUserVerificationMethodExtension", id = 4)
    private final UserVerificationMethodExtension f38446zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleMultiAssertionExtension", id = 5)
    private final zzz f38447zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleSessionIdExtension", id = 6)
    private final zzab f38448zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleSilentVerificationExtension", id = 7)
    private final zzad f38449zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getDevicePublicKeyExtension", id = 8)
    private final zzu f38450zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleTunnelServerIdExtension", id = 9)
    private final zzag f38451zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleThirdPartyPaymentExtension", id = 10)
    private final GoogleThirdPartyPaymentExtension f38452zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPrfExtension", id = 11)
    private final zzak f38453zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSimpleTransactionAuthorizationExtension", id = 12)
    private final zzaw f38454zzk;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHmacSecretExtension", id = 13)
    private final zzai f38455zzl;

    public static final class Builder {

        /* JADX INFO: renamed from: zza, reason: collision with root package name */
        private FidoAppIdExtension f38456zza;

        /* JADX INFO: renamed from: zzb, reason: collision with root package name */
        private UserVerificationMethodExtension f38457zzb;

        /* JADX INFO: renamed from: zzc, reason: collision with root package name */
        private zzs f38458zzc;

        /* JADX INFO: renamed from: zzd, reason: collision with root package name */
        private zzz f38459zzd;

        /* JADX INFO: renamed from: zze, reason: collision with root package name */
        private zzab f38460zze;

        /* JADX INFO: renamed from: zzf, reason: collision with root package name */
        private zzad f38461zzf;

        /* JADX INFO: renamed from: zzg, reason: collision with root package name */
        private zzu f38462zzg;

        /* JADX INFO: renamed from: zzh, reason: collision with root package name */
        private zzag f38463zzh;

        /* JADX INFO: renamed from: zzi, reason: collision with root package name */
        private GoogleThirdPartyPaymentExtension f38464zzi;

        /* JADX INFO: renamed from: zzj, reason: collision with root package name */
        private zzak f38465zzj;

        /* JADX INFO: renamed from: zzk, reason: collision with root package name */
        private zzaw f38466zzk;

        /* JADX INFO: renamed from: zzl, reason: collision with root package name */
        private zzai f38467zzl;

        public Builder() {
        }

        @NonNull
        public AuthenticationExtensions build() {
            return new AuthenticationExtensions(this.f38456zza, this.f38458zzc, this.f38457zzb, this.f38459zzd, this.f38460zze, this.f38461zzf, this.f38462zzg, this.f38463zzh, this.f38464zzi, this.f38465zzj, this.f38466zzk, this.f38467zzl);
        }

        @NonNull
        public Builder setFido2Extension(FidoAppIdExtension fidoAppIdExtension) {
            this.f38456zza = fidoAppIdExtension;
            return this;
        }

        @NonNull
        public Builder setGoogleThirdPartyPaymentExtension(GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.f38464zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        @NonNull
        public Builder setUserVerificationMethodExtension(UserVerificationMethodExtension userVerificationMethodExtension) {
            this.f38457zzb = userVerificationMethodExtension;
            return this;
        }

        public final Builder zza(zzs zzsVar) {
            this.f38458zzc = zzsVar;
            return this;
        }

        public final Builder zzb(zzu zzuVar) {
            this.f38462zzg = zzuVar;
            return this;
        }

        public final Builder zzc(zzz zzzVar) {
            this.f38459zzd = zzzVar;
            return this;
        }

        public final Builder zzd(zzab zzabVar) {
            this.f38460zze = zzabVar;
            return this;
        }

        public final Builder zze(zzad zzadVar) {
            this.f38461zzf = zzadVar;
            return this;
        }

        public final Builder zzf(zzag zzagVar) {
            this.f38463zzh = zzagVar;
            return this;
        }

        public final Builder zzg(zzak zzakVar) {
            this.f38465zzj = zzakVar;
            return this;
        }

        public final Builder zzh(zzaw zzawVar) {
            this.f38466zzk = zzawVar;
            return this;
        }

        public Builder(AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.f38456zza = authenticationExtensions.getFidoAppIdExtension();
                this.f38457zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.f38458zzc = authenticationExtensions.zzb();
                this.f38459zzd = authenticationExtensions.zzd();
                this.f38460zze = authenticationExtensions.zze();
                this.f38461zzf = authenticationExtensions.zzf();
                this.f38462zzg = authenticationExtensions.zzc();
                this.f38463zzh = authenticationExtensions.zzh();
                this.f38464zzi = authenticationExtensions.zzg();
                this.f38465zzj = authenticationExtensions.zzj();
                this.f38466zzk = authenticationExtensions.zzk();
                this.f38467zzl = authenticationExtensions.zzi();
            }
        }
    }

    @SafeParcelable.Constructor
    public AuthenticationExtensions(@SafeParcelable.Param(id = 2) FidoAppIdExtension fidoAppIdExtension, @SafeParcelable.Param(id = 3) zzs zzsVar, @SafeParcelable.Param(id = 4) UserVerificationMethodExtension userVerificationMethodExtension, @SafeParcelable.Param(id = 5) zzz zzzVar, @SafeParcelable.Param(id = 6) zzab zzabVar, @SafeParcelable.Param(id = 7) zzad zzadVar, @SafeParcelable.Param(id = 8) zzu zzuVar, @SafeParcelable.Param(id = 9) zzag zzagVar, @SafeParcelable.Param(id = 10) GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @SafeParcelable.Param(id = 11) zzak zzakVar, @SafeParcelable.Param(id = 12) zzaw zzawVar, @SafeParcelable.Param(id = 13) zzai zzaiVar) {
        this.f38444zza = fidoAppIdExtension;
        this.f38446zzc = userVerificationMethodExtension;
        this.f38445zzb = zzsVar;
        this.f38447zzd = zzzVar;
        this.f38448zze = zzabVar;
        this.f38449zzf = zzadVar;
        this.f38450zzg = zzuVar;
        this.f38451zzh = zzagVar;
        this.f38452zzi = googleThirdPartyPaymentExtension;
        this.f38453zzj = zzakVar;
        this.f38454zzk = zzawVar;
        this.f38455zzl = zzaiVar;
    }

    @NonNull
    public static AuthenticationExtensions zza(@NonNull JSONObject jSONObject) throws JSONException {
        Builder builder = new Builder();
        if (jSONObject.has("fidoAppIdExtension")) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid")));
        }
        if (jSONObject.has("appid")) {
            builder.setFido2Extension(new FidoAppIdExtension(jSONObject.getString("appid")));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            builder.zzg(zzak.zza(jSONObject.getJSONObject("prf"), false));
        } else if (jSONObject.has("prfAlreadyHashed")) {
            builder.zzg(zzak.zza(jSONObject.getJSONObject("prfAlreadyHashed"), true));
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            builder.zza(new zzs(arrayList));
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            builder.setUserVerificationMethodExtension(new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            builder.zzc(new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            builder.zzd(new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            builder.zze(new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            builder.zzb(new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")));
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            builder.zzf(new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            builder.setGoogleThirdPartyPaymentExtension(new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")));
        }
        if (jSONObject.has("txAuthSimple")) {
            builder.zzh(new zzaw(jSONObject.getString("txAuthSimple")));
        }
        return builder.build();
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj2;
        return Objects.equal(this.f38444zza, authenticationExtensions.f38444zza) && Objects.equal(this.f38445zzb, authenticationExtensions.f38445zzb) && Objects.equal(this.f38446zzc, authenticationExtensions.f38446zzc) && Objects.equal(this.f38447zzd, authenticationExtensions.f38447zzd) && Objects.equal(this.f38448zze, authenticationExtensions.f38448zze) && Objects.equal(this.f38449zzf, authenticationExtensions.f38449zzf) && Objects.equal(this.f38450zzg, authenticationExtensions.f38450zzg) && Objects.equal(this.f38451zzh, authenticationExtensions.f38451zzh) && Objects.equal(this.f38452zzi, authenticationExtensions.f38452zzi) && Objects.equal(this.f38453zzj, authenticationExtensions.f38453zzj) && Objects.equal(this.f38454zzk, authenticationExtensions.f38454zzk) && Objects.equal(this.f38455zzl, authenticationExtensions.f38455zzl);
    }

    public FidoAppIdExtension getFidoAppIdExtension() {
        return this.f38444zza;
    }

    public UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.f38446zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.f38444zza, this.f38445zzb, this.f38446zzc, this.f38447zzd, this.f38448zze, this.f38449zzf, this.f38450zzg, this.f38451zzh, this.f38452zzi, this.f38453zzj, this.f38454zzk, this.f38455zzl);
    }

    @NonNull
    public final String toString() {
        zzaw zzawVar = this.f38454zzk;
        zzak zzakVar = this.f38453zzj;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.f38452zzi;
        zzag zzagVar = this.f38451zzh;
        zzu zzuVar = this.f38450zzg;
        zzad zzadVar = this.f38449zzf;
        zzab zzabVar = this.f38448zze;
        zzz zzzVar = this.f38447zzd;
        UserVerificationMethodExtension userVerificationMethodExtension = this.f38446zzc;
        zzs zzsVar = this.f38445zzb;
        String strValueOf = String.valueOf(this.f38444zza);
        String strValueOf2 = String.valueOf(zzsVar);
        String strValueOf3 = String.valueOf(userVerificationMethodExtension);
        String strValueOf4 = String.valueOf(zzzVar);
        String strValueOf5 = String.valueOf(zzabVar);
        String strValueOf6 = String.valueOf(zzadVar);
        String strValueOf7 = String.valueOf(zzuVar);
        String strValueOf8 = String.valueOf(zzagVar);
        String strValueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String strValueOf10 = String.valueOf(zzakVar);
        String strValueOf11 = String.valueOf(zzawVar);
        StringBuilder sbM = a.m("AuthenticationExtensions{\n fidoAppIdExtension=", strValueOf, ", \n cableAuthenticationExtension=", strValueOf2, ", \n userVerificationMethodExtension=");
        j6.a.D(sbM, strValueOf3, ", \n googleMultiAssertionExtension=", strValueOf4, ", \n googleSessionIdExtension=");
        j6.a.D(sbM, strValueOf5, ", \n googleSilentVerificationExtension=", strValueOf6, ", \n devicePublicKeyExtension=");
        j6.a.D(sbM, strValueOf7, ", \n googleTunnelServerIdExtension=", strValueOf8, ", \n googleThirdPartyPaymentExtension=");
        j6.a.D(sbM, strValueOf9, ", \n prfExtension=", strValueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return a.i(sbM, strValueOf11, "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f38445zzb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f38447zzd, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f38448zze, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f38449zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f38450zzg, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f38451zzh, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f38452zzi, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f38453zzj, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f38454zzk, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f38455zzl, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzs zzb() {
        return this.f38445zzb;
    }

    public final zzu zzc() {
        return this.f38450zzg;
    }

    public final zzz zzd() {
        return this.f38447zzd;
    }

    public final zzab zze() {
        return this.f38448zze;
    }

    public final zzad zzf() {
        return this.f38449zzf;
    }

    public final GoogleThirdPartyPaymentExtension zzg() {
        return this.f38452zzi;
    }

    public final zzag zzh() {
        return this.f38451zzh;
    }

    public final zzai zzi() {
        return this.f38455zzl;
    }

    public final zzak zzj() {
        return this.f38453zzj;
    }

    public final zzaw zzk() {
        return this.f38454zzk;
    }
}
