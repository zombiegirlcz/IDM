package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r5b.j f315305a;

    public c(r5b.j plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f315305a = plan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f315305a, ((c) obj2).f315305a);
    }

    public final int hashCode() {
        return this.f315305a.hashCode();
    }
}
