package ps9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_chat.settings.d f239447w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f239447w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f239447w, continuation, 0);
            case 1:
                return new v(this.f239447w, continuation, 1);
            default:
                return new v(this.f239447w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((v) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar = this.f239447w;
                    com.revolut.feature.payments.groups.impl.ui_chat.settings.b bVar = new com.revolut.feature.payments.groups.impl.ui_chat.settings.b(dVar, null);
                    this.v = 1;
                    if (dVar.p2(this, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar2 = this.f239447w;
                    com.revolut.feature.payments.groups.impl.ui_chat.settings.c cVar = new com.revolut.feature.payments.groups.impl.ui_chat.settings.c(dVar2, null);
                    this.v = 1;
                    if (dVar2.p2(this, cVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.payments.groups.impl.ui_chat.settings.d dVar3 = this.f239447w;
                p40.v vVar = new p40.v(dVar3, null, 11);
                this.v = 1;
                Object objP2 = dVar3.p2(this, vVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
