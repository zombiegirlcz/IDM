package rgm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f254241h;
    public final fgm.l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final igm.o f254242j;
    public Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f254243l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference f254244m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i, int i2, fgm.l lVar, igm.o oVar, ygm.f fVar) {
        super(i, fVar);
        this.f254241h = i2;
        switch (i2) {
            case 1:
                super(i, fVar);
                this.i = lVar;
                this.f254242j = oVar;
                this.f254244m = new d(this, 2);
                break;
            default:
                this.i = lVar;
                this.f254242j = oVar;
                this.f254244m = new d(this, 1);
                break;
        }
    }

    @Override // rgm.c
    public final void a() {
        switch (this.f254241h) {
            case 0:
                this.k = null;
                break;
            default:
                this.k = null;
                break;
        }
    }

    @Override // rgm.c
    public final void b() {
        switch (this.f254241h) {
            case 0:
                d dVar = (d) this.f254244m;
                dVar.getClass();
                jgm.b.a(dVar);
                break;
            default:
                d dVar2 = (d) this.f254244m;
                dVar2.getClass();
                jgm.b.a(dVar2);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r2.clear();
        r10.k = null;
        r3.e(r0);
     */
    @Override // rgm.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rgm.g.c():void");
    }

    @Override // rgm.c
    public final void d() {
        switch (this.f254241h) {
            case 0:
                this.i.onSubscribe(this);
                break;
            default:
                this.i.onSubscribe(this);
                break;
        }
    }
}
