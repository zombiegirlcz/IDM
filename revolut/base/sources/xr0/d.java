package xr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f308190a;

    public d(Object obj2) {
        this.f308190a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f308190a, ((d) obj2).f308190a);
    }

    public final int hashCode() {
        Object obj2 = this.f308190a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
