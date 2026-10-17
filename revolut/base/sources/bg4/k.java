package bg4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15106a;

    public k(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f15106a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f15106a, ((k) obj2).f15106a);
    }

    public final int hashCode() {
        return this.f15106a.hashCode();
    }
}
