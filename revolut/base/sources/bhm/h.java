package bhm;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends AtomicReferenceArray implements f {
    public static final Integer f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f15332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15333c;
    public final AtomicLong d;
    public final int e;

    public h(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f15331a = length() - 1;
        this.f15332b = new AtomicLong();
        this.d = new AtomicLong();
        this.e = Math.min(i / 4, f.intValue());
    }

    @Override // bhm.g
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return this.f15332b.get() == this.d.get();
    }

    @Override // bhm.g
    public final boolean offer(Object obj2) {
        if (obj2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.f15332b;
        long j2 = atomicLong.get();
        int i = this.f15331a;
        int i2 = ((int) j2) & i;
        if (j2 >= this.f15333c) {
            long j3 = ((long) this.e) + j2;
            if (get(i & ((int) j3)) == null) {
                this.f15333c = j3;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj2);
        atomicLong.lazySet(j2 + 1);
        return true;
    }

    @Override // bhm.g
    public final Object poll() {
        AtomicLong atomicLong = this.d;
        long j2 = atomicLong.get();
        int i = ((int) j2) & this.f15331a;
        Object obj2 = get(i);
        if (obj2 == null) {
            return null;
        }
        atomicLong.lazySet(j2 + 1);
        lazySet(i, null);
        return obj2;
    }
}
