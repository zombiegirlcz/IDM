package xif;

import com.revolut.feature.transactions.impl.data.network.WarrantService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WarrantService f306392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f306393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hif.c f306394c;
    public final w4l.f d;
    public final w4l.f e;

    public z(WarrantService service, ne0.j memoryCache, hif.c mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f306392a = service;
        this.f306393b = memoryCache;
        this.f306394c = mapper;
        this.d = a(new v(this, 1));
        this.e = a(new v(this, 2));
    }

    public final w4l.f a(Function1 function1) {
        return new w4l.f(new u3a.p(function1, this, 21), new v(this, 0), new k(this, 1), null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
