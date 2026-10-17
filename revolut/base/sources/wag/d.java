package wag;

import deg.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f295940a;

    public d(g output) {
        Intrinsics.checkNotNullParameter(output, "output");
        this.f295940a = output;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f295940a, ((d) obj2).f295940a);
    }

    public final int hashCode() {
        return this.f295940a.hashCode();
    }
}
