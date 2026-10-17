package m40;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202617a;

    public e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f202617a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f202617a, ((e) obj2).f202617a);
    }

    public final int hashCode() {
        return this.f202617a.hashCode();
    }
}
