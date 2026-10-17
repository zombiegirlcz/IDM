package iid;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.flow.session.c f161605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f161606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.shops.impl.flow.session.c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f161605w = cVar;
        this.f161606x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f161605w, this.f161606x, continuation, 0);
            default:
                return new e(this.f161605w, this.f161606x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = this.f161606x;
                    com.revolut.feature.shops.impl.flow.session.c cVar = this.f161605w;
                    com.revolut.feature.shops.impl.flow.session.a aVar2 = new com.revolut.feature.shops.impl.flow.session.a(cVar, str, null);
                    this.v = 1;
                    if (cVar.p2(this, aVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    String str2 = this.f161606x;
                    com.revolut.feature.shops.impl.flow.session.c cVar2 = this.f161605w;
                    com.revolut.feature.shops.impl.flow.session.b bVar = new com.revolut.feature.shops.impl.flow.session.b(cVar2, str2, null);
                    this.v = 1;
                    if (cVar2.p2(this, bVar) == aVar3) {
                        return aVar3;
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
}
