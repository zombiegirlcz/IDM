package a9d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2413a;

    public l(String str) {
        this.f2413a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f2413a, ((l) obj2).f2413a);
    }

    public final int hashCode() {
        String str = this.f2413a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
