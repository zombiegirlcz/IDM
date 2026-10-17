package vim;

import java.util.NoSuchElementException;
import zhm.l0;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f289623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f289624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f289625c;
    public int d;

    public f(int i, int i2, int i3) {
        this.f289623a = i3;
        this.f289624b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f289625c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f289625c;
    }

    @Override // zhm.l0
    public final int nextInt() {
        int i = this.d;
        if (i != this.f289624b) {
            this.d = this.f289623a + i;
            return i;
        }
        if (!this.f289625c) {
            throw new NoSuchElementException();
        }
        this.f289625c = false;
        return i;
    }
}
