package w2e;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f294028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f294029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f294030c;

    public c(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f294028a = items;
        this.f294029b = menuItems;
        this.f294030c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f294028a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f294028a, cVar.f294028a) && Intrinsics.f(this.f294029b, cVar.f294029b) && this.f294030c == cVar.f294030c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f294030c) + p.a.d(this.f294028a.hashCode() * 31, 31, this.f294029b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        f0 f0Var = f0.f322471a;
        this(f0Var, false, f0Var);
    }
}
