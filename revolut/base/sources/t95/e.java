package t95;

import com.revolut.feature.credit.overdraft.impl.network.OverdraftService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import t5e.m;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverdraftService f268951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f268952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f268953c;
    public final x4l.c d;

    public e(OverdraftService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f268951a = api2;
        this.f268952b = memoryCache;
        this.f268953c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new pti.d(this, continuation, 25), new m(this, 16), new suf.a(this, 26), new t05.m(this, continuation, 12), new ska.c(this, continuation, 5));
    }
}
