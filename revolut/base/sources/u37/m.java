package u37;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f276801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f276802c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f276803g;

    public m(List items, TextLocalisedClause buttonTitle, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f276800a = items;
        this.f276801b = buttonTitle;
        this.f276802c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = textLocalisedClause3;
        this.f = menuItems;
        this.f276803g = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f276800a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f276800a, mVar.f276800a) && Intrinsics.f(this.f276801b, mVar.f276801b) && Intrinsics.f(this.f276802c, mVar.f276802c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && this.f276803g == mVar.f276803g;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f276800a.hashCode() * 31, 31, this.f276801b);
        Clause clause = this.f276802c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        return Boolean.hashCode(this.f276803g) + p.a.d((iHashCode2 + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.f);
    }

    public m(TextLocalisedClause textLocalisedClause, List list) {
        this(list, textLocalisedClause, null, null, null, f0.f322471a, false);
    }
}
