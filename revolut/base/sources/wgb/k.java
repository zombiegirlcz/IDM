package wgb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i f297282a;

    public k(aw0.i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f297282a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f297282a, ((k) obj2).f297282a);
    }

    public final int hashCode() {
        return this.f297282a.hashCode();
    }
}
