package zrd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f324687c;
    public final Clause d;
    public final Clause e;

    public d(List chartSwitcherItems, String str, MoneyClause title, Clause topDescription, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(chartSwitcherItems, "chartSwitcherItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        this.f324685a = chartSwitcherItems;
        this.f324686b = str;
        this.f324687c = title;
        this.d = topDescription;
        this.e = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f324685a, dVar.f324685a) && Intrinsics.f(this.f324686b, dVar.f324686b) && Intrinsics.f(this.f324687c, dVar.f324687c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f324685a.hashCode() * 31;
        String str = this.f324686b;
        int iA = p.a.a(v7.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f324687c), 31, this.d);
        Clause clause = this.e;
        return iA + (clause != null ? clause.hashCode() : 0);
    }
}
