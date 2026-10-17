package qdk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244969a;

    public j0(String str) {
        this.f244969a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j0) && Intrinsics.f(this.f244969a, ((j0) obj2).f244969a);
    }

    public final int hashCode() {
        String str = this.f244969a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
