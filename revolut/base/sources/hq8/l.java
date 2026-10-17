package hq8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f154633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f154634b;

    public l(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154633a = z;
        this.f154634b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f154634b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f154633a == lVar.f154633a && Intrinsics.f(this.f154634b, lVar.f154634b);
    }

    public final int hashCode() {
        return this.f154634b.hashCode() + (Boolean.hashCode(this.f154633a) * 31);
    }
}
