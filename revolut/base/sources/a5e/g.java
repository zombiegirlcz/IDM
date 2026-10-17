package a5e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1368a;

    public g(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f1368a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f1368a, ((g) obj2).f1368a);
    }

    public final int hashCode() {
        return this.f1368a.hashCode();
    }
}
