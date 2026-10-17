package pgm;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class v1 extends AtomicReference implements dom.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.a f236163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f236164c;

    public /* synthetic */ v1(dom.a aVar, int i) {
        this.f236162a = i;
        this.f236163b = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        switch (this.f236162a) {
            case 0:
                if (xgm.f.f(j2)) {
                    this.f236164c = true;
                }
                break;
            default:
                if (yfm.g.f(j2)) {
                    this.f236164c = true;
                }
                break;
        }
    }

    @Override // dom.b
    public final void cancel() {
        switch (this.f236162a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                lfm.d.a(this);
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f236162a) {
            case 0:
                if (get() != jgm.b.DISPOSED) {
                    if (!this.f236164c) {
                        lazySet(jgm.c.INSTANCE);
                        this.f236163b.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                    } else {
                        this.f236163b.onNext(0L);
                        lazySet(jgm.c.INSTANCE);
                        this.f236163b.onComplete();
                    }
                }
                break;
            default:
                if (get() != lfm.d.DISPOSED) {
                    if (!this.f236164c) {
                        lazySet(lfm.e.INSTANCE);
                        this.f236163b.onError(new io.reactivex.exceptions.MissingBackpressureException("Can't deliver value due to lack of requests"));
                    } else {
                        this.f236163b.onNext(0L);
                        lazySet(lfm.e.INSTANCE);
                        this.f236163b.onComplete();
                    }
                }
                break;
        }
    }
}
