package v4k;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f286121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f286122b;

    public b() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f286121a, bVar.f286121a) && Intrinsics.f(this.f286122b, bVar.f286122b);
    }

    public final int hashCode() {
        Clause clause = this.f286121a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        g gVar = this.f286122b;
        return iHashCode + (gVar != null ? gVar.hashCode() : 0);
    }

    public b(Clause clause, g gVar) {
        this.f286121a = clause;
        this.f286122b = gVar;
    }
}
