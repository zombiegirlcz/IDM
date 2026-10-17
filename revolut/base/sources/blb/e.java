package blb;

import dkk.a0;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import vc.s;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f16502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f16503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xbd.c f16504c;
    public final efk.a d;
    public final vbd.c e;
    public final jk3.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nj0.a f16505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l70.e f16506h;
    public final u06.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cri.b f16507j;
    public final npk.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f16508l = this;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f16509m = e4m.b.b(new d(this, 2));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f16510n = e4m.b.b(new d(this, 1));
    public final e4m.e o = e4m.b.b(new d(this, 0));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f16511p = e4m.b.b(new d(this, 3));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f16512q = e4m.b.b(new d(this, 6));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f16513r = e4m.b.b(new d(this, 5));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f16514s = e4m.b.b(new d(this, 7));

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f16515t = e4m.b.b(new d(this, 4));

    public e(l70.e eVar, jk3.c cVar, nj0.a aVar, ee0.a aVar2, an0.c cVar2, cri.b bVar, u06.a aVar3, npk.a aVar4, efk.a aVar5, xbd.c cVar3, vbd.c cVar4) {
        this.f16502a = aVar2;
        this.f16503b = cVar2;
        this.f16504c = cVar3;
        this.d = aVar5;
        this.e = cVar4;
        this.f = cVar;
        this.f16505g = aVar;
        this.f16506h = eVar;
        this.i = aVar3;
        this.f16507j = bVar;
        this.k = aVar4;
    }

    public final r a() {
        return h();
    }

    public final skb.f b() {
        return new skb.f(new skb.b(), new skb.a(), new skb.g(new dcd.b()));
    }

    public final iob.c c() {
        dcd.b bVar = new dcd.b();
        l80.e eVarH = this.f16506h.h();
        s.j(eVarH);
        return new iob.c(bVar, new iob.g(eVarH));
    }

    public final a0 d() {
        clb.a errorConfigProvider = new clb.a();
        dlb.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(errorConfigProvider, "errorConfigProvider");
        return new a0(errorConfigProvider, 1);
    }

    public final elb.b e() {
        fk3.a aVarA = this.f.a();
        s.j(aVarA);
        return new elb.b(aVarA);
    }

    public final dcd.b f() {
        return new dcd.b();
    }

    public final ijb.a g() {
        return (ijb.a) this.f16511p.get();
    }

    public final r h() {
        q06.d deeplinkParser = this.i.a();
        s.j(deeplinkParser);
        x deeplinkHandler = ((s41.a) this.f16507j).d();
        f80.a uriHelper = this.f16506h.x();
        s.j(uriHelper);
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        r rVar = new r();
        rVar.f250851a = deeplinkParser;
        rVar.f250852b = deeplinkHandler;
        rVar.f250853c = uriHelper;
        return rVar;
    }
}
