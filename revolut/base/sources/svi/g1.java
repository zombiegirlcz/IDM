package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f265913a;

    public g1(r detail) {
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.f265913a = detail;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && Intrinsics.f(this.f265913a, ((g1) obj2).f265913a);
    }

    public final int hashCode() {
        return this.f265913a.hashCode();
    }
}
