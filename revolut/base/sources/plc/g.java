package plc;

import com.revolut.feature.robo.impl.data.network.TemplateService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfk.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateService f237335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f237336b;

    public g(TemplateService service, ne0.d cache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f237335a = service;
        this.f237336b = new x4l.c(new a0e.n(this, (Continuation) null, 12), new pj9.n(this, 17), new pj9.m(this, 11), new o0(this, (Continuation) null, 16), new p24.q(this, (Continuation) null, 6));
    }

    @Override // phm.a
    public final Object get() {
        return this.f237336b;
    }
}
