package ogm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends AtomicInteger implements fgm.b, efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f225206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225207c;
    public final Object[] d;
    public final AtomicReference e;

    public b(efm.d dVar, efm.f[] fVarArr) {
        this.f225205a = 1;
        this.f225207c = dVar;
        this.d = fVarArr;
        this.e = new lfm.b(1);
    }

    public final void a() {
        switch (this.f225205a) {
            case 0:
                ggm.b bVar = (ggm.b) this.e;
                if (!bVar.isDisposed() && getAndIncrement() == 0) {
                    CompletableSource[] completableSourceArr = (CompletableSource[]) this.d;
                    while (!bVar.isDisposed()) {
                        int i = this.f225206b;
                        this.f225206b = i + 1;
                        if (i == completableSourceArr.length) {
                            ((fgm.b) this.f225207c).onComplete();
                            break;
                        } else {
                            completableSourceArr[i].c(this);
                            if (decrementAndGet() == 0) {
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                lfm.b bVar2 = (lfm.b) this.e;
                if (!bVar2.isDisposed() && getAndIncrement() == 0) {
                    efm.f[] fVarArr = (efm.f[]) this.d;
                    while (!bVar2.isDisposed()) {
                        int i2 = this.f225206b;
                        this.f225206b = i2 + 1;
                        if (i2 == fVarArr.length) {
                            ((efm.d) this.f225207c).onComplete();
                            break;
                        } else {
                            fVarArr[i2].d(this);
                            if (decrementAndGet() == 0) {
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // fgm.b
    public final void onComplete() {
        switch (this.f225205a) {
            case 0:
                a();
                break;
            default:
                a();
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f225205a) {
            case 0:
                ((fgm.b) this.f225207c).onError(th10);
                break;
            default:
                ((efm.d) this.f225207c).onError(th10);
                break;
        }
    }

    @Override // efm.d
    public void onSubscribe(ifm.c cVar) {
        lfm.b bVar = (lfm.b) this.e;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }

    @Override // fgm.b
    public void onSubscribe(Disposable disposable) {
        ggm.b bVar = (ggm.b) this.e;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }

    public b(fgm.b bVar, CompletableSource[] completableSourceArr) {
        this.f225205a = 0;
        this.f225207c = bVar;
        this.d = completableSourceArr;
        this.e = new ggm.b();
    }
}
