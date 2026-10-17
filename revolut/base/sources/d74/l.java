package d74;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f111817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f111818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f111819c;
    public final Clause d;
    public final boolean e;

    public l(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f111817a = items;
        this.f111818b = title;
        this.f111819c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f111817a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f111817a, lVar.f111817a) && this.f111818b.equals(lVar.f111818b) && this.f111819c.equals(lVar.f111819c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(this.f111817a.hashCode() * 31, 31, this.f111818b), 31, this.f111819c);
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
