package qfm;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends xfm.b {
    public final kfm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kfm.g f245569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.a f245570h;
    public final kfm.a i;

    public w(dom.a aVar, kfm.g gVar, kfm.g gVar2, kfm.a aVar2, kfm.a aVar3) {
        super(aVar);
        this.f = gVar;
        this.f245569g = gVar2;
        this.f245570h = aVar2;
        this.i = aVar3;
    }

    @Override // xfm.b, dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        try {
            this.f245570h.run();
            this.d = true;
            this.f305442a.onComplete();
            try {
                this.i.run();
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            this.f305443b.cancel();
            onError(th11);
        }
    }

    @Override // xfm.b, dom.a
    public final void onError(Throwable th10) {
        dom.a aVar = this.f305442a;
        if (this.d) {
            mo3.a.m(th10);
            return;
        }
        this.d = true;
        try {
            this.f245569g.accept(th10);
            aVar.onError(th10);
        } catch (Throwable th11) {
            m70.a.u(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
        try {
            this.i.run();
        } catch (Throwable th12) {
            m70.a.u(th12);
            mo3.a.m(th12);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        dom.a aVar = this.f305442a;
        if (i != 0) {
            aVar.onNext(null);
            return;
        }
        try {
            this.f.accept(obj2);
            aVar.onNext(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f305443b.cancel();
            onError(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() throws Exception {
        CompositeException compositeException;
        kfm.g gVar = this.f245569g;
        try {
            Object objPoll = this.f305444c.poll();
            kfm.a aVar = this.i;
            if (objPoll == null) {
                if (this.e == 1) {
                    this.f245570h.run();
                    aVar.run();
                }
                return objPoll;
            }
            try {
                this.f.accept(objPoll);
                aVar.run();
                return objPoll;
            } catch (Throwable th10) {
                try {
                    m70.a.u(th10);
                    try {
                        gVar.accept(th10);
                        zfm.g gVar2 = zfm.h.f322035a;
                        if (th10 instanceof Exception) {
                            throw th10;
                        }
                        throw th10;
                    } finally {
                    }
                } catch (Throwable th11) {
                    aVar.run();
                    throw th11;
                }
            }
        } catch (Throwable th102) {
            m70.a.u(th102);
            try {
                gVar.accept(th102);
                zfm.g gVar3 = zfm.h.f322035a;
                if (th102 instanceof Exception) {
                    throw th102;
                }
                throw th102;
            } finally {
            }
        }
    }
}
