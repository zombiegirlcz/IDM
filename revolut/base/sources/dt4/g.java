package dt4;

import kotlin.jvm.internal.Intrinsics;
import ql4.s;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f117368a;

    public g(s quote) {
        Intrinsics.checkNotNullParameter(quote, "quote");
        this.f117368a = quote;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f117368a, ((g) obj2).f117368a);
    }

    public final int hashCode() {
        return this.f117368a.hashCode();
    }
}
