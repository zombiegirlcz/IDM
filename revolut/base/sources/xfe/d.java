package xfe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f305245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f305246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f305247c;
    public final Clause d;

    public d(Clause title, Clause clause, List itemTitlesAndIcons, TextLocalisedClause textLocalisedClause, int i) {
        itemTitlesAndIcons = (i & 4) != 0 ? f0.f322471a : itemTitlesAndIcons;
        textLocalisedClause = (i & 8) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(itemTitlesAndIcons, "itemTitlesAndIcons");
        this.f305245a = title;
        this.f305246b = clause;
        this.f305247c = itemTitlesAndIcons;
        this.d = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f305245a, dVar.f305245a) && Intrinsics.f(this.f305246b, dVar.f305246b) && Intrinsics.f(this.f305247c, dVar.f305247c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f305245a.hashCode() * 31;
        Clause clause = this.f305246b;
        int iD = p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f305247c);
        Clause clause2 = this.d;
        return iD + (clause2 != null ? clause2.hashCode() : 0);
    }
}
