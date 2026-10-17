package qua;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f249302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f249304c;
    public final String d;
    public final String e;
    public final String f;

    public l(String name, k kVar, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f249302a = name;
        this.f249303b = kVar;
        this.f249304c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f249302a, lVar.f249302a) && this.f249303b == lVar.f249303b && Intrinsics.f(this.f249304c, lVar.f249304c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f249302a.hashCode() * 31;
        k kVar = this.f249303b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.f249304c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }
}
