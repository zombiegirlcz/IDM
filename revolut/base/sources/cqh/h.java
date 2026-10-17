package cqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wgl.d f108108a;

    public h(wgl.d params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f108108a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f108108a, ((h) obj2).f108108a);
    }

    public final int hashCode() {
        return this.f108108a.hashCode();
    }
}
