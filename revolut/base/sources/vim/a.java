package vim;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import zhm.s;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f289614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f289615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f289616c;
    public int d;

    public a(char c2, char c3, int i) {
        this.f289614a = i;
        this.f289615b = c3;
        boolean z = false;
        if (i <= 0 ? Intrinsics.k(c2, c3) >= 0 : Intrinsics.k(c2, c3) <= 0) {
            z = true;
        }
        this.f289616c = z;
        this.d = z ? c2 : c3;
    }

    @Override // zhm.s
    public final char a() {
        int i = this.d;
        if (i != this.f289615b) {
            this.d = this.f289614a + i;
        } else {
            if (!this.f289616c) {
                throw new NoSuchElementException();
            }
            this.f289616c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f289616c;
    }
}
