package k3c;

import d3c.i0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f180663a;

    public f(i0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f180663a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f180663a, ((f) obj2).f180663a);
    }

    public final int hashCode() {
        return this.f180663a.hashCode();
    }
}
