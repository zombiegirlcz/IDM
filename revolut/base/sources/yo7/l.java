package yo7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f315620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f315621c;
    public final boolean d;
    public final boolean e;

    public l(aim.e items, TextLocalisedClause title, TextLocalisedClause primaryButtonText, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        this.f315619a = items;
        this.f315620b = title;
        this.f315621c = primaryButtonText;
        this.d = z;
        this.e = z3;
    }

    @Override // jki.n
    public final List c() {
        return this.f315619a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f315619a, lVar.f315619a) && this.f315620b.equals(lVar.f315620b) && this.f315621c.equals(lVar.f315621c) && this.d == lVar.d && this.e == lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(t61.a.a(t61.a.a(this.f315619a.hashCode() * 31, 31, this.f315620b), 31, this.f315621c), 31, this.d);
    }
}
