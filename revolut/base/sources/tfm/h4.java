package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class h4 extends ofm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.y f270509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f270510c;
    public long d;
    public boolean e;

    public /* synthetic */ h4(efm.y yVar, long j2, long j3, int i) {
        this.f270508a = i;
        this.f270509b = yVar;
        this.d = j2;
        this.f270510c = j3;
    }

    @Override // nfm.f
    public final int b(int i) {
        switch (this.f270508a) {
            case 0:
                this.e = true;
                break;
            default:
                this.e = true;
                break;
        }
        return 1;
    }

    @Override // nfm.j
    public final void clear() {
        switch (this.f270508a) {
            case 0:
                this.d = this.f270510c;
                lazySet(1);
                break;
            default:
                this.d = this.f270510c;
                lazySet(1);
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270508a) {
            case 0:
                set(1);
                break;
            default:
                set(1);
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270508a) {
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

    @Override // nfm.j
    public final boolean isEmpty() {
        switch (this.f270508a) {
            case 0:
                if (this.d == this.f270510c) {
                }
                break;
            default:
                if (this.d == this.f270510c) {
                }
                break;
        }
        return false;
    }

    @Override // nfm.j
    public final Object poll() {
        switch (this.f270508a) {
            case 0:
                long j2 = this.d;
                if (j2 == this.f270510c) {
                    lazySet(1);
                } else {
                    this.d = 1 + j2;
                }
                break;
            default:
                long j3 = this.d;
                if (j3 == this.f270510c) {
                    lazySet(1);
                } else {
                    this.d = 1 + j3;
                }
                break;
        }
        return null;
    }
}
