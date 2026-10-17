package w0a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f293673a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f293673a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f293673a, ((b) obj2).f293673a);
    }

    public final int hashCode() {
        return this.f293673a.hashCode();
    }
}
