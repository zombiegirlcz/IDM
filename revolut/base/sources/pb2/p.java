package pb2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f234614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f234615c;
    public final aw0.h d;

    public /* synthetic */ p(List list, aw0.h hVar) {
        this(list, null, false, hVar);
    }

    @Override // cli.p
    public final List c() {
        return this.f234613a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f234613a, pVar.f234613a) && Intrinsics.f(this.f234614b, pVar.f234614b) && this.f234615c == pVar.f234615c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f234613a.hashCode() * 31;
        Clause clause = this.f234614b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f234615c);
    }

    public p(List items, TextLocalisedClause textLocalisedClause, boolean z, aw0.h actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f234613a = items;
        this.f234614b = textLocalisedClause;
        this.f234615c = z;
        this.d = actionFooterModel;
    }
}
