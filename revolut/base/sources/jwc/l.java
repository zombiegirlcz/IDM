package jwc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f178963c;
    public final Clause d;
    public final List e;

    public l(List items, boolean z, TextClause title, TextLocalisedClause textLocalisedClause, List list) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f178961a = items;
        this.f178962b = z;
        this.f178963c = title;
        this.d = textLocalisedClause;
        this.e = list;
    }

    @Override // cli.p
    public final List c() {
        return this.f178961a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f178961a.equals(lVar.f178961a) && this.f178962b == lVar.f178962b && this.f178963c.equals(lVar.f178963c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(j6.a.c(this.f178961a.hashCode() * 31, 31, this.f178962b), 31, this.f178963c);
        Clause clause = this.d;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
