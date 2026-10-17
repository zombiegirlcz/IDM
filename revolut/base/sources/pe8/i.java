package pe8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f235343a;

    public i(Object obj2) {
        this.f235343a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f235343a, ((i) obj2).f235343a);
    }

    public final int hashCode() {
        Object obj2 = this.f235343a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
