package lw8;

import kotlin.jvm.internal.Intrinsics;
import my8.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200426a;

    public b(s result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f200426a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f200426a, ((b) obj2).f200426a);
    }

    public final int hashCode() {
        return this.f200426a.hashCode();
    }
}
