package plc;

import com.revolut.feature.robo.impl.data.network.RoboAccountService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;
import pij.d1;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoboAccountService f237332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f237333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.d f237334c;

    public f(RoboAccountService service, rlc.c networkMapper, ylc.b storageMapper, ue0.c storage, ne0.d cache) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkMapper, "networkMapper");
        Intrinsics.checkNotNullParameter(storageMapper, "storageMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f237332a = service;
        this.f237333b = storage;
        this.f237334c = cache;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x4l.c get() {
        return new x4l.c(new o29.l(this, null, 27), new d1(this, 13), new plb.g(this, 3), new o0(this, (Continuation) null, 15), new pfk.q(this, null, 9));
    }
}
