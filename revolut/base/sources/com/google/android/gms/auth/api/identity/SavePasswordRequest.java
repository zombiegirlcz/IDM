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
@SafeParcelable.Class(creator = "SavePasswordRequestCreator")
@Deprecated
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new zbs();

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSignInPassword", id = 1)
    private final SignInPassword f37438zba;

    /* JADX INFO: renamed from: zbb, reason: collision with root package name */
    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String f37439zbb;

    @SafeParcelable.Field(getter = "getTheme", id = 3)
    private final int zbc;

    @Deprecated
    public static final class Builder {

        /* JADX INFO: renamed from: zba, reason: collision with root package name */
        private SignInPassword f37440zba;

        /* JADX INFO: renamed from: zbb, reason: collision with root package name */
        private String f37441zbb;
        private int zbc;

        @NonNull
        public SavePasswordRequest build() {
            return new SavePasswordRequest(this.f37440zba, this.f37441zbb, this.zbc);
        }

        @NonNull
        public Builder setSignInPassword(@NonNull SignInPassword signInPassword) {
            this.f37440zba = signInPassword;
            return this;
        }

        @NonNull
        public final Builder zba(@NonNull String str) {
            this.f37441zbb = str;
            return this;
        }

        @NonNull
        public final Builder zbb(int i) {
            this.zbc = i;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SavePasswordRequest(@SafeParcelable.Param(id = 1) SignInPassword signInPassword, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i) {
        this.f37438zba = (SignInPassword) Preconditions.checkNotNull(signInPassword);
        this.f37439zbb = str;
        this.zbc = i;
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    public static Builder zba(@NonNull SavePasswordRequest savePasswordRequest) {
        Preconditions.checkNotNull(savePasswordRequest);
        Builder builder = builder();
        builder.setSignInPassword(savePasswordRequest.getSignInPassword());
        builder.zbb(savePasswordRequest.zbc);
        String str = savePasswordRequest.f37439zbb;
        if (str != null) {
            builder.zba(str);
        }
        return builder;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj2;
        return Objects.equal(this.f37438zba, savePasswordRequest.f37438zba) && Objects.equal(this.f37439zbb, savePasswordRequest.f37439zbb) && this.zbc == savePasswordRequest.zbc;
    }

    @NonNull
    public SignInPassword getSignInPassword() {
        return this.f37438zba;
    }

    public int hashCode() {
        return Objects.hashCode(this.f37438zba, this.f37439zbb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSignInPassword(), i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f37439zbb, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zbc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
