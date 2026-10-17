package pi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f236436a;

    public b(Object obj2) {
        this.f236436a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f236436a, ((b) obj2).f236436a);
    }

    public final int hashCode() {
        Object obj2 = this.f236436a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}
