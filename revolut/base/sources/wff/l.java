package wff;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f297089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f297090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f297091c;

    public l(p pVar, p pVar2, float f) {
        this.f297089a = pVar;
        this.f297090b = pVar2;
        this.f297091c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f297089a, lVar.f297089a) && Intrinsics.f(this.f297090b, lVar.f297090b) && Float.compare(this.f297091c, lVar.f297091c) == 0;
    }

    public final int hashCode() {
        p pVar = this.f297089a;
        int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        p pVar2 = this.f297090b;
        return Float.hashCode(this.f297091c) + ((iHashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31);
    }
}
