package com.revolut.sso.api.login;

import android.os.Parcel;
import android.os.Parcelable;
import bjl.n;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/sso/api/login/RevolutSsoApi$InputData$CombinedAuthentication", "", "", "toString", "()Ljava/lang/String;", "b", "bjl/n", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoApi$InputData$CombinedAuthentication implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoApi$InputData$CombinedAuthentication> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f105849c;
    public final boolean d;
    public final boolean e;
    public final n f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new RevolutSsoApi$InputData$CombinedAuthentication(string, string2, bVarValueOf, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : n.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoApi$InputData$CombinedAuthentication[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/api/login/RevolutSsoApi$InputData$CombinedAuthentication$b;", "", "TWO_BUTTONS_UI", "UNIFIED_UI", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @lg.b("TWO_BUTTONS_UI")
        public static final b TWO_BUTTONS_UI;

        @lg.b("UNIFIED_UI")
        public static final b UNIFIED_UI;

        static {
            b bVar = new b("TWO_BUTTONS_UI", 0);
            TWO_BUTTONS_UI = bVar;
            b bVar2 = new b("UNIFIED_UI", 1);
            UNIFIED_UI = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = s.n(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public RevolutSsoApi$InputData$CombinedAuthentication(String detectedCountryCode, String str, b mode, boolean z, boolean z3, n nVar) {
        Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f105847a = detectedCountryCode;
        this.f105848b = str;
        this.f105849c = mode;
        this.d = z;
        this.e = z3;
        this.f = nVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutSsoApi$InputData$CombinedAuthentication)) {
            return false;
        }
        RevolutSsoApi$InputData$CombinedAuthentication revolutSsoApi$InputData$CombinedAuthentication = (RevolutSsoApi$InputData$CombinedAuthentication) obj2;
        return Intrinsics.f(this.f105847a, revolutSsoApi$InputData$CombinedAuthentication.f105847a) && Intrinsics.f(this.f105848b, revolutSsoApi$InputData$CombinedAuthentication.f105848b) && this.f105849c == revolutSsoApi$InputData$CombinedAuthentication.f105849c && this.d == revolutSsoApi$InputData$CombinedAuthentication.d && this.e == revolutSsoApi$InputData$CombinedAuthentication.e && this.f == revolutSsoApi$InputData$CombinedAuthentication.f;
    }

    public final int hashCode() {
        int iHashCode = this.f105847a.hashCode() * 31;
        String str = this.f105848b;
        int iC = j6.a.c(j6.a.c((this.f105849c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        n nVar = this.f;
        return iC + (nVar != null ? nVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105847a);
        dest.writeString(this.f105848b);
        dest.writeString(this.f105849c.name());
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        n nVar = this.f;
        if (nVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(nVar.name());
        }
    }
}
