package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class m1 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f262992b;

    public /* synthetic */ m1(fgm.l lVar, int i) {
        this.f262991a = i;
        this.f262992b = lVar;
    }

    private final void a() {
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f262991a) {
            case 0:
                ((n1) this.f262992b).f263018b.onComplete();
                break;
            case 1:
                g5 g5Var = (g5) this.f262992b;
                g5Var.d.dispose();
                g5Var.a();
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.f262991a) {
            case 0:
                ((n1) this.f262992b).f263018b.onError(th10);
                break;
            case 1:
                g5 g5Var = (g5) this.f262992b;
                g5Var.d.dispose();
                g5Var.f262859a.onError(th10);
                break;
            default:
                ngm.i iVar = (ngm.i) this.f262992b;
                jgm.b.a((AtomicReference) iVar.e);
                ((ahm.c) iVar.f215247b).onError(th10);
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f262991a) {
            case 0:
                ((n1) this.f262992b).f263018b.onNext(obj2);
                break;
            case 1:
                ((g5) this.f262992b).b();
                break;
            default:
                ((ngm.i) this.f262992b).lazySet(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        switch (this.f262991a) {
            case 0:
                ggm.b bVar = ((n1) this.f262992b).f263019c;
                bVar.getClass();
                jgm.b.d(bVar, disposable);
                break;
            case 1:
                jgm.b.e(((g5) this.f262992b).f262861c, disposable);
                break;
            default:
                jgm.b.e((AtomicReference) ((ngm.i) this.f262992b).d, disposable);
                break;
        }
    }
}
