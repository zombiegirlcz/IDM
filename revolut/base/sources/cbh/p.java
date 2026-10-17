package cbh;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f22840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22841b;

    public p(n toolbar, ArrayList items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f22840a = toolbar;
        this.f22841b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f22841b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f22840a.equals(pVar.f22840a) && this.f22841b.equals(pVar.f22841b);
    }

    public final int hashCode() {
        return this.f22841b.hashCode() + (this.f22840a.f22830a.hashCode() * 31);
    }
}
