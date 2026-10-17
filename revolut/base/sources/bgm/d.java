package bgm;

import e8.q;
import efm.y;
import zfm.k;
import zfm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f15219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f15220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15221c;
    public q d;
    public volatile boolean e;

    public d(y yVar) {
        this.f15219a = yVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f15220b.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f15220b.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (!this.f15221c) {
                    this.e = true;
                    this.f15221c = true;
                    this.f15219a.onComplete();
                } else {
                    q qVar = this.d;
                    if (qVar == null) {
                        qVar = new q(4, (byte) 0);
                        this.d = qVar;
                    }
                    qVar.c(m.COMPLETE);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.e) {
                    if (this.f15221c) {
                        this.e = true;
                        q qVar = this.d;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.d = qVar;
                        }
                        ((Object[]) qVar.f123510c)[0] = new k(th10);
                        return;
                    }
                    this.e = true;
                    this.f15221c = true;
                    z = false;
                }
                if (z) {
                    mo3.a.m(th10);
                } else {
                    this.f15219a.onError(th10);
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        Object[] objArr;
        if (this.e) {
            return;
        }
        if (obj2 == null) {
            this.f15220b.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                if (this.f15221c) {
                    q qVar = this.d;
                    if (qVar == null) {
                        qVar = new q(4, (byte) 0);
                        this.d = qVar;
                    }
                    qVar.c(obj2);
                    return;
                }
                this.f15221c = true;
                this.f15219a.onNext(obj2);
                while (true) {
                    synchronized (this) {
                        try {
                            q qVar2 = this.d;
                            if (qVar2 == null) {
                                this.f15221c = false;
                                return;
                            }
                            this.d = null;
                            y yVar = this.f15219a;
                            for (Object[] objArr2 = (Object[]) qVar2.f123510c; objArr2 != null; objArr2 = objArr2[4]) {
                                for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                                    if (m.b(yVar, objArr)) {
                                        return;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f15220b, cVar)) {
            this.f15220b = cVar;
            this.f15219a.onSubscribe(this);
        }
    }
}
