package x9f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f303707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f303708b;

    public l(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f303707a = z;
        this.f303708b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f303708b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f303707a == lVar.f303707a && Intrinsics.f(this.f303708b, lVar.f303708b);
    }

    public final int hashCode() {
        return this.f303708b.hashCode() + (Boolean.hashCode(this.f303707a) * 31);
    }
}
