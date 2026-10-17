package e94;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123916a;

    public o(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123916a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f123916a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f123916a, ((o) obj2).f123916a);
    }

    public final int hashCode() {
        return this.f123916a.hashCode();
    }
}
