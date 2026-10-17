package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class a6 {

    @NotNull
    public static final z5 Companion = new z5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294780c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f294781g;

    public /* synthetic */ a6(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (1 != (i & 1)) {
            qlm.j1.f(y5.f295086a.getDescriptor(), i, 1);
            throw null;
        }
        this.f294778a = str;
        if ((i & 2) == 0) {
            this.f294779b = null;
        } else {
            this.f294779b = str2;
        }
        if ((i & 4) == 0) {
            this.f294780c = null;
        } else {
            this.f294780c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.f294781g = null;
        } else {
            this.f294781g = str7;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj2;
        return Intrinsics.f(this.f294778a, a6Var.f294778a) && Intrinsics.f(this.f294779b, a6Var.f294779b) && Intrinsics.f(this.f294780c, a6Var.f294780c) && Intrinsics.f(this.d, a6Var.d) && Intrinsics.f(this.e, a6Var.e) && Intrinsics.f(this.f, a6Var.f) && Intrinsics.f(this.f294781g, a6Var.f294781g);
    }

    public final int hashCode() {
        int iHashCode = this.f294778a.hashCode() * 31;
        String str = this.f294779b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f294780c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f294781g;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public a6(String title, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f294778a = title;
        this.f294779b = str;
        this.f294780c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f294781g = str6;
    }
}
