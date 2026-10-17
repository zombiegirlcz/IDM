package mw7;

import com.revolut.feature.insurance_home.impl.data.network.InsuranceHomeService;
import k3c.k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mkk.q;
import mnl.g;
import ne0.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f209403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsuranceHomeService f209404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f209405c;
    public final x4l.c d;

    public c(j memoryCache, InsuranceHomeService service, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f209403a = memoryCache;
        this.f209404b = service;
        this.f209405c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new k(this, continuation, 14), new mqi.a(this, 16), new g(this, 23), new q(this, continuation, 28), new lp6.g(this, continuation, 15));
    }
}
