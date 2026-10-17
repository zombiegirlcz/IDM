package rw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f257812a;

    public l(j time) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f257812a = time;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f257812a, ((l) obj2).f257812a);
    }

    public final int hashCode() {
        return this.f257812a.hashCode();
    }
}
