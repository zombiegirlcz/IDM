package k50;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f181096a;

    public h1(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f181096a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && Intrinsics.f(this.f181096a, ((h1) obj2).f181096a);
    }

    public final int hashCode() {
        return this.f181096a.hashCode();
    }
}
