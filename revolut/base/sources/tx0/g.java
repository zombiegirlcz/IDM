package tx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarCenterViewModel;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements r {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarCenterViewModel f275128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f275129c;
    public final NavBarWithContainerBackground d;
    public final u e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f275130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f275131h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f275132j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f275133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f275134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f275135n;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(NavBarCenterViewModel centerViewModel, List actions, NavBarWithContainerBackground background, Clause clause, h hVar, int i) {
        boolean z = (i & 32) == 0;
        zhm.f0 tickerTape = zhm.f0.f322471a;
        Clause clause2 = (i & 512) != 0 ? null : clause;
        h hVar2 = (i & 1024) != 0 ? null : hVar;
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter(centerViewModel, "centerViewModel");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(background, "background");
        t moreActionId = t.f275245a;
        Intrinsics.checkNotNullParameter(moreActionId, "moreActionId");
        Intrinsics.checkNotNullParameter(tickerTape, "tickerTape");
        this("", centerViewModel, new d(zhm.u.c(actions)), background, moreActionId, z, null, tickerTape, null, clause2, hVar2 != null ? new j(hVar2.f275145a, hVar2.f275146b) : null, null);
    }

    @Override // tx0.b
    public final int a() {
        return this.f275135n;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f275127a, gVar.f275127a) && Intrinsics.f(this.f275128b, gVar.f275128b) && Intrinsics.f(this.f275129c, gVar.f275129c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && Intrinsics.f(this.f275130g, gVar.f275130g) && Intrinsics.f(this.f275131h, gVar.f275131h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f275132j, gVar.f275132j) && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f275133l, gVar.f275133l);
    }

    @Override // tx0.r
    public final String getId() {
        return this.f275127a;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.e.hashCode() + ((this.d.hashCode() + p.a.d((this.f275128b.hashCode() + (this.f275127a.hashCode() * 31)) * 31, 31, this.f275129c.f275099a)) * 31)) * 31, 31, this.f);
        e eVar = this.f275130g;
        int iD = p.a.d((iC + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f275131h);
        Clause clause = this.i;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f275132j;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        k kVar = this.k;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Object obj2 = this.f275133l;
        return iHashCode3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public g(String id10, NavBarCenterViewModel centerViewModel, d actionGroups, NavBarWithContainerBackground background, u moreActionId, boolean z, e eVar, List tickerTape, Clause clause, Clause clause2, k kVar, Object obj2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(centerViewModel, "centerViewModel");
        Intrinsics.checkNotNullParameter(actionGroups, "actionGroups");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(moreActionId, "moreActionId");
        Intrinsics.checkNotNullParameter(tickerTape, "tickerTape");
        this.f275127a = id10;
        this.f275128b = centerViewModel;
        this.f275129c = actionGroups;
        this.d = background;
        this.e = moreActionId;
        this.f = z;
        this.f275130g = eVar;
        this.f275131h = tickerTape;
        this.i = clause;
        this.f275132j = clause2;
        this.k = kVar;
        this.f275133l = obj2;
        ArrayList arrayListU = zhm.w.u(actionGroups.f275099a);
        this.f275134m = arrayListU;
        this.f275135n = arrayListU.size();
    }

    public g(String str, NavBarCenterViewModel navBarCenterViewModel, d dVar, NavBarWithContainerBackground navBarWithContainerBackground, s sVar, e eVar, zhm.f0 f0Var, Clause clause, k kVar, ProductAccountSubtitle productAccountSubtitle, int i) {
        this((i & 1) != 0 ? "" : str, navBarCenterViewModel, dVar, navBarWithContainerBackground, (i & 16) != 0 ? t.f275245a : sVar, (i & 32) == 0, (i & 64) != 0 ? null : eVar, (i & 128) != 0 ? zhm.f0.f322471a : f0Var, null, (i & 512) != 0 ? null : clause, (i & 1024) != 0 ? null : kVar, (i & 2048) != 0 ? null : productAccountSubtitle);
    }
}
