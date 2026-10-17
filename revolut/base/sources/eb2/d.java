package eb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f124282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f124283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f124284c;
    public final String d;
    public final TextLocalisedClause e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f124285g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CircleIconBadge f124286h;

    public d(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause confirmButton, String aliasValue, TextLocalisedClause aliasTypeText, TextLocalisedClause aliasStatusText, int i, CircleIconBadge aliasBadgeModel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        Intrinsics.checkNotNullParameter(aliasTypeText, "aliasTypeText");
        Intrinsics.checkNotNullParameter(aliasStatusText, "aliasStatusText");
        Intrinsics.checkNotNullParameter(aliasBadgeModel, "aliasBadgeModel");
        this.f124282a = title;
        this.f124283b = description;
        this.f124284c = confirmButton;
        this.d = aliasValue;
        this.e = aliasTypeText;
        this.f = aliasStatusText;
        this.f124285g = i;
        this.f124286h = aliasBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f124282a.equals(dVar.f124282a) && this.f124283b.equals(dVar.f124283b) && this.f124284c.equals(dVar.f124284c) && Intrinsics.f(this.d, dVar.d) && this.e.equals(dVar.e) && this.f.equals(dVar.f) && this.f124285g == dVar.f124285g && this.f124286h.equals(dVar.f124286h);
    }

    public final int hashCode() {
        return this.f124286h.hashCode() + j6.a.b(this.f124285g, t61.a.a(t61.a.a(p.a.c(t61.a.a(t61.a.a(this.f124282a.hashCode() * 31, 31, this.f124283b), 31, this.f124284c), 31, this.d), 31, this.e), 31, this.f), 31);
    }
}
