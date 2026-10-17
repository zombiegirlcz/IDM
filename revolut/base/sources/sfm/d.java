package sfm;

import efm.w;
import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends AtomicReference implements y, efm.l, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f262508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f262509c;

    public d(y yVar, kfm.o oVar) {
        this.f262507a = 0;
        this.f262508b = yVar;
        this.f262509c = oVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f262507a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                ((ifm.c) this.f262509c).dispose();
                lfm.d.a(this);
                break;
            default:
                lfm.d.a((AtomicReference) this.f262509c);
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f262507a) {
            case 0:
                return lfm.d.b((ifm.c) get());
            case 1:
                return ((ifm.c) this.f262509c).isDisposed();
            default:
                return ((AtomicReference) this.f262509c).get() == lfm.d.DISPOSED;
        }
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f262507a) {
            case 0:
                this.f262508b.onComplete();
                break;
            case 1:
                lfm.d.a(this);
                this.f262508b.onComplete();
                break;
            default:
                dispose();
                this.f262508b.onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f262507a) {
            case 0:
                this.f262508b.onError(th10);
                break;
            case 1:
                lfm.d.a(this);
                this.f262508b.onError(th10);
                break;
            default:
                dispose();
                this.f262508b.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f262507a) {
            case 0:
                this.f262508b.onNext(obj2);
                break;
            case 1:
                this.f262508b.onNext(obj2);
                break;
            default:
                this.f262508b.onNext(obj2);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f262507a) {
            case 0:
                lfm.d.c(this, cVar);
                break;
            case 1:
                if (lfm.d.f((ifm.c) this.f262509c, cVar)) {
                    this.f262509c = cVar;
                    this.f262508b.onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.e((AtomicReference) this.f262509c, cVar)) {
                    this.f262508b.onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        try {
            Object objApply = ((kfm.o) this.f262509c).apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null Publisher");
            ((w) objApply).subscribe(this);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f262508b.onError(th10);
        }
    }

    public d(y yVar, int i) {
        this.f262507a = i;
        switch (i) {
            case 2:
                this.f262509c = new AtomicReference();
                this.f262508b = yVar;
                break;
            default:
                this.f262508b = yVar;
                break;
        }
    }
}
