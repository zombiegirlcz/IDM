package zsd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements amd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f324884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f324885b;

    public b(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f324884a = title;
        this.f324885b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f324884a.equals(bVar.f324884a) && Intrinsics.f(this.f324885b, bVar.f324885b);
    }

    public final int hashCode() {
        int iHashCode = this.f324884a.hashCode() * 31;
        Clause clause = this.f324885b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
