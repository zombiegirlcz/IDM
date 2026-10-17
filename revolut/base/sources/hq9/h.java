package hq9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f154642a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f154642a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f154642a, ((h) obj2).f154642a);
    }

    public final int hashCode() {
        return this.f154642a.hashCode();
    }
}
