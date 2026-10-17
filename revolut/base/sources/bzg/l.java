package bzg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f20004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f20006c;
    public final Object d;
    public final List e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f20007g;

    public l(TextLocalisedClause topDescription, Clause title, Clause description, Clause thirdDescription, List list, String str, boolean z) {
        Intrinsics.checkNotNullParameter(topDescription, "topDescription");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(thirdDescription, "thirdDescription");
        this.f20004a = topDescription;
        this.f20005b = title;
        this.f20006c = description;
        this.d = thirdDescription;
        this.e = list;
        this.f = str;
        this.f20007g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f20004a.equals(lVar.f20004a) && this.f20005b.equals(lVar.f20005b) && this.f20006c.equals(lVar.f20006c) && this.d.equals(lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f20007g == lVar.f20007g;
    }

    public final int hashCode() {
        int iB = p.a.b(p.a.a(p.a.b(this.f20004a.hashCode() * 31, 31, this.f20005b), 31, this.f20006c), 31, this.d);
        List list = this.e;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f20007g) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
