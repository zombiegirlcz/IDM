package qf1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u68.a f245216a;

    public g(u68.a descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f245216a = descriptor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f245216a.equals(((g) obj2).f245216a);
    }

    public final int hashCode() {
        return this.f245216a.hashCode();
    }
}
