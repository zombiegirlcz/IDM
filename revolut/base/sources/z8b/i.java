package z8b;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320062a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320062a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f320062a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f320062a, ((i) obj2).f320062a);
    }

    public final int hashCode() {
        return this.f320062a.hashCode();
    }
}
