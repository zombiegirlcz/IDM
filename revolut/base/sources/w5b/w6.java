package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class w6 {

    @NotNull
    public static final v6 Companion = new v6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295061c;
    public final String d;

    public /* synthetic */ w6(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(u6.f295037a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295059a = str;
        this.f295060b = str2;
        this.f295061c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj2;
        return Intrinsics.f(this.f295059a, w6Var.f295059a) && Intrinsics.f(this.f295060b, w6Var.f295060b) && Intrinsics.f(this.f295061c, w6Var.f295061c) && Intrinsics.f(this.d, w6Var.d);
    }

    public final int hashCode() {
        String str = this.f295059a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f295060b;
        int iC = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f295061c);
        String str3 = this.d;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    public w6(String str, String str2, String title, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295059a = str;
        this.f295060b = str2;
        this.f295061c = title;
        this.d = str3;
    }
}
