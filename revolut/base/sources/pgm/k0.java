package pgm;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes14.dex */
public final class k0 extends AtomicLong implements bhm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f236090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f236091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f236092c;
    public final /* synthetic */ int d;
    public final dom.a e;

    public k0(dom.a aVar, Object[] objArr, int i) {
        this.d = i;
        this.f236090a = objArr;
        this.e = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2) && xam.a.b(this, j2) == 0) {
            if (j2 == Long.MAX_VALUE) {
                switch (this.d) {
                    case 0:
                        Object[] objArr = this.f236090a;
                        int length = objArr.length;
                        bhm.a aVar = (bhm.a) this.e;
                        for (int i = this.f236091b; i != length; i++) {
                            if (!this.f236092c) {
                                Object obj2 = objArr[i];
                                if (obj2 == null) {
                                    aVar.onError(new NullPointerException(j6.a.l(i, "The element at index ", " is null")));
                                } else {
                                    aVar.d(obj2);
                                }
                            }
                            break;
                        }
                        if (!this.f236092c) {
                            aVar.onComplete();
                            break;
                        }
                        break;
                    default:
                        Object[] objArr2 = this.f236090a;
                        int length2 = objArr2.length;
                        dom.a aVar2 = this.e;
                        for (int i2 = this.f236091b; i2 != length2; i2++) {
                            if (!this.f236092c) {
                                Object obj3 = objArr2[i2];
                                if (obj3 == null) {
                                    aVar2.onError(new NullPointerException(j6.a.l(i2, "The element at index ", " is null")));
                                } else {
                                    aVar2.onNext(obj3);
                                }
                            }
                            break;
                        }
                        if (!this.f236092c) {
                            aVar2.onComplete();
                            break;
                        }
                        break;
                }
            }
            switch (this.d) {
                case 0:
                    Object[] objArr3 = this.f236090a;
                    int length3 = objArr3.length;
                    int i3 = this.f236091b;
                    bhm.a aVar3 = (bhm.a) this.e;
                    do {
                        long j3 = 0;
                        while (true) {
                            if (j3 != j2 && i3 != length3) {
                                if (!this.f236092c) {
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
                                if (!this.f236092c) {
                                    aVar3.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j3 == j2) {
                                    this.f236091b = i3;
                                    j2 = addAndGet(-j3);
                                }
                            }
                        }
                    } while (j2 != 0);
                    break;
                default:
                    Object[] objArr4 = this.f236090a;
                    int length4 = objArr4.length;
                    int i5 = this.f236091b;
                    dom.a aVar4 = this.e;
                    do {
                        long j5 = 0;
                        while (true) {
                            if (j5 != j2 && i5 != length4) {
                                if (!this.f236092c) {
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
                                if (!this.f236092c) {
                                    aVar4.onComplete();
                                }
                                break;
                            } else {
                                j2 = get();
                                if (j5 == j2) {
                                    this.f236091b = i5;
                                    j2 = addAndGet(-j5);
                                }
                            }
                        }
                    } while (j2 != 0);
                    break;
            }
        }
    }

    @Override // bhm.c
    public final int b(int i) {
        return 1;
    }

    @Override // dom.b
    public final void cancel() {
        this.f236092c = true;
    }

    @Override // bhm.g
    public final void clear() {
        this.f236091b = this.f236090a.length;
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f236091b == this.f236090a.length;
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // bhm.g
    public final Object poll() {
        int i = this.f236091b;
        Object[] objArr = this.f236090a;
        if (i == objArr.length) {
            return null;
        }
        this.f236091b = i + 1;
        Object obj2 = objArr[i];
        Objects.requireNonNull(obj2, "array element is null");
        return obj2;
    }
}
