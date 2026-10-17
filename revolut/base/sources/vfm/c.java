package vfm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nfm.i;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements i {
    public static final int i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f288672j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f288673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f288674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f288675c;
    public final int d;
    public AtomicReferenceArray e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray f288676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f288677h;

    public c(int i2) {
        AtomicLong atomicLong = new AtomicLong();
        this.f288673a = atomicLong;
        this.f288677h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i2) - 1));
        int i3 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.e = atomicReferenceArray;
        this.d = i3;
        this.f288674b = Math.min(iNumberOfLeadingZeros / 4, i);
        this.f288676g = atomicReferenceArray;
        this.f = i3;
        this.f288675c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    public final void a(Number number, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.f288673a;
        long j2 = atomicLong.get();
        long j3 = 2 + j2;
        int i2 = this.d;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            int i3 = ((int) j2) & i2;
            atomicReferenceArray.lazySet(i3 + 1, obj2);
            atomicReferenceArray.lazySet(i3, number);
            atomicLong.lazySet(j3);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        int i5 = ((int) j2) & i2;
        atomicReferenceArray2.lazySet(i5 + 1, obj2);
        atomicReferenceArray2.lazySet(i5, number);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i5, f288672j);
        atomicLong.lazySet(j3);
    }

    public final Object c() {
        AtomicReferenceArray atomicReferenceArray = this.f288676g;
        int i2 = (int) this.f288677h.get();
        int i3 = this.f;
        int i5 = i2 & i3;
        Object obj2 = atomicReferenceArray.get(i5);
        if (obj2 != f288672j) {
            return obj2;
        }
        int i6 = i3 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i6);
        atomicReferenceArray.lazySet(i6, null);
        this.f288676g = atomicReferenceArray2;
        return atomicReferenceArray2.get(i5);
    }

    @Override // nfm.j
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return this.f288673a.get() == this.f288677h.get();
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.e;
        AtomicLong atomicLong = this.f288673a;
        long j2 = atomicLong.get();
        int i2 = this.d;
        int i3 = ((int) j2) & i2;
        if (j2 < this.f288675c) {
            atomicReferenceArray.lazySet(i3, obj2);
            atomicLong.lazySet(j2 + 1);
            return true;
        }
        long j3 = ((long) this.f288674b) + j2;
        if (atomicReferenceArray.get(((int) j3) & i2) == null) {
            this.f288675c = j3 - 1;
            atomicReferenceArray.lazySet(i3, obj2);
            atomicLong.lazySet(j2 + 1);
            return true;
        }
        long j5 = j2 + 1;
        if (atomicReferenceArray.get(((int) j5) & i2) == null) {
            atomicReferenceArray.lazySet(i3, obj2);
            atomicLong.lazySet(j5);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.e = atomicReferenceArray2;
        this.f288675c = (j2 + ((long) i2)) - 1;
        atomicReferenceArray2.lazySet(i3, obj2);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i3, f288672j);
        atomicLong.lazySet(j5);
        return true;
    }

    @Override // nfm.j
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f288676g;
        AtomicLong atomicLong = this.f288677h;
        long j2 = atomicLong.get();
        int i2 = this.f;
        int i3 = ((int) j2) & i2;
        Object obj2 = atomicReferenceArray.get(i3);
        boolean z = obj2 == f288672j;
        if (obj2 != null && !z) {
            atomicReferenceArray.lazySet(i3, null);
            atomicLong.lazySet(j2 + 1);
            return obj2;
        }
        if (!z) {
            return null;
        }
        int i5 = i2 + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i5);
        atomicReferenceArray.lazySet(i5, null);
        this.f288676g = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i3);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i3, null);
            atomicLong.lazySet(j2 + 1);
        }
        return obj3;
    }
}
