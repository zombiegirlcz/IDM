package cyc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110082a;

    public f(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f110082a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f110082a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f110082a, ((f) obj2).f110082a);
    }

    public final int hashCode() {
        return this.f110082a.hashCode();
    }
}
