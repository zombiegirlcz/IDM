package bt4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18282a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f18282a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f18282a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f18282a, ((g) obj2).f18282a);
    }

    public final int hashCode() {
        return this.f18282a.hashCode();
    }
}
