package com.revolut.feature.retail.legacy.login.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sab.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Login", "TwoFaDeeplink", "Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig$Login;", "Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig$TwoFaDeeplink;", "feature_retail_legacy_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LegacyLoginFeatureConfig extends FeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig$Login;", "Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Login implements LegacyLoginFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Login> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f82660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82662c;
        public final String d;
        public final boolean e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Integer f82663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Parcelable f82664h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                b bVarValueOf = b.valueOf(parcel.readString());
                String string = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Login(bVarValueOf, string, z4, string2, z3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readParcelable(Login.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Login[i];
            }
        }

        public Login(b loginMode, String str, boolean z, String str2, boolean z3, String str3, Integer num, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(loginMode, "loginMode");
            this.f82660a = loginMode;
            this.f82661b = str;
            this.f82662c = z;
            this.d = str2;
            this.e = z3;
            this.f = str3;
            this.f82663g = num;
            this.f82664h = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Login)) {
                return false;
            }
            Login login = (Login) obj2;
            return this.f82660a == login.f82660a && Intrinsics.f(this.f82661b, login.f82661b) && this.f82662c == login.f82662c && Intrinsics.f(this.d, login.d) && this.e == login.e && Intrinsics.f(this.f, login.f) && Intrinsics.f(this.f82663g, login.f82663g) && Intrinsics.f(this.f82664h, login.f82664h);
        }

        public final int hashCode() {
            int iHashCode = this.f82660a.hashCode() * 31;
            String str = this.f82661b;
            int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f82662c);
            String str2 = this.d;
            int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
            String str3 = this.f;
            int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.f82663g;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Parcelable parcelable = this.f82664h;
            return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82660a.name());
            dest.writeString(this.f82661b);
            dest.writeInt(this.f82662c ? 1 : 0);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f);
            Integer num = this.f82663g;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            dest.writeParcelable(this.f82664h, i);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig$TwoFaDeeplink;", "Lcom/revolut/feature/retail/legacy/login/api/LegacyLoginFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TwoFaDeeplink implements LegacyLoginFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TwoFaDeeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82666b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TwoFaDeeplink(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TwoFaDeeplink[i];
            }
        }

        public TwoFaDeeplink(String twoFaCode, String deeplinkUri) {
            Intrinsics.checkNotNullParameter(twoFaCode, "twoFaCode");
            Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
            this.f82665a = twoFaCode;
            this.f82666b = deeplinkUri;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF82666b() {
            return this.f82666b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF82665a() {
            return this.f82665a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TwoFaDeeplink)) {
                return false;
            }
            TwoFaDeeplink twoFaDeeplink = (TwoFaDeeplink) obj2;
            return Intrinsics.f(this.f82665a, twoFaDeeplink.f82665a) && Intrinsics.f(this.f82666b, twoFaDeeplink.f82666b);
        }

        public final int hashCode() {
            return this.f82666b.hashCode() + (this.f82665a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82665a);
            dest.writeString(this.f82666b);
        }
    }
}
