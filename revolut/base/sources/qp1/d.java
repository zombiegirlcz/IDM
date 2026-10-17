package qp1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3.b f248232a;

    public d(no3.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f248232a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f248232a, ((d) obj2).f248232a);
    }

    public final int hashCode() {
        return this.f248232a.hashCode();
    }
}
