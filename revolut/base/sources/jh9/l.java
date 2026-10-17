package jh9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f174169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f174170b;

    public l(List items, aw0.g actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f174169a = items;
        this.f174170b = actionFooterModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f174169a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f174169a, lVar.f174169a) && this.f174170b.equals(lVar.f174170b);
    }

    public final int hashCode() {
        return this.f174170b.hashCode() + (this.f174169a.hashCode() * 31);
    }
}
