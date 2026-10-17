package noe;

import java.util.List;
import jki.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218009a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f218009a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f218009a, ((e) obj2).f218009a);
    }

    public final int hashCode() {
        return this.f218009a.hashCode();
    }
}
