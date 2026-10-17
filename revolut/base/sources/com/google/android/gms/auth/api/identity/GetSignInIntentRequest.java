package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "GetSignInIntentRequestCreator")
@Deprecated
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new zbl();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getServerClientId", id = 1)
    private final String f37417zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getHostedDomainFilter", id = 2)
    private final String f37418zbb;

    @SafeParcelable.Field(getter = "getSessionId", id = 3)
    private final String zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getNonce", id = 4)
    private final String f37419zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "requestVerifiedPhoneNumber", id = 5)
    private final boolean f37420zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int f37421zbf;

    public static final class Builder {

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        private String f37422zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        private String f37423zbb;
        private String zbc;

        /* JADX INFO: renamed from: zbd, reason: collision with root package name */
        private String f37424zbd;

        /* JADX INFO: renamed from: zbe, reason: collision with root package name */
        private boolean f37425zbe;

        /* JADX INFO: renamed from: zbf, reason: collision with root package name */
        private int f37426zbf;

        @NonNull
        public GetSignInIntentRequest build() {
            return new GetSignInIntentRequest(this.f37422zba, this.f37423zbb, this.zbc, this.f37424zbd, this.f37425zbe, this.f37426zbf);
        }

        @NonNull
        public Builder filterByHostedDomain(String str) {
            this.f37423zbb = str;
            return this;
        }

        @NonNull
        public Builder setNonce(String str) {
            this.f37424zbd = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setRequestVerifiedPhoneNumber(boolean z) {
            this.f37425zbe = z;
            return this;
        }

        @NonNull
        public Builder setServerClientId(@NonNull String str) {
            Preconditions.checkNotNull(str);
            this.f37422zba = str;
            return this;
        }

        @NonNull
        public final Builder zba(String str) {
            this.zbc = str;
            return this;
        }

        @NonNull
        public final Builder zbb(int i) {
            this.f37426zbf = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public GetSignInIntentRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) String str3, @SafeParcelable.Param(id = 4) String str4, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i) {
        Preconditions.checkNotNull(str);
        this.f37417zba = str;
        this.f37418zbb = str2;
        this.zbc = str3;
        this.f37419zbd = str4;
        this.f37420zbe = z;
        this.f37421zbf = i;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull GetSignInIntentRequest getSignInIntentRequest) {
        Preconditions.checkNotNull(getSignInIntentRequest);
        Builder builder = builder();
        builder.setServerClientId(getSignInIntentRequest.getServerClientId());
        builder.setNonce(getSignInIntentRequest.getNonce());
        builder.filterByHostedDomain(getSignInIntentRequest.getHostedDomainFilter());
        builder.setRequestVerifiedPhoneNumber(getSignInIntentRequest.f37420zbe);
        builder.zbb(getSignInIntentRequest.f37421zbf);
        String str = getSignInIntentRequest.zbc;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj2;
        return Objects.equal(this.f37417zba, getSignInIntentRequest.f37417zba) && Objects.equal(this.f37419zbd, getSignInIntentRequest.f37419zbd) && Objects.equal(this.f37418zbb, getSignInIntentRequest.f37418zbb) && Objects.equal(Boolean.valueOf(this.f37420zbe), Boolean.valueOf(getSignInIntentRequest.f37420zbe)) && this.f37421zbf == getSignInIntentRequest.f37421zbf;
    }

    public String getHostedDomainFilter() {
        return this.f37418zbb;
    }

    public String getNonce() {
        return this.f37419zbd;
    }

    @NonNull
    public String getServerClientId() {
        return this.f37417zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37417zba, this.f37418zbb, this.f37419zbd, Boolean.valueOf(this.f37420zbe), Integer.valueOf(this.f37421zbf));
    }

    @Deprecated
    public boolean requestVerifiedPhoneNumber() {
        return this.f37420zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 2, getHostedDomainFilter(), false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeString(parcel, 4, getNonce(), false);
        SafeParcelWriter.writeBoolean(parcel, 5, requestVerifiedPhoneNumber());
        SafeParcelWriter.writeInt(parcel, 6, this.f37421zbf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
