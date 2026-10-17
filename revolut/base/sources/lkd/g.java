package lkd;

import akd.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f196360a;

    public g(r promoBanner) {
        Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
        this.f196360a = promoBanner;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f196360a, ((g) obj2).f196360a);
    }

    public final int hashCode() {
        return this.f196360a.hashCode();
    }
}
