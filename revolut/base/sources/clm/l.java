package clm;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends skm.a {
    public final rfm.c d;

    public l(CoroutineContext coroutineContext, rfm.c cVar) {
        super(coroutineContext, false, true);
        this.d = cVar;
    }

    @Override // skm.a
    public final void h0(Throwable th10, boolean z) {
        try {
            if (this.d.b(th10)) {
                return;
            }
        } catch (Throwable th11) {
            yhm.f.a(th10, th11);
        }
        n14.k.m(this.f263953c, th10);
    }

    @Override // skm.a
    public final void i0(Object obj2) {
        rfm.c cVar = this.d;
        try {
            if (obj2 == null) {
                cVar.onComplete();
            } else {
                cVar.a(obj2);
            }
        } catch (Throwable th10) {
            n14.k.m(this.f263953c, th10);
        }
    }
}
