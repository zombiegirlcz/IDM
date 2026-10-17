package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "BeginSignInRequestCreator")
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPasswordRequestOptions", id = 1)
    private final PasswordRequestOptions f37379zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getGoogleIdTokenRequestOptions", id = 2)
    private final GoogleIdTokenRequestOptions f37380zbb;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "isAutoSelectEnabled", id = 4)
    private final boolean f37381zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTheme", id = 5)
    private final int f37382zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPasskeysRequestOptions", id = 6)
    private final PasskeysRequestOptions f37383zbf;

    /* JADX INFO: renamed from: zbg, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getPasskeyJsonRequestOptions", id = 7)
    private final PasskeyJsonRequestOptions f37384zbg;

    /* JADX INFO: renamed from: zbh, reason: collision with root package name */
    @SafeParcelable.Field(defaultValue = "false", getter = "getPreferImmediatelyAvailableCredentials", id = 8)
    private final boolean f37385zbh;

    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        private PasswordRequestOptions f37386zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        private GoogleIdTokenRequestOptions f37387zbb;
        private PasskeysRequestOptions zbc;

        /* JADX INFO: renamed from: zbd, reason: collision with root package name */
        private PasskeyJsonRequestOptions f37388zbd;

        /* JADX INFO: renamed from: zbe, reason: collision with root package name */
        private String f37389zbe;

        /* JADX INFO: renamed from: zbf, reason: collision with root package name */
        private boolean f37390zbf;

        /* JADX INFO: renamed from: zbg, reason: collision with root package name */
        private int f37391zbg;

        /* JADX INFO: renamed from: zbh, reason: collision with root package name */
        private boolean f37392zbh;

        public Builder() {
            PasswordRequestOptions.Builder builder = PasswordRequestOptions.builder();
            builder.setSupported(false);
            this.f37386zba = builder.build();
            GoogleIdTokenRequestOptions.Builder builder2 = GoogleIdTokenRequestOptions.builder();
            builder2.setSupported(false);
            this.f37387zbb = builder2.build();
            PasskeysRequestOptions.Builder builder3 = PasskeysRequestOptions.builder();
            builder3.setSupported(false);
            this.zbc = builder3.build();
            PasskeyJsonRequestOptions.Builder builder4 = PasskeyJsonRequestOptions.builder();
            builder4.setSupported(false);
            this.f37388zbd = builder4.build();
        }

        @NonNull
        public BeginSignInRequest build() {
            return new BeginSignInRequest(this.f37386zba, this.f37387zbb, this.f37389zbe, this.f37390zbf, this.f37391zbg, this.zbc, this.f37388zbd, this.f37392zbh);
        }

        @NonNull
        public Builder setAutoSelectEnabled(boolean z) {
            this.f37390zbf = z;
            return this;
        }

        @NonNull
        public Builder setGoogleIdTokenRequestOptions(@NonNull GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f37387zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
            return this;
        }

        @NonNull
        public Builder setPasskeyJsonSignInRequestOptions(@NonNull PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f37388zbd = (PasskeyJsonRequestOptions) Preconditions.checkNotNull(passkeyJsonRequestOptions);
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setPasskeysSignInRequestOptions(@NonNull PasskeysRequestOptions passkeysRequestOptions) {
            this.zbc = (PasskeysRequestOptions) Preconditions.checkNotNull(passkeysRequestOptions);
            return this;
        }

        @NonNull
        public Builder setPasswordRequestOptions(@NonNull PasswordRequestOptions passwordRequestOptions) {
            this.f37386zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
            return this;
        }

        @NonNull
        public Builder setPreferImmediatelyAvailableCredentials(boolean z) {
            this.f37392zbh = z;
            return this;
        }

        @NonNull
        public final Builder zba(@NonNull String str) {
            this.f37389zbe = str;
            return this;
        }

        @NonNull
        public final Builder zbb(int i) {
            this.f37391zbg = i;
            return this;
        }
    }

    @SafeParcelable.Class(creator = "GoogleIdTokenRequestOptionsCreator")
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean f37393zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getServerClientId", id = 2)
        private final String f37394zbb;

        @SafeParcelable.Field(getter = "getNonce", id = 3)
        private final String zbc;

        /* JADX INFO: renamed from: zbd, reason: collision with root package name */
        @SafeParcelable.Field(getter = "filterByAuthorizedAccounts", id = 4)
        private final boolean f37395zbd;

        /* JADX INFO: renamed from: zbe, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getLinkedServiceId", id = 5)
        private final String f37396zbe;

        /* JADX INFO: renamed from: zbf, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getIdTokenDepositionScopes", id = 6)
        private final List f37397zbf;

        /* JADX INFO: renamed from: zbg, reason: collision with root package name */
        @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 7)
        private final boolean f37398zbg;

        public static final class Builder {

            /* JADX INFO: renamed from: zba, reason: collision with root package name */
            private boolean f37399zba = false;

            /* JADX INFO: renamed from: zbb, reason: collision with root package name */
            private String f37400zbb = null;
            private String zbc = null;

            /* JADX INFO: renamed from: zbd, reason: collision with root package name */
            private boolean f37401zbd = true;

            /* JADX INFO: renamed from: zbe, reason: collision with root package name */
            private String f37402zbe = null;

            /* JADX INFO: renamed from: zbf, reason: collision with root package name */
            private List f37403zbf = null;

            /* JADX INFO: renamed from: zbg, reason: collision with root package name */
            private boolean f37404zbg = false;

            @NonNull
            public Builder associateLinkedAccounts(@NonNull String str, List<String> list) {
                this.f37402zbe = (String) Preconditions.checkNotNull(str, "linkedServiceId must be provided if you want to associate linked accounts.");
                this.f37403zbf = list;
                return this;
            }

            @NonNull
            public GoogleIdTokenRequestOptions build() {
                return new GoogleIdTokenRequestOptions(this.f37399zba, this.f37400zbb, this.zbc, this.f37401zbd, this.f37402zbe, this.f37403zbf, this.f37404zbg);
            }

            @NonNull
            public Builder setFilterByAuthorizedAccounts(boolean z) {
                this.f37401zbd = z;
                return this;
            }

            @NonNull
            public Builder setNonce(String str) {
                this.zbc = str;
                return this;
            }

            @NonNull
            @Deprecated
            public Builder setRequestVerifiedPhoneNumber(boolean z) {
                this.f37404zbg = z;
                return this;
            }

            @NonNull
            public Builder setServerClientId(@NonNull String str) {
                this.f37400zbb = Preconditions.checkNotEmpty(str);
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z) {
                this.f37399zba = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public GoogleIdTokenRequestOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) boolean z3, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) List list, @SafeParcelable.Param(id = 7) boolean z4) {
            boolean z6 = true;
            if (z3 && z4) {
                z6 = false;
            }
            Preconditions.checkArgument(z6, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f37393zba = z;
            if (z) {
                Preconditions.checkNotNull(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f37394zbb = str;
            this.zbc = str2;
            this.f37395zbd = z3;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f37397zbf = arrayList;
            this.f37396zbe = str3;
            this.f37398zbg = z4;
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj2) {
            if (!(obj2 instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj2;
            return this.f37393zba == googleIdTokenRequestOptions.f37393zba && Objects.equal(this.f37394zbb, googleIdTokenRequestOptions.f37394zbb) && Objects.equal(this.zbc, googleIdTokenRequestOptions.zbc) && this.f37395zbd == googleIdTokenRequestOptions.f37395zbd && Objects.equal(this.f37396zbe, googleIdTokenRequestOptions.f37396zbe) && Objects.equal(this.f37397zbf, googleIdTokenRequestOptions.f37397zbf) && this.f37398zbg == googleIdTokenRequestOptions.f37398zbg;
        }

        public boolean filterByAuthorizedAccounts() {
            return this.f37395zbd;
        }

        public List<String> getIdTokenDepositionScopes() {
            return this.f37397zbf;
        }

        public String getLinkedServiceId() {
            return this.f37396zbe;
        }

        public String getNonce() {
            return this.zbc;
        }

        public String getServerClientId() {
            return this.f37394zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f37393zba), this.f37394zbb, this.zbc, Boolean.valueOf(this.f37395zbd), this.f37396zbe, this.f37397zbf, Boolean.valueOf(this.f37398zbg));
        }

        public boolean isSupported() {
            return this.f37393zba;
        }

        @Deprecated
        public boolean requestVerifiedPhoneNumber() {
            return this.f37398zbg;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getServerClientId(), false);
            SafeParcelWriter.writeString(parcel, 3, getNonce(), false);
            SafeParcelWriter.writeBoolean(parcel, 4, filterByAuthorizedAccounts());
            SafeParcelWriter.writeString(parcel, 5, getLinkedServiceId(), false);
            SafeParcelWriter.writeStringList(parcel, 6, getIdTokenDepositionScopes(), false);
            SafeParcelWriter.writeBoolean(parcel, 7, requestVerifiedPhoneNumber());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasskeyJsonRequestOptionsCreator")
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean f37405zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getRequestJson", id = 2)
        private final String f37406zbb;

        public static final class Builder {

            /* JADX INFO: renamed from: zba, reason: collision with root package name */
            private boolean f37407zba = false;

            /* JADX INFO: renamed from: zbb, reason: collision with root package name */
            private String f37408zbb;

            @NonNull
            public PasskeyJsonRequestOptions build() {
                return new PasskeyJsonRequestOptions(this.f37407zba, this.f37408zbb);
            }

            @NonNull
            public Builder setRequestJson(@NonNull String str) {
                this.f37408zbb = str;
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z) {
                this.f37407zba = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public PasskeyJsonRequestOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) String str) {
            if (z) {
                Preconditions.checkNotNull(str);
            }
            this.f37405zba = z;
            this.f37406zbb = str;
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj2;
            return this.f37405zba == passkeyJsonRequestOptions.f37405zba && Objects.equal(this.f37406zbb, passkeyJsonRequestOptions.f37406zbb);
        }

        @NonNull
        public String getRequestJson() {
            return this.f37406zbb;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f37405zba), this.f37406zbb);
        }

        public boolean isSupported() {
            return this.f37405zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeString(parcel, 2, getRequestJson(), false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasskeysRequestOptionsCreator")
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean f37409zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        @SafeParcelable.Field(getter = "getChallenge", id = 2)
        private final byte[] f37410zbb;

        @SafeParcelable.Field(getter = "getRpId", id = 3)
        private final String zbc;

        public static final class Builder {

            /* JADX INFO: renamed from: zba, reason: collision with root package name */
            private boolean f37411zba = false;

            /* JADX INFO: renamed from: zbb, reason: collision with root package name */
            private byte[] f37412zbb;
            private String zbc;

            @NonNull
            public PasskeysRequestOptions build() {
                return new PasskeysRequestOptions(this.f37411zba, this.f37412zbb, this.zbc);
            }

            @NonNull
            public Builder setChallenge(@NonNull byte[] bArr) {
                this.f37412zbb = bArr;
                return this;
            }

            @NonNull
            public Builder setRpId(@NonNull String str) {
                this.zbc = str;
                return this;
            }

            @NonNull
            public Builder setSupported(boolean z) {
                this.f37411zba = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public PasskeysRequestOptions(@SafeParcelable.Param(id = 1) boolean z, @SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) String str) {
            if (z) {
                Preconditions.checkNotNull(bArr);
                Preconditions.checkNotNull(str);
            }
            this.f37409zba = z;
            this.f37410zbb = bArr;
            this.zbc = str;
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj2;
            return this.f37409zba == passkeysRequestOptions.f37409zba && Arrays.equals(this.f37410zbb, passkeysRequestOptions.f37410zbb) && java.util.Objects.equals(this.zbc, passkeysRequestOptions.zbc);
        }

        @NonNull
        public byte[] getChallenge() {
            return this.f37410zbb;
        }

        @NonNull
        public String getRpId() {
            return this.zbc;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f37410zbb) + (java.util.Objects.hash(Boolean.valueOf(this.f37409zba), this.zbc) * 31);
        }

        public boolean isSupported() {
            return this.f37409zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.writeByteArray(parcel, 2, getChallenge(), false);
            SafeParcelWriter.writeString(parcel, 3, getRpId(), false);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Class(creator = "PasswordRequestOptionsCreator")
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        @SafeParcelable.Field(getter = "isSupported", id = 1)
        private final boolean f37413zba;

        public static final class Builder {

            /* JADX INFO: renamed from: zba, reason: collision with root package name */
            private boolean f37414zba = false;

            @NonNull
            public PasswordRequestOptions build() {
                return new PasswordRequestOptions(this.f37414zba);
            }

            @NonNull
            public Builder setSupported(boolean z) {
                this.f37414zba = z;
                return this;
            }
        }

        @SafeParcelable.Constructor
        public PasswordRequestOptions(@SafeParcelable.Param(id = 1) boolean z) {
            this.f37413zba = z;
        }

        @NonNull
        public static Builder builder() {
            return new Builder();
        }

        public boolean equals(Object obj2) {
            return (obj2 instanceof PasswordRequestOptions) && this.f37413zba == ((PasswordRequestOptions) obj2).f37413zba;
        }

        public int hashCode() {
            return Objects.hashCode(Boolean.valueOf(this.f37413zba));
        }

        public boolean isSupported() {
            return this.f37413zba;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeBoolean(parcel, 1, isSupported());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public BeginSignInRequest(@SafeParcelable.Param(id = 1) PasswordRequestOptions passwordRequestOptions, @SafeParcelable.Param(id = 2) GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @SafeParcelable.Param(id = 3) String str, @SafeParcelable.Param(id = 4) boolean z, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) PasskeysRequestOptions passkeysRequestOptions, @SafeParcelable.Param(id = 7) PasskeyJsonRequestOptions passkeyJsonRequestOptions, @SafeParcelable.Param(id = 8) boolean z3) {
        this.f37379zba = (PasswordRequestOptions) Preconditions.checkNotNull(passwordRequestOptions);
        this.f37380zbb = (GoogleIdTokenRequestOptions) Preconditions.checkNotNull(googleIdTokenRequestOptions);
        this.zbc = str;
        this.f37381zbd = z;
        this.f37382zbe = i;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.Builder builder = PasskeysRequestOptions.builder();
            builder.setSupported(false);
            passkeysRequestOptions = builder.build();
        }
        this.f37383zbf = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.Builder builder2 = PasskeyJsonRequestOptions.builder();
            builder2.setSupported(false);
            passkeyJsonRequestOptions = builder2.build();
        }
        this.f37384zbg = passkeyJsonRequestOptions;
        this.f37385zbh = z3;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull BeginSignInRequest beginSignInRequest) {
        Preconditions.checkNotNull(beginSignInRequest);
        Builder builder = builder();
        builder.setGoogleIdTokenRequestOptions(beginSignInRequest.getGoogleIdTokenRequestOptions());
        builder.setPasswordRequestOptions(beginSignInRequest.getPasswordRequestOptions());
        builder.setPasskeysSignInRequestOptions(beginSignInRequest.getPasskeysRequestOptions());
        builder.setPasskeyJsonSignInRequestOptions(beginSignInRequest.getPasskeyJsonRequestOptions());
        builder.setAutoSelectEnabled(beginSignInRequest.f37381zbd);
        builder.zbb(beginSignInRequest.f37382zbe);
        builder.setPreferImmediatelyAvailableCredentials(beginSignInRequest.f37385zbh);
        String str = beginSignInRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj2;
        return Objects.equal(this.f37379zba, beginSignInRequest.f37379zba) && Objects.equal(this.f37380zbb, beginSignInRequest.f37380zbb) && Objects.equal(this.f37383zbf, beginSignInRequest.f37383zbf) && Objects.equal(this.f37384zbg, beginSignInRequest.f37384zbg) && Objects.equal(this.zbc, beginSignInRequest.zbc) && this.f37381zbd == beginSignInRequest.f37381zbd && this.f37382zbe == beginSignInRequest.f37382zbe && this.f37385zbh == beginSignInRequest.f37385zbh;
    }

    @NonNull
    public GoogleIdTokenRequestOptions getGoogleIdTokenRequestOptions() {
        return this.f37380zbb;
    }

    @NonNull
    public PasskeyJsonRequestOptions getPasskeyJsonRequestOptions() {
        return this.f37384zbg;
    }

    @NonNull
    public PasskeysRequestOptions getPasskeysRequestOptions() {
        return this.f37383zbf;
    }

    @NonNull
    public PasswordRequestOptions getPasswordRequestOptions() {
        return this.f37379zba;
    }

    public boolean getPreferImmediatelyAvailableCredentials() {
        return this.f37385zbh;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37379zba, this.f37380zbb, this.f37383zbf, this.f37384zbg, this.zbc, Boolean.valueOf(this.f37381zbd), Integer.valueOf(this.f37382zbe), Boolean.valueOf(this.f37385zbh));
    }

    public boolean isAutoSelectEnabled() {
        return this.f37381zbd;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPasswordRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getGoogleIdTokenRequestOptions(), i, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isAutoSelectEnabled());
        SafeParcelWriter.writeInt(parcel, 5, this.f37382zbe);
        SafeParcelWriter.writeParcelable(parcel, 6, getPasskeysRequestOptions(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, getPasskeyJsonRequestOptions(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 8, getPreferImmediatelyAvailableCredentials());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
