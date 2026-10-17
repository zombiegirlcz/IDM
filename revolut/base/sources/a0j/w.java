package a0j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f420b;

    public w(List elements, v vVar) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f419a = elements;
        this.f420b = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f419a, wVar.f419a) && Intrinsics.f(this.f420b, wVar.f420b);
    }

    public final int hashCode() {
        int iHashCode = this.f419a.hashCode() * 31;
        v vVar = this.f420b;
        return iHashCode + (vVar == null ? 0 : vVar.hashCode());
    }
}
