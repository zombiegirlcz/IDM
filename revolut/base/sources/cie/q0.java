package cie;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.ui.tab.d f24514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f24515x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f24516y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(com.revolut.feature.tab.accounts.impl.ui.tab.d dVar, ProductAccountDescriptor$Value productAccountDescriptor$Value, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24514w = dVar;
        this.f24515x = productAccountDescriptor$Value;
        this.f24516y = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q0(this.f24514w, this.f24515x, this.f24516y, continuation, 0);
            default:
                return new q0(this.f24514w, this.f24515x, this.f24516y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    the.a aVar2 = this.f24514w.v;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f24515x;
                    ProductId f89727a = productAccountDescriptor$Value.getF89727a();
                    sfe.h hVar = new sfe.h(productAccountDescriptor$Value.getF89728b(), this.f24516y);
                    this.v = 1;
                    if (aVar2.a(f89727a, hVar, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    the.a aVar4 = this.f24514w.v;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value2 = this.f24515x;
                    ProductId f89727a2 = productAccountDescriptor$Value2.getF89727a();
                    sfe.n nVar = new sfe.n(productAccountDescriptor$Value2.getF89728b(), this.f24516y);
                    this.v = 1;
                    if (aVar4.a(f89727a2, nVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
