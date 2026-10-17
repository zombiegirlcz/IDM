package qv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249530a;

    public i(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249530a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f249530a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f249530a, ((i) obj2).f249530a);
    }

    public final int hashCode() {
        return this.f249530a.hashCode();
    }
}
