package aem;

import io.ktor.client.plugins.HttpRequestTimeoutException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3770y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Long l2, fem.d dVar, Job job2, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f3768w = l2;
        this.f3769x = dVar;
        this.f3770y = job2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f3769x, (hem.c) this.f3770y, continuation, 0);
                rVar.f3768w = obj2;
                return rVar;
            case 1:
                return new r((Long) this.f3768w, (fem.d) this.f3769x, (Job) this.f3770y, continuation);
            default:
                r rVar2 = new r((klm.b) this.f3769x, (io.ktor.utils.io.p0) this.f3770y, continuation, 2);
                rVar2.f3768w = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((io.ktor.utils.io.t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((io.ktor.utils.io.t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        Object objB;
        int i = this.u;
        Object obj3 = this.f3770y;
        Object obj4 = this.f3769x;
        switch (i) {
            case 0:
                hem.c cVar = (hem.c) obj3;
                io.ktor.utils.io.t0 t0Var = (io.ktor.utils.io.t0) this.f3768w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        io.ktor.utils.io.e0 e0Var = t0Var.f163088a;
                        this.f3768w = null;
                        this.v = 1;
                        objB = io.ktor.utils.io.n0.b((io.ktor.utils.io.t) obj4, e0Var, Long.MAX_VALUE, this);
                        if (objB == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objB = obj2;
                    }
                    ((Number) objB).longValue();
                    return Unit.f186387a;
                } catch (CancellationException e) {
                    skm.e0.k(cVar, e);
                    throw e;
                } catch (Throwable th10) {
                    skm.e0.k(cVar, d9.e1.a("Receive failed", th10));
                    throw th10;
                }
            case 1:
                fem.d request = (fem.d) obj4;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    long jLongValue = ((Long) this.f3768w).longValue();
                    this.v = 1;
                    if (skm.k0.b(jLongValue, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Intrinsics.checkNotNullParameter(request, "request");
                String strC = request.f134657a.c();
                z0 key = z0.f3801a;
                Intrinsics.checkNotNullParameter(key, "key");
                Map map = (Map) request.f.d(ydm.f.f312720a);
                b1 b1Var = (b1) (map != null ? map.get(key) : null);
                HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(strC, b1Var != null ? b1Var.f3695a : null, null);
                Logger logger = e1.f3713a;
                Intrinsics.checkNotNullParameter(logger, "<this>");
                if (logger.isTraceEnabled()) {
                    logger.trace("Request timeout: " + request.f134657a);
                }
                String message = httpRequestTimeoutException.getMessage();
                Intrinsics.h(message);
                skm.e0.l((Job) obj3, message, httpRequestTimeoutException);
                return Unit.f186387a;
            default:
                io.ktor.utils.io.t0 t0Var2 = (io.ktor.utils.io.t0) this.f3768w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    io.ktor.utils.io.p0 p0Var = (io.ktor.utils.io.p0) obj3;
                    io.ktor.utils.io.e0 e0Var2 = t0Var2.f163088a;
                    this.f3768w = t0Var2;
                    this.v = 1;
                    klm.b bVar = lem.n.f194617a;
                    if (new io.ktor.utils.io.q(p0Var, (klm.b) obj4, e0Var2, 8193L).d(true, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                io.ktor.utils.io.e0 e0Var3 = t0Var2.f163088a;
                this.f3768w = null;
                this.v = 2;
                if (((io.ktor.utils.io.m) e0Var3).i(this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f3769x = obj2;
        this.f3770y = obj3;
    }
}
