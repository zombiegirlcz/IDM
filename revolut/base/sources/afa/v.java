package afa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.ui.pockets_list.c f4007w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f4008x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wi0.b f4009y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.pockets.impl.ui.pockets_list.c cVar, String str, Continuation continuation, wi0.b bVar) {
        super(2, continuation);
        this.u = 3;
        this.f4007w = cVar;
        this.f4009y = bVar;
        this.f4008x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v(this.f4007w, this.f4008x, this.f4009y, continuation, 0);
            case 1:
                return new v(this.f4007w, this.f4008x, this.f4009y, continuation, 1);
            case 2:
                return new v(this.f4007w, this.f4008x, this.f4009y, continuation, 2);
            default:
                wi0.b bVar = this.f4009y;
                return new v(this.f4007w, this.f4008x, continuation, bVar);
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
                com.revolut.feature.pockets.impl.ui.pockets_list.c cVar = this.f4007w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    rea.p pVar = cVar.f80927y;
                    this.v = 1;
                    obj2 = ((o8b.c) pVar.f253582a).g() ? pVar.a(this) : Boolean.FALSE;
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                Continuation continuation = null;
                if (((Boolean) obj2).booleanValue()) {
                    cVar.f80927y.getClass();
                    return yji.l.a1(cVar, cVar.X1(rea.p.c()), null, null, new t(cVar, null, 0), 3);
                }
                u uVar = new u(cVar, this.f4008x, this.f4009y, continuation, 0);
                this.v = 2;
                if (u0.b0(cVar.X(), "ADD_ACCOUNT_BUTTON_TAG", uVar, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    wi0.b bVar = this.f4009y;
                    com.revolut.feature.pockets.impl.ui.pockets_list.c cVar2 = this.f4007w;
                    com.revolut.feature.pockets.impl.ui.pockets_list.a aVar3 = new com.revolut.feature.pockets.impl.ui.pockets_list.a(cVar2, this.f4008x, null, bVar);
                    this.v = 1;
                    if (u0.b0(cVar2.X(), "ADD_ACCOUNT_BUTTON_TAG", aVar3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.pockets.impl.ui.pockets_list.c cVar3 = this.f4007w;
                    Function1 sVar = new a41.s(cVar3, this.f4008x, this.f4009y, (Continuation) null, 3);
                    this.v = 1;
                    if (cVar3.p2(this, sVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    String str = this.f4008x;
                    com.revolut.feature.pockets.impl.ui.pockets_list.c cVar4 = this.f4007w;
                    com.revolut.feature.pockets.impl.ui.pockets_list.b bVar2 = new com.revolut.feature.pockets.impl.ui.pockets_list.b(cVar4, str, null, this.f4009y);
                    this.v = 1;
                    if (cVar4.p2(this, bVar2) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(com.revolut.feature.pockets.impl.ui.pockets_list.c cVar, String str, wi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f4007w = cVar;
        this.f4008x = str;
        this.f4009y = bVar;
    }
}
