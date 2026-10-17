package clm;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes13.dex */
public final class h extends skm.a {
    public final /* synthetic */ int d;
    public final AtomicReference e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CoroutineContext coroutineContext, AtomicReference atomicReference, int i) {
        super(coroutineContext, false, true);
        this.d = i;
        this.e = atomicReference;
    }

    @Override // skm.a
    public final void h0(Throwable th10, boolean z) {
        switch (this.d) {
            case 0:
                try {
                    if (((pfm.g) this.e).a(th10)) {
                    }
                } catch (Throwable th11) {
                    yhm.f.a(th10, th11);
                }
                n14.k.m(this.f263953c, th10);
                break;
            default:
                try {
                    if (((ufm.a) this.e).c(th10)) {
                    }
                } catch (Throwable th12) {
                    yhm.f.a(th10, th12);
                }
                n14.k.m(this.f263953c, th10);
                break;
        }
    }

    @Override // skm.a
    public final void i0(Object obj2) {
        switch (this.d) {
            case 0:
                try {
                    ((pfm.g) this.e).onComplete();
                } catch (Throwable th10) {
                    n14.k.m(this.f263953c, th10);
                }
                break;
            default:
                try {
                    ((ufm.a) this.e).b(obj2);
                } catch (Throwable th11) {
                    n14.k.m(this.f263953c, th11);
                    return;
                }
                break;
        }
    }
}
