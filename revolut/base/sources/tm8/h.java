package tm8;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f272164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f272166c;

    public h(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272164a = textLocalisedClause;
        this.f272165b = items;
        this.f272166c = textLocalisedClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f272165b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f272164a, hVar.f272164a) && Intrinsics.f(this.f272165b, hVar.f272165b) && Intrinsics.f(this.f272166c, hVar.f272166c);
    }

    public final int hashCode() {
        Clause clause = this.f272164a;
        int iD = p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f272165b);
        Clause clause2 = this.f272166c;
        return iD + (clause2 != null ? clause2.hashCode() : 0);
    }
}
