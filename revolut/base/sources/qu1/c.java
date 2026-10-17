package qu1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249176a;

    public c(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249176a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f249176a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f249176a, ((c) obj2).f249176a);
    }

    public final int hashCode() {
        return this.f249176a.hashCode();
    }
}
