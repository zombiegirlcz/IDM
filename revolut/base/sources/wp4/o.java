package wp4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299085a;

    public o() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f299085a, ((o) obj2).f299085a);
    }

    public final int hashCode() {
        String str = this.f299085a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public o(String str) {
        this.f299085a = str;
    }
}
