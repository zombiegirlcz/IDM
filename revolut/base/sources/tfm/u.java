package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends bgm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f270851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f270852c;
    public final Object d;

    public /* synthetic */ u(Object obj2, int i) {
        this.f270851b = i;
        this.d = obj2;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270851b) {
            case 0:
                if (!this.f270852c) {
                    this.f270852c = true;
                    ((v) this.d).j0();
                    break;
                }
                break;
            case 1:
                if (!this.f270852c) {
                    this.f270852c = true;
                    j7 j7Var = (j7) this.d;
                    lfm.d.a(j7Var.d);
                    j7Var.i = true;
                    j7Var.a();
                    break;
                }
                break;
            default:
                if (!this.f270852c) {
                    this.f270852c = true;
                    p7 p7Var = (p7) this.d;
                    p7Var.i.dispose();
                    p7Var.f270734j = true;
                    p7Var.b();
                    break;
                }
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270851b) {
            case 0:
                if (!this.f270852c) {
                    this.f270852c = true;
                    ((v) this.d).onError(th10);
                } else {
                    mo3.a.m(th10);
                }
                break;
            case 1:
                if (!this.f270852c) {
                    this.f270852c = true;
                    j7 j7Var = (j7) this.d;
                    lfm.d.a(j7Var.d);
                    zfm.c cVar = j7Var.f270574g;
                    cVar.getClass();
                    if (!zfm.h.a(cVar, th10)) {
                        mo3.a.m(th10);
                    } else {
                        j7Var.i = true;
                        j7Var.a();
                    }
                } else {
                    mo3.a.m(th10);
                }
                break;
            default:
                if (!this.f270852c) {
                    this.f270852c = true;
                    p7 p7Var = (p7) this.d;
                    p7Var.i.dispose();
                    zfm.c cVar2 = p7Var.f;
                    cVar2.getClass();
                    if (!zfm.h.a(cVar2, th10)) {
                        mo3.a.m(th10);
                    } else {
                        p7Var.f270734j = true;
                        p7Var.b();
                    }
                } else {
                    mo3.a.m(th10);
                }
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270851b) {
            case 0:
                if (!this.f270852c) {
                    this.f270852c = true;
                    dispose();
                    ((v) this.d).j0();
                    break;
                }
                break;
            case 1:
                if (!this.f270852c) {
                    ((j7) this.d).b();
                    break;
                }
                break;
            default:
                if (!this.f270852c) {
                    this.f270852c = true;
                    dispose();
                    p7 p7Var = (p7) this.d;
                    AtomicReference atomicReference = p7Var.f270731c;
                    while (!atomicReference.compareAndSet(this, null) && atomicReference.get() == this) {
                    }
                    p7Var.e.offer(p7.f270728m);
                    p7Var.b();
                    break;
                }
                break;
        }
    }
}
