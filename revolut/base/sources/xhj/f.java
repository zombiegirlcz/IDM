package xhj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306260a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f306260a, ((f) obj2).f306260a);
    }

    public final int hashCode() {
        String str = this.f306260a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public f(String str) {
        this.f306260a = str;
    }
}
