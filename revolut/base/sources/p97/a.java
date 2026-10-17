package p97;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f234280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f234281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f234282c;
    public final Clause d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f234283g;

    public a(b id10, int i, Clause title, Clause clause, Clause clause2, List keywords, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        this.f234280a = id10;
        this.f234281b = i;
        this.f234282c = title;
        this.d = clause;
        this.e = clause2;
        this.f = keywords;
        this.f234283g = obj2;
    }

    public static a a(a aVar, int i, Clause title, TextLocalisedClause textLocalisedClause, Clause clause, List keywords, Object obj2, int i2) {
        int i3 = i;
        b id10 = aVar.f234280a;
        if ((i2 & 2) != 0) {
            i3 = aVar.f234281b;
        }
        if ((i2 & 4) != 0) {
            title = aVar.f234282c;
        }
        Clause clause2 = textLocalisedClause;
        if ((i2 & 8) != 0) {
            clause2 = aVar.d;
        }
        if ((i2 & 16) != 0) {
            clause = aVar.e;
        }
        if ((i2 & 32) != 0) {
            keywords = aVar.f;
        }
        if ((i2 & 64) != 0) {
            obj2 = aVar.f234283g;
        }
        Object obj3 = obj2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(keywords, "keywords");
        List list = keywords;
        Clause clause3 = clause;
        Clause clause4 = clause2;
        return new a(id10, i3, title, clause4, clause3, list, obj3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f234280a, aVar.f234280a) && this.f234281b == aVar.f234281b && Intrinsics.f(this.f234282c, aVar.f234282c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f234283g, aVar.f234283g);
    }

    public final int hashCode() {
        int iA = p.a.a(j6.a.b(this.f234281b, this.f234280a.hashCode() * 31, 31), 31, this.f234282c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iD = p.a.d((iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f);
        Object obj2 = this.f234283g;
        return iD + (obj2 != null ? obj2.hashCode() : 0);
    }

    public a(b bVar, int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, List list) {
        this(bVar, i, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, list, null);
    }
}
