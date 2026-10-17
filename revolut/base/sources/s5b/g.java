package s5b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260059a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f260059a, ((g) obj2).f260059a);
    }

    public final int hashCode() {
        String str = this.f260059a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public g(String str) {
        this.f260059a = str;
    }
}
