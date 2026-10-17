package m4d;

import android.content.Context;
import com.revolut.feature.separate_favourites.item_data.impl.watchlist.network.WatchlistService;
import lal.j;
import n4d.n;
import n4d.r;
import n4d.r0;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f202700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee0.c f202701c;
    public final f d;
    public final nj0.a e;
    public final ee0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l70.e f202702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cri.a f202703h;
    public final rk0.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f202704j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f202705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f202706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f202707n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f202708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f202709q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f202710r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f202711s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f202712t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f202713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f202714x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f202715y;

    public a(f fVar, an0.c cVar, l70.e eVar, ee0.a aVar, nj0.a aVar2, rk0.c cVar2, ee0.c cVar3, cri.a aVar3, Context context) {
        this.f202699a = context;
        this.f202700b = cVar;
        this.f202701c = cVar3;
        this.d = fVar;
        this.e = aVar2;
        this.f = aVar;
        this.f202702g = eVar;
        this.f202703h = aVar3;
        this.i = cVar2;
        int i = 19;
        this.f202704j = e4m.b.b(new j(this, 1, i));
        this.k = e4m.b.b(new j(this, 0, i));
        this.f202705l = e4m.b.b(new j(this, 4, i));
        this.f202706m = e4m.b.b(new j(this, 3, i));
        this.f202707n = e4m.b.b(new j(this, 2, i));
        this.o = e4m.b.b(new j(this, 5, i));
        this.f202708p = e4m.b.b(new j(this, 6, i));
        this.f202709q = e4m.b.b(new j(this, 7, i));
        this.f202710r = e4m.b.b(new j(this, 8, i));
        this.f202711s = e4m.b.b(new j(this, 9, i));
        this.f202712t = e4m.b.b(new j(this, 10, i));
        this.u = e4m.b.b(new j(this, 11, i));
        this.v = e4m.b.b(new j(this, 13, i));
        this.f202713w = e4m.b.b(new j(this, 14, i));
        this.f202714x = e4m.b.b(new j(this, 12, i));
        this.f202715y = e4m.b.b(new j(this, 15, i));
    }

    public final r0 a() {
        n nVar = (n) this.f202710r.get();
        ne0.j jVar = (ne0.j) this.o.get();
        ue0.c cVar = (ue0.c) this.f202711s.get();
        WatchlistService watchlistService = (WatchlistService) this.f202712t.get();
        l80.e eVarH = this.f202702g.h();
        s.j(eVarH);
        r rVar = (r) this.u.get();
        lfm.c cVarB = ((g8b.a) this.f202703h).b();
        s.j(cVarB);
        mk0.a aVarA = this.i.a();
        s.j(aVarA);
        return new r0(nVar, jVar, cVar, watchlistService, eVarH, rVar, cVarB, aVarA);
    }
}
