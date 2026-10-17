package e1c;

import hha.z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f121945a;

    public b(z0 earningRate) {
        Intrinsics.checkNotNullParameter(earningRate, "earningRate");
        this.f121945a = earningRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f121945a, ((b) obj2).f121945a);
    }

    public final int hashCode() {
        return this.f121945a.hashCode();
    }
}
