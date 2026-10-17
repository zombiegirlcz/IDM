package vtc;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f292045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f292046c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    public /* synthetic */ q0(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, int i) {
        this.f292045b = i;
        this.f292046c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f292045b) {
            case 0:
                rkd.g gVar = (rkd.g) ((phm.a) this.f292046c.f955b).get();
                re9.c cVar = (re9.c) ((phm.a) this.d.f955b).get();
                yt2.g gVar2 = (yt2.g) ((phm.a) this.e.f955b).get();
                wwc.a aVar = (wwc.a) ((phm.a) this.f.f955b).get();
                gVar.getClass();
                cVar.getClass();
                gVar2.getClass();
                aVar.getClass();
                return new h0(gVar, cVar, gVar2, aVar);
            case 1:
                ee0.a aVar2 = (ee0.a) ((phm.a) this.f292046c.f955b).get();
                nj0.a aVar3 = (nj0.a) ((phm.a) this.d.f955b).get();
                an0.c cVar2 = (an0.c) ((phm.a) this.e.f955b).get();
                add.a aVar4 = (add.a) ((phm.a) this.f.f955b).get();
                aVar2.getClass();
                aVar3.getClass();
                cVar2.getClass();
                aVar4.getClass();
                return new wcd.b(aVar2, aVar3, cVar2, aVar4);
            default:
                ee0.a aVar5 = (ee0.a) ((phm.a) this.f292046c.f955b).get();
                nj0.a aVar6 = (nj0.a) ((phm.a) this.d.f955b).get();
                an0.c cVar3 = (an0.c) ((phm.a) this.e.f955b).get();
                ifl.a aVar7 = (ifl.a) ((phm.a) this.f.f955b).get();
                aVar5.getClass();
                aVar6.getClass();
                cVar3.getClass();
                aVar7.getClass();
                return new zdl.a(aVar5, aVar6, cVar3, aVar7);
        }
    }
}
