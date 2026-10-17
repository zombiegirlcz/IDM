package vfd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;
import l3d.h0;
import m3d.j;
import m3d.k;
import us6.r2;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements nhd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rfd.d f288577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatchlistHomeScreenContract$InputData f288578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScreenContentRecyclerView f288579c;
    public final o5d.b d;
    public final dte.c e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f288580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f288581h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f288582j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f288583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f288584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f288585n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f288586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f288587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f288588r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f288589s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f288590t;

    public c(a aVar, b bVar, WatchlistHomeScreenContract$InputData watchlistHomeScreenContract$InputData, ScreenContentRecyclerView screenContentRecyclerView, dte.c cVar, rfd.d dVar, o5d.b bVar2) {
        this.f = aVar;
        this.f288577a = dVar;
        this.f288578b = watchlistHomeScreenContract$InputData;
        this.f288579c = screenContentRecyclerView;
        this.d = bVar2;
        this.e = cVar;
        int i = 14;
        this.f288580g = e4m.b.b(new r2(aVar, this, 1, i));
        this.f288581h = e4m.b.b(new r2(aVar, this, 2, i));
        this.i = e4m.b.b(new r2(aVar, this, 0, i));
        this.f288582j = e4m.b.b(new r2(aVar, this, 4, i));
        this.k = e4m.b.b(new r2(aVar, this, 3, i));
        this.f288583l = e4m.b.b(new r2(aVar, this, 6, i));
        this.f288584m = e4m.b.b(new r2(aVar, this, 5, i));
        this.f288585n = e4m.b.b(new r2(aVar, this, 7, i));
        this.o = e4m.b.b(new r2(aVar, this, 8, i));
        this.f288586p = e4m.b.b(new r2(aVar, this, 10, i));
        this.f288587q = e4m.b.b(new r2(aVar, this, 9, i));
        this.f288588r = e4m.b.b(new r2(aVar, this, 12, i));
        this.f288589s = e4m.b.b(new r2(aVar, this, 13, i));
        this.f288590t = e4m.b.b(new r2(aVar, this, 11, i));
    }

    public final lal.a d() {
        a aVar = this.f;
        h0 h0VarB = aVar.f288569a.b();
        s.j(h0VarB);
        j jVarA = aVar.f288570b.a();
        s.j(jVarA);
        return new lal.a(h0VarB, jVarA, new k(), (phd.a) this.f288580g.get());
    }

    @Override // sji.b
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        builderBuilderWithExpectedSize.add(this.f288585n.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.o.get());
        builderBuilderWithExpectedSize.add(this.f288587q.get());
        builderBuilderWithExpectedSize.add(this.f288586p.get());
        return j6.a.g(this.f288581h, builderBuilderWithExpectedSize);
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.k.get(), (yji.d) this.f288584m.get());
    }
}
