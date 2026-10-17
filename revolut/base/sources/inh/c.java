package inh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp3.b f162942a;

    public c(kp3.b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f162942a = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f162942a, ((c) obj2).f162942a);
    }

    public final int hashCode() {
        return this.f162942a.hashCode();
    }
}
