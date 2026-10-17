package gcm;

import com.google.common.base.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142786c;
    public final AtomicInteger d;

    public n5(float f, float f4) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.d = atomicInteger;
        this.f142786c = (int) (f4 * 1000.0f);
        int i = (int) (f * 1000.0f);
        this.f142784a = i;
        this.f142785b = i / 2;
        atomicInteger.set(i);
    }

    public final boolean a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.d;
            i = atomicInteger.get();
            if (i == 0) {
                return false;
            }
            i2 = i - 1000;
        } while (!atomicInteger.compareAndSet(i, Math.max(i2, 0)));
        return i2 > this.f142785b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj2;
        return this.f142784a == n5Var.f142784a && this.f142786c == n5Var.f142786c;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f142784a), Integer.valueOf(this.f142786c));
    }
}
