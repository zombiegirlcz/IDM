package m9j;

import aw0.q0;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f203811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyClause f203812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f203813c;
    public final q0 d;
    public final List e;
    public final List f;

    public l(q0 q0Var, CurrencyClause subtitleClause, TextLocalisedClause titleClause, CurrencyImage currencyImage, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        Intrinsics.checkNotNullParameter(currencyImage, "currencyImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203811a = titleClause;
        this.f203812b = subtitleClause;
        this.f203813c = currencyImage;
        this.d = q0Var;
        this.e = menuItems;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f203811a.equals(lVar.f203811a) && this.f203812b.equals(lVar.f203812b) && this.f203813c.equals(lVar.f203813c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f203813c.hashCode() + ((this.f203812b.hashCode() + (this.f203811a.hashCode() * 31)) * 31)) * 31;
        q0 q0Var = this.d;
        return this.f.hashCode() + p.a.d((iHashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31, 31, this.e);
    }
}
