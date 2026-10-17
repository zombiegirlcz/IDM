package b8f;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f13253b;

    public w(aim.e items, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f13252a = items;
        this.f13253b = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f13252a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f13252a, wVar.f13252a) && Intrinsics.f(this.f13253b, wVar.f13253b);
    }

    public final int hashCode() {
        int iHashCode = this.f13252a.hashCode() * 31;
        aw0.i iVar = this.f13253b;
        return iHashCode + (iVar == null ? 0 : iVar.hashCode());
    }
}
