package mig;

import hfg.o;
import kotlin.jvm.internal.Intrinsics;
import mig.b;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends b.AbstractC1167b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f205843a;

    public d(o city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.f205843a = city;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f205843a, ((d) obj2).f205843a);
    }

    public final int hashCode() {
        return this.f205843a.hashCode();
    }
}
