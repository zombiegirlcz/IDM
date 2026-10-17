package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class w5 extends AtomicInteger implements fgm.l, Disposable {
    public static final v5 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f263251c;
    public final boolean d;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f263252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Disposable f263253h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f263254j;
    public final AtomicReference i = new AtomicReference();
    public final ygm.c e = new ygm.c();

    static {
        v5 v5Var = new v5(null, -1L, 1);
        k = v5Var;
        jgm.b.a(v5Var);
    }

    public w5(int i, fgm.l lVar, igm.o oVar, boolean z) {
        this.f263249a = lVar;
        this.f263250b = oVar;
        this.f263251c = i;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.w5.a():void");
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263252g) {
            return;
        }
        this.f263252g = true;
        this.f263253h.dispose();
        v5 v5Var = (v5) this.i.getAndSet(k);
        if (v5Var != null) {
            jgm.b.a(v5Var);
        }
        this.e.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263252g;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        v5 v5Var;
        if (!this.f) {
            ygm.c cVar = this.e;
            cVar.getClass();
            if (ygm.g.a(cVar, th10)) {
                if (!this.d && (v5Var = (v5) this.i.getAndSet(k)) != null) {
                    jgm.b.a(v5Var);
                }
                this.f = true;
                a();
                return;
            }
        }
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        long j2 = this.f263254j + 1;
        this.f263254j = j2;
        v5 v5Var = (v5) this.i.get();
        if (v5Var != null) {
            jgm.b.a(v5Var);
        }
        try {
            Object objApply = this.f263250b.apply(obj2);
            Objects.requireNonNull(objApply, "The ObservableSource returned is null");
            ObservableSource observableSource = (ObservableSource) objApply;
            v5 v5Var2 = new v5(this, j2, this.f263251c);
            while (true) {
                v5 v5Var3 = (v5) this.i.get();
                if (v5Var3 == k) {
                    return;
                }
                AtomicReference atomicReference = this.i;
                while (!atomicReference.compareAndSet(v5Var3, v5Var2)) {
                    if (atomicReference.get() != v5Var3) {
                        break;
                    }
                }
                observableSource.subscribe(v5Var2);
                return;
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f263253h.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f263253h, disposable)) {
            this.f263253h = disposable;
            this.f263249a.onSubscribe(this);
        }
    }
}
