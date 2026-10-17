package dp4;

import com.revolut.feature.credit.card.impl.network.CreditCardEntryPointDetailsService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.r3;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardEntryPointDetailsService f116684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xx4.d f116685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xx4.e f116686c;
    public final x4l.c d;

    public r(CreditCardEntryPointDetailsService api2, xx4.d memoryCache, xx4.e storage) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f116684a = api2;
        this.f116685b = memoryCache;
        this.f116686c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new cvi.i(this, continuation, 24), new dmj.e0(this, 14), new dgj.h(this, 20), new dob.c(this, continuation, 3), new n(this, continuation, 1));
    }

    public final Object a(ll4.c cVar, List list, r3 r3Var) {
        Object objD = this.d.d(new cp4.n(cVar, list), false, r3Var);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
