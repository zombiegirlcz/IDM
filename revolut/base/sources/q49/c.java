package q49;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f242084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242085c;
    public final int d;

    public c() {
        this(0);
    }

    public static c a(c cVar, List initialTabs, List tabs, String str, int i, int i2) {
        if ((i2 & 1) != 0) {
            initialTabs = cVar.f242083a;
        }
        if ((i2 & 2) != 0) {
            tabs = cVar.f242084b;
        }
        if ((i2 & 4) != 0) {
            str = cVar.f242085c;
        }
        if ((i2 & 8) != 0) {
            i = cVar.d;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(initialTabs, "initialTabs");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        return new c(i, str, initialTabs, tabs);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f242083a, cVar.f242083a) && Intrinsics.f(this.f242084b, cVar.f242084b) && Intrinsics.f(this.f242085c, cVar.f242085c) && this.d == cVar.d;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f242083a.hashCode() * 31, 31, this.f242084b);
        String str = this.f242085c;
        return Integer.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }

    public c(int i, String str, List initialTabs, List tabs) {
        Intrinsics.checkNotNullParameter(initialTabs, "initialTabs");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f242083a = initialTabs;
        this.f242084b = tabs;
        this.f242085c = str;
        this.d = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(int i) {
        f0 f0Var = f0.f322471a;
        this(0, null, f0Var, f0Var);
    }
}
