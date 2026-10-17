package x82;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f303262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f303263b;

    public c(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f303262a = items;
        this.f303263b = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f303262a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f303262a, cVar.f303262a) && Intrinsics.f(this.f303263b, cVar.f303263b);
    }

    public final int hashCode() {
        int iHashCode = this.f303262a.hashCode() * 31;
        Clause clause = this.f303263b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
