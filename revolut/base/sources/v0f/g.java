package v0f;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.topup_screen.impl.screens.card_details.CardDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ CardDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CardDetailsScreen cardDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cardDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            v vVarD = this.v.d();
            this.u = 1;
            com.revolut.feature.topup_screen.impl.screens.card_details.b bVar = (com.revolut.feature.topup_screen.impl.screens.card_details.b) vVarD;
            bVar.getClass();
            Object objP2 = bVar.p2(this, new uk9.h(bVar, null, 7));
            if (objP2 != aVar) {
                objP2 = Unit.f186387a;
            }
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
