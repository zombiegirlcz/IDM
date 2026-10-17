package e85;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f123590b;

    public l(List items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f123589a = items;
        this.f123590b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f123589a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f123589a, lVar.f123589a) && this.f123590b.equals(lVar.f123590b);
    }

    public final int hashCode() {
        return this.f123590b.hashCode() + (this.f123589a.hashCode() * 31);
    }
}
