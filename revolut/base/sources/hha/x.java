package hha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f152369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f152370b;

    public x(u feature, y state) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f152369a = feature;
        this.f152370b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f152369a, xVar.f152369a) && this.f152370b == xVar.f152370b;
    }

    public final int hashCode() {
        return this.f152370b.hashCode() + (this.f152369a.f152366a.hashCode() * 31);
    }
}
