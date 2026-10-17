package rfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements efm.l, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f253939c;
    public final Object d;

    public /* synthetic */ g(efm.l lVar, Object obj2, int i) {
        this.f253937a = i;
        this.f253938b = lVar;
        this.d = obj2;
    }

    public boolean a(int i) {
        AtomicInteger atomicInteger = (AtomicInteger) this.f253939c;
        int i2 = atomicInteger.get();
        int i3 = 0;
        if (i2 != 0) {
            return i2 == i;
        }
        if (!atomicInteger.compareAndSet(0, i)) {
            return false;
        }
        tfm.k[] kVarArr = (tfm.k[]) this.d;
        int length = kVarArr.length;
        while (i3 < length) {
            int i5 = i3 + 1;
            if (i5 != i) {
                tfm.k kVar = kVarArr[i3];
                kVar.getClass();
                lfm.d.a(kVar);
            }
            i3 = i5;
        }
        return true;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253937a) {
            case 0:
                ((ifm.c) this.f253939c).dispose();
                this.f253939c = lfm.d.DISPOSED;
                break;
            case 1:
                ((ifm.c) this.f253939c).dispose();
                break;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f253939c;
                if (atomicInteger.get() != -1) {
                    atomicInteger.lazySet(-1);
                    for (tfm.k kVar : (tfm.k[]) this.d) {
                        kVar.getClass();
                        lfm.d.a(kVar);
                    }
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253937a) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((AtomicInteger) this.f253939c).get() == -1) {
                }
                break;
        }
        return ((ifm.c) this.f253939c).isDisposed();
    }

    @Override // efm.l
    public void onComplete() {
        switch (this.f253937a) {
            case 0:
                efm.l lVar = (efm.l) this.f253938b;
                this.f253939c = lfm.d.DISPOSED;
                try {
                    ((k3k.l) this.d).accept(null, null);
                    lVar.onComplete();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lVar.onError(th10);
                    return;
                }
                break;
            default:
                ((efm.l) this.f253938b).onComplete();
                break;
        }
    }

    @Override // efm.l
    public void onError(Throwable th10) {
        switch (this.f253937a) {
            case 0:
                this.f253939c = lfm.d.DISPOSED;
                try {
                    ((k3k.l) this.d).accept(null, th10);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    th10 = new CompositeException(th10, th11);
                }
                ((efm.l) this.f253938b).onError(th10);
                break;
            default:
                efm.l lVar = (efm.l) this.f253938b;
                try {
                    Object objApply = ((kfm.o) this.d).apply(th10);
                    mfm.f.b(objApply, "The valueSupplier returned a null value");
                    lVar.onSuccess(objApply);
                } catch (Throwable th12) {
                    m70.a.u(th12);
                    lVar.onError(new CompositeException(th10, th12));
                }
                break;
        }
    }

    @Override // efm.l
    public void onSubscribe(ifm.c cVar) {
        switch (this.f253937a) {
            case 0:
                if (lfm.d.f((ifm.c) this.f253939c, cVar)) {
                    this.f253939c = cVar;
                    ((efm.l) this.f253938b).onSubscribe(this);
                }
                break;
            default:
                if (lfm.d.f((ifm.c) this.f253939c, cVar)) {
                    this.f253939c = cVar;
                    ((efm.l) this.f253938b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        switch (this.f253937a) {
            case 0:
                efm.l lVar = (efm.l) this.f253938b;
                this.f253939c = lfm.d.DISPOSED;
                try {
                    ((k3k.l) this.d).accept(obj2, null);
                    lVar.onSuccess(obj2);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lVar.onError(th10);
                    return;
                }
                break;
            default:
                ((efm.l) this.f253938b).onSuccess(obj2);
                break;
        }
    }

    public g(efm.y yVar, int i) {
        this.f253937a = 2;
        this.f253939c = new AtomicInteger();
        this.f253938b = yVar;
        this.d = new tfm.k[i];
    }
}
