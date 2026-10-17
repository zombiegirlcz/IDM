package cma;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f25184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f25185c;
    public final boolean d;
    public final Integer e;
    public final boolean f;

    public c(String id10, TextLocalisedClause title, Clause clause, Integer num, boolean z, int i) {
        boolean z3 = (i & 8) == 0;
        num = (i & 16) != 0 ? null : num;
        z = (i & 32) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f25183a = id10;
        this.f25184b = title;
        this.f25185c = clause;
        this.d = z3;
        this.e = num;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f25183a.equals(cVar.f25183a) && this.f25184b.equals(cVar.f25184b) && Intrinsics.f(this.f25185c, cVar.f25185c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && this.f == cVar.f;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f25183a.hashCode() * 31, 31, this.f25184b);
        Clause clause = this.f25185c;
        int iC = j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iC + (num != null ? num.hashCode() : 0)) * 31);
    }
}
