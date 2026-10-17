package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272647c;
    public final String d;
    public final String e;
    public final String f;

    public b4(String id10, String lastFour, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f272645a = id10;
        this.f272646b = lastFour;
        this.f272647c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f272645a, b4Var.f272645a) && Intrinsics.f(this.f272646b, b4Var.f272646b) && Intrinsics.f(this.f272647c, b4Var.f272647c) && Intrinsics.f(this.d, b4Var.d) && Intrinsics.f(this.e, b4Var.e) && Intrinsics.f(this.f, b4Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f272645a.hashCode() * 31, 31, this.f272646b);
        String str = this.f272647c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
