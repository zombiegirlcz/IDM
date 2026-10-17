package txg;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f275422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f275423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f275424c;

    public f(TextLocalisedClause title, TextLocalisedQuantityClause textLocalisedQuantityClause, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f275422a = title;
        this.f275423b = textLocalisedQuantityClause;
        this.f275424c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f275424c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f275422a.equals(fVar.f275422a) && Intrinsics.f(this.f275423b, fVar.f275423b) && Intrinsics.f(this.f275424c, fVar.f275424c);
    }

    public final int hashCode() {
        int iHashCode = this.f275422a.hashCode() * 31;
        Clause clause = this.f275423b;
        return this.f275424c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
