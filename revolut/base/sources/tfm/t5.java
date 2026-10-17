package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class t5 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270843a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vfm.c f270844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270845c;
    public volatile boolean d;
    public Throwable e;
    public final AtomicInteger f;

    public t5(s5 s5Var, int i, int i2) {
        this.f = s5Var;
        this.f270845c = i;
        this.f270844b = new vfm.c(i2);
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270843a) {
            case 0:
                this.d = true;
                ((s5) this.f).a();
                break;
            default:
                this.d = true;
                ((s5) this.f).a();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270843a) {
            case 0:
                this.e = th10;
                this.d = true;
                ((s5) this.f).a();
                break;
            default:
                this.e = th10;
                this.d = true;
                ((s5) this.f).a();
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270843a) {
            case 0:
                this.f270844b.offer(obj2);
                ((s5) this.f).a();
                break;
            default:
                this.f270844b.offer(obj2);
                ((s5) this.f).a();
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270843a) {
            case 0:
                s5 s5Var = (s5) this.f;
                s5Var.f270816c.a(this.f270845c, cVar);
                break;
            default:
                s5 s5Var2 = (s5) this.f;
                s5Var2.f270816c.a(this.f270845c, cVar);
                break;
        }
    }

    public t5(s5 s5Var, int i, int i2, byte b4) {
        this.f = s5Var;
        this.f270845c = i;
        this.f270844b = new vfm.c(i2);
    }
}
