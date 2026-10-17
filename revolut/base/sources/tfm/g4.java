package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g4 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270488c;

    public /* synthetic */ g4(efm.y yVar, AtomicReference atomicReference, int i) {
        this.f270486a = i;
        this.f270487b = yVar;
        this.f270488c = atomicReference;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270486a) {
            case 0:
                ((ihm.f) this.f270487b).onComplete();
                break;
            default:
                this.f270487b.onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270486a) {
            case 0:
                ((ihm.f) this.f270487b).onError(th10);
                break;
            default:
                this.f270487b.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270486a) {
            case 0:
                ((ihm.f) this.f270487b).onNext(obj2);
                break;
            default:
                this.f270487b.onNext(obj2);
                break;
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270486a) {
            case 0:
                lfm.d.e((sfm.d) this.f270488c, cVar);
                break;
            default:
                lfm.d.c(this.f270488c, cVar);
                break;
        }
    }
}
