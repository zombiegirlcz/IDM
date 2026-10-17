package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class u0 extends yfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f245554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f245555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f245556c;
    public final /* synthetic */ int d;
    public final dom.a e;

    public u0(dom.a aVar, Object[] objArr, int i) {
        this.d = i;
        this.f245554a = objArr;
        this.e = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2) && com.bumptech.glide.d.a(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                switch (this.d) {
                    case 0:
                        Object[] objArr = this.f245554a;
                        int length = objArr.length;
                        nfm.a aVar = (nfm.a) this.e;
                        for (int i = this.f245555b; i != length; i++) {
                            if (!this.f245556c) {
                                Object obj2 = objArr[i];
                                if (obj2 == null) {
                                    aVar.onError(new NullPointerException(j6.a.l(i, "The element at index ", " is null")));
                                } else {
                                    aVar.d(obj2);
                                }
                            }
                            break;
                        }
                        if (!this.f245556c) {
                            aVar.onComplete();
                            break;
                        }
                        break;
                    default:
                        Object[] objArr2 = this.f245554a;
                        int length2 = objArr2.length;
                        dom.a aVar2 = this.e;
                        for (int i2 = this.f245555b; i2 != length2; i2++) {
                            if (!this.f245556c) {
                                Object obj3 = objArr2[i2];
                                if (obj3 == null) {
                                    aVar2.onError(new NullPointerException(j6.a.l(i2, "The element at index ", " is null")));
                                } else {
                                    aVar2.onNext(obj3);
                                }
                            }
                            break;
                        }
                        if (!this.f245556c) {
                            aVar2.onComplete();
                            break;
                        }
                        break;
                }
            }
            switch (this.d) {
                case 0:
                    Object[] objArr3 = this.f245554a;
                    int length3 = objArr3.length;
                    int i3 = this.f245555b;
                    nfm.a aVar3 = (nfm.a) this.e;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 != j2 && i3 != length3) {
                                if (!this.f245556c) {
                                    Object obj4 = objArr3[i3];
                                    if (obj4 == null) {
                                        aVar3.onError(new NullPointerException(j6.a.l(i3, "The element at index ", " is null")));
                                    } else {
                                        if (aVar3.d(obj4)) {
                                            j3++;
                                        }
                                        i3++;
                                    }
                                }
                                break;
                            } else if (i3 == length3) {
                                if (!this.f245556c) {
                                    aVar3.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j3 == j2) {
                                    this.f245555b = i3;
                                    j2 = addAndGet(-j3);
                                }
                            }
                        }
                    } while (j2 != 0);
                    break;
                default:
                    Object[] objArr4 = this.f245554a;
                    int length4 = objArr4.length;
                    int i5 = this.f245555b;
                    dom.a aVar4 = this.e;
                    do {
                        long j5 = 0;
                        while (true) {
                            if (j5 != j2 && i5 != length4) {
                                if (!this.f245556c) {
                                    Object obj5 = objArr4[i5];
                                    if (obj5 == null) {
                                        aVar4.onError(new NullPointerException(j6.a.l(i5, "The element at index ", " is null")));
                                    } else {
                                        aVar4.onNext(obj5);
                                        j5++;
                                        i5++;
                                    }
                                }
                                break;
                            } else if (i5 == length4) {
                                if (!this.f245556c) {
                                    aVar4.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j5 == j2) {
                                    this.f245555b = i5;
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
        this.f245556c = true;
    }

    @Override // nfm.j
    public final void clear() {
        this.f245555b = this.f245554a.length;
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f245555b == this.f245554a.length;
    }

    @Override // nfm.j
    public final Object poll() {
        int i = this.f245555b;
        Object[] objArr = this.f245554a;
        if (i == objArr.length) {
            return null;
        }
        this.f245555b = i + 1;
        Object obj2 = objArr[i];
        mfm.f.b(obj2, "array element is null");
        return obj2;
    }
}
