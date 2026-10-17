package zod;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f323981a;

    public d0(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323981a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f323981a, ((d0) obj2).f323981a);
    }

    public final int hashCode() {
        return this.f323981a.hashCode();
    }
}
