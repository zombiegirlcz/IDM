package qp1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f248235a;

    public g(jo3.a value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f248235a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f248235a, ((g) obj2).f248235a);
    }

    public final int hashCode() {
        return this.f248235a.hashCode();
    }
}
