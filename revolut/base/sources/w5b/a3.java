package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294776c;
    public final String d;

    public /* synthetic */ a3(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(y2.f295082a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294774a = str;
        this.f294775b = str2;
        this.f294776c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f294774a, a3Var.f294774a) && Intrinsics.f(this.f294775b, a3Var.f294775b) && Intrinsics.f(this.f294776c, a3Var.f294776c) && Intrinsics.f(this.d, a3Var.d);
    }

    public final int hashCode() {
        String str = this.f294774a;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f294775b), 31, this.f294776c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public a3(String str, String title, String deeplink, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f294774a = str;
        this.f294775b = title;
        this.f294776c = deeplink;
        this.d = str2;
    }
}
