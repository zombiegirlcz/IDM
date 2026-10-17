package lh9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f195187b;

    public o(aim.e items, aw0.e actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f195186a = items;
        this.f195187b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f195186a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f195186a, oVar.f195186a) && this.f195187b.equals(oVar.f195187b);
    }

    public final int hashCode() {
        return this.f195187b.hashCode() + (this.f195186a.hashCode() * 31);
    }
}
