package y12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310279a;

    public f(String str) {
        this.f310279a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f310279a, ((f) obj2).f310279a);
    }

    public final int hashCode() {
        String str = this.f310279a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
