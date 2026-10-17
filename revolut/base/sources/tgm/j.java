package tgm;

import fgm.p;
import igm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f271222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f271223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k[] f271224c;
    public Object[] d;

    public j(int i, p pVar, o oVar) {
        super(i);
        this.f271222a = pVar;
        this.f271223b = oVar;
        k[] kVarArr = new k[i];
        for (int i2 = 0; i2 < i; i2++) {
            kVarArr[i2] = new k(this, i2);
        }
        this.f271224c = kVarArr;
        this.d = new Object[i];
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (k kVar : this.f271224c) {
                kVar.getClass();
                jgm.b.a(kVar);
            }
            this.d = null;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() <= 0;
    }
}
