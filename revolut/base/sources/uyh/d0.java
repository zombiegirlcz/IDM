package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderPocketInfo;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f284360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284361x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284361x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(this.f284361x, continuation, 0);
                d0Var.f284360w = obj2;
                return d0Var;
            default:
                d0 d0Var2 = new d0(this.f284361x, continuation, 1);
                d0Var2.f284360w = obj2;
                return d0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((CryptoOrderPocketInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = this.f284361x;
        switch (i) {
            case 0:
                j jVar = (j) this.f284360w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    CryptoOrderDraft cryptoOrderDraft = jVar.f284369a;
                    if (cryptoOrderDraft == null) {
                        return Unit.f186387a;
                    }
                    ae5.a aVar2 = dVar.I;
                    xi0.b bVar = cryptoOrderDraft.f96689a.f96683a;
                    xi0.b bVar2 = cryptoOrderDraft.f96690b.f96683a;
                    ae5.c cVar = ae5.c.CTA_CLICKED;
                    this.f284360w = null;
                    this.v = 1;
                    if (aVar2.b3() == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                CryptoOrderPocketInfo cryptoOrderPocketInfo = (CryptoOrderPocketInfo) this.f284360w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    uif.d dVar2 = new uif.d(cryptoOrderPocketInfo, dVar, 29);
                    this.f284360w = null;
                    this.v = 1;
                    Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                    if (dVar.T2(this, dVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
