package cgh;

import jel.a0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f23974a;

    public g(a0 dealSourcing) {
        Intrinsics.checkNotNullParameter(dealSourcing, "dealSourcing");
        this.f23974a = dealSourcing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f23974a == ((g) obj2).f23974a;
    }

    public final int hashCode() {
        return this.f23974a.hashCode();
    }
}
