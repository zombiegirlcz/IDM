package l03;

import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsContract$ModalStep;
import com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.CardReplaceExpectationsController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CardReplaceExpectationsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CardReplaceExpectationsController cardReplaceExpectationsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cardReplaceExpectationsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardReplaceExpectationsController cardReplaceExpectationsController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a) ((a) cardReplaceExpectationsController.Q.getValue())).C2(c.f191146a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a aVar3 = (com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a) ((a) cardReplaceExpectationsController.Q.getValue());
                int i2 = h.f191152a[aVar3.o.f64878a.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    oki.h.v2(aVar3.f64884r, CardReplaceExpectationsContract$ModalStep.TerminateAndReorder.f64881a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (i2 == 3) {
                    aVar3.A1(new i(aVar3, null, 0), new yi5.b(25));
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar3.C1(u0.b(aVar3.o.f64880c));
                }
                return Unit.f186387a;
        }
    }
}
