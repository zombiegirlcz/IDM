package qp7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f248312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f248313b;

    public p(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f248312a = items;
        this.f248313b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f248312a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f248312a, pVar.f248312a) && this.f248313b == pVar.f248313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f248313b) + (this.f248312a.hashCode() * 31);
    }
}
