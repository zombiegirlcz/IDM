package umk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f281326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f281327b;

    public k(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281326a = z;
        this.f281327b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f281327b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f281326a == kVar.f281326a && Intrinsics.f(this.f281327b, kVar.f281327b);
    }

    public final int hashCode() {
        return this.f281327b.hashCode() + (Boolean.hashCode(this.f281326a) * 31);
    }
}
