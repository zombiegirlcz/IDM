package com.revolut.retail.feature.api.userauth.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin;", "Landroid/os/Parcelable;", "Default", "DuplicateAccount", "LostAccess", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$Default;", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$DuplicateAccount;", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$LostAccess;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SignInOrigin extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$Default;", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin;", "<init>", "()V", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Default implements SignInOrigin {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f99273a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f99273a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$DuplicateAccount;", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DuplicateAccount implements SignInOrigin {

        @NotNull
        public static final Parcelable.Creator<DuplicateAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99274a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99275b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DuplicateAccount(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DuplicateAccount[i];
            }
        }

        public DuplicateAccount(String identityId, String str) {
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            this.f99274a = identityId;
            this.f99275b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DuplicateAccount)) {
                return false;
            }
            DuplicateAccount duplicateAccount = (DuplicateAccount) obj2;
            return Intrinsics.f(this.f99274a, duplicateAccount.f99274a) && Intrinsics.f(this.f99275b, duplicateAccount.f99275b);
        }

        public final int hashCode() {
            int iHashCode = this.f99274a.hashCode() * 31;
            String str = this.f99275b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99274a);
            dest.writeString(this.f99275b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin$LostAccess;", "Lcom/revolut/retail/feature/api/userauth/models/SignInOrigin;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LostAccess implements SignInOrigin {

        @NotNull
        public static final Parcelable.Creator<LostAccess> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier f99276a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LostAccess((RevolutSsoApi$DefaultIdentifier) parcel.readParcelable(LostAccess.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LostAccess[i];
            }
        }

        public LostAccess(RevolutSsoApi$DefaultIdentifier defaultIdentifier) {
            Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
            this.f99276a = defaultIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LostAccess) && Intrinsics.f(this.f99276a, ((LostAccess) obj2).f99276a);
        }

        public final int hashCode() {
            return this.f99276a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99276a, i);
        }
    }
}
