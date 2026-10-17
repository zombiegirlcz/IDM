package h0b;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f148347a;

    public i(Set selectedIndicators) {
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        this.f148347a = selectedIndicators;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f148347a, ((i) obj2).f148347a);
    }

    public final int hashCode() {
        return this.f148347a.hashCode();
    }
}
