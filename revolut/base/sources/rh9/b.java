package rh9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254381a;

    public b(List counterLimits) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        this.f254381a = counterLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f254381a, ((b) obj2).f254381a);
    }

    public final int hashCode() {
        return this.f254381a.hashCode();
    }
}
