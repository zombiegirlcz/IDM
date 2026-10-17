package dce;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ip0.y f112891a;

    public r(ip0.y data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f112891a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f112891a, ((r) obj2).f112891a);
    }

    public final int hashCode() {
        return this.f112891a.hashCode();
    }
}
