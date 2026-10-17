package ihm;

import efm.y;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f161451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f161452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f161453c;
    public volatile boolean d;

    public g(y yVar, i iVar) {
        this.f161451a = yVar;
        this.f161452b = iVar;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f161452b.g(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }
}
