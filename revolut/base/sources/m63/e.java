package m63;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import h93.f0;
import h93.g0;
import h93.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f202990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardDetailsDesignConfig f202991c;
    public final g0 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h93.d f202992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f202993h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f202994j;
    public final d k;

    public e(String listId, f0 card, CardDetailsDesignConfig cardDetailsDesignConfig, g0 g0Var, boolean z, boolean z3, h93.d dVar, i iVar, Clause clause, Clause clause2, d dVar2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(card, "card");
        this.f202989a = listId;
        this.f202990b = card;
        this.f202991c = cardDetailsDesignConfig;
        this.d = g0Var;
        this.e = z;
        this.f = z3;
        this.f202992g = dVar;
        this.f202993h = iVar;
        this.i = clause;
        this.f202994j = clause2;
        this.k = dVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f202989a, eVar.f202989a) && Intrinsics.f(this.f202990b, eVar.f202990b) && Intrinsics.f(this.f202991c, eVar.f202991c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && Intrinsics.f(this.f202992g, eVar.f202992g) && Intrinsics.f(this.f202993h, eVar.f202993h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f202994j, eVar.f202994j) && Intrinsics.f(this.k, eVar.k);
    }

    public final int hashCode() {
        int iHashCode = (this.f202990b.hashCode() + (this.f202989a.hashCode() * 31)) * 31;
        CardDetailsDesignConfig cardDetailsDesignConfig = this.f202991c;
        int iHashCode2 = (iHashCode + (cardDetailsDesignConfig == null ? 0 : cardDetailsDesignConfig.hashCode())) * 31;
        g0 g0Var = this.d;
        int iC = j6.a.c(j6.a.c((iHashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31, 31, this.e), 31, this.f);
        h93.d dVar = this.f202992g;
        int iHashCode3 = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.f202993h;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Clause clause = this.i;
        int iHashCode5 = (iHashCode4 + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f202994j;
        int iHashCode6 = (iHashCode5 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        d dVar2 = this.k;
        return iHashCode6 + (dVar2 != null ? dVar2.hashCode() : 0);
    }
}
