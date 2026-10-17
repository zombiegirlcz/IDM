package qfm;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends yfm.f implements efm.j {
    public final dom.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Publisher[] f245373j;
    public final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f245374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f245375m;

    public b(Publisher[] publisherArr, dom.a aVar) {
        super(false);
        this.i = aVar;
        this.f245373j = publisherArr;
        this.k = new AtomicInteger();
    }

    @Override // dom.a
    public final void onComplete() {
        AtomicInteger atomicInteger = this.k;
        if (atomicInteger.getAndIncrement() == 0) {
            Publisher[] publisherArr = this.f245373j;
            int length = publisherArr.length;
            int i = this.f245374l;
            do {
                dom.a aVar = this.i;
                if (i == length) {
                    aVar.onComplete();
                    return;
                }
                Publisher publisher = publisherArr[i];
                if (publisher == null) {
                    aVar.onError(new NullPointerException("A Publisher entry is null"));
                    return;
                }
                long j2 = this.f245375m;
                if (j2 != 0) {
                    this.f245375m = 0L;
                    c(j2);
                }
                publisher.a(this);
                i++;
                this.f245374l = i;
            } while (atomicInteger.decrementAndGet() != 0);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.i.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245375m++;
        this.i.onNext(obj2);
    }
}
