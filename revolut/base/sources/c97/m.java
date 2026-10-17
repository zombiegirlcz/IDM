package c97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f22334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f22335b;

    public m(Integer num, o oVar) {
        this.f22334a = num;
        this.f22335b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f22334a, mVar.f22334a) && Intrinsics.f(this.f22335b, mVar.f22335b);
    }

    public final int hashCode() {
        Integer num = this.f22334a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        o oVar = this.f22335b;
        return iHashCode + (oVar != null ? oVar.hashCode() : 0);
    }
}
