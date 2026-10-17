package qc3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244542a;

    public f(String str) {
        this.f244542a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f244542a, ((f) obj2).f244542a);
    }

    public final int hashCode() {
        String str = this.f244542a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
