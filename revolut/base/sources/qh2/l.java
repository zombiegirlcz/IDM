package qh2;

import e8.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import pfm.z;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f246441w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f246441w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f246441w, continuation, 0);
            default:
                return new l(this.f246441w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    o oVar = this.f246441w;
                    r rVar = oVar.e;
                    KProperty[] kPropertyArr = o.f;
                    if (((MutableSharedFlow) rVar.b(kPropertyArr[0])).d().isEmpty()) {
                        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) oVar.e.b(kPropertyArr[0]);
                        obj3 = Unit.f186387a;
                        Object objEmit = mutableSharedFlow.emit(obj3, this);
                        if (objEmit == aVar) {
                            obj3 = objEmit;
                        }
                    } else {
                        obj3 = Unit.f186387a;
                    }
                    if (obj3 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                o oVar2 = this.f246441w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVarC = ((ty1.b) oVar2.f246445a).c(yoj.c.APM_WERO);
                    this.v = 1;
                    obj2 = nim.a.b(zVarC, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    this.v = 2;
                    if (o.a(oVar2, this) == aVar2) {
                        return aVar2;
                    }
                }
                return Unit.f186387a;
        }
    }
}
