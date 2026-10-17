package kq2;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f188324c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f188325g;

    public p(String str, String str2, String str3, String str4, String str5, String str6, Map accountFields) {
        Intrinsics.checkNotNullParameter(accountFields, "accountFields");
        this.f188322a = str;
        this.f188323b = str2;
        this.f188324c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f188325g = accountFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f188322a, pVar.f188322a) && Intrinsics.f(this.f188323b, pVar.f188323b) && Intrinsics.f(this.f188324c, pVar.f188324c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f188325g, pVar.f188325g);
    }

    public final int hashCode() {
        String str = this.f188322a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f188323b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f188324c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        return this.f188325g.hashCode() + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }
}
