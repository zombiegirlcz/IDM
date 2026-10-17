package qu4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f249231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f249232b;

    public n(List items, aw0.i actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f249231a = items;
        this.f249232b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f249231a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f249231a, nVar.f249231a) && Intrinsics.f(this.f249232b, nVar.f249232b);
    }

    public final int hashCode() {
        return this.f249232b.hashCode() + (this.f249231a.hashCode() * 31);
    }
}
