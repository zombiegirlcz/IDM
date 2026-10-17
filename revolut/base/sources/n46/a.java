package n46;

import com.google.common.collect.ImmutableMap;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.defi.feed.api.widget.DeFiPortfolioWidgetContext;
import csh.i;
import csh.j;
import csh.k;
import dsh.g;
import dsh.h;
import e4m.e;
import fsh.c;
import grl.k9;
import hsh.b;
import kotlin.jvm.internal.Intrinsics;
import q46.d;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f212304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rr5.a f212305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g76.a f212306c;
    public final s2l.a d;
    public final e e;
    public final mil.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mil.a f212307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f212308h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mil.a f212309j;
    public final e k;

    public a(g76.a aVar, s2l.a aVar2, b bVar, rr5.a aVar3) {
        this.f212304a = bVar;
        this.f212305b = aVar3;
        this.f212306c = aVar;
        this.d = aVar2;
        int i = 17;
        this.e = e4m.b.b(new mil.a(this, 1, i));
        this.f = new mil.a(this, 0, i);
        this.f212307g = new mil.a(this, 2, i);
        this.f212308h = e4m.b.b(new mil.a(this, 5, i));
        this.i = e4m.b.b(new mil.a(this, 4, i));
        this.f212309j = new mil.a(this, 3, i);
        this.k = e4m.b.b(new mil.a(this, 6, i));
    }

    @Override // csh.k
    public final i a() {
        i iVar = (i) this.d.d.get();
        s.j(iVar);
        return iVar;
    }

    @Override // csh.k
    public final ImmutableMap b() {
        return ImmutableMap.of("transactions", this.f212307g);
    }

    @Override // csh.k
    public final h c() {
        g gVar = new g();
        c cVar = new c();
        ImmutableMap immutableMapOf = ImmutableMap.of("TransactionsDynamic", this.f);
        p46.a aVar = new p46.a();
        bil.a initializer = new bil.a(gVar, cVar, immutableMapOf, aVar);
        d.Companion.getClass();
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        gVar.a(DeFiPortfolioWidgetContext.class, c.a(immutableMapOf, aVar));
        return new h(gVar.f117321a);
    }

    @Override // csh.k
    public final csh.g d() {
        return new p46.b();
    }

    @Override // csh.k
    public final csh.b e() {
        d.Companion.getClass();
        return new q46.b();
    }

    @Override // csh.k
    public final j f() {
        return new p46.c();
    }

    @Override // csh.k
    public final Class g() {
        d.Companion.getClass();
        return a.class;
    }

    @Override // csh.k
    public final q2l.a h() {
        q2l.a aVar = (q2l.a) this.d.e.get();
        s.j(aVar);
        return aVar;
    }

    @Override // csh.k
    public final AnalyticsProduct.Retail l() {
        d.Companion.getClass();
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.f137497g;
        return com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }
}
