package h52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149433a;

    public a(List counterLimits) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        this.f149433a = counterLimits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f149433a, ((a) obj2).f149433a);
    }

    public final int hashCode() {
        return this.f149433a.hashCode();
    }
}
