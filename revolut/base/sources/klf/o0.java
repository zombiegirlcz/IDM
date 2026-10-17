package klf;

import kotlin.jvm.internal.Intrinsics;
import tof.q7;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7 f185544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f185545b;

    public o0(q7 filter, n0 currentComponent) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(currentComponent, "currentComponent");
        this.f185544a = filter;
        this.f185545b = currentComponent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f185544a.equals(o0Var.f185544a) && this.f185545b == o0Var.f185545b;
    }

    public final int hashCode() {
        return this.f185545b.hashCode() + (this.f185544a.f273011a.hashCode() * 31);
    }
}
