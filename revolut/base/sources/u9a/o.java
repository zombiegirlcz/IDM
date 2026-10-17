package u9a;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f278436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f278437c;
    public final yy0.l d;
    public final List e;

    public o(List items, MoneyClause moneyClause, TextClause textClause, yy0.j jVar, List actionItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        this.f278435a = items;
        this.f278436b = moneyClause;
        this.f278437c = textClause;
        this.d = jVar;
        this.e = actionItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f278435a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f278435a, oVar.f278435a) && Intrinsics.f(this.f278436b, oVar.f278436b) && Intrinsics.f(this.f278437c, oVar.f278437c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f278435a.hashCode() * 31;
        MoneyClause moneyClause = this.f278436b;
        int iHashCode2 = (iHashCode + (moneyClause == null ? 0 : moneyClause.hashCode())) * 31;
        TextClause textClause = this.f278437c;
        int iHashCode3 = (iHashCode2 + (textClause == null ? 0 : textClause.hashCode())) * 31;
        yy0.l lVar = this.d;
        return this.e.hashCode() + ((iHashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }

    public o(List list) {
        this(list, null, null, null, f0.f322471a);
    }
}
