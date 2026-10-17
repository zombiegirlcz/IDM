package fhm;

import fgm.l;
import io.grpc.okhttp.internal.n;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Disposable, ygm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f135263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BehaviorSubject f135264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f135265c;
    public boolean d;
    public n e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f135266g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f135267h;

    public a(l lVar, BehaviorSubject behaviorSubject) {
        this.f135263a = lVar;
        this.f135264b = behaviorSubject;
    }

    public final void a(long j2, Object obj2) {
        if (this.f135266g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.f135266g) {
                        return;
                    }
                    if (this.f135267h == j2) {
                        return;
                    }
                    if (this.d) {
                        n nVar = this.e;
                        if (nVar == null) {
                            nVar = new n(4);
                            this.e = nVar;
                        }
                        nVar.b(obj2);
                        return;
                    }
                    this.f135265c = true;
                    this.f = true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        test(obj2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f135266g) {
            return;
        }
        this.f135266g = true;
        this.f135264b.f(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f135266g;
    }

    @Override // igm.p
    public final boolean test(Object obj2) {
        return this.f135266g || ygm.l.a(this.f135263a, obj2);
    }
}
