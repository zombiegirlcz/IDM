package hu7;

import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;
import g2e.m0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f155593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsuranceEmbeddedService f155594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f155595c;
    public final x4l.c d;

    public o(InsuranceEmbeddedService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f155593a = memoryCache;
        this.f155594b = service;
        this.f155595c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new ghl.l(this, continuation, 8), new hs4.l(this, 22), new hfb.d(this, 23), new hp2.d(this, continuation, 10), new m0(this, continuation, 21));
    }
}
