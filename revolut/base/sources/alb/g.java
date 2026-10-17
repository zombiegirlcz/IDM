package alb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f6177b;

    public g(List items, aw0.e footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f6176a = items;
        this.f6177b = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f6176a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f6176a, gVar.f6176a) && this.f6177b.equals(gVar.f6177b);
    }

    public final int hashCode() {
        return this.f6177b.hashCode() + (this.f6176a.hashCode() * 31);
    }
}
