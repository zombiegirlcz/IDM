package pic;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f236463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f236464b;

    public c(Clause period, TextLocalisedClause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f236463a = status;
        this.f236464b = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f236463a.equals(cVar.f236463a) && this.f236464b.equals(cVar.f236464b);
    }

    public final int hashCode() {
        return this.f236464b.hashCode() + (this.f236463a.hashCode() * 31);
    }
}
