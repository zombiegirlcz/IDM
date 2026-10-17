package dhi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f114818a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f114818a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f114818a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f114818a, ((g) obj2).f114818a);
    }

    public final int hashCode() {
        return this.f114818a.hashCode();
    }
}
