package i4b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.cfd.api.domain.models.Fee;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f158371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f158372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentImage f158373c;
    public final aw0.e d;
    public final p e;
    public final Fee f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f158374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f158375h;

    public r(Clause title, TextLocalisedClause subtitle, InstrumentImage icon, aw0.e actionFooter, p pVar, Fee fee2, o oVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158371a = title;
        this.f158372b = subtitle;
        this.f158373c = icon;
        this.d = actionFooter;
        this.e = pVar;
        this.f = fee2;
        this.f158374g = oVar;
        this.f158375h = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f158375h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f158371a.equals(rVar.f158371a) && this.f158372b.equals(rVar.f158372b) && this.f158373c.equals(rVar.f158373c) && this.d.equals(rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && this.f158374g.equals(rVar.f158374g) && this.f158375h.equals(rVar.f158375h);
    }

    public final int hashCode() {
        int iC = ehe.n.c(this.d, (this.f158373c.hashCode() + t61.a.a(this.f158371a.hashCode() * 31, 31, this.f158372b)) * 31, 31);
        p pVar = this.e;
        int iHashCode = (iC + (pVar == null ? 0 : pVar.f158368a.hashCode())) * 31;
        Fee fee2 = this.f;
        return this.f158375h.hashCode() + ((this.f158374g.hashCode() + ((iHashCode + (fee2 != null ? fee2.hashCode() : 0)) * 31)) * 31);
    }
}
