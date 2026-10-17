package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y3 {

    @NotNull
    public static final x3 Companion = new x3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124713c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ y3(int i, String str, String str2, String str3, String str4, Boolean bool) {
        if (31 != (i & 31)) {
            qlm.j1.f(w3.f124699a.getDescriptor(), i, 31);
            throw null;
        }
        this.f124711a = str;
        this.f124712b = str2;
        this.f124713c = str3;
        this.d = str4;
        this.e = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj2;
        return Intrinsics.f(this.f124711a, y3Var.f124711a) && Intrinsics.f(this.f124712b, y3Var.f124712b) && Intrinsics.f(this.f124713c, y3Var.f124713c) && Intrinsics.f(this.d, y3Var.d) && Intrinsics.f(this.e, y3Var.e);
    }

    public final int hashCode() {
        String str = this.f124711a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f124712b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f124713c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public y3(String str, String str2, String str3, String str4, Boolean bool) {
        this.f124711a = str;
        this.f124712b = str2;
        this.f124713c = str3;
        this.d = str4;
        this.e = bool;
    }
}
