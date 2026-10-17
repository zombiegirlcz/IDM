package wh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hx4.a f297405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f297406b;

    public m(hx4.a navbarModel, aw0.e actionModel) {
        Intrinsics.checkNotNullParameter(navbarModel, "navbarModel");
        Intrinsics.checkNotNullParameter(actionModel, "actionModel");
        this.f297405a = navbarModel;
        this.f297406b = actionModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f297405a.equals(mVar.f297405a) && this.f297406b.equals(mVar.f297406b);
    }

    public final int hashCode() {
        return this.f297406b.hashCode() + (this.f297405a.hashCode() * 31);
    }
}
