package po1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f237882a;

    public l(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f237882a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f237882a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f237882a, ((l) obj2).f237882a);
    }

    public final int hashCode() {
        return this.f237882a.hashCode();
    }
}
