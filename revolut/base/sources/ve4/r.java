package ve4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f288126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f288127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f288128c;

    public r(List items, p toolbar, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        this.f288126a = items;
        this.f288127b = toolbar;
        this.f288128c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f288126a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f288126a, rVar.f288126a) && Intrinsics.f(this.f288127b, rVar.f288127b) && Intrinsics.f(this.f288128c, rVar.f288128c);
    }

    public final int hashCode() {
        int iHashCode = (this.f288127b.hashCode() + (this.f288126a.hashCode() * 31)) * 31;
        Clause clause = this.f288128c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
