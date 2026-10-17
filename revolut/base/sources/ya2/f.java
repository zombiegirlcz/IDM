package ya2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311910a;

    public f() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f311910a, ((f) obj2).f311910a);
    }

    public final int hashCode() {
        String str = this.f311910a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public f(String str) {
        this.f311910a = str;
    }
}
