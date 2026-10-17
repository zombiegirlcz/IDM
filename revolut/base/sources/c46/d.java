package c46;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t36.h f21085a;

    public d(t36.h hVar) {
        this.f21085a = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f21085a, ((d) obj2).f21085a);
    }

    public final int hashCode() {
        t36.h hVar = this.f21085a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}
