package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244965a;

    public g0(String str) {
        this.f244965a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f244965a, ((g0) obj2).f244965a);
    }

    public final int hashCode() {
        String str = this.f244965a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
