package eii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f126655a;

    public i(Object obj2) {
        this.f126655a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f126655a, ((i) obj2).f126655a);
    }

    public final int hashCode() {
        Object obj2 = this.f126655a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
