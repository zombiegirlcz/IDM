package ybh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f312348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f312350c;

    public t(Clause clause, TextLocalisedClause text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312348a = z;
        this.f312349b = text;
        this.f312350c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f312348a == tVar.f312348a && this.f312349b.equals(tVar.f312349b) && Intrinsics.f(this.f312350c, tVar.f312350c);
    }

    public final int hashCode() {
        int iA = t61.a.a(Boolean.hashCode(this.f312348a) * 31, 31, this.f312349b);
        Clause clause = this.f312350c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
