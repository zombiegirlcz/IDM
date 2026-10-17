package m44;

import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main.CreditAddressScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditAddressScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CreditAddressScreen creditAddressScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditAddressScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        int i2 = 18;
        CreditAddressScreen creditAddressScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                creditAddressScreen.T2().v2(j.f202655a);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarI3 = creditAddressScreen.T2();
                gv3.b bVar = ((e) uVarI3.t2()).f202649b;
                gv3.b bVar2 = ((e) uVarI3.t2()).f202650c;
                int i3 = s.f202663a[uVarI3.f202666q.d.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bVar != null && bVar2 != null) {
                        uVarI3.l2(new lo.c(uVarI3, continuation, i2), new yi5.b(26));
                    }
                } else if (bVar != null) {
                    if (((e) uVarI3.t2()).d) {
                        uVarI3.l2(new lo.c(uVarI3, continuation, i2), new yi5.b(26));
                    } else {
                        uVarI3.v2(l.f202657a);
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarI32 = creditAddressScreen.T2();
                uVarI32.getClass();
                uVarI32.l2(new lo.c(uVarI32, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
