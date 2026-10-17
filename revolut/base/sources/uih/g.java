package uih;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f280445a;

    public g() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f280445a, ((g) obj2).f280445a);
    }

    public final int hashCode() {
        return this.f280445a.hashCode();
    }

    public g(int i) {
        this(h0.f322473a);
    }

    public g(Set remediationComplexBonds) {
        Intrinsics.checkNotNullParameter(remediationComplexBonds, "remediationComplexBonds");
        this.f280445a = remediationComplexBonds;
    }
}
