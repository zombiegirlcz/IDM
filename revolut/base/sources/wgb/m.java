package wgb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f297285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f297286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f297287c;

    public m(l lVar, k kVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f297285a = lVar;
        this.f297286b = kVar;
        this.f297287c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f297287c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f297285a, mVar.f297285a) && Intrinsics.f(this.f297286b, mVar.f297286b) && Intrinsics.f(this.f297287c, mVar.f297287c);
    }

    public final int hashCode() {
        l lVar = this.f297285a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        k kVar = this.f297286b;
        return this.f297287c.hashCode() + ((iHashCode + (kVar != null ? kVar.f297282a.hashCode() : 0)) * 31);
    }
}
