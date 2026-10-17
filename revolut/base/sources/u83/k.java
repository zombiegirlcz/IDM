package u83;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278106a;

    public k(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f278106a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f278106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f278106a, ((k) obj2).f278106a);
    }

    public final int hashCode() {
        return this.f278106a.hashCode();
    }
}
