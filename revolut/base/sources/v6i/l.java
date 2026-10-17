package v6i;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f286400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f286401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f286402c;

    public l(TextLocalisedClause textLocalisedClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f286400a = textLocalisedClause;
        this.f286401b = z;
        this.f286402c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f286402c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f286400a, lVar.f286400a) && this.f286401b == lVar.f286401b && Intrinsics.f(this.f286402c, lVar.f286402c);
    }

    public final int hashCode() {
        Clause clause = this.f286400a;
        return this.f286402c.hashCode() + j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f286401b);
    }
}
