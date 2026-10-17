package w7b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f295504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f295505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295506c;

    public n(l lVar, m mVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f295504a = lVar;
        this.f295505b = mVar;
        this.f295506c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f295506c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f295504a, nVar.f295504a) && Intrinsics.f(this.f295505b, nVar.f295505b) && Intrinsics.f(this.f295506c, nVar.f295506c);
    }

    public final int hashCode() {
        l lVar = this.f295504a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        m mVar = this.f295505b;
        return this.f295506c.hashCode() + ((iHashCode + (mVar != null ? mVar.hashCode() : 0)) * 31);
    }
}
