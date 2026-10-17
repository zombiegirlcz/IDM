package fr8;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(JuniorTransferAmountScreen juniorTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorTransferAmountScreen juniorTransferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                juniorTransferAmountScreen.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVarT2 = juniorTransferAmountScreen.T2();
                Object content = ((l) rVarT2.t2()).f137420h.getContent();
                if (content == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                psg.a aVar3 = (psg.a) content;
                Object content2 = ((l) rVarT2.t2()).f137419g.getContent();
                if (content2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                rVarT2.v2(new n(aVar3, (JuniorBankingProfile) content2, new dj0.d(((l) rVarT2.t2()).f137416a, rVarT2.y2()), ((l) rVarT2.t2()).f137417b, ((l) rVarT2.t2()).f137418c));
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                juniorTransferAmountScreen.T2().x2(new fo9.a(17));
                return Unit.f186387a;
        }
    }
}
