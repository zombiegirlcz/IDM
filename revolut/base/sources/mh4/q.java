package mh4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f205402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f205403c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f205404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f205405h;

    public q(List items, List bottomItems, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, boolean z, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f205401a = items;
        this.f205402b = bottomItems;
        this.f205403c = title;
        this.d = textLocalisedClause;
        this.e = textLocalisedClause2;
        this.f = textLocalisedClause3;
        this.f205404g = z;
        this.f205405h = i;
    }

    @Override // cli.p
    public final List c() {
        return this.f205401a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f205401a, qVar.f205401a) && Intrinsics.f(this.f205402b, qVar.f205402b) && this.f205403c.equals(qVar.f205403c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && this.f205404g == qVar.f205404g && this.f205405h == qVar.f205405h;
    }

    public final int hashCode() {
        int iA = t61.a.a(p.a.d(this.f205401a.hashCode() * 31, 31, this.f205402b), 31, this.f205403c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f;
        return Integer.hashCode(this.f205405h) + j6.a.c((iHashCode2 + (clause3 != null ? clause3.hashCode() : 0)) * 31, 31, this.f205404g);
    }
}
