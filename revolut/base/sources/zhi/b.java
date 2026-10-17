package zhi;

import aii.n;
import kotlin.jvm.internal.Intrinsics;
import vkm.t;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f322424a;

    public b(t authedStream) {
        Intrinsics.checkNotNullParameter(authedStream, "authedStream");
        this.f322424a = authedStream;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f322424a.equals(((b) obj2).f322424a);
    }

    public final int hashCode() {
        return this.f322424a.hashCode();
    }
}
