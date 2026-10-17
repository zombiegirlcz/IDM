package x35;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302656a;

    public f(String disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f302656a = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f302656a, ((f) obj2).f302656a);
    }

    public final int hashCode() {
        return this.f302656a.hashCode();
    }
}
