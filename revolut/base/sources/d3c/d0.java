package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111011a;

    public d0() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d0) && Intrinsics.f(this.f111011a, ((d0) obj2).f111011a);
    }

    public final int hashCode() {
        String str = this.f111011a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public d0(String str) {
        this.f111011a = str;
    }
}
