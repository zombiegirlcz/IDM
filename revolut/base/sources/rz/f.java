package rz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f258444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f258445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f258446c;
    public final Integer d;

    public f(k kVar, k kVar2, Integer num, int i) {
        num = (i & 8) != 0 ? null : num;
        c background = c.f258442a;
        Intrinsics.checkNotNullParameter(background, "background");
        this.f258444a = kVar;
        this.f258445b = kVar2;
        this.f258446c = background;
        this.d = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f258444a, fVar.f258444a) && Intrinsics.f(this.f258445b, fVar.f258445b) && Intrinsics.f(this.f258446c, fVar.f258446c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        k kVar = this.f258444a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        k kVar2 = this.f258445b;
        int iHashCode2 = (this.f258446c.hashCode() + ((iHashCode + (kVar2 == null ? 0 : kVar2.hashCode())) * 31)) * 31;
        Integer num = this.d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
