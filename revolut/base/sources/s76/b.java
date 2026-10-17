package s76;

import com.revolut.feature.derivatives.data.impl.network.service.DerivativesBalanceService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import org.jetbrains.annotations.NotNull;
import p24.q;
import pti.s;
import qe0.o;
import ryd.i;
import s42.f;
import ue0.c;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DerivativesBalanceService f260523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f260524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f260525c;
    public final CoroutineScope d;
    public final x4l.c e;
    public final o f;

    public b(DerivativesBalanceService service, j memoryCache, c storage, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f260523a = service;
        this.f260524b = memoryCache;
        this.f260525c = storage;
        this.d = coroutineScope;
        Continuation continuation = null;
        x4l.c cVar = new x4l.c(new s(this, continuation, 8), new i(this, 29), new f(this, 13), new s1k.b(this, continuation, 12), new q(this, continuation, 26));
        this.e = cVar;
        this.f = do3.q.f(cVar, coroutineScope);
    }
}
