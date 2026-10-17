package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5b.j f315325a;

    public d(r5b.j plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f315325a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f315325a, ((d) obj2).f315325a);
    }

    public final int hashCode() {
        return this.f315325a.hashCode();
    }
}
