package pgm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends AtomicBoolean implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dom.a f236073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f236074c;

    public /* synthetic */ i(Object obj2, dom.a aVar, int i) {
        this.f236072a = i;
        this.f236074c = obj2;
        this.f236073b = aVar;
    }

    private final void b() {
    }

    private final void c() {
    }

    @Override // dom.b
    public final void a(long j2) {
        switch (this.f236072a) {
            case 0:
                if (j2 > 0 && compareAndSet(false, true)) {
                    Object obj2 = this.f236074c;
                    dom.a aVar = this.f236073b;
                    aVar.onNext(obj2);
                    aVar.onComplete();
                    break;
                }
                break;
            default:
                if (j2 > 0 && compareAndSet(false, true)) {
                    Object obj3 = this.f236074c;
                    dom.a aVar2 = this.f236073b;
                    aVar2.onNext(obj3);
                    aVar2.onComplete();
                    break;
                }
                break;
        }
    }

    @Override // dom.b
    public final void cancel() {
        int i = this.f236072a;
    }
}
