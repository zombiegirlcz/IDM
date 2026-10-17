package iji;

import aii.n;
import kotlin.jvm.internal.Intrinsics;
import vkm.y;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f161799a;

    public b(y authedStream) {
        Intrinsics.checkNotNullParameter(authedStream, "authedStream");
        this.f161799a = authedStream;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f161799a.equals(((b) obj2).f161799a);
    }

    public final int hashCode() {
        return this.f161799a.hashCode();
    }
}
