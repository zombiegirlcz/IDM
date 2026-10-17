package hud;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f155630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155632c;
    public final MoneyClause d;
    public final CurrencyImage e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f155633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f155634h;

    public j(TextLocalisedClause buttonClause, boolean z, boolean z3, MoneyClause moneyClause, CurrencyImage currencyImage, TextLocalisedClause textLocalisedClause, Clause clause, aim.e items) {
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f155630a = buttonClause;
        this.f155631b = z;
        this.f155632c = z3;
        this.d = moneyClause;
        this.e = currencyImage;
        this.f = textLocalisedClause;
        this.f155633g = clause;
        this.f155634h = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f155634h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f155630a.equals(jVar.f155630a) && this.f155631b == jVar.f155631b && this.f155632c == jVar.f155632c && this.d.equals(jVar.d) && this.e.equals(jVar.e) && this.f.equals(jVar.f) && Intrinsics.f(this.f155633g, jVar.f155633g) && Intrinsics.f(this.f155634h, jVar.f155634h);
    }

    public final int hashCode() {
        int iA = t61.a.a((this.e.hashCode() + v7.a(j6.a.c(j6.a.c(this.f155630a.hashCode() * 31, 31, this.f155631b), 31, this.f155632c), 31, this.d)) * 31, 31, this.f);
        Clause clause = this.f155633g;
        return this.f155634h.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
