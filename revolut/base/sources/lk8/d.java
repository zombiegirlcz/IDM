package lk8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f196304a;

    public d(c progression) {
        Intrinsics.checkNotNullParameter(progression, "progression");
        this.f196304a = progression;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f196304a, ((d) obj2).f196304a);
    }

    public final int hashCode() {
        return this.f196304a.hashCode();
    }
}
