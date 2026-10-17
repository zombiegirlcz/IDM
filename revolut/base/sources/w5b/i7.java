package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i7 {

    @NotNull
    public static final h7 Companion = new h7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294880c;
    public final h6 d;
    public final l7 e;

    public /* synthetic */ i7(int i, String str, String str2, String str3, h6 h6Var, l7 l7Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(g7.f294858a.getDescriptor(), i, 31);
            throw null;
        }
        this.f294878a = str;
        this.f294879b = str2;
        this.f294880c = str3;
        this.d = h6Var;
        this.e = l7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj2;
        return Intrinsics.f(this.f294878a, i7Var.f294878a) && Intrinsics.f(this.f294879b, i7Var.f294879b) && Intrinsics.f(this.f294880c, i7Var.f294880c) && Intrinsics.f(this.d, i7Var.d) && Intrinsics.f(this.e, i7Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f294878a.hashCode() * 31, 31, this.f294879b), 31, this.f294880c)) * 31;
        l7 l7Var = this.e;
        return iHashCode + (l7Var == null ? 0 : l7Var.hashCode());
    }

    public i7(String icon, String title, String subtitle, h6 action, l7 l7Var) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f294878a = icon;
        this.f294879b = title;
        this.f294880c = subtitle;
        this.d = action;
        this.e = l7Var;
    }
}
