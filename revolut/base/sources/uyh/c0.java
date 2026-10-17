package uyh;

import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_crypto_order_flow.impl.exchange.d f284357w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature_crypto_order_flow.impl.exchange.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284357w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f284357w, continuation, 0);
            case 1:
                return new c0(this.f284357w, continuation, 1);
            case 2:
                return new c0(this.f284357w, continuation, 2);
            case 3:
                return new c0(this.f284357w, continuation, 3);
            default:
                return new c0(this.f284357w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature_crypto_order_flow.impl.exchange.d dVar = this.f284357w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature_crypto_order_flow.impl.exchange.d dVar2 = this.f284357w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    int i3 = b0.f284352a[dVar2.o.f96723c.ordinal()];
                    if (i3 == 1) {
                        this.v = 1;
                        if (com.revolut.feature_crypto_order_flow.impl.exchange.d.J2(dVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.v = 2;
                        if (com.revolut.feature_crypto_order_flow.impl.exchange.d.K2(dVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                yji.l.a1(dVar2, dVar2.B.a(dVar2.N2()), null, null, new t0(dVar2, ((j) ((j2) dVar2.K.f22677a).getValue()).f284370b.f190907b, null), 3);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    CryptoOrderDraft cryptoOrderDraft = ((j) ((j2) dVar.K.f22677a).getValue()).f284369a;
                    if (cryptoOrderDraft == null) {
                        return Unit.f186387a;
                    }
                    this.v = 1;
                    if (com.revolut.feature_crypto_order_flow.impl.exchange.d.I2(dVar, cryptoOrderDraft, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    q qVar = new q(dVar, 5);
                    this.v = 1;
                    Set set = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                    if (dVar.T2(this, qVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    CryptoOrderDraft cryptoOrderDraft2 = ((j) ((j2) dVar.K.f22677a).getValue()).f284369a;
                    if (cryptoOrderDraft2 == null) {
                        return Unit.f186387a;
                    }
                    ae5.a aVar5 = dVar.I;
                    xi0.b bVar = cryptoOrderDraft2.f96689a.f96683a;
                    xi0.b bVar2 = cryptoOrderDraft2.f96690b.f96683a;
                    ae5.c cVar = ae5.c.CTA_CLICKED;
                    this.v = 1;
                    obj2 = aVar5.Z2();
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                if (((ae5.b) obj2) == ae5.b.BLOCK_FLOW) {
                    return Unit.f186387a;
                }
                q qVar2 = new q(dVar, 6);
                this.v = 2;
                if (com.revolut.feature_crypto_order_flow.impl.exchange.d.L2(dVar, qVar2, this) == aVar4) {
                    return aVar4;
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature_crypto_order_flow.impl.exchange.a aVar7 = new com.revolut.feature_crypto_order_flow.impl.exchange.a(dVar, null);
                this.v = 1;
                Set set2 = com.revolut.feature_crypto_order_flow.impl.exchange.d.M;
                Object objB = pu7.a.B(dVar.k, "on_toolbar_description_click", aVar7, this);
                return objB == aVar6 ? aVar6 : objB;
        }
    }
}
