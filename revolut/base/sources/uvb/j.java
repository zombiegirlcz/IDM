package uvb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tvb.a f283353a;

    public j(tvb.a result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f283353a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f283353a, ((j) obj2).f283353a);
    }

    public final int hashCode() {
        return this.f283353a.hashCode();
    }
}
