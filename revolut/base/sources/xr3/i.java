package xr3;

import ft3.d1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f308220a;

    public i(d1 productClassification) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        this.f308220a = productClassification;
    }

    public final d1 a() {
        return this.f308220a;
    }

    public final d1 b() {
        return this.f308220a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f308220a, ((i) obj2).f308220a);
    }

    public final int hashCode() {
        return this.f308220a.hashCode();
    }
}
