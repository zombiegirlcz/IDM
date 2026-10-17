package sfm;

import efm.f0;
import efm.w;
import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicReference implements y, efm.d, ifm.c, f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f262500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f262501c;

    public /* synthetic */ a(y yVar, Object obj2, int i) {
        this.f262499a = i;
        this.f262501c = obj2;
        this.f262500b = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f262499a) {
            case 0:
                lfm.d.a(this);
                break;
            case 1:
                lfm.d.a(this);
                break;
            default:
                lfm.d.a((AtomicReference) this.f262501c);
                lfm.d.a(this);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f262499a) {
        }
        return lfm.d.b((ifm.c) get());
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f262499a) {
            case 0:
                w wVar = (w) this.f262501c;
                if (wVar != null) {
                    this.f262501c = null;
                    wVar.subscribe(this);
                } else {
                    this.f262500b.onComplete();
                }
                break;
            case 1:
                this.f262500b.onComplete();
                break;
            default:
                this.f262500b.onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f262499a) {
            case 0:
                this.f262500b.onError(th10);
                break;
            case 1:
                this.f262500b.onError(th10);
                break;
            default:
                this.f262500b.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f262499a) {
            case 0:
                this.f262500b.onNext(obj2);
                break;
            case 1:
                this.f262500b.onNext(obj2);
                break;
            default:
                this.f262500b.onNext(obj2);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f262499a) {
            case 0:
                lfm.d.c(this, cVar);
                break;
            case 1:
                lfm.d.c(this, cVar);
                break;
            default:
                lfm.d.e((AtomicReference) this.f262501c, cVar);
                break;
        }
    }

    @Override // efm.f0
    public void onSuccess(Object obj2) {
        try {
            Object objApply = ((kfm.o) this.f262501c).apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null Publisher");
            ((w) objApply).subscribe(this);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f262500b.onError(th10);
        }
    }

    public a(y yVar) {
        this.f262499a = 2;
        this.f262500b = yVar;
        this.f262501c = new AtomicReference();
    }
}
