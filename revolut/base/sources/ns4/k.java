package ns4;

import al4.m;
import com.revolut.feature.credit.card.api.models.instalment.CreditCardInstalmentAnticipationQuote;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreenContract$InputData;
import iuf.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.r1;
import ql4.v;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a f218746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f218746w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f218746w, continuation, 0);
            default:
                return new k(this.f218746w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a aVar2 = this.f218746w;
                    CreditCardAnticipationConfirmationScreenContract$InputData creditCardAnticipationConfirmationScreenContract$InputData = aVar2.o;
                    CreditCardInstalmentAnticipationQuote creditCardInstalmentAnticipationQuote = creditCardAnticipationConfirmationScreenContract$InputData.f69443c;
                    m mVar = aVar2.f69445p;
                    String str = creditCardAnticipationConfirmationScreenContract$InputData.f69441a;
                    String str2 = creditCardAnticipationConfirmationScreenContract$InputData.f69442b;
                    int i2 = creditCardInstalmentAnticipationQuote.f68783b;
                    dj0.d dVar = creditCardInstalmentAnticipationQuote.d;
                    v vVar = creditCardAnticipationConfirmationScreenContract$InputData.f;
                    this.v = 1;
                    if (((r1) mVar).b(str, str2, i2, dVar, vVar, this) == aVar) {
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
                int i3 = this.v;
                com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.a aVar4 = this.f218746w;
                if (i3 == 0) {
                    o.b(obj2);
                    lic.a aVar5 = new lic.a(aVar4, 5);
                    y yVar = new y(aVar4, 13);
                    k kVar = new k(aVar4, null, 0);
                    this.v = 1;
                    obj2 = n14.k.V(aVar4, null, aVar5, yVar, kVar, this, 1);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (((nii.h) obj2) instanceof nii.g) {
                    aVar4.C2(g.f218744a);
                }
                return Unit.f186387a;
        }
    }
}
