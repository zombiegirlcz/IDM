package ppc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238334a;

    public q(List disclaimers) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f238334a = disclaimers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f238334a, ((q) obj2).f238334a);
    }

    public final int hashCode() {
        return this.f238334a.hashCode();
    }
}
