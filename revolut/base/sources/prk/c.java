package prk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.add_key_stats_view_groups.AddKeyStatsViewGroupsScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final awk.f f239065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final awk.a f239066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AddKeyStatsViewGroupsScreenContract$Input f239067c;
    public final g0 d;
    public final e4m.e e = e4m.b.b(new pl1.h(this, 1, 28));
    public final e4m.e f = e4m.b.b(new pl1.h(this, 0, 28));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f239068g = e4m.b.b(new pl1.h(this, 2, 28));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f239069h = e4m.b.b(new pl1.h(this, 4, 28));
    public final e4m.e i = e4m.b.b(new pl1.h(this, 3, 28));

    public c(g0 g0Var, b bVar, AddKeyStatsViewGroupsScreenContract$Input addKeyStatsViewGroupsScreenContract$Input, awk.a aVar, awk.f fVar) {
        this.d = g0Var;
        this.f239065a = fVar;
        this.f239066b = aVar;
        this.f239067c = addKeyStatsViewGroupsScreenContract$Input;
    }

    public final zvk.d b() {
        return new zvk.d(new o7.d(new x3h.a()));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f239068g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
