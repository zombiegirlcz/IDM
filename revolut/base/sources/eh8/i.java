package eh8;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f125756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f125757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f125758c;

    public i(h headerModel, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f125756a = headerModel;
        this.f125757b = textLocalisedClause;
        this.f125758c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f125758c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f125756a, iVar.f125756a) && Intrinsics.f(this.f125757b, iVar.f125757b) && Intrinsics.f(this.f125758c, iVar.f125758c);
    }

    public final int hashCode() {
        int iHashCode = this.f125756a.hashCode() * 31;
        Clause clause = this.f125757b;
        return this.f125758c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
