package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295033c;
    public final Boolean d;

    public /* synthetic */ u2(int i, Boolean bool, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            qlm.j1.f(s2.f295005a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295031a = str;
        this.f295032b = str2;
        this.f295033c = str3;
        this.d = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.f295031a, u2Var.f295031a) && Intrinsics.f(this.f295032b, u2Var.f295032b) && Intrinsics.f(this.f295033c, u2Var.f295033c) && Intrinsics.f(this.d, u2Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f295031a.hashCode() * 31, 31, this.f295032b);
        String str = this.f295033c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public u2(String icon, String title, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f295031a = icon;
        this.f295032b = title;
        this.f295033c = str;
        this.d = bool;
    }
}
