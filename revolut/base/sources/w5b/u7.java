package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u7 {

    @NotNull
    public static final t7 Companion = new t7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295040c;
    public final String d;
    public final String e;
    public final x7 f;

    public /* synthetic */ u7(int i, String str, String str2, String str3, String str4, String str5, x7 x7Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(s7.f295010a.getDescriptor(), i, 63);
            throw null;
        }
        this.f295038a = str;
        this.f295039b = str2;
        this.f295040c = str3;
        this.d = str4;
        this.e = str5;
        this.f = x7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj2;
        return Intrinsics.f(this.f295038a, u7Var.f295038a) && Intrinsics.f(this.f295039b, u7Var.f295039b) && Intrinsics.f(this.f295040c, u7Var.f295040c) && Intrinsics.f(this.d, u7Var.d) && Intrinsics.f(this.e, u7Var.e) && Intrinsics.f(this.f, u7Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295038a.hashCode() * 31, 31, this.f295039b);
        String str = this.f295040c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        x7 x7Var = this.f;
        return iHashCode + (x7Var != null ? x7Var.hashCode() : 0);
    }

    public u7(String headerTitle, String iconUrl, String str, String primaryTitle, String str2, x7 x7Var) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(primaryTitle, "primaryTitle");
        this.f295038a = headerTitle;
        this.f295039b = iconUrl;
        this.f295040c = str;
        this.d = primaryTitle;
        this.e = str2;
        this.f = x7Var;
    }
}
