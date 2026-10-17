package l27;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f191689b;

    public f(List items, e navBar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        this.f191688a = items;
        this.f191689b = navBar;
    }

    @Override // cli.p
    public final List c() {
        return this.f191688a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f191688a, fVar.f191688a) && Intrinsics.f(this.f191689b, fVar.f191689b);
    }

    public final int hashCode() {
        return this.f191689b.hashCode() + (this.f191688a.hashCode() * 31);
    }
}
