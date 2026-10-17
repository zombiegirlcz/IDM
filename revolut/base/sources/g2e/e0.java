package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139982a;

    public e0() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f139982a, ((e0) obj2).f139982a);
    }

    public final int hashCode() {
        String str = this.f139982a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public e0(String str) {
        this.f139982a = str;
    }
}
