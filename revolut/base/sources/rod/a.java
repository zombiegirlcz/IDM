package rod;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f255970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f255971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f255972c;

    public a(TextLocalisedClause textLocalisedClause, Clause middle, Clause clause) {
        Intrinsics.checkNotNullParameter(middle, "middle");
        this.f255970a = textLocalisedClause;
        this.f255971b = middle;
        this.f255972c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f255970a, aVar.f255970a) && this.f255971b.equals(aVar.f255971b) && Intrinsics.f(this.f255972c, aVar.f255972c);
    }

    public final int hashCode() {
        Clause clause = this.f255970a;
        int iB = p.a.b((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f255971b);
        Clause clause2 = this.f255972c;
        return iB + (clause2 != null ? clause2.hashCode() : 0);
    }
}
