package mhe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205560a;

    public k(List newOrder) {
        Intrinsics.checkNotNullParameter(newOrder, "newOrder");
        this.f205560a = newOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f205560a, ((k) obj2).f205560a);
    }

    public final int hashCode() {
        return this.f205560a.hashCode();
    }
}
