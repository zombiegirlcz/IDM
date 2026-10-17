package y7k;

import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class k0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a f311557w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f311557w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(this.f311557w, continuation, 0);
            case 1:
                return new k0(this.f311557w, continuation, 1);
            case 2:
                return new k0(this.f311557w, continuation, 2);
            case 3:
                return new k0(this.f311557w, continuation, 3);
            default:
                return new k0(this.f311557w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar2 = this.f311557w;
                Object objB0 = u0.b0(aVar2.X(), "PAYMENTS_LINKS_CTA_BUTTON_TAG", new k0(aVar2, null, 3), this);
                return objB0 == aVar ? aVar : objB0;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar4 = this.f311557w;
                Object objB02 = u0.b0(aVar4.X(), "PAYMENTS_LINKS_CTA_BUTTON_TAG", new k0(aVar4, null, 4), this);
                return objB02 == aVar3 ? aVar3 : objB02;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar6 = this.f311557w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    b8k.d dVar = aVar6.f102208p;
                    this.v = 1;
                    obj2 = dVar.b(this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar6.H2(aVar6.H, new y1.a((PaymentLinksTransferData) obj2, 27));
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar8 = this.f311557w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.I2(aVar8, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (n8k.k) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                n8k.a aVar9 = aVar8.v;
                PaymentLinksTransferData paymentLinksTransferDataN2 = aVar8.N2();
                this.v = 2;
                obj2 = ((n8k.d) aVar9).Z2(paymentLinksTransferDataN2, this);
                if (obj2 == aVar7) {
                    return aVar7;
                }
                return (n8k.k) obj2;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar11 = this.f311557w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.I2(aVar11, this);
                    if (obj2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return (n8k.k) obj2;
                    }
                    yhm.o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return null;
                }
                n8k.a aVar12 = aVar11.v;
                PaymentLinksTransferData paymentLinksTransferDataN22 = aVar11.N2();
                this.v = 2;
                obj2 = ((n8k.d) aVar12).b3(paymentLinksTransferDataN22, this);
                if (obj2 == aVar10) {
                    return aVar10;
                }
                return (n8k.k) obj2;
        }
    }
}
