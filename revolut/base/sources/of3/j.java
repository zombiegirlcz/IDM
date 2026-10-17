package of3;

import com.google.common.collect.ImmutableMap;
import oai.s;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vnh.b f224726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m8g.b f224727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2h.b f224728c;
    public final khf.b d;
    public final or5.b e;
    public final fd5.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jo9.b f224729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f224730h;
    public final s i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f224731j;
    public final s k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f224732l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s f224733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f224734n;
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f224735p;

    public j(m2h.b bVar, m8g.b bVar2, vnh.b bVar3, khf.b bVar4, or5.b bVar5, fd5.b bVar6, jo9.b bVar7) {
        this.f224726a = bVar3;
        this.f224727b = bVar2;
        this.f224728c = bVar;
        this.d = bVar4;
        this.e = bVar5;
        this.f = bVar6;
        this.f224729g = bVar7;
        int i = 2;
        this.f224730h = new s(this, 0, i);
        this.i = new s(this, 1, i);
        this.f224731j = new s(this, 2, i);
        this.k = new s(this, 3, i);
        this.f224732l = new s(this, 4, i);
        this.f224733m = new s(this, 5, i);
        this.f224734n = new s(this, 6, i);
        this.o = new s(this, 7, i);
        this.f224735p = new s(this, 8, i);
    }

    public final ImmutableMap a() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
        builderBuilderWithExpectedSize.put("tradingScreenerChart", this.f224730h);
        builderBuilderWithExpectedSize.put("staysTilesCollection", this.i);
        builderBuilderWithExpectedSize.put("staysBooking", this.f224731j);
        builderBuilderWithExpectedSize.put("tradingPriceChart", this.k);
        builderBuilderWithExpectedSize.put("transaction", this.f224732l);
        builderBuilderWithExpectedSize.put("cryptoTokens", this.f224733m);
        builderBuilderWithExpectedSize.put("cryptoDynamicPriceChart", this.f224734n);
        builderBuilderWithExpectedSize.put("cryptoCards", this.o);
        builderBuilderWithExpectedSize.put("transfer", this.f224735p);
        return builderBuilderWithExpectedSize.build();
    }
}
