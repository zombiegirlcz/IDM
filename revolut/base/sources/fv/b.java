package fv;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nvf.d f138297a;

    public b(nvf.d mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f138297a = mapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f138297a, ((b) obj2).f138297a);
    }

    public final int hashCode() {
        return this.f138297a.hashCode();
    }
}
