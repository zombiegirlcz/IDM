package js4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.r1;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a f178132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f178133x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar, int i, Continuation continuation, int i2) {
        super(1, continuation);
        this.u = i2;
        this.f178132w = aVar;
        this.f178133x = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f178132w, this.f178133x, continuation, 0);
            case 1:
                return new j(this.f178132w, this.f178133x, continuation, 1);
            case 2:
                return new j(this.f178132w, this.f178133x, continuation, 2);
            default:
                return new j(this.f178132w, this.f178133x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar2 = this.f178132w;
                    al4.m mVar = aVar2.f69430q;
                    CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData creditCardEditPostPurchaseInstalmentTermScreenContract$InputData = aVar2.o;
                    String str = creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69419a;
                    String str2 = creditCardEditPostPurchaseInstalmentTermScreenContract$InputData.f69420b;
                    this.v = 1;
                    if (((r1) mVar).e(str, str2, this.f178133x, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar4 = this.f178132w;
                    j jVar = new j(aVar4, this.f178133x, null, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar4, jVar, this) == aVar3) {
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
                    com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar6 = this.f178132w;
                    j jVar2 = new j(aVar6, this.f178133x, null, 1);
                    this.v = 1;
                    if (u0.b0(aVar6.X(), "CONFIRM_BUTTON_TAG", jVar2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.a aVar8 = this.f178132w;
                Continuation continuation = null;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    a3b.h hVar = new a3b.h(aVar8, 27);
                    ack.n nVar = new ack.n(19);
                    j jVar3 = new j(aVar8, this.f178133x, continuation, 2);
                    this.v = 1;
                    objP = n14.k.P(aVar8.X(), null, hVar, nVar, jVar3, this);
                    if (objP == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objP = obj2;
                }
                if (((nii.e) objP) instanceof nii.d) {
                    yji.l.a1(aVar8, aVar8.X1(new mii.k("id_credit_card_update_term_confirmation", new TextLocalisedClause(R$string.credit_card_instalment_edit_quote_success, null, null, 14), null, null, null, 28)), null, null, new jkc.g(aVar8, continuation, 12), 3);
                }
                return Unit.f186387a;
        }
    }
}
