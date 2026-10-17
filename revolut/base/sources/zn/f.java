package zn;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f323642a;

    public f(ConcurrentHashMap items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323642a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f323642a, ((f) obj2).f323642a);
    }

    public final int hashCode() {
        return this.f323642a.hashCode();
    }
}
