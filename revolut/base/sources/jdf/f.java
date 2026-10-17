package jdf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f173062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f173063b;

    public f() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f173062a, fVar.f173062a) && this.f173063b == fVar.f173063b;
    }

    public final int hashCode() {
        Integer num = this.f173062a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        b bVar = this.f173063b;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public f(Integer num, b bVar) {
        this.f173062a = num;
        this.f173063b = bVar;
    }
}
