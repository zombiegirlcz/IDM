package dfl;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f114447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114448c;
    public final String d;
    public final String e;
    public final String f;

    public o0(String id10, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f114446a = id10;
        this.f114447b = str;
        this.f114448c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f114446a, o0Var.f114446a) && Intrinsics.f(this.f114447b, o0Var.f114447b) && Intrinsics.f(this.f114448c, o0Var.f114448c) && Intrinsics.f(this.d, o0Var.d) && Intrinsics.f(this.e, o0Var.e) && Intrinsics.f(this.f, o0Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.f114446a.hashCode() * 31;
        String str = this.f114447b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114448c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
