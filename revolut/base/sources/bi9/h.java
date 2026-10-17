package bi9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15455a;

    public h(List upcomingInstalmentsWithPlan) {
        Intrinsics.checkNotNullParameter(upcomingInstalmentsWithPlan, "upcomingInstalmentsWithPlan");
        this.f15455a = upcomingInstalmentsWithPlan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f15455a, ((h) obj2).f15455a);
    }

    public final int hashCode() {
        return this.f15455a.hashCode();
    }
}
