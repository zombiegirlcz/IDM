package k66;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181651a;

    public j(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f181651a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f181651a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f181651a, ((j) obj2).f181651a);
    }

    public final int hashCode() {
        return this.f181651a.hashCode();
    }
}
