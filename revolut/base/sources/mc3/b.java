package mc3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204267a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204267a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f204267a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f204267a, ((b) obj2).f204267a);
    }

    public final int hashCode() {
        return this.f204267a.hashCode();
    }
}
