package yr3;

import com.revolut.feature.credit.application.impl.network.CreditEntryPointsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import ve0.c;
import y5b.b0;
import y69.e;
import yk6.m;
import yo7.p;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditEntryPointsService f316115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f316116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f316117c;
    public final x4l.c d;

    public b(CreditEntryPointsService api2, d memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f316115a = api2;
        this.f316116b = memoryCache;
        this.f316117c = storage;
        Continuation continuation = null;
        int i = 11;
        this.d = new x4l.c(new b0(this, continuation, 5), new p(this, i), new yi3.d(this, i), new m(this, continuation, 10), new e(this, continuation, 2));
    }
}
