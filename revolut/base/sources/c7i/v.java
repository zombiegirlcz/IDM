package c7i;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.e f22029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f22030c;

    public v(List items, aw0.e footerModel, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f22028a = items;
        this.f22029b = footerModel;
        this.f22030c = compositeClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f22028a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f22028a, vVar.f22028a) && Intrinsics.f(this.f22029b, vVar.f22029b) && Intrinsics.f(this.f22030c, vVar.f22030c);
    }

    public final int hashCode() {
        int iC = ehe.n.c(this.f22029b, this.f22028a.hashCode() * 31, 31);
        Clause clause = this.f22030c;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
