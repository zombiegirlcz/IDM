package khe;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a f184111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f184112x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Continuation continuation) {
        super(2, continuation);
        this.f184111w = aVar;
        this.f184112x = productAccountDescriptor$Value;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.f184111w, this.f184112x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar3 = this.f184111w;
            she.g gVar = aVar3.C;
            this.u = aVar3;
            this.v = 1;
            zfe.f fVar = zfe.g.Companion;
            Object objC = gVar.c(this.f184112x, null, this);
            if (objC == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        return aVar.C1((aii.u) obj2);
    }
}
