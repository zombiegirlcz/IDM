package hi2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f152458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f152459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f152460c;

    public j(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f152458a = items;
        this.f152459b = textLocalisedClause;
        this.f152460c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f152458a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f152458a, jVar.f152458a) && Intrinsics.f(this.f152459b, jVar.f152459b) && this.f152460c == jVar.f152460c;
    }

    public final int hashCode() {
        int iHashCode = this.f152458a.hashCode() * 31;
        Clause clause = this.f152459b;
        return Boolean.hashCode(this.f152460c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
