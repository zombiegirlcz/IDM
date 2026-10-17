package or4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4.a f228059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f228060b;

    public g(hx4.a toolbarModel, List items) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f228059a = toolbarModel;
        this.f228060b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f228060b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f228059a.equals(gVar.f228059a) && Intrinsics.f(this.f228060b, gVar.f228060b);
    }

    public final int hashCode() {
        return this.f228060b.hashCode() + (this.f228059a.hashCode() * 31);
    }
}
