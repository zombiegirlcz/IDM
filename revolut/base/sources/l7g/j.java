package l7g;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192613c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f192614g;

    public j(String code, String name, String str, String str2, String str3, String str4, ArrayList airlineRules) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(airlineRules, "airlineRules");
        this.f192611a = code;
        this.f192612b = name;
        this.f192613c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.f192614g = airlineRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f192611a, jVar.f192611a) && Intrinsics.f(this.f192612b, jVar.f192612b) && Intrinsics.f(this.f192613c, jVar.f192613c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && this.f192614g.equals(jVar.f192614g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f192611a.hashCode() * 31, 31, this.f192612b);
        String str = this.f192613c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return this.f192614g.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }
}
