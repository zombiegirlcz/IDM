package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116691c;
    public final x4l.c d;

    public s(CreditCardService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116689a = api2;
        this.f116690b = memoryCache;
        this.f116691c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new cuh.a(this, continuation, 10), new dmj.e0(this, 15), new dgj.h(this, 21), new dob.c(this, continuation, 4), new n(this, continuation, 2));
    }
}
