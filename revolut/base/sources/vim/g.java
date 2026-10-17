package vim;

import java.util.NoSuchElementException;
import zhm.m0;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f289626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f289627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f289628c;
    public long d;

    public g(long j2, long j3, long j5) {
        this.f289626a = j5;
        this.f289627b = j3;
        boolean z = false;
        if (j5 <= 0 ? j2 >= j3 : j2 <= j3) {
            z = true;
        }
        this.f289628c = z;
        this.d = z ? j2 : j3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f289628c;
    }

    @Override // zhm.m0
    public final long nextLong() {
        long j2 = this.d;
        if (j2 != this.f289627b) {
            this.d = this.f289626a + j2;
            return j2;
        }
        if (!this.f289628c) {
            throw new NoSuchElementException();
        }
        this.f289628c = false;
        return j2;
    }
}
