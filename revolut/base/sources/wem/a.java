package wem;

import a1m.e;
import gim.i;
import io.ktor.utils.io.m0;
import io.ktor.utils.io.s;
import io.ktor.utils.io.t;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.OkHttpClient;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f296830w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f296830w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((t) this.f296830w, continuation, 0);
            case 1:
                return new a((c) this.f296830w, this.v, continuation);
            default:
                return new a((io.ktor.client.engine.okhttp.a) this.f296830w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        Iterator it8;
        int i = this.u;
        Object obj3 = this.f296830w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                s sVar = t.Companion;
                Object objD = ((t) obj3).d(1, this);
                return objD == aVar ? aVar : objD;
            case 1:
                c cVar = (c) obj3;
                jlm.b bVar = cVar.f296833a;
                jlm.a aVar2 = cVar.d;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                long jJ2 = 0;
                while (e.x(aVar2) < this.v && jJ2 >= 0) {
                    try {
                        jJ2 = bVar.j2(aVar2, Long.MAX_VALUE);
                    } catch (EOFException unused) {
                        jJ2 = -1;
                    }
                }
                if (jJ2 == -1) {
                    bVar.close();
                    cVar.e.h0();
                    cVar.f296835c = new m0(null);
                }
                return Unit.f186387a;
            default:
                io.ktor.client.engine.okhttp.a aVar4 = (io.ktor.client.engine.okhttp.a) obj3;
                Map map = aVar4.f163024h;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        Job jobT = e0.t(aVar4.f);
                        this.v = 1;
                        if (jobT.u(this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    while (it8.hasNext()) {
                        OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it8.next()).getValue();
                        okHttpClient.F.a();
                        ((ThreadPoolExecutor) okHttpClient.f226053a.a()).shutdown();
                    }
                    return Unit.f186387a;
                } finally {
                    it8 = map.entrySet().iterator();
                    while (it8.hasNext()) {
                        OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it8.next()).getValue();
                        okHttpClient2.F.a();
                        ((ThreadPoolExecutor) okHttpClient2.f226053a.a()).shutdown();
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f296830w = cVar;
        this.v = i;
    }
}
