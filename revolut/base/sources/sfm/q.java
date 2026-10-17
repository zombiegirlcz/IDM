package sfm;

import efm.f0;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class q extends AtomicReference implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f262555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f262556b;

    public q(r rVar) {
        this.f262555a = rVar;
    }

    @Override // efm.f0
    public final void onError(Throwable th10) {
        r rVar = this.f262555a;
        if (r6.b.v(rVar.e, this)) {
            zfm.c cVar = rVar.d;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                if (!rVar.f262559c) {
                    rVar.f.dispose();
                    rVar.a();
                }
                rVar.b();
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // efm.f0
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // efm.f0
    public final void onSuccess(Object obj2) {
        this.f262556b = obj2;
        this.f262555a.b();
    }
}
