package fc;

import com.google.firebase.messaging.t;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phm.a f133588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f133589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ec.f f133590c;
    public final phm.a d;

    public i(phm.a aVar, phm.a aVar2, ec.f fVar, phm.a aVar3) {
        this.f133588a = aVar;
        this.f133589b = aVar2;
        this.f133590c = fVar;
        this.d = aVar3;
    }

    @Override // phm.a
    public final Object get() {
        return new t((Executor) this.f133588a.get(), (gc.d) this.f133589b.get(), (gpk.c) this.f133590c.get(), (hc.b) this.d.get(), 8);
    }
}
