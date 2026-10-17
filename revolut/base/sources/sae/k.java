package sae;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f261392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f261393c;

    public k(List items, aw0.e actionFooterModel, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f261391a = items;
        this.f261392b = actionFooterModel;
        this.f261393c = num;
    }

    @Override // cli.p
    public final List c() {
        return this.f261391a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f261391a, kVar.f261391a) && this.f261392b.equals(kVar.f261392b) && Intrinsics.f(this.f261393c, kVar.f261393c);
    }

    public final int hashCode() {
        int iC = ehe.n.c(this.f261392b, this.f261391a.hashCode() * 31, 31);
        Integer num = this.f261393c;
        return iC + (num == null ? 0 : num.hashCode());
    }
}
