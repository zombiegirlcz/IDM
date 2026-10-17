package nd8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f214338a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f214338a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f214338a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f214338a, ((h) obj2).f214338a);
    }

    public final int hashCode() {
        return this.f214338a.hashCode();
    }
}
