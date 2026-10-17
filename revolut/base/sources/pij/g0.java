package pij;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f236546a;

    public g0(c0 view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f236546a = view;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f236546a, ((g0) obj2).f236546a);
    }

    @Override // pij.h0
    public final c0 getView() {
        return this.f236546a;
    }

    public final int hashCode() {
        return this.f236546a.hashCode();
    }
}
