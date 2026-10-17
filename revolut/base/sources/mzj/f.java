package mzj;

import hha.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f210787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xfa.b f210788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f210789c;

    public f(u feature, List list, xfa.b startedFrom) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(startedFrom, "startedFrom");
        this.f210787a = feature;
        this.f210788b = startedFrom;
        this.f210789c = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f210787a, fVar.f210787a) && this.f210788b == fVar.f210788b && Intrinsics.f(this.f210789c, fVar.f210789c);
    }

    public final int hashCode() {
        int iC = v1.c.c(this.f210788b, this.f210787a.f152366a.hashCode() * 31, 31);
        List list = this.f210789c;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
