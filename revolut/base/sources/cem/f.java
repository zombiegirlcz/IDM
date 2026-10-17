package cem;

import gim.i;
import io.ktor.utils.io.n0;
import io.ktor.utils.io.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Function2 f23511x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ hem.c f23512y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Function2 function2, hem.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f23511x = function2;
        this.f23512y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f23511x, this.f23512y, continuation, 0);
                fVar.f23510w = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f23511x, this.f23512y, continuation, 1);
                fVar2.f23510w = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        int i = this.u;
        Function2 function2 = this.f23511x;
        hem.c cVar = this.f23512y;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        m.Companion companion = m.INSTANCE;
                        this.f23510w = null;
                        this.v = 1;
                        if (function2.invoke(cVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    objA = Unit.f186387a;
                    m.Companion companion2 = m.INSTANCE;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion3 = m.INSTANCE;
                    objA = o.a(th10);
                }
                return new m(objA);
            default:
                CoroutineScope coroutineScope = (CoroutineScope) this.f23510w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    try {
                    } catch (Throwable th11) {
                        m.Companion companion4 = m.INSTANCE;
                        o.a(th11);
                    }
                } catch (Throwable th12) {
                    m.Companion companion5 = m.INSTANCE;
                    o.a(th12);
                }
                if (i3 == 0) {
                    o.b(obj2);
                    m.Companion companion6 = m.INSTANCE;
                    this.f23510w = coroutineScope;
                    this.v = 1;
                    if (function2.invoke(cVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        new Long(((Number) obj2).longValue());
                        m.Companion companion7 = m.INSTANCE;
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                Unit unit = Unit.f186387a;
                m.Companion companion8 = m.INSTANCE;
                t tVarB = cVar.b();
                this.f23510w = null;
                this.v = 2;
                obj2 = n0.c(tVarB, Long.MAX_VALUE, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
                new Long(((Number) obj2).longValue());
                m.Companion companion72 = m.INSTANCE;
                return Unit.f186387a;
        }
    }
}
