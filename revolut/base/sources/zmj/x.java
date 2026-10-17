package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323597a;

    public x() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f323597a, ((x) obj2).f323597a);
    }

    public final int hashCode() {
        String str = this.f323597a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public x(String str) {
        this.f323597a = str;
    }
}
