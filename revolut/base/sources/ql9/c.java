package ql9;

import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f247557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f247558x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247558x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f247558x, continuation, 0);
                cVar.f247557w = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f247558x, continuation, 1);
                cVar2.f247557w = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Object objA2;
        int i = this.u;
        d dVar = this.f247558x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                try {
                    if (i2 == 0) {
                        o.b(obj2);
                        m.Companion companion = m.INSTANCE;
                        fn2.c cVar = dVar.f247560b;
                        this.f247557w = null;
                        this.v = 1;
                        if (cVar.l(true, this) == aVar) {
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
                Throwable thA = m.a(objA);
                if (thA != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA, h0Var);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        o.b(obj2);
                        m.Companion companion4 = m.INSTANCE;
                        re0.c cVar2 = dVar.f247561c;
                        Unit unit = Unit.f186387a;
                        this.f247557w = null;
                        this.v = 1;
                        if (cVar2.b(unit, true, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    objA2 = Unit.f186387a;
                    m.Companion companion5 = m.INSTANCE;
                    break;
                } catch (Throwable th11) {
                    m.Companion companion6 = m.INSTANCE;
                    objA2 = o.a(th11);
                }
                Throwable thA2 = m.a(objA2);
                if (thA2 != null) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, thA2, h0Var2);
                }
                return Unit.f186387a;
        }
    }
}
