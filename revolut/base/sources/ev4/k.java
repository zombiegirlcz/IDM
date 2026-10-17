package ev4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f129717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f129718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f129719c;
    public final i d;

    public k(j toolbarModel, List items, TextLocalisedClause textLocalisedClause, i buttonModel) {
        Intrinsics.checkNotNullParameter(toolbarModel, "toolbarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        this.f129717a = toolbarModel;
        this.f129718b = items;
        this.f129719c = textLocalisedClause;
        this.d = buttonModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f129718b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f129717a, kVar.f129717a) && Intrinsics.f(this.f129718b, kVar.f129718b) && Intrinsics.f(this.f129719c, kVar.f129719c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f129717a.hashCode() * 31, 31, this.f129718b);
        Clause clause = this.f129719c;
        return this.d.hashCode() + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
