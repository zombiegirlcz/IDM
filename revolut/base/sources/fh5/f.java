package fh5;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f135151a;

    public f(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f135151a = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f135151a, ((f) obj2).f135151a);
    }

    public final int hashCode() {
        return this.f135151a.hashCode();
    }
}
