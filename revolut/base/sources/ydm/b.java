package ydm;

import io.ktor.client.engine.ClientEngineClosedException;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.utils.io.e0;
import io.ktor.utils.io.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import skm.g1;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f312713w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f312714x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpClientEngine httpClientEngine, fem.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f312713w = httpClientEngine;
        this.f312714x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((HttpClientEngine) this.f312713w, (fem.e) this.f312714x, continuation);
            default:
                b bVar = new b((nem.c) this.f312714x, continuation);
                bVar.f312713w = obj2;
                return bVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                HttpClientEngine httpClientEngine = (HttpClientEngine) this.f312713w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                Job job2 = (Job) httpClientEngine.getF74819h().get(g1.f263979a);
                if (!(job2 != null ? job2.d() : false)) {
                    throw new ClientEngineClosedException("Client already closed");
                }
                fem.e eVar = (fem.e) this.f312714x;
                this.v = 1;
                Object objF = ((io.ktor.client.engine.okhttp.a) httpClientEngine).f(eVar, this);
                return objF == aVar ? aVar : objF;
            default:
                t0 t0Var = (t0) this.f312713w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    gem.f fVar = (gem.f) ((nem.c) this.f312714x);
                    e0 e0Var = t0Var.f163088a;
                    this.f312713w = null;
                    this.v = 1;
                    if (fVar.d(e0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nem.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f312714x = cVar;
    }
}
