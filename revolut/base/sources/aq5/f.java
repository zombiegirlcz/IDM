package aq5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b f8264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f8264w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f8264w, continuation, 0);
            case 1:
                return new f(this.f8264w, continuation, 1);
            default:
                return new f(this.f8264w, continuation, 2);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar = this.f8264w;
                    e eVar = new e(bVar, null, 0);
                    this.v = 1;
                    if (bVar.p2(this, eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar2 = this.f8264w;
                    e eVar2 = new e(bVar2, null, 1);
                    this.v = 1;
                    if (bVar2.p2(this, eVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b bVar3 = this.f8264w;
                    com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.a aVar4 = new com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.a(bVar3, null);
                    this.v = 1;
                    if (bVar3.p2(this, aVar4) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
