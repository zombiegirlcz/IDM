package iuh;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f168611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f168612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168613c;
    public final TextLocalisedClause d;
    public final List e;

    public i(TextClause title, CompositeClause compositeClause, boolean z, TextLocalisedClause submitButtonClause, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168611a = title;
        this.f168612b = compositeClause;
        this.f168613c = z;
        this.d = submitButtonClause;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f168611a.equals(iVar.f168611a) && Intrinsics.f(this.f168612b, iVar.f168612b) && this.f168613c == iVar.f168613c && this.d.equals(iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f168611a.hashCode() * 31;
        Clause clause = this.f168612b;
        return this.e.hashCode() + t61.a.a(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f168613c), 31, this.d);
    }
}
