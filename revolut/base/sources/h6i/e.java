package h6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7i.c f149660a;

    public e(b7i.c checker) {
        Intrinsics.checkNotNullParameter(checker, "checker");
        this.f149660a = checker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f149660a.equals(((e) obj2).f149660a);
    }

    public final int hashCode() {
        return this.f149660a.hashCode();
    }
}
