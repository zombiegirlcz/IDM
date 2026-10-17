package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardService f116680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116682c;
    public final x4l.c d;

    public q(CreditCardService api2, xx4.d timeMemoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(timeMemoryCache, "timeMemoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116680a = api2;
        this.f116681b = timeMemoryCache;
        this.f116682c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new cuh.a(this, continuation, 9), new dmj.e0(this, 13), new dgj.h(this, 19), new dob.c(this, continuation, 2), new n(this, continuation, 0));
    }
}
