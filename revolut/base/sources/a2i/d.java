package a2i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0i.a f861a;

    public d(n0i.a data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f861a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f861a, ((d) obj2).f861a);
    }

    public final int hashCode() {
        return this.f861a.hashCode();
    }
}
