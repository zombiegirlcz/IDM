package wfb;

import com.revolut.feature.retail.salary_account.impl.switch_assistant.data.SalarySwitchAssistantService;
import com.revolut.feature.retail.salary_account.impl.work_email.data.WorkEmailService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f297039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f297040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f297041c;
    public final ite.a d;
    public final ila.b e;
    public final xmg.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nj0.a f297042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vxc.h f297043h;
    public final vn2.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ctj.e f297044j;
    public final u06.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u06.c f297045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rkd.g f297046m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ufk.a f297047n;
    public final usg.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oda.d f297048p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final pqi.a f297049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cf7.l f297050r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ore.b f297051s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f297052t = this;
    public final e4m.e u = e4m.b.b(new h(this, 0));
    public final e4m.e v = e4m.b.b(new h(this, 1));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f297053w = e4m.b.b(new h(this, 4));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f297054x = e4m.b.b(new h(this, 3));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f297055y = e4m.b.b(new h(this, 2));
    public final e4m.e z = e4m.b.b(new h(this, 5));
    public final e4m.e A = e4m.b.b(new h(this, 7));
    public final e4m.e B = e4m.b.b(new h(this, 6));
    public final e4m.e C = e4m.b.b(new h(this, 9));
    public final e4m.e D = e4m.b.b(new h(this, 8));
    public final e4m.e E = e4m.b.b(new h(this, 10));
    public final e4m.e F = e4m.b.b(new h(this, 13));
    public final e4m.e G = e4m.b.b(new h(this, 12));
    public final e4m.e H = e4m.b.b(new h(this, 11));
    public final e4m.e I = e4m.b.b(new h(this, 14));
    public final e4m.e J = e4m.b.b(new h(this, 15));
    public final e4m.e K = e4m.b.b(new h(this, 16));
    public final e4m.e L = e4m.b.b(new h(this, 20));
    public final e4m.e M = e4m.b.b(new h(this, 19));
    public final e4m.e N = e4m.b.b(new h(this, 18));
    public final e4m.e O = e4m.b.b(new h(this, 17));

    public i(vn2.e eVar, l70.e eVar2, ee0.a aVar, nj0.a aVar2, u06.a aVar3, u06.c cVar, vxc.h hVar, ite.a aVar4, ctj.e eVar3, cf7.l lVar, oda.d dVar, ufk.a aVar5, ila.b bVar, pqi.a aVar6, an0.c cVar2, rkd.g gVar, ore.b bVar2, xmg.a aVar7, usg.a aVar8) {
        this.f297039a = aVar;
        this.f297040b = cVar2;
        this.f297041c = eVar2;
        this.d = aVar4;
        this.e = bVar;
        this.f = aVar7;
        this.f297042g = aVar2;
        this.f297043h = hVar;
        this.i = eVar;
        this.f297044j = eVar3;
        this.k = aVar3;
        this.f297045l = cVar;
        this.f297046m = gVar;
        this.f297047n = aVar5;
        this.o = aVar8;
        this.f297048p = dVar;
        this.f297049q = aVar6;
        this.f297050r = lVar;
        this.f297051s = bVar2;
    }

    public final mf1.c a() {
        return (mf1.c) this.I.get();
    }

    public final rfb.b b() {
        return (rfb.b) this.H.get();
    }

    public final fnc.s c() {
        SalarySwitchAssistantService salarySwitchAssistantService = (SalarySwitchAssistantService) this.K.get();
        z9l.h hVar = (z9l.h) this.f297043h.f293076c.get();
        vc.s.j(hVar);
        zjh.j salarySwitchRequestStatusResultMapper = new zjh.j(hVar);
        Intrinsics.checkNotNullParameter(salarySwitchAssistantService, "salarySwitchAssistantService");
        Intrinsics.checkNotNullParameter(salarySwitchRequestStatusResultMapper, "salarySwitchRequestStatusResultMapper");
        r10.w wVar = new r10.w();
        wVar.f250865a = salarySwitchAssistantService;
        wVar.f250866b = salarySwitchRequestStatusResultMapper;
        return new fnc.s(wVar);
    }

    public final zjh.f d() {
        nj0.d dVar = (nj0.d) this.f297042g;
        ik0.b retrofitFactory = dVar.m();
        vc.s.j(retrofitFactory);
        ek.a converterFactory = dVar.d();
        eib.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(WorkEmailService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WorkEmailService workEmailService = (WorkEmailService) objCreate;
        vc.s.k(workEmailService);
        return new zjh.f(workEmailService);
    }
}
