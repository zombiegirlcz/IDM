package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class z3 extends ngm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fgm.l f263322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f263323c;
    public long d;
    public boolean e;

    public /* synthetic */ z3(fgm.l lVar, long j2, long j3, int i) {
        this.f263321a = i;
        this.f263322b = lVar;
        this.d = j2;
        this.f263323c = j3;
    }

    @Override // bhm.c
    public final int b(int i) {
        switch (this.f263321a) {
            case 0:
                this.e = true;
                break;
            default:
                this.e = true;
                break;
        }
        return 1;
    }

    @Override // bhm.g
    public final void clear() {
        switch (this.f263321a) {
            case 0:
                this.d = this.f263323c;
                lazySet(1);
                break;
            default:
                this.d = this.f263323c;
                lazySet(1);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f263321a) {
            case 0:
                set(1);
                break;
            default:
                set(1);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f263321a) {
            case 0:
                if (get() != 0) {
                }
                break;
            default:
                if (get() != 0) {
                }
                break;
        }
        return false;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        switch (this.f263321a) {
            case 0:
                if (this.d == this.f263323c) {
                }
                break;
            default:
                if (this.d == this.f263323c) {
                }
                break;
        }
        return false;
    }

    @Override // bhm.g
    public final Object poll() {
        switch (this.f263321a) {
            case 0:
                long j2 = this.d;
                if (j2 == this.f263323c) {
                    lazySet(1);
                } else {
                    this.d = 1 + j2;
                }
                break;
            default:
                long j3 = this.d;
                if (j3 == this.f263323c) {
                    lazySet(1);
                } else {
                    this.d = 1 + j3;
                }
                break;
        }
        return null;
    }
}
