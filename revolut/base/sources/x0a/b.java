package x0a;

import aii.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f301538a;

    public b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301538a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f301538a, ((b) obj2).f301538a);
    }

    public final int hashCode() {
        return this.f301538a.hashCode();
    }
}
