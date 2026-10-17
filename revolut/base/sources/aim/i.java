package aim;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5333c;
    public int d;

    public i(f map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f5331a = map;
        this.f5333c = -1;
        this.d = map.f5324h;
        b();
    }

    public final void a() {
        if (this.f5331a.f5324h != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.f5332b;
            f fVar = this.f5331a;
            if (i >= fVar.f || fVar.f5322c[i] >= 0) {
                return;
            } else {
                this.f5332b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.f5332b < this.f5331a.f;
    }

    public final void remove() {
        a();
        if (this.f5333c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        f fVar = this.f5331a;
        fVar.c();
        fVar.n(this.f5333c);
        this.f5333c = -1;
        this.d = fVar.f5324h;
    }
}
