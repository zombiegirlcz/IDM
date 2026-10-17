package ea2;

import android.content.Context;
import dw3.f6;
import kotlin.jvm.internal.Intrinsics;
import zu8.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.b f124071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c21.e f124072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f124073c;
    public final l70.e d;
    public final nj0.a e;
    public final nf0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vl3.n f124074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f124075h;
    public final p12.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ox9.a f124076j;
    public final djf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ika.f f124077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lx1.b f124078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f124079n = this;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f124080p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f6 f124081q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f124082r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f124083s;

    public h(uw1.b bVar, p12.l lVar, lx1.b bVar2, t2j.a aVar, nj0.a aVar2, nf0.a aVar3, vl3.n nVar, l70.e eVar, c21.e eVar2, c0 c0Var, p2k.f fVar, ox9.a aVar4, ika.f fVar2, djf.c cVar, Context context) {
        this.f124071a = bVar;
        this.f124072b = eVar2;
        this.f124073c = context;
        this.d = eVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f124074g = nVar;
        this.f124075h = c0Var;
        this.i = lVar;
        this.f124076j = aVar4;
        this.k = cVar;
        this.f124077l = fVar2;
        this.f124078m = bVar2;
        int i = 18;
        this.o = e4m.b.b(new f6(this, 0, i));
        this.f124080p = e4m.b.b(new f6(this, 1, i));
        this.f124081q = new f6(this, 3, i);
        this.f124082r = e4m.b.b(new f6(this, 2, i));
        this.f124083s = e4m.b.b(new f6(this, 4, i));
    }

    public final ab2.b a() {
        u.Companion.getClass();
        zzl.c cVar = new zzl.c();
        z80.b bVarS = this.d.s();
        vc.s.j(bVarS);
        return new ab2.b(cVar, bVarS, new ab2.a(), new ab2.c());
    }

    public final twg.c b() {
        uy1.o interactor = (uy1.o) ((lz1.m) this.f124071a).X.get();
        vc.s.j(interactor);
        o71.a beneficiaryRepository = ((c21.b) this.f124072b).a();
        sri.m navigator = (sri.m) this.f124080p.get();
        ia2.a dialogProvider = new ia2.a();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        twg.c cVar = new twg.c();
        cVar.f275017a = interactor;
        cVar.f275018b = beneficiaryRepository;
        cVar.f275019c = navigator;
        cVar.d = dialogProvider;
        return cVar;
    }
}
