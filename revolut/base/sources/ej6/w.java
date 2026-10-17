package ej6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f126757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f126758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f126759c;
    public final boolean d;
    public final Clause e;
    public final Clause f;

    public w(ArrayList items, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, TextLocalisedClause textLocalisedClause2, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f126757a = items;
        this.f126758b = textLocalisedClause;
        this.f126759c = z;
        this.d = z3;
        this.e = textLocalisedClause2;
        this.f = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f126757a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f126757a.equals(wVar.f126757a) && Intrinsics.f(this.f126758b, wVar.f126758b) && this.f126759c == wVar.f126759c && this.d == wVar.d && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f126757a.hashCode() * 31;
        Clause clause = this.f126758b;
        int iC = j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f126759c), 31, this.d);
        Clause clause2 = this.e;
        int iHashCode2 = (iC + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f;
        return iHashCode2 + (clause3 != null ? clause3.hashCode() : 0);
    }
}
