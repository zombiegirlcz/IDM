package zt4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.CreditCardBoletoDetailsContract$InputData;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.w;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a f325080w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f325080w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f325080w, continuation, 0);
            case 1:
                return new m(this.f325080w, continuation, 1);
            case 2:
                return new m(this.f325080w, continuation, 2);
            case 3:
                return new m(this.f325080w, continuation, 3);
            default:
                return new m(this.f325080w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar2 = this.f325080w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    w wVar = aVar2.f69547p;
                    CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData = aVar2.o;
                    String str = creditCardBoletoDetailsContract$InputData.f69543a;
                    String str2 = creditCardBoletoDetailsContract$InputData.f69544b;
                    this.v = 1;
                    if (wVar.b(str, str2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar2.X1(new mii.f("id_credit_card_boleto_cancel_success", new TextLocalisedClause(R$string.credit_card_boleto_cancelled, null, null, 14), null, null, null, null, 124));
                aVar2.C2(b.f325069a);
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar4 = this.f325080w;
                    m mVar = new m(aVar4, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, mVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar6 = this.f325080w;
                    w wVar2 = aVar6.f69547p;
                    String str3 = aVar6.o.f69543a;
                    this.v = 1;
                    if (wVar2.e(str3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar8 = this.f325080w;
                w wVar3 = aVar8.f69547p;
                CreditCardBoletoDetailsContract$InputData creditCardBoletoDetailsContract$InputData2 = aVar8.o;
                String str4 = creditCardBoletoDetailsContract$InputData2.f69543a;
                String str5 = creditCardBoletoDetailsContract$InputData2.f69544b;
                this.v = 1;
                Object objA = wVar3.a(str4, str5, this);
                return objA == aVar7 ? aVar7 : objA;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.repay.boleto.boleto_details.a aVar10 = this.f325080w;
                xxh.d dVar = new xxh.d(aVar10, 5);
                up4.h hVar = new up4.h(16);
                m mVar2 = new m(aVar10, null, 3);
                this.v = 1;
                Object objQ = n14.k.Q(aVar10, null, dVar, hVar, mVar2, this, 1);
                return objQ == aVar9 ? aVar9 : objQ;
        }
    }
}
