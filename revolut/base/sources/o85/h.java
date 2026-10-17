package o85;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f222938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f222939b;

    public h(g toolbar, aim.e items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f222938a = toolbar;
        this.f222939b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f222939b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f222938a.equals(hVar.f222938a) && Intrinsics.f(this.f222939b, hVar.f222939b);
    }

    public final int hashCode() {
        return this.f222939b.hashCode() + (this.f222938a.hashCode() * 31);
    }
}
