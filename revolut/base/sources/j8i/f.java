package j8i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172218a;

    public f(String str) {
        this.f172218a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f172218a, ((f) obj2).f172218a);
    }

    public final int hashCode() {
        String str = this.f172218a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
