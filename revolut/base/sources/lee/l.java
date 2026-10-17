package lee;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f194537b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f194536a = items;
        this.f194537b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f194536a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f194536a, lVar.f194536a) && this.f194537b == lVar.f194537b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f194537b) + (this.f194536a.hashCode() * 31);
    }
}
