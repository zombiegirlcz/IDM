package hlm;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import zkm.t;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends t {
    public final /* synthetic */ AtomicReferenceArray e;

    public k(long j2, k kVar, int i) {
        super(j2, kVar, i);
        this.e = new AtomicReferenceArray(j.f);
    }

    @Override // zkm.t
    public final int g() {
        return j.f;
    }

    @Override // zkm.t
    public final void h(int i, CoroutineContext coroutineContext) {
        this.e.set(i, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f323123c + ", hashCode=" + hashCode() + ']';
    }
}
