package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10541a;

    public t5(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f10541a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t5) && Intrinsics.f(this.f10541a, ((t5) obj2).f10541a);
    }

    public final int hashCode() {
        return this.f10541a.hashCode();
    }
}
