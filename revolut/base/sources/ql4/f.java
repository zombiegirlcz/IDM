package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247120a;

    public f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f247120a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f247120a, ((f) obj2).f247120a);
    }

    public final int hashCode() {
        return this.f247120a.hashCode();
    }
}
