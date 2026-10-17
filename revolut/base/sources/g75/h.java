package g75;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f141115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f141116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f141117c;
    public final Clause d;
    public final boolean e;

    public h(List items, TextLocalisedClause title, Clause clause, Clause clause2, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f141115a = items;
        this.f141116b = title;
        this.f141117c = clause;
        this.d = clause2;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f141115a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f141115a, hVar.f141115a) && Intrinsics.f(this.f141116b, hVar.f141116b) && Intrinsics.f(this.f141117c, hVar.f141117c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f141115a.hashCode() * 31, 31, this.f141116b);
        Clause clause = this.f141117c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 961;
        Clause clause2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
