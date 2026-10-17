package op0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f227416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f227417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227418c;
    public final Clause d;

    public t(Clause stringWithNumbersAnimateFrom, String str, CompositeClause compositeClause, int i) {
        compositeClause = (i & 32) != 0 ? null : compositeClause;
        Intrinsics.checkNotNullParameter(stringWithNumbersAnimateFrom, "stringWithNumbersAnimateTo");
        Intrinsics.checkNotNullParameter(stringWithNumbersAnimateFrom, "stringWithNumbersAnimateFrom");
        this.f227416a = stringWithNumbersAnimateFrom;
        this.f227417b = stringWithNumbersAnimateFrom;
        this.f227418c = str;
        this.d = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f227416a.equals(tVar.f227416a) && this.f227417b.equals(tVar.f227417b) && this.f227418c.equals(tVar.f227418c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(p.a.c(p.a.b(this.f227416a.hashCode() * 31, 31, this.f227417b), 31, this.f227418c), 31, true), 31, true);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
