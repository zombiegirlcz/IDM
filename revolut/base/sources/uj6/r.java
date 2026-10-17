package uj6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f280510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f280511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f280512c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f280513g;

    public r(List items, boolean z, TextClause textClause, TextClause textClause2, TextClause textClause3, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f280510a = items;
        this.f280511b = z;
        this.f280512c = textClause;
        this.d = textClause2;
        this.e = textClause3;
        this.f = textLocalisedClause;
        this.f280513g = textLocalisedClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f280510a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f280510a, rVar.f280510a) && this.f280511b == rVar.f280511b && Intrinsics.f(this.f280512c, rVar.f280512c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f280513g, rVar.f280513g);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f280510a.hashCode() * 31, 31, this.f280511b);
        Clause clause = this.f280512c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.e;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.f;
        int iHashCode4 = (iHashCode3 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Clause clause5 = this.f280513g;
        return iHashCode4 + (clause5 != null ? clause5.hashCode() : 0);
    }
}
