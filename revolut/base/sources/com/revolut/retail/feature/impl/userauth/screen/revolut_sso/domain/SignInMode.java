package com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode;", "Landroid/os/Parcelable;", "AutoWithPasscode", "AutoWithPasskey", "Default", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$AutoWithPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$AutoWithPasskey;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$Default;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SignInMode extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$AutoWithPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoWithPasscode implements SignInMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101720c;

        @NotNull
        public static final Parcelable.Creator<AutoWithPasscode> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoWithPasscode(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoWithPasscode[i];
            }
        }

        public AutoWithPasscode(String codeVerifier, String passcode, String authCode) {
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            Intrinsics.checkNotNullParameter(passcode, "passcode");
            Intrinsics.checkNotNullParameter(authCode, "authCode");
            this.f101718a = codeVerifier;
            this.f101719b = passcode;
            this.f101720c = authCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoWithPasscode)) {
                return false;
            }
            AutoWithPasscode autoWithPasscode = (AutoWithPasscode) obj2;
            return Intrinsics.f(this.f101718a, autoWithPasscode.f101718a) && Intrinsics.f(this.f101719b, autoWithPasscode.f101719b) && Intrinsics.f(this.f101720c, autoWithPasscode.f101720c);
        }

        public final int hashCode() {
            return this.f101720c.hashCode() + a.c(this.f101718a.hashCode() * 31, 31, this.f101719b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101718a);
            dest.writeString(this.f101719b);
            dest.writeString(this.f101720c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$AutoWithPasskey;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoWithPasskey implements SignInMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101722b;

        @NotNull
        public static final Parcelable.Creator<AutoWithPasskey> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoWithPasskey(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoWithPasskey[i];
            }
        }

        public AutoWithPasskey(String codeVerifier, String authCode) {
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            Intrinsics.checkNotNullParameter(authCode, "authCode");
            this.f101721a = codeVerifier;
            this.f101722b = authCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoWithPasskey)) {
                return false;
            }
            AutoWithPasskey autoWithPasskey = (AutoWithPasskey) obj2;
            return Intrinsics.f(this.f101721a, autoWithPasskey.f101721a) && Intrinsics.f(this.f101722b, autoWithPasskey.f101722b);
        }

        public final int hashCode() {
            return this.f101722b.hashCode() + (this.f101721a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101721a);
            dest.writeString(this.f101722b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode$Default;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/domain/SignInMode;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements SignInMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthFeatureConfig.SignInParams f101723a;

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default((UserAuthFeatureConfig.SignInParams) parcel.readParcelable(Default.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(UserAuthFeatureConfig.SignInParams signInParams) {
            Intrinsics.checkNotNullParameter(signInParams, "signInParams");
            this.f101723a = signInParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Default) && Intrinsics.f(this.f101723a, ((Default) obj2).f101723a);
        }

        public final int hashCode() {
            return this.f101723a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101723a, i);
        }
    }
}
