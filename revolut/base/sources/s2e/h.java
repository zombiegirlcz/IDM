package s2e;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259295a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f259295a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f259295a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f259295a, ((h) obj2).f259295a);
    }

    public final int hashCode() {
        return this.f259295a.hashCode();
    }

    public h() {
        this(f0.f322471a);
    }
}
