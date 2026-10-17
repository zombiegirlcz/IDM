package ux6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f283883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283884b;

    public l(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283883a = items;
        this.f283884b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f283883a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f283883a, lVar.f283883a) && this.f283884b == lVar.f283884b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f283884b) + (this.f283883a.hashCode() * 31);
    }
}
