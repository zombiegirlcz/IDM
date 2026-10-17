package com.revolut.ui.login.pin;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sab.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/ui/login/pin/LoginScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoginScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LoginScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f107077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f107079c;
    public final String d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f107080g;

    /* JADX INFO: loaded from: classes12.dex */
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
            return new LoginScreenContract$Configuration(bVarValueOf, string, z4, string2, z3, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LoginScreenContract$Configuration[i];
        }
    }

    public LoginScreenContract$Configuration(b loginMode, String str, boolean z, String str2, boolean z3, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(loginMode, "loginMode");
        this.f107077a = loginMode;
        this.f107078b = str;
        this.f107079c = z;
        this.d = str2;
        this.e = z3;
        this.f = str3;
        this.f107080g = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LoginScreenContract$Configuration)) {
            return false;
        }
        LoginScreenContract$Configuration loginScreenContract$Configuration = (LoginScreenContract$Configuration) obj2;
        return this.f107077a == loginScreenContract$Configuration.f107077a && Intrinsics.f(this.f107078b, loginScreenContract$Configuration.f107078b) && this.f107079c == loginScreenContract$Configuration.f107079c && Intrinsics.f(this.d, loginScreenContract$Configuration.d) && this.e == loginScreenContract$Configuration.e && Intrinsics.f(this.f, loginScreenContract$Configuration.f) && Intrinsics.f(this.f107080g, loginScreenContract$Configuration.f107080g);
    }

    public final int hashCode() {
        int iHashCode = this.f107077a.hashCode() * 31;
        String str = this.f107078b;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f107079c);
        String str2 = this.d;
        int iC2 = j6.a.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
        String str3 = this.f;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f107080g;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f107077a.name());
        dest.writeString(this.f107078b);
        dest.writeInt(this.f107079c ? 1 : 0);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        Integer num = this.f107080g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }

    public /* synthetic */ LoginScreenContract$Configuration(b bVar, String str, String str2, Integer num, int i) {
        this(bVar, (i & 2) != 0 ? null : str, true, (i & 8) != 0 ? null : str2, false, null, (i & 64) != 0 ? null : num);
    }
}
