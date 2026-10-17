package rfm;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import tfm.s3;

/* JADX INFO: loaded from: classes13.dex */
public final class a0 extends AtomicReference implements efm.l, efm.f0, efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253915b;

    public /* synthetic */ a0(Object obj2, int i) {
        this.f253914a = i;
        this.f253915b = obj2;
    }

    @Override // efm.l
    public void onComplete() {
        switch (this.f253914a) {
            case 0:
                ofm.h hVar = (ofm.h) this.f253915b;
                hVar.getClass();
                if (lfm.d.a(hVar)) {
                    ((efm.l) hVar.f224920b).onError(new TimeoutException());
                }
                break;
            default:
                s3 s3Var = (s3) this.f253915b;
                s3Var.f = true;
                if (s3Var.e) {
                    jh.d.o(s3Var.f270806a, s3Var, s3Var.d);
                }
                break;
        }
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        switch (this.f253914a) {
            case 0:
                ofm.h hVar = (ofm.h) this.f253915b;
                hVar.getClass();
                if (!lfm.d.a(hVar)) {
                    mo3.a.m(th10);
                } else {
                    ((efm.l) hVar.f224920b).onError(th10);
                }
                break;
            case 1:
                sfm.i iVar = (sfm.i) this.f253915b;
                zfm.c cVar = iVar.f262530c;
                cVar.getClass();
                if (!zfm.h.a(cVar, th10)) {
                    mo3.a.m(th10);
                } else {
                    if (iVar.f != zfm.f.END) {
                        iVar.f262531g.dispose();
                    }
                    iVar.k = 0;
                    iVar.a();
                }
                break;
            case 2:
                s3 s3Var = (s3) this.f253915b;
                lfm.d.a(s3Var.f270807b);
                jh.d.p(s3Var.f270806a, th10, s3Var, s3Var.d);
                break;
            default:
                ((efm.f0) this.f253915b).onError(th10);
                break;
        }
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f253914a) {
            case 0:
                lfm.d.e(this, cVar);
                break;
            case 1:
                lfm.d.c(this, cVar);
                break;
            case 2:
                lfm.d.e(this, cVar);
                break;
            default:
                lfm.d.e(this, cVar);
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f253914a) {
            case 0:
                ofm.h hVar = (ofm.h) this.f253915b;
                hVar.getClass();
                if (lfm.d.a(hVar)) {
                    ((efm.l) hVar.f224920b).onError(new TimeoutException());
                }
                break;
            case 1:
                sfm.i iVar = (sfm.i) this.f253915b;
                iVar.f262533j = obj2;
                iVar.k = 2;
                iVar.a();
                break;
            default:
                ((efm.f0) this.f253915b).onSuccess(obj2);
                break;
        }
    }
}
