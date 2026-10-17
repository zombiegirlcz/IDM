package fb6;

import ba6.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f133450a;

    public g(d0 result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f133450a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f133450a, ((g) obj2).f133450a);
    }

    public final int hashCode() {
        return this.f133450a.hashCode();
    }
}
