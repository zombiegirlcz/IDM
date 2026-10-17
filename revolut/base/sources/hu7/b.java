package hu7;

import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;
import g2e.m0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f155569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsuranceEmbeddedService f155570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f155571c;
    public final x4l.c d;

    public b(InsuranceEmbeddedService service, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f155569a = memoryCache;
        this.f155570b = service;
        this.f155571c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new ghl.l(this, continuation, 4), new hs4.l(this, 20), new hfb.d(this, 21), new hp2.d(this, continuation, 8), new m0(this, continuation, 17));
    }

    public static vkm.d a(b bVar, bu7.k coverageGroup) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(coverageGroup, "coverageGroup");
        return bVar.d.c(new a(coverageGroup), false);
    }
}
