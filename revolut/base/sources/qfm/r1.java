package qfm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends AtomicLong implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f245524c;

    public r1(dom.a aVar) {
        this.f245522a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this, j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f245523b.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245523b, bVar)) {
            this.f245523b = bVar;
            this.f245522a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245524c) {
            return;
        }
        this.f245524c = true;
        this.f245522a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f245524c) {
            mo3.a.m(th10);
        } else {
            this.f245524c = true;
            this.f245522a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245524c) {
            return;
        }
        if (get() != 0) {
            this.f245522a.onNext(obj2);
            com.bumptech.glide.d.A(this, 1L);
        } else {
            this.f245523b.cancel();
            onError(new MissingBackpressureException("could not emit value due to lack of requests"));
        }
    }
}
