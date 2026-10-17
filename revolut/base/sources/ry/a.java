package ry;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import ty.c;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f258192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f258193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f258194c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f258195g;

    public a(Clause title, TextLocalisedClause textLocalisedClause, c cVar, boolean z, boolean z3, boolean z4, boolean z6, int i) {
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        cVar = (i & 4) != 0 ? null : cVar;
        z = (i & 8) != 0 ? false : z;
        z3 = (i & 16) != 0 ? false : z3;
        z4 = (i & 32) != 0 ? false : z4;
        z6 = (i & 64) != 0 ? false : z6;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f258192a = title;
        this.f258193b = textLocalisedClause;
        this.f258194c = cVar;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f258195g = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f258192a.equals(aVar.f258192a) && Intrinsics.f(this.f258193b, aVar.f258193b) && Intrinsics.f(this.f258194c, aVar.f258194c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.f258195g == aVar.f258195g;
    }

    public final int hashCode() {
        int iHashCode = this.f258192a.hashCode() * 31;
        Clause clause = this.f258193b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        c cVar = this.f258194c;
        return Boolean.hashCode(this.f258195g) + j6.a.c(j6.a.c(j6.a.c((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
