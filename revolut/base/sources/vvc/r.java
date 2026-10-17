package vvc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f292519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f292520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f292521c;
    public final Clause d;
    public final boolean e;

    public r(TextLocalisedClause titleClause, f fVar, boolean z, TextLocalisedClause textLocalisedClause, boolean z3) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f292519a = titleClause;
        this.f292520b = fVar;
        this.f292521c = z;
        this.d = textLocalisedClause;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f292519a.equals(rVar.f292519a) && Intrinsics.f(this.f292520b, rVar.f292520b) && this.f292521c == rVar.f292521c && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f292519a.hashCode() * 31;
        f fVar = this.f292520b;
        int iC = j6.a.c((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.f292521c);
        Clause clause = this.d;
        return Boolean.hashCode(this.e) + ((iC + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
