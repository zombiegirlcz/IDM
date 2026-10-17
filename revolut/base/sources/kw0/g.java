package kw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f190188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f190189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f190190c;
    public final j d;
    public final Clause e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f190191g;

    public g(k toolbar, f fVar, Clause clause, j jVar, Clause clause2, List actions, c heightMode) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f190188a = toolbar;
        this.f190189b = fVar;
        this.f190190c = clause;
        this.d = jVar;
        this.e = clause2;
        this.f = actions;
        this.f190191g = heightMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f190188a, gVar.f190188a) && Intrinsics.f(this.f190189b, gVar.f190189b) && Intrinsics.f(this.f190190c, gVar.f190190c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f190191g, gVar.f190191g);
    }

    public final int hashCode() {
        int iHashCode = this.f190188a.hashCode() * 31;
        f fVar = this.f190189b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Clause clause = this.f190190c;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode4 = (iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Clause clause2 = this.e;
        return this.f190191g.hashCode() + p.a.d((iHashCode4 + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f);
    }

    public g(k kVar, f fVar, TextLocalisedClause textLocalisedClause, h hVar, Clause clause, c cVar, int i) {
        this(kVar, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : textLocalisedClause, (i & 8) != 0 ? null : hVar, (i & 16) != 0 ? null : clause, f0.f322471a, (i & 64) != 0 ? b.f190185a : cVar);
    }
}
