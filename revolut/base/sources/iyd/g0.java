package iyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f169665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f169666c;

    public /* synthetic */ g0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(e0.f169659a.getDescriptor(), i, 7);
            throw null;
        }
        this.f169664a = str;
        this.f169665b = str2;
        this.f169666c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f169664a, g0Var.f169664a) && Intrinsics.f(this.f169665b, g0Var.f169665b) && Intrinsics.f(this.f169666c, g0Var.f169666c);
    }

    public final int hashCode() {
        return this.f169666c.hashCode() + p.a.c(this.f169664a.hashCode() * 31, 31, this.f169665b);
    }

    public g0(String id10, String title, String icon) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f169664a = id10;
        this.f169665b = title;
        this.f169666c = icon;
    }
}
