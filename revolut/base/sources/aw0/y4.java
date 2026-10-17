package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y4 extends x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f10628a;

    public y4(d0 ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        this.f10628a = ratio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y4) && Intrinsics.f(this.f10628a, ((y4) obj2).f10628a);
    }

    public final int hashCode() {
        return this.f10628a.hashCode();
    }
}
