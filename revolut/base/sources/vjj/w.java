package vjj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f289791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f289792c;

    public w(List items, k kVar, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f289790a = items;
        this.f289791b = kVar;
        this.f289792c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f289790a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f289790a, wVar.f289790a) && Intrinsics.f(this.f289791b, wVar.f289791b) && Intrinsics.f(this.f289792c, wVar.f289792c);
    }

    public final int hashCode() {
        int iHashCode = this.f289790a.hashCode() * 31;
        k kVar = this.f289791b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Clause clause = this.f289792c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
