package k2h;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180585a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180585a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f180585a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f180585a, ((h) obj2).f180585a);
    }

    public final int hashCode() {
        return this.f180585a.hashCode();
    }
}
