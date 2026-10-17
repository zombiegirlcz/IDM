package we6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f296656a;

    public n(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296656a = inputData;
    }

    public final l b() {
        return this.f296656a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f296656a, ((n) obj2).f296656a);
    }

    public final int hashCode() {
        return this.f296656a.hashCode();
    }
}
