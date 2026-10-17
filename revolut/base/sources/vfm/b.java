package vfm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nfm.i;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AtomicReferenceArray implements i {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f288669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f288670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f288671c;
    public final AtomicLong d;
    public final int e;

    public b(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f288669a = length() - 1;
        this.f288670b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
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
        return this.f288670b.get() == this.d.get();
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f288670b;
        long j2 = atomicLong.get();
        int i = this.f288669a;
        int i2 = ((int) j2) & i;
        if (j2 >= this.f288671c) {
            long j3 = ((long) this.e) + j2;
            if (get(i & ((int) j3)) == null) {
                this.f288671c = j3;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj2);
        atomicLong.lazySet(j2 + 1);
        return true;
    }

    @Override // nfm.j
    public final Object poll() {
        AtomicLong atomicLong = this.d;
        long j2 = atomicLong.get();
        int i = ((int) j2) & this.f288669a;
        Object obj2 = get(i);
        if (obj2 == null) {
            return null;
        }
        atomicLong.lazySet(j2 + 1);
        lazySet(i, null);
        return obj2;
    }
}
