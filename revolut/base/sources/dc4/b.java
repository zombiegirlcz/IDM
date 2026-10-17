package dc4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112785a;

    public b(String str) {
        this.f112785a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f112785a, ((b) obj2).f112785a);
    }

    public final int hashCode() {
        String str = this.f112785a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
