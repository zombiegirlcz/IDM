package xr0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f308189a;

    public c(Object obj2) {
        this.f308189a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f308189a, ((c) obj2).f308189a);
    }

    public final int hashCode() {
        Object obj2 = this.f308189a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
