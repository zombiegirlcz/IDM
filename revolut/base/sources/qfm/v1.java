package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends yfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f245564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f245565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f245566c;
    public final /* synthetic */ int d;
    public final dom.a e;

    public v1(dom.a aVar, int i, int i2, int i3) {
        this.d = i3;
        this.f245565b = i;
        this.f245564a = i2;
        this.e = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2) && com.bumptech.glide.d.a(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                switch (this.d) {
                    case 0:
                        int i = this.f245564a;
                        nfm.a aVar = (nfm.a) this.e;
                        for (int i2 = this.f245565b; i2 != i; i2++) {
                            if (!this.f245566c) {
                                aVar.d(Integer.valueOf(i2));
                            }
                            break;
                        }
                        if (!this.f245566c) {
                            aVar.onComplete();
                            break;
                        }
                        break;
                    default:
                        int i3 = this.f245564a;
                        dom.a aVar2 = this.e;
                        for (int i5 = this.f245565b; i5 != i3; i5++) {
                            if (!this.f245566c) {
                                aVar2.onNext(Integer.valueOf(i5));
                            }
                            break;
                        }
                        if (!this.f245566c) {
                            aVar2.onComplete();
                            break;
                        }
                        break;
                }
            }
            switch (this.d) {
                case 0:
                    int i6 = this.f245564a;
                    int i21 = this.f245565b;
                    nfm.a aVar3 = (nfm.a) this.e;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 != j2 && i21 != i6) {
                                if (!this.f245566c) {
                                    if (aVar3.d(Integer.valueOf(i21))) {
                                        j3++;
                                    }
                                    i21++;
                                }
                                break;
                            } else if (i21 == i6) {
                                if (!this.f245566c) {
                                    aVar3.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j3 == j2) {
                                    this.f245565b = i21;
                                    j2 = addAndGet(-j3);
                                }
                            }
                        }
                    } while (j2 != 0);
                    break;
                default:
                    int i22 = this.f245564a;
                    int i32 = this.f245565b;
                    dom.a aVar4 = this.e;
                    do {
                        long j5 = 0;
                        while (true) {
                            if (j5 != j2 && i32 != i22) {
                                if (!this.f245566c) {
                                    aVar4.onNext(Integer.valueOf(i32));
                                    j5++;
                                    i32++;
                                }
                                break;
                            } else if (i32 == i22) {
                                if (!this.f245566c) {
                                    aVar4.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j5 == j2) {
                                    this.f245565b = i32;
                                    j2 = addAndGet(-j5);
                                }
                            }
                        }
                    } while (j2 != 0);
                    break;
            }
        }
    }

    @Override // nfm.f
    public final int b(int i) {
        return 1;
    }

    @Override // dom.b
    public final void cancel() {
        this.f245566c = true;
    }

    @Override // nfm.j
    public final void clear() {
        this.f245565b = this.f245564a;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f245565b == this.f245564a;
    }

    @Override // nfm.j
    public final Object poll() {
        int i = this.f245565b;
        if (i == this.f245564a) {
            return null;
        }
        this.f245565b = i + 1;
        return Integer.valueOf(i);
    }
}
