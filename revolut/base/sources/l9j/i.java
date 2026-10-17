package l9j;

import aw0.q0;
import cli.p;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f193260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CurrencyClause f193261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CurrencyImage f193262c;
    public final List d;
    public final q0 e;
    public final List f;

    public i(q0 q0Var, CurrencyClause subtitleClause, TextLocalisedClause titleClause, CurrencyImage currencyImage, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        Intrinsics.checkNotNullParameter(currencyImage, "currencyImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193260a = titleClause;
        this.f193261b = subtitleClause;
        this.f193262c = currencyImage;
        this.d = menuItems;
        this.e = q0Var;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f193260a.equals(iVar.f193260a) && this.f193261b.equals(iVar.f193261b) && this.f193262c.equals(iVar.f193262c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d((this.f193262c.hashCode() + ((this.f193261b.hashCode() + (this.f193260a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        q0 q0Var = this.e;
        return this.f.hashCode() + ((iD + (q0Var == null ? 0 : q0Var.hashCode())) * 31);
    }
}
