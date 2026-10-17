package wm;

import kotlin.jvm.internal.Intrinsics;
import rp0.q;

/* JADX INFO: loaded from: classes17.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f298575a;

    public g(q data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f298575a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f298575a, ((g) obj2).f298575a);
    }

    public final int hashCode() {
        return this.f298575a.hashCode();
    }
}
