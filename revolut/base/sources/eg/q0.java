package eg;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes17.dex */
public final class q0 implements hg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f125482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f125483c;

    public /* synthetic */ q0(phm.a aVar, phm.a aVar2, int i) {
        this.f125481a = i;
        this.f125482b = aVar;
        this.f125483c = aVar2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f125481a) {
            case 0:
                return new p0((CoroutineContext) this.f125482b.get(), (DataStore) this.f125483c.get());
            case 1:
                return new c1((o1) this.f125482b.get(), (q1) this.f125483c.get());
            case 2:
                return new ig.g((b) this.f125482b.get(), (CoroutineContext) this.f125483c.get());
            default:
                return new ig.k((ig.p) this.f125482b.get(), (ig.p) this.f125483c.get());
        }
    }
}
