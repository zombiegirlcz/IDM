package vm1;

import kotlin.jvm.internal.Intrinsics;
import pm1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f290519a;

    public c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f290519a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290519a, ((c) obj2).f290519a);
    }

    public final int hashCode() {
        return this.f290519a.hashCode();
    }
}
