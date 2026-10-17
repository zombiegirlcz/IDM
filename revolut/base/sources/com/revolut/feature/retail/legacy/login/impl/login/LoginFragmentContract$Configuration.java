package com.revolut.feature.retail.legacy.login.impl.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sab.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/legacy/login/impl/login/LoginFragmentContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_legacy_login_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoginFragmentContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginFragmentContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f82691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f82693c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f82694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f82695h;
    public final AnalyticsProduct i;

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
            return new LoginFragmentContract$Configuration(bVarValueOf, string, z4, string2, z3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readParcelable(LoginFragmentContract$Configuration.class.getClassLoader()), (AnalyticsProduct) parcel.readParcelable(LoginFragmentContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoginFragmentContract$Configuration[i];
        }
    }

    public LoginFragmentContract$Configuration(b loginMode, String str, boolean z, String str2, boolean z3, String str3, Integer num, Parcelable parcelable, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(loginMode, "loginMode");
        this.f82691a = loginMode;
        this.f82692b = str;
        this.f82693c = z;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.f82694g = num;
        this.f82695h = parcelable;
        this.i = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoginFragmentContract$Configuration)) {
            return false;
        }
        LoginFragmentContract$Configuration loginFragmentContract$Configuration = (LoginFragmentContract$Configuration) obj2;
        return this.f82691a == loginFragmentContract$Configuration.f82691a && Intrinsics.f(this.f82692b, loginFragmentContract$Configuration.f82692b) && this.f82693c == loginFragmentContract$Configuration.f82693c && Intrinsics.f(this.d, loginFragmentContract$Configuration.d) && this.e == loginFragmentContract$Configuration.e && Intrinsics.f(this.f, loginFragmentContract$Configuration.f) && Intrinsics.f(this.f82694g, loginFragmentContract$Configuration.f82694g) && Intrinsics.f(this.f82695h, loginFragmentContract$Configuration.f82695h) && Intrinsics.f(this.i, loginFragmentContract$Configuration.i);
    }

    public final int hashCode() {
        int iHashCode = this.f82691a.hashCode() * 31;
        String str = this.f82692b;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f82693c);
        String str2 = this.d;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f82694g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Parcelable parcelable = this.f82695h;
        int iHashCode4 = (iHashCode3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        AnalyticsProduct analyticsProduct = this.i;
        return iHashCode4 + (analyticsProduct != null ? analyticsProduct.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82691a.name());
        dest.writeString(this.f82692b);
        dest.writeInt(this.f82693c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        Integer num = this.f82694g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeParcelable(this.f82695h, i);
        dest.writeParcelable(this.i, i);
    }

    public /* synthetic */ LoginFragmentContract$Configuration(b bVar, String str, boolean z, String str2, boolean z3, String str3, Integer num, Parcelable parcelable, int i) {
        this(bVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str2, z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : parcelable, (AnalyticsProduct) null);
    }
}
