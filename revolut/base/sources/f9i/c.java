package f9i;

import aii.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f132975a;

    public c(f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f132975a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f132975a, ((c) obj2).f132975a);
    }

    public final int hashCode() {
        return this.f132975a.hashCode();
    }
}
