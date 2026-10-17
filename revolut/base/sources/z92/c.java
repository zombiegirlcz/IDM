package z92;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f320300a;

    public c(Object obj2) {
        this.f320300a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f320300a, ((c) obj2).f320300a);
    }

    public final int hashCode() {
        Object obj2 = this.f320300a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
