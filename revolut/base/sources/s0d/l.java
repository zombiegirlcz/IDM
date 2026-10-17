package s0d;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f258948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.h f258949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f258950c;

    public l(k kVar, aw0.h hVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258948a = kVar;
        this.f258949b = hVar;
        this.f258950c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f258950c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f258948a, lVar.f258948a) && Intrinsics.f(this.f258949b, lVar.f258949b) && Intrinsics.f(this.f258950c, lVar.f258950c);
    }

    public final int hashCode() {
        k kVar = this.f258948a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        aw0.h hVar = this.f258949b;
        return this.f258950c.hashCode() + ((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31);
    }
}
