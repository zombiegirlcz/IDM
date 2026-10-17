package q7b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242804a;

    public l(String str) {
        this.f242804a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f242804a, ((l) obj2).f242804a);
    }

    public final int hashCode() {
        String str = this.f242804a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
