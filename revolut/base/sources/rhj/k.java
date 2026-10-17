package rhj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254498a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f254498a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f254498a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f254498a, ((k) obj2).f254498a);
    }

    public final int hashCode() {
        return this.f254498a.hashCode();
    }
}
