package ohe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f225354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f225355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f225356c;
    public final List d;

    public b(TotalWealthCategoryKey categoryKey, List regularItems, Clause clause, List favouriteItems) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(regularItems, "regularItems");
        Intrinsics.checkNotNullParameter(favouriteItems, "favouriteItems");
        this.f225354a = categoryKey;
        this.f225355b = regularItems;
        this.f225356c = clause;
        this.d = favouriteItems;
    }

    public static b a(b bVar, List regularItems, List favouriteItems) {
        TotalWealthCategoryKey categoryKey = bVar.f225354a;
        Clause clause = bVar.f225356c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(regularItems, "regularItems");
        Intrinsics.checkNotNullParameter(favouriteItems, "favouriteItems");
        return new b(categoryKey, regularItems, clause, favouriteItems);
    }

    public final ArrayList b() {
        return d0.E0(this.f225355b, this.d);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f225354a, bVar.f225354a) && Intrinsics.f(this.f225355b, bVar.f225355b) && Intrinsics.f(this.f225356c, bVar.f225356c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f225354a.hashCode() * 31, 31, this.f225355b);
        Clause clause = this.f225356c;
        return this.d.hashCode() + ((iD + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public b(TotalWealthCategoryKey totalWealthCategoryKey, List list, Clause clause, int i) {
        this(totalWealthCategoryKey, list, (i & 4) != 0 ? null : clause, f0.f322471a);
    }
}
