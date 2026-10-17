package s0i;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f258959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f258960b;

    public c(Float f, Float f4) {
        this.f258959a = f;
        this.f258960b = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f258959a, cVar.f258959a) && Intrinsics.f(this.f258960b, cVar.f258960b);
    }

    public final int hashCode() {
        Float f = this.f258959a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f4 = this.f258960b;
        return iHashCode + (f4 != null ? f4.hashCode() : 0);
    }
}
