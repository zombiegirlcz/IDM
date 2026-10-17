package pe8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f235337a;

    public b(Object obj2) {
        this.f235337a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f235337a, ((b) obj2).f235337a);
    }

    public final int hashCode() {
        Object obj2 = this.f235337a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
