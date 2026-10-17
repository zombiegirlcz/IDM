package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@SafeParcelable.Class(creator = "SaveAccountLinkingTokenRequestCreator")
public class SaveAccountLinkingTokenRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getConsentPendingIntent", id = 1)
    private final PendingIntent f37427zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTokenType", id = 2)
    private final String f37428zbb;

    @SafeParcelable.Field(getter = "getServiceId", id = 3)
    private final String zbc;

    /* JADX INFO: renamed from: zbd, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getScopes", id = 4)
    private final List f37429zbd;

    /* JADX INFO: renamed from: zbe, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 5)
    private final String f37430zbe;

    /* JADX INFO: renamed from: zbf, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getTheme", id = 6)
    private final int f37431zbf;

    @NonNull
    public static final String TOKEN_TYPE_AUTH_CODE = "auth_code";

    @NonNull
    public static final String EXTRA_TOKEN = "extra_token";

    @NonNull
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new zbq();

    public static final class Builder {

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        private PendingIntent f37432zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        private String f37433zbb;
        private String zbc;

        /* JADX INFO: renamed from: zbd, reason: collision with root package name */
        private List f37434zbd = new ArrayList();

        /* JADX INFO: renamed from: zbe, reason: collision with root package name */
        private String f37435zbe;

        /* JADX INFO: renamed from: zbf, reason: collision with root package name */
        private int f37436zbf;

        @NonNull
        public SaveAccountLinkingTokenRequest build() {
            Preconditions.checkArgument(this.f37432zba != null, "Consent PendingIntent cannot be null");
            Preconditions.checkArgument("auth_code".equals(this.f37433zbb), "Invalid tokenType");
            Preconditions.checkArgument(!TextUtils.isEmpty(this.zbc), "serviceId cannot be null or empty");
            Preconditions.checkArgument(this.f37434zbd != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f37432zba, this.f37433zbb, this.zbc, this.f37434zbd, this.f37435zbe, this.f37436zbf);
        }

        @NonNull
        public Builder setConsentPendingIntent(@NonNull PendingIntent pendingIntent) {
            this.f37432zba = pendingIntent;
            return this;
        }

        @NonNull
        public Builder setScopes(@NonNull List<String> list) {
            this.f37434zbd = list;
            return this;
        }

        @NonNull
        public Builder setServiceId(@NonNull String str) {
            this.zbc = str;
            return this;
        }

        @NonNull
        public Builder setTokenType(@NonNull String str) {
            this.f37433zbb = str;
            return this;
        }

        @NonNull
        public final Builder zba(@NonNull String str) {
            this.f37435zbe = str;
            return this;
        }

        @NonNull
        public final Builder zbb(int i) {
            this.f37436zbf = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SaveAccountLinkingTokenRequest(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List list, @SafeParcelable.Param(id = 5) String str3, @SafeParcelable.Param(id = 6) int i) {
        this.f37427zba = pendingIntent;
        this.f37428zbb = str;
        this.zbc = str2;
        this.f37429zbd = list;
        this.f37430zbe = str3;
        this.f37431zbf = i;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Preconditions.checkNotNull(saveAccountLinkingTokenRequest);
        Builder builder = builder();
        builder.setScopes(saveAccountLinkingTokenRequest.getScopes());
        builder.setServiceId(saveAccountLinkingTokenRequest.getServiceId());
        builder.setConsentPendingIntent(saveAccountLinkingTokenRequest.getConsentPendingIntent());
        builder.setTokenType(saveAccountLinkingTokenRequest.getTokenType());
        builder.zbb(saveAccountLinkingTokenRequest.f37431zbf);
        String str = saveAccountLinkingTokenRequest.f37430zbe;
        if (!TextUtils.isEmpty(str)) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj2;
        return this.f37429zbd.size() == saveAccountLinkingTokenRequest.f37429zbd.size() && this.f37429zbd.containsAll(saveAccountLinkingTokenRequest.f37429zbd) && Objects.equal(this.f37427zba, saveAccountLinkingTokenRequest.f37427zba) && Objects.equal(this.f37428zbb, saveAccountLinkingTokenRequest.f37428zbb) && Objects.equal(this.zbc, saveAccountLinkingTokenRequest.zbc) && Objects.equal(this.f37430zbe, saveAccountLinkingTokenRequest.f37430zbe) && this.f37431zbf == saveAccountLinkingTokenRequest.f37431zbf;
    }

    @NonNull
    public PendingIntent getConsentPendingIntent() {
        return this.f37427zba;
    }

    @NonNull
    public List<String> getScopes() {
        return this.f37429zbd;
    }

    @NonNull
    public String getServiceId() {
        return this.zbc;
    }

    @NonNull
    public String getTokenType() {
        return this.f37428zbb;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37427zba, this.f37428zbb, this.zbc, this.f37429zbd, this.f37430zbe);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getConsentPendingIntent(), i, false);
        SafeParcelWriter.writeString(parcel, 2, getTokenType(), false);
        SafeParcelWriter.writeString(parcel, 3, getServiceId(), false);
        SafeParcelWriter.writeStringList(parcel, 4, getScopes(), false);
        SafeParcelWriter.writeString(parcel, 5, this.f37430zbe, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f37431zbf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
