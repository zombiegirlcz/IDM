package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2753a;

    public z0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2753a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z0) && Intrinsics.f(this.f2753a, ((z0) obj2).f2753a);
    }

    public final int hashCode() {
        return this.f2753a.hashCode();
    }
}
