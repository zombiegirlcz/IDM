package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116696c;
    public final x4l.c d;

    public t(CreditCardService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116694a = api2;
        this.f116695b = memoryCache;
        this.f116696c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new cuh.a(this, continuation, 11), new dmj.e0(this, 16), new dgj.h(this, 22), new dob.c(this, continuation, 5), new n(this, continuation, 3));
    }
}
