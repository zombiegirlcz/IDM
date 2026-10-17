package k25;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f180329a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180329a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f180329a, ((d) obj2).f180329a);
    }

    public final int hashCode() {
        return this.f180329a.hashCode();
    }
}
